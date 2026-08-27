import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dnj(int b, int c, int d, int e, int f, bdc g, float h) implements dms {
   public static final Codec<dnj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(dnj::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(dnj::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(dnj::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(dnj::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(dnj::f),
               bdc.c.fieldOf("extra_rare_growths").forGetter(dnj::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(dnj::h)
            )
            .apply($$0, dnj::new)
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
