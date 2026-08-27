import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bkp(String b, bkm c, float d, bkl e, bkr f) {
   public static final Codec<bkp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bkp::a),
               bkm.d.fieldOf("scaling").forGetter(bkp::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bkp::c),
               bkl.g.optionalFieldOf("effects", bkl.a).forGetter(bkp::d),
               bkr.d.optionalFieldOf("death_message_type", bkr.a).forGetter(bkp::e)
            )
            .apply($$0, bkp::new)
   );

   public bkp(String $$0, bkm $$1, float $$2) {
      this($$0, $$1, $$2, bkl.a, bkr.a);
   }

   public bkp(String $$0, bkm $$1, float $$2, bkl $$3) {
      this($$0, $$1, $$2, $$3, bkr.a);
   }

   public bkp(String $$0, float $$1, bkl $$2) {
      this($$0, bkm.b, $$1, $$2);
   }

   public bkp(String $$0, float $$1) {
      this($$0, bkm.b, $$1);
   }

   public String a() {
      return this.b;
   }

   public bkm b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public bkl d() {
      return this.e;
   }

   public bkr e() {
      return this.f;
   }
}
