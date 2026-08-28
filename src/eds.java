import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eds(int b, int c, int d, int e, int f, bpy g, float h) implements edb {
   public static final Codec<eds> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(eds::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(eds::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(eds::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(eds::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(eds::f),
               bpy.c.fieldOf("extra_rare_growths").forGetter(eds::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(eds::h)
            )
            .apply($$0, eds::new)
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
