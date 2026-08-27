import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dux(int b, int c, int d, int e, int f, bjh g, float h) implements dug {
   public static final Codec<dux> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(dux::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(dux::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(dux::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(dux::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(dux::f),
               bjh.c.fieldOf("extra_rare_growths").forGetter(dux::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(dux::h)
            )
            .apply($$0, dux::new)
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
