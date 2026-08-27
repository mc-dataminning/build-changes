import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dqm(int b, int c, int d, int e, int f, bfy g, float h) implements dpv {
   public static final Codec<dqm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(dqm::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(dqm::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(dqm::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(dqm::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(dqm::f),
               bfy.c.fieldOf("extra_rare_growths").forGetter(dqm::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(dqm::h)
            )
            .apply($$0, dqm::new)
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
