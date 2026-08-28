import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record egl(int b, int c, int d, int e, int f, bqu g, float h) implements efu {
   public static final Codec<egl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(egl::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(egl::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(egl::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(egl::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(egl::f),
               bqu.c.fieldOf("extra_rare_growths").forGetter(egl::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(egl::h)
            )
            .apply($$0, egl::new)
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
