import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bqr(String b, bqo c, float d, bqn e, bqt f) {
   public static final Codec<bqr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bqr::a),
               bqo.d.fieldOf("scaling").forGetter(bqr::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bqr::c),
               bqn.g.optionalFieldOf("effects", bqn.a).forGetter(bqr::d),
               bqt.d.optionalFieldOf("death_message_type", bqt.a).forGetter(bqr::e)
            )
            .apply($$0, bqr::new)
   );

   public bqr(String $$0, bqo $$1, float $$2) {
      this($$0, $$1, $$2, bqn.a, bqt.a);
   }

   public bqr(String $$0, bqo $$1, float $$2, bqn $$3) {
      this($$0, $$1, $$2, $$3, bqt.a);
   }

   public bqr(String $$0, float $$1, bqn $$2) {
      this($$0, bqo.b, $$1, $$2);
   }

   public bqr(String $$0, float $$1) {
      this($$0, bqo.b, $$1);
   }

   public String a() {
      return this.b;
   }

   public bqo b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public bqn d() {
      return this.e;
   }

   public bqt e() {
      return this.f;
   }
}
