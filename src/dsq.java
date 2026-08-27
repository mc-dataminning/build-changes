import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dsq(int b, int c, int d, int e, int f, bic g, float h) implements drz {
   public static final Codec<dsq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(dsq::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(dsq::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(dsq::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(dsq::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(dsq::f),
               bic.c.fieldOf("extra_rare_growths").forGetter(dsq::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(dsq::h)
            )
            .apply($$0, dsq::new)
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
