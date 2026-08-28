import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ehr(int b, int c, int d, int e, int f, brp g, float h) implements eha {
   public static final Codec<ehr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(ehr::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(ehr::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(ehr::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(ehr::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(ehr::f),
               brp.c.fieldOf("extra_rare_growths").forGetter(ehr::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(ehr::h)
            )
            .apply($$0, ehr::new)
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
