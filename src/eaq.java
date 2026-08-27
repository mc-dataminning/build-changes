import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eaq(int b, int c, int d, int e, int f, bnf g, float h) implements dzz {
   public static final Codec<eaq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(eaq::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(eaq::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(eaq::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(eaq::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(eaq::f),
               bnf.c.fieldOf("extra_rare_growths").forGetter(eaq::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(eaq::h)
            )
            .apply($$0, eaq::new)
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
