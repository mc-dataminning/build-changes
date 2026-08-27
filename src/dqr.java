import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dqr(int b, int c, int d, int e, int f, bgd g, float h) implements dqa {
   public static final Codec<dqr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(dqr::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(dqr::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(dqr::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(dqr::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(dqr::f),
               bgd.c.fieldOf("extra_rare_growths").forGetter(dqr::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(dqr::h)
            )
            .apply($$0, dqr::new)
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
