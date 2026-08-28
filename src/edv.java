import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record edv(int b, int c, int d, int e, int f, bqb g, float h) implements ede {
   public static final Codec<edv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(edv::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(edv::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(edv::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(edv::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(edv::f),
               bqb.c.fieldOf("extra_rare_growths").forGetter(edv::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(edv::h)
            )
            .apply($$0, edv::new)
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
