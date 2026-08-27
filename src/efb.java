import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record efb(int b, int c, int d, int e, int f, bpf g, float h) implements eek {
   public static final Codec<efb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(efb::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(efb::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(efb::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(efb::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(efb::f),
               bpf.c.fieldOf("extra_rare_growths").forGetter(efb::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(efb::h)
            )
            .apply($$0, efb::new)
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
