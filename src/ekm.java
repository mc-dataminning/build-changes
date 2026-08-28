import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ekm(int b, int c, int d, int e, int f, bsv g, float h) implements ejv {
   public static final Codec<ekm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(ekm::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(ekm::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(ekm::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(ekm::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(ekm::f),
               bsv.c.fieldOf("extra_rare_growths").forGetter(ekm::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(ekm::h)
            )
            .apply($$0, ekm::new)
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
