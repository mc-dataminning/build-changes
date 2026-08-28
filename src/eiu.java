import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eiu(int b, int c, int d, int e, int f, brq g, float h) implements eid {
   public static final Codec<eiu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(eiu::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(eiu::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(eiu::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(eiu::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(eiu::f),
               brq.c.fieldOf("extra_rare_growths").forGetter(eiu::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(eiu::h)
            )
            .apply($$0, eiu::new)
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
