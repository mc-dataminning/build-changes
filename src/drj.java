import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record drj(int b, int c, int d, int e, int f, bhg g, float h) implements dqs {
   public static final Codec<drj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(drj::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(drj::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(drj::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(drj::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(drj::f),
               bhg.c.fieldOf("extra_rare_growths").forGetter(drj::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(drj::h)
            )
            .apply($$0, drj::new)
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
