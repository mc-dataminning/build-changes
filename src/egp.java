import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record egp(int b, int c, int d, int e, int f, bqx g, float h) implements efy {
   public static final Codec<egp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(egp::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(egp::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(egp::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(egp::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(egp::f),
               bqx.c.fieldOf("extra_rare_growths").forGetter(egp::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(egp::h)
            )
            .apply($$0, egp::new)
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
