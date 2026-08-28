import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ejk(int b, int c, int d, int e, int f, bsf g, float h) implements eit {
   public static final Codec<ejk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(ejk::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(ejk::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(ejk::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(ejk::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(ejk::f),
               bsf.c.fieldOf("extra_rare_growths").forGetter(ejk::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(ejk::h)
            )
            .apply($$0, ejk::new)
   );

   public int a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
