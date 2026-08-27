import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dwu(int b, int c, int d, int e, int f, blb g, float h) implements dwd {
   public static final Codec<dwu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(dwu::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(dwu::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(dwu::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(dwu::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(dwu::f),
               blb.c.fieldOf("extra_rare_growths").forGetter(dwu::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(dwu::h)
            )
            .apply($$0, dwu::new)
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
