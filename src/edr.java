import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record edr(int b, int c, int d, int e, int f, bpx g, float h) implements eda {
   public static final Codec<edr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(edr::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(edr::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(edr::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(edr::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(edr::f),
               bpx.c.fieldOf("extra_rare_growths").forGetter(edr::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(edr::h)
            )
            .apply($$0, edr::new)
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
