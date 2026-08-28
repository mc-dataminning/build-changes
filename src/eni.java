import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eni(int b, int c, int d, int e, int f, bty g, float h) implements emr {
   public static final Codec<eni> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(eni::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(eni::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(eni::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(eni::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(eni::f),
               bty.c.fieldOf("extra_rare_growths").forGetter(eni::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(eni::h)
            )
            .apply($$0, eni::new)
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
