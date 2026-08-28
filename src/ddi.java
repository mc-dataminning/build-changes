import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddi(int d, float e) {
   public static final float a = 5.0F;
   public static final Codec<ddi> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayy.l.optionalFieldOf("item_damage_per_attack", 1).forGetter(ddi::a),
               ayy.n.optionalFieldOf("disable_blocking_for_seconds", 0.0F).forGetter(ddi::b)
            )
            .apply($$0, ddi::new)
   );
   public static final za<wn, ddi> c = za.a(yy.h, ddi::a, yy.l, ddi::b, ddi::new);

   public ddi(int $$0) {
      this($$0, 0.0F);
   }

   public int a() {
      return this.d;
   }

   public float b() {
      return this.e;
   }
}
