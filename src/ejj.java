import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ejj(int b, int c, int d, int e, int f, bsj g, float h) implements eis {
   public static final Codec<ejj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(ejj::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(ejj::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(ejj::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(ejj::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(ejj::f),
               bsj.c.fieldOf("extra_rare_growths").forGetter(ejj::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(ejj::h)
            )
            .apply($$0, ejj::new)
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
