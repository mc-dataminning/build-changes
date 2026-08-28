import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record elo(int b, int c, int d, int e, int f, btd g, float h) implements ekx {
   public static final Codec<elo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(elo::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(elo::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(elo::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(elo::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(elo::f),
               btd.c.fieldOf("extra_rare_growths").forGetter(elo::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(elo::h)
            )
            .apply($$0, elo::new)
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
