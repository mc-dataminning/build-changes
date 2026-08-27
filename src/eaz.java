import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eaz(int b, int c, int d, int e, int f, bnk g, float h) implements eai {
   public static final Codec<eaz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(eaz::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(eaz::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(eaz::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(eaz::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(eaz::f),
               bnk.c.fieldOf("extra_rare_growths").forGetter(eaz::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(eaz::h)
            )
            .apply($$0, eaz::new)
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
