import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eko(List<eko.a> b, ja c, egu d, boolean e) implements ekx {
   public static final Codec<eko> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eko.a.a.listOf().fieldOf("layers").forGetter(eko::a),
               ja.g.fieldOf("direction").forGetter(eko::b),
               egu.b.fieldOf("allowed_placement").forGetter(eko::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(eko::d)
            )
            .apply($$0, eko::new)
   );

   public static eko.a a(btd $$0, emy $$1) {
      return new eko.a($$0, $$1);
   }

   public static eko b(btd $$0, emy $$1) {
      return new eko(List.of(a($$0, $$1)), ja.b, egu.c, false);
   }

   public List<eko.a> a() {
      return this.b;
   }

   public ja b() {
      return this.c;
   }

   public egu c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(btd b, emy c) {
      public static final Codec<eko.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(btd.d.fieldOf("height").forGetter(eko.a::a), emy.a.fieldOf("provider").forGetter(eko.a::b)).apply($$0, eko.a::new)
      );

      public btd a() {
         return this.b;
      }

      public emy b() {
         return this.c;
      }
   }
}
