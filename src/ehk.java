import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ehk(int b, int c, int d, int e, int f, brm g, float h) implements egt {
   public static final Codec<ehk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(ehk::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(ehk::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(ehk::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(ehk::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(ehk::f),
               brm.c.fieldOf("extra_rare_growths").forGetter(ehk::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(ehk::h)
            )
            .apply($$0, ehk::new)
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
