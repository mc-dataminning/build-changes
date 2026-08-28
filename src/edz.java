import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record edz(int b, int c, int d, int e, int f, bpi g, float h) implements edi {
   public static final Codec<edz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(edz::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(edz::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(edz::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(edz::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(edz::f),
               bpi.c.fieldOf("extra_rare_growths").forGetter(edz::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(edz::h)
            )
            .apply($$0, edz::new)
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
