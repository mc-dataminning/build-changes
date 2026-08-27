import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bqh(String b, bqe c, float d, bqd e, bqj f) {
   public static final Codec<bqh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bqh::a),
               bqe.d.fieldOf("scaling").forGetter(bqh::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bqh::c),
               bqd.g.optionalFieldOf("effects", bqd.a).forGetter(bqh::d),
               bqj.d.optionalFieldOf("death_message_type", bqj.a).forGetter(bqh::e)
            )
            .apply($$0, bqh::new)
   );

   public bqh(String $$0, bqe $$1, float $$2) {
      this($$0, $$1, $$2, bqd.a, bqj.a);
   }

   public bqh(String $$0, bqe $$1, float $$2, bqd $$3) {
      this($$0, $$1, $$2, $$3, bqj.a);
   }

   public bqh(String $$0, float $$1, bqd $$2) {
      this($$0, bqe.b, $$1, $$2);
   }

   public bqh(String $$0, float $$1) {
      this($$0, bqe.b, $$1);
   }

   public String a() {
      return this.b;
   }

   public bqe b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public bqd d() {
      return this.e;
   }

   public bqj e() {
      return this.f;
   }
}
