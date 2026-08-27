import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dyl(int b, int c, int d, int e, int f, bmh g, float h) implements dxu {
   public static final Codec<dyl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(dyl::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(dyl::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(dyl::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(dyl::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(dyl::f),
               bmh.c.fieldOf("extra_rare_growths").forGetter(dyl::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(dyl::h)
            )
            .apply($$0, dyl::new)
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
