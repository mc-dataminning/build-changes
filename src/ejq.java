import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ejq(int b, int c, int d, int e, int f, bsn g, float h) implements eiz {
   public static final Codec<ejq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(ejq::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(ejq::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(ejq::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(ejq::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(ejq::f),
               bsn.c.fieldOf("extra_rare_growths").forGetter(ejq::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(ejq::h)
            )
            .apply($$0, ejq::new)
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
