import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcs(int d, float e) {
   public static final float a = 5.0F;
   public static final Codec<dcs> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayu.l.optionalFieldOf("item_damage_per_attack", 1).forGetter(dcs::a),
               ayu.n.optionalFieldOf("disable_blocking_for_seconds", 0.0F).forGetter(dcs::b)
            )
            .apply($$0, dcs::new)
   );
   public static final yw<wj, dcs> c = yw.a(yu.h, dcs::a, yu.l, dcs::b, dcs::new);

   public dcs(int $$0) {
      this($$0, 0.0F);
   }

   public int a() {
      return this.d;
   }

   public float b() {
      return this.e;
   }
}
