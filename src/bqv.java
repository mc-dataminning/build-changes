import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bqv(String b, bqs c, float d, bqr e, bqx f) {
   public static final Codec<bqv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bqv::a),
               bqs.d.fieldOf("scaling").forGetter(bqv::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bqv::c),
               bqr.g.optionalFieldOf("effects", bqr.a).forGetter(bqv::d),
               bqx.d.optionalFieldOf("death_message_type", bqx.a).forGetter(bqv::e)
            )
            .apply($$0, bqv::new)
   );

   public bqv(String $$0, bqs $$1, float $$2) {
      this($$0, $$1, $$2, bqr.a, bqx.a);
   }

   public bqv(String $$0, bqs $$1, float $$2, bqr $$3) {
      this($$0, $$1, $$2, $$3, bqx.a);
   }

   public bqv(String $$0, float $$1, bqr $$2) {
      this($$0, bqs.b, $$1, $$2);
   }

   public bqv(String $$0, float $$1) {
      this($$0, bqs.b, $$1);
   }

   public String a() {
      return this.b;
   }

   public bqs b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public bqr d() {
      return this.e;
   }

   public bqx e() {
      return this.f;
   }
}
