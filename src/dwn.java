import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dwn(int b, int c, int d, int e, int f, bkz g, float h) implements dvw {
   public static final Codec<dwn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(dwn::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(dwn::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(dwn::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(dwn::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(dwn::f),
               bkz.c.fieldOf("extra_rare_growths").forGetter(dwn::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(dwn::h)
            )
            .apply($$0, dwn::new)
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
