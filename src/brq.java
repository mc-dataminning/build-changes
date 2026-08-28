import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record brq(String b, brn c, float d, brm e, brs f) {
   public static final Codec<brq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(brq::a),
               brn.d.fieldOf("scaling").forGetter(brq::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(brq::c),
               brm.g.optionalFieldOf("effects", brm.a).forGetter(brq::d),
               brs.d.optionalFieldOf("death_message_type", brs.a).forGetter(brq::e)
            )
            .apply($$0, brq::new)
   );

   public brq(String $$0, brn $$1, float $$2) {
      this($$0, $$1, $$2, brm.a, brs.a);
   }

   public brq(String $$0, brn $$1, float $$2, brm $$3) {
      this($$0, $$1, $$2, $$3, brs.a);
   }

   public brq(String $$0, float $$1, brm $$2) {
      this($$0, brn.b, $$1, $$2);
   }

   public brq(String $$0, float $$1) {
      this($$0, brn.b, $$1);
   }

   public String a() {
      return this.b;
   }

   public brn b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public brm d() {
      return this.e;
   }

   public brs e() {
      return this.f;
   }
}
