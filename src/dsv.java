import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dsv(int b, int c, int d, int e, int f, big g, float h) implements dse {
   public static final Codec<dsv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(dsv::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(dsv::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(dsv::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(dsv::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(dsv::f),
               big.c.fieldOf("extra_rare_growths").forGetter(dsv::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(dsv::h)
            )
            .apply($$0, dsv::new)
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
