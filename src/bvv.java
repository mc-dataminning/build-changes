import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bvv(String d, bvs e, float f, bvr g, bvx h) {
   public static final Codec<bvv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bvv::a),
               bvs.d.fieldOf("scaling").forGetter(bvv::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bvv::c),
               bvr.g.optionalFieldOf("effects", bvr.a).forGetter(bvv::d),
               bvx.d.optionalFieldOf("death_message_type", bvx.a).forGetter(bvv::e)
            )
            .apply($$0, bvv::new)
   );
   public static final Codec<jg<bvv>> b = alo.a(mi.aN);
   public static final ze<wp, jg<bvv>> c = zc.b(mi.aN);

   public bvv(String $$0, bvs $$1, float $$2) {
      this($$0, $$1, $$2, bvr.a, bvx.a);
   }

   public bvv(String $$0, bvs $$1, float $$2, bvr $$3) {
      this($$0, $$1, $$2, $$3, bvx.a);
   }

   public bvv(String $$0, float $$1, bvr $$2) {
      this($$0, bvs.b, $$1, $$2);
   }

   public bvv(String $$0, float $$1) {
      this($$0, bvs.b, $$1);
   }

   public String a() {
      return this.d;
   }

   public bvs b() {
      return this.e;
   }

   public float c() {
      return this.f;
   }

   public bvr d() {
      return this.g;
   }

   public bvx e() {
      return this.h;
   }
}
