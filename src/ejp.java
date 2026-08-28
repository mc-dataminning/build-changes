import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ejp(int b, int c, int d, int e, int f, bsd g, float h) implements eiy {
   public static final Codec<ejp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(ejp::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(ejp::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(ejp::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(ejp::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(ejp::f),
               bsd.c.fieldOf("extra_rare_growths").forGetter(ejp::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(ejp::h)
            )
            .apply($$0, ejp::new)
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
