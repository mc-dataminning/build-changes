import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bqp(String b, bqm c, float d, bql e, bqr f) {
   public static final Codec<bqp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bqp::a),
               bqm.d.fieldOf("scaling").forGetter(bqp::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bqp::c),
               bql.g.optionalFieldOf("effects", bql.a).forGetter(bqp::d),
               bqr.d.optionalFieldOf("death_message_type", bqr.a).forGetter(bqp::e)
            )
            .apply($$0, bqp::new)
   );

   public bqp(String $$0, bqm $$1, float $$2) {
      this($$0, $$1, $$2, bql.a, bqr.a);
   }

   public bqp(String $$0, bqm $$1, float $$2, bql $$3) {
      this($$0, $$1, $$2, $$3, bqr.a);
   }

   public bqp(String $$0, float $$1, bql $$2) {
      this($$0, bqm.b, $$1, $$2);
   }

   public bqp(String $$0, float $$1) {
      this($$0, bqm.b, $$1);
   }

   public String a() {
      return this.b;
   }

   public bqm b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public bql d() {
      return this.e;
   }

   public bqr e() {
      return this.f;
   }
}
