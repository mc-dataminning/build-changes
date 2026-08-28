import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcg(int d, float e) {
   public static final float a = 5.0F;
   public static final Codec<dcg> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayu.l.optionalFieldOf("item_damage_per_attack", 1).forGetter(dcg::a),
               ayu.n.optionalFieldOf("disable_blocking_for_seconds", 0.0F).forGetter(dcg::b)
            )
            .apply($$0, dcg::new)
   );
   public static final yw<wj, dcg> c = yw.a(yu.h, dcg::a, yu.l, dcg::b, dcg::new);

   public dcg(int $$0) {
      this($$0, 0.0F);
   }

   public int a() {
      return this.d;
   }

   public float b() {
      return this.e;
   }
}
