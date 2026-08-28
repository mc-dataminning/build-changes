import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ehg(int b, int c, int d, int e, int f, bri g, float h) implements egp {
   public static final Codec<ehg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(ehg::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(ehg::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(ehg::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(ehg::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(ehg::f),
               bri.c.fieldOf("extra_rare_growths").forGetter(ehg::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(ehg::h)
            )
            .apply($$0, ehg::new)
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
