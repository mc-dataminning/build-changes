import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dse(int b, int c, int d, int e, int f, bhv g, float h) implements drn {
   public static final Codec<dse> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(dse::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(dse::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(dse::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(dse::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(dse::f),
               bhv.c.fieldOf("extra_rare_growths").forGetter(dse::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(dse::h)
            )
            .apply($$0, dse::new)
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
