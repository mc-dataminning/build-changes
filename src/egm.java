import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record egm(eiy b, ecm c, bri d, int e) implements egp {
   public static final Codec<egm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eiy.a.fieldOf("state_provider").forGetter(egm::a),
               ecm.b.fieldOf("target").forGetter(egm::b),
               bri.b(0, 8).fieldOf("radius").forGetter(egm::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(egm::d)
            )
            .apply($$0, egm::new)
   );

   public eiy a() {
      return this.b;
   }

   public ecm b() {
      return this.c;
   }

   public bri c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
