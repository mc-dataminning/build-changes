import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dqt(int b, int c, int d, int e, int f, bgf g, float h) implements dqc {
   public static final Codec<dqt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(dqt::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(dqt::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(dqt::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(dqt::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(dqt::f),
               bgf.c.fieldOf("extra_rare_growths").forGetter(dqt::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(dqt::h)
            )
            .apply($$0, dqt::new)
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
