import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record brp(String b, brm c, float d, brl e, brr f) {
   public static final Codec<brp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(brp::a),
               brm.d.fieldOf("scaling").forGetter(brp::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(brp::c),
               brl.g.optionalFieldOf("effects", brl.a).forGetter(brp::d),
               brr.d.optionalFieldOf("death_message_type", brr.a).forGetter(brp::e)
            )
            .apply($$0, brp::new)
   );

   public brp(String $$0, brm $$1, float $$2) {
      this($$0, $$1, $$2, brl.a, brr.a);
   }

   public brp(String $$0, brm $$1, float $$2, brl $$3) {
      this($$0, $$1, $$2, $$3, brr.a);
   }

   public brp(String $$0, float $$1, brl $$2) {
      this($$0, brm.b, $$1, $$2);
   }

   public brp(String $$0, float $$1) {
      this($$0, brm.b, $$1);
   }

   public String a() {
      return this.b;
   }

   public brm b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public brl d() {
      return this.e;
   }

   public brr e() {
      return this.f;
   }
}
