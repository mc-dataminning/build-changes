import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dxp(int b, int c, int d, int e, int f, blq g, float h) implements dwy {
   public static final Codec<dxp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(dxp::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(dxp::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(dxp::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(dxp::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(dxp::f),
               blq.c.fieldOf("extra_rare_growths").forGetter(dxp::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(dxp::h)
            )
            .apply($$0, dxp::new)
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
