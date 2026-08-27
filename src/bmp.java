import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bmp(String b, bmm c, float d, bml e, bmr f) {
   public static final Codec<bmp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bmp::a),
               bmm.d.fieldOf("scaling").forGetter(bmp::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bmp::c),
               bml.g.optionalFieldOf("effects", bml.a).forGetter(bmp::d),
               bmr.d.optionalFieldOf("death_message_type", bmr.a).forGetter(bmp::e)
            )
            .apply($$0, bmp::new)
   );

   public bmp(String $$0, bmm $$1, float $$2) {
      this($$0, $$1, $$2, bml.a, bmr.a);
   }

   public bmp(String $$0, bmm $$1, float $$2, bml $$3) {
      this($$0, $$1, $$2, $$3, bmr.a);
   }

   public bmp(String $$0, float $$1, bml $$2) {
      this($$0, bmm.b, $$1, $$2);
   }

   public bmp(String $$0, float $$1) {
      this($$0, bmm.b, $$1);
   }

   public String a() {
      return this.b;
   }

   public bmm b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public bml d() {
      return this.e;
   }

   public bmr e() {
      return this.f;
   }
}
