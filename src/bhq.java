import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bhq(String b, bhn c, float d, bhm e, bhs f) {
   public static final Codec<bhq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bhq::a),
               bhn.d.fieldOf("scaling").forGetter(bhq::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bhq::c),
               bhm.g.optionalFieldOf("effects", bhm.a).forGetter(bhq::d),
               bhs.d.optionalFieldOf("death_message_type", bhs.a).forGetter(bhq::e)
            )
            .apply($$0, bhq::new)
   );

   public bhq(String $$0, bhn $$1, float $$2) {
      this($$0, $$1, $$2, bhm.a, bhs.a);
   }

   public bhq(String $$0, bhn $$1, float $$2, bhm $$3) {
      this($$0, $$1, $$2, $$3, bhs.a);
   }

   public bhq(String $$0, float $$1, bhm $$2) {
      this($$0, bhn.b, $$1, $$2);
   }

   public bhq(String $$0, float $$1) {
      this($$0, bhn.b, $$1);
   }

   public String a() {
      return this.b;
   }

   public bhn b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public bhm d() {
      return this.e;
   }

   public bhs e() {
      return this.f;
   }
}
