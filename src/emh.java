import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record emh(int b, int c, int d, int e, int f, bti g, float h) implements elq {
   public static final Codec<emh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(emh::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(emh::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(emh::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(emh::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(emh::f),
               bti.c.fieldOf("extra_rare_growths").forGetter(emh::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(emh::h)
            )
            .apply($$0, emh::new)
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
