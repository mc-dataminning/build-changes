import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dqi(int b, int c, int d, int e, int f, bfv g, float h) implements dpr {
   public static final Codec<dqi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(dqi::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(dqi::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(dqi::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(dqi::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(dqi::f),
               bfv.c.fieldOf("extra_rare_growths").forGetter(dqi::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(dqi::h)
            )
            .apply($$0, dqi::new)
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
