import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dxn(List<dxn.a> b, ih c, dtv d, boolean e) implements dxw {
   public static final Codec<dxn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dxn.a.a.listOf().fieldOf("layers").forGetter(dxn::a),
               ih.g.fieldOf("direction").forGetter(dxn::b),
               dtv.b.fieldOf("allowed_placement").forGetter(dxn::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(dxn::d)
            )
            .apply($$0, dxn::new)
   );

   public static dxn.a a(bmi $$0, dzx $$1) {
      return new dxn.a($$0, $$1);
   }

   public static dxn b(bmi $$0, dzx $$1) {
      return new dxn(List.of(a($$0, $$1)), ih.b, dtv.c, false);
   }

   public List<dxn.a> a() {
      return this.b;
   }

   public ih b() {
      return this.c;
   }

   public dtv c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bmi b, dzx c) {
      public static final Codec<dxn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bmi.d.fieldOf("height").forGetter(dxn.a::a), dzx.a.fieldOf("provider").forGetter(dxn.a::b)).apply($$0, dxn.a::new)
      );

      public bmi a() {
         return this.b;
      }

      public dzx b() {
         return this.c;
      }
   }
}
