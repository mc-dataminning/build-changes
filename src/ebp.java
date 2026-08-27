import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ebp(int b, int c, int d, int e, int f, bnv g, float h) implements eay {
   public static final Codec<ebp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(ebp::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(ebp::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(ebp::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(ebp::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(ebp::f),
               bnv.c.fieldOf("extra_rare_growths").forGetter(ebp::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(ebp::h)
            )
            .apply($$0, ebp::new)
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
