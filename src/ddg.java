import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddg(int d, float e) {
   public static final float a = 5.0F;
   public static final Codec<ddg> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayw.l.optionalFieldOf("item_damage_per_attack", 1).forGetter(ddg::a),
               ayw.n.optionalFieldOf("disable_blocking_for_seconds", 0.0F).forGetter(ddg::b)
            )
            .apply($$0, ddg::new)
   );
   public static final yy<wl, ddg> c = yy.a(yw.h, ddg::a, yw.l, ddg::b, ddg::new);

   public ddg(int $$0) {
      this($$0, 0.0F);
   }

   public int a() {
      return this.d;
   }

   public float b() {
      return this.e;
   }
}
