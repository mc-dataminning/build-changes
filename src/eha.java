import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eha(int b, int c, int d, int e, int f, brd g, float h) implements egj {
   public static final Codec<eha> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(eha::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(eha::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(eha::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(eha::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(eha::f),
               brd.c.fieldOf("extra_rare_growths").forGetter(eha::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(eha::h)
            )
            .apply($$0, eha::new)
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
