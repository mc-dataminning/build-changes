import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record edt(int b, int c, int d, int e, int f, bpz g, float h) implements edc {
   public static final Codec<edt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(edt::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(edt::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(edt::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(edt::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(edt::f),
               bpz.c.fieldOf("extra_rare_growths").forGetter(edt::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(edt::h)
            )
            .apply($$0, edt::new)
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
