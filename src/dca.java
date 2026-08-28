import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dca(int d, float e) {
   public static final float a = 5.0F;
   public static final Codec<dca> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ays.l.optionalFieldOf("item_damage_per_attack", 1).forGetter(dca::a),
               ays.n.optionalFieldOf("disable_blocking_for_seconds", 0.0F).forGetter(dca::b)
            )
            .apply($$0, dca::new)
   );
   public static final yu<wh, dca> c = yu.a(ys.h, dca::a, ys.l, dca::b, dca::new);

   public dca(int $$0) {
      this($$0, 0.0F);
   }

   public int a() {
      return this.d;
   }

   public float b() {
      return this.e;
   }
}
