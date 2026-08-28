import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcv(int d, float e) {
   public static final float a = 5.0F;
   public static final Codec<dcv> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayu.l.optionalFieldOf("item_damage_per_attack", 1).forGetter(dcv::a),
               ayu.n.optionalFieldOf("disable_blocking_for_seconds", 0.0F).forGetter(dcv::b)
            )
            .apply($$0, dcv::new)
   );
   public static final yw<wj, dcv> c = yw.a(yu.h, dcv::a, yu.l, dcv::b, dcv::new);

   public dcv(int $$0) {
      this($$0, 0.0F);
   }

   public int a() {
      return this.d;
   }

   public float b() {
      return this.e;
   }
}
