import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record duo(int b, int c, int d, int e, int f, bjf g, float h) implements dtx {
   public static final Codec<duo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(duo::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(duo::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(duo::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(duo::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(duo::f),
               bjf.c.fieldOf("extra_rare_growths").forGetter(duo::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(duo::h)
            )
            .apply($$0, duo::new)
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
