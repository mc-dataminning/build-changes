import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eit(int b, int c, int d, int e, int f, bro g, float h) implements eic {
   public static final Codec<eit> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(eit::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(eit::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(eit::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(eit::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(eit::f),
               bro.c.fieldOf("extra_rare_growths").forGetter(eit::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(eit::h)
            )
            .apply($$0, eit::new)
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
