import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bvk(String d, bvh e, float f, bvg g, bvm h) {
   public static final Codec<bvk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bvk::a),
               bvh.d.fieldOf("scaling").forGetter(bvk::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bvk::c),
               bvg.g.optionalFieldOf("effects", bvg.a).forGetter(bvk::d),
               bvm.d.optionalFieldOf("death_message_type", bvm.a).forGetter(bvk::e)
            )
            .apply($$0, bvk::new)
   );
   public static final Codec<jf<bvk>> b = alf.a(mh.aN);
   public static final yy<wl, jf<bvk>> c = yw.b(mh.aN);

   public bvk(String $$0, bvh $$1, float $$2) {
      this($$0, $$1, $$2, bvg.a, bvm.a);
   }

   public bvk(String $$0, bvh $$1, float $$2, bvg $$3) {
      this($$0, $$1, $$2, $$3, bvm.a);
   }

   public bvk(String $$0, float $$1, bvg $$2) {
      this($$0, bvh.b, $$1, $$2);
   }

   public bvk(String $$0, float $$1) {
      this($$0, bvh.b, $$1);
   }

   public String a() {
      return this.d;
   }

   public bvh b() {
      return this.e;
   }

   public float c() {
      return this.f;
   }

   public bvg d() {
      return this.g;
   }

   public bvm e() {
      return this.h;
   }
}
