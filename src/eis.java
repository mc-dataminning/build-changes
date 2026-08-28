import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eis(int b, int c, int d, int e, int f, bro g, float h) implements eib {
   public static final Codec<eis> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(eis::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(eis::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(eis::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(eis::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(eis::f),
               bro.c.fieldOf("extra_rare_growths").forGetter(eis::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(eis::h)
            )
            .apply($$0, eis::new)
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
