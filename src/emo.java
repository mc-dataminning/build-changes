import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record emo(int b, int c, int d, int e, int f, btl g, float h) implements elx {
   public static final Codec<emo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(emo::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(emo::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(emo::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(emo::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(emo::f),
               btl.c.fieldOf("extra_rare_growths").forGetter(emo::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(emo::h)
            )
            .apply($$0, emo::new)
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
