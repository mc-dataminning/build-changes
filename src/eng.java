import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eng(int b, int c, int d, int e, int f, btw g, float h) implements emp {
   public static final Codec<eng> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(eng::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(eng::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(eng::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(eng::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(eng::f),
               btw.c.fieldOf("extra_rare_growths").forGetter(eng::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(eng::h)
            )
            .apply($$0, eng::new)
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
