import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dtx(int b, int c, int d, int e, int f, biq g, float h) implements dtg {
   public static final Codec<dtx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(dtx::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(dtx::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(dtx::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(dtx::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(dtx::f),
               biq.c.fieldOf("extra_rare_growths").forGetter(dtx::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(dtx::h)
            )
            .apply($$0, dtx::new)
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
