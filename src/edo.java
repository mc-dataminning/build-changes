import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record edo(int b, int c, int d, int e, int f, bpu g, float h) implements ecx {
   public static final Codec<edo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(edo::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(edo::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(edo::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(edo::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(edo::f),
               bpu.c.fieldOf("extra_rare_growths").forGetter(edo::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(edo::h)
            )
            .apply($$0, edo::new)
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
