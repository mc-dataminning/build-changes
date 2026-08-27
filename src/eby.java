import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eby(int b, int c, int d, int e, int f, bor g, float h) implements ebh {
   public static final Codec<eby> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(eby::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(eby::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(eby::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(eby::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(eby::f),
               bor.c.fieldOf("extra_rare_growths").forGetter(eby::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(eby::h)
            )
            .apply($$0, eby::new)
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
