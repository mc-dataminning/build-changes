import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ens(int b, int c, int d, int e, int f, buh g, float h) implements enb {
   public static final Codec<ens> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(ens::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(ens::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(ens::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(ens::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(ens::f),
               buh.c.fieldOf("extra_rare_growths").forGetter(ens::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(ens::h)
            )
            .apply($$0, ens::new)
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
