import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record efp(List<efp.a> b, jk c, ebv d, boolean e) implements efy {
   public static final Codec<efp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efp.a.a.listOf().fieldOf("layers").forGetter(efp::a),
               jk.g.fieldOf("direction").forGetter(efp::b),
               ebv.b.fieldOf("allowed_placement").forGetter(efp::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(efp::d)
            )
            .apply($$0, efp::new)
   );

   public static efp.a a(bqx $$0, ehz $$1) {
      return new efp.a($$0, $$1);
   }

   public static efp b(bqx $$0, ehz $$1) {
      return new efp(List.of(a($$0, $$1)), jk.b, ebv.c, false);
   }

   public List<efp.a> a() {
      return this.b;
   }

   public jk b() {
      return this.c;
   }

   public ebv c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bqx b, ehz c) {
      public static final Codec<efp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bqx.d.fieldOf("height").forGetter(efp.a::a), ehz.a.fieldOf("provider").forGetter(efp.a::b)).apply($$0, efp.a::new)
      );

      public bqx a() {
         return this.b;
      }

      public ehz b() {
         return this.c;
      }
   }
}
