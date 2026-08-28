import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record elz(int b, int c, int d, int e, int f, btg g, float h) implements eli {
   public static final Codec<elz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(elz::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(elz::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(elz::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(elz::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(elz::f),
               btg.c.fieldOf("extra_rare_growths").forGetter(elz::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(elz::h)
            )
            .apply($$0, elz::new)
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
