import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eev(int b, int c, int d, int e, int f, bpv g, float h) implements eee {
   public static final Codec<eev> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(eev::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(eev::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(eev::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(eev::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(eev::f),
               bpv.c.fieldOf("extra_rare_growths").forGetter(eev::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(eev::h)
            )
            .apply($$0, eev::new)
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
