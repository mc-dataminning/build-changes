import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dyn(int b, int c, int d, int e, int f, bmi g, float h) implements dxw {
   public static final Codec<dyn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(dyn::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(dyn::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(dyn::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(dyn::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(dyn::f),
               bmi.c.fieldOf("extra_rare_growths").forGetter(dyn::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(dyn::h)
            )
            .apply($$0, dyn::new)
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
