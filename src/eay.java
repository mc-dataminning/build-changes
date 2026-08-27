import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eay(List<eay.a> b, is c, dxg d, boolean e) implements ebh {
   public static final Codec<eay> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eay.a.a.listOf().fieldOf("layers").forGetter(eay::a),
               is.g.fieldOf("direction").forGetter(eay::b),
               dxg.b.fieldOf("allowed_placement").forGetter(eay::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(eay::d)
            )
            .apply($$0, eay::new)
   );

   public static eay.a a(bor $$0, edi $$1) {
      return new eay.a($$0, $$1);
   }

   public static eay b(bor $$0, edi $$1) {
      return new eay(List.of(a($$0, $$1)), is.b, dxg.c, false);
   }

   public List<eay.a> a() {
      return this.b;
   }

   public is b() {
      return this.c;
   }

   public dxg c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bor b, edi c) {
      public static final Codec<eay.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bor.d.fieldOf("height").forGetter(eay.a::a), edi.a.fieldOf("provider").forGetter(eay.a::b)).apply($$0, eay.a::new)
      );

      public bor a() {
         return this.b;
      }

      public edi b() {
         return this.c;
      }
   }
}
