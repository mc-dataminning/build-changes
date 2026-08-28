import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dds(int d, float e) {
   public static final float a = 5.0F;
   public static final Codec<dds> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azg.l.optionalFieldOf("item_damage_per_attack", 1).forGetter(dds::a),
               azg.n.optionalFieldOf("disable_blocking_for_seconds", 0.0F).forGetter(dds::b)
            )
            .apply($$0, dds::new)
   );
   public static final ze<wp, dds> c = ze.a(zc.h, dds::a, zc.l, dds::b, dds::new);

   public dds(int $$0) {
      this($$0, 0.0F);
   }

   public int a() {
      return this.d;
   }

   public float b() {
      return this.e;
   }
}
