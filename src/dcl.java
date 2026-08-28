import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcl(int d, float e) {
   public static final float a = 5.0F;
   public static final Codec<dcl> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayu.l.optionalFieldOf("item_damage_per_attack", 1).forGetter(dcl::a),
               ayu.n.optionalFieldOf("disable_blocking_for_seconds", 0.0F).forGetter(dcl::b)
            )
            .apply($$0, dcl::new)
   );
   public static final yw<wj, dcl> c = yw.a(yu.h, dcl::a, yu.l, dcl::b, dcl::new);

   public dcl(int $$0) {
      this($$0, 0.0F);
   }

   public int a() {
      return this.d;
   }

   public float b() {
      return this.e;
   }
}
