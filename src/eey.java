import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eey(int b, int c, int d, int e, int f, bpw g, float h) implements eeh {
   public static final Codec<eey> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(eey::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(eey::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(eey::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(eey::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(eey::f),
               bpw.c.fieldOf("extra_rare_growths").forGetter(eey::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(eey::h)
            )
            .apply($$0, eey::new)
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
