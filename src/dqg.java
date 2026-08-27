import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dqg(int b, int c, int d, int e, int f, bft g, float h) implements dpp {
   public static final Codec<dqg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(dqg::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(dqg::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(dqg::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(dqg::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(dqg::f),
               bft.c.fieldOf("extra_rare_growths").forGetter(dqg::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(dqg::h)
            )
            .apply($$0, dqg::new)
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
