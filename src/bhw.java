import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bhw(String b, bht c, float d, bhs e, bhy f) {
   public static final Codec<bhw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bhw::a),
               bht.d.fieldOf("scaling").forGetter(bhw::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bhw::c),
               bhs.g.optionalFieldOf("effects", bhs.a).forGetter(bhw::d),
               bhy.d.optionalFieldOf("death_message_type", bhy.a).forGetter(bhw::e)
            )
            .apply($$0, bhw::new)
   );

   public bhw(String $$0, bht $$1, float $$2) {
      this($$0, $$1, $$2, bhs.a, bhy.a);
   }

   public bhw(String $$0, bht $$1, float $$2, bhs $$3) {
      this($$0, $$1, $$2, $$3, bhy.a);
   }

   public bhw(String $$0, float $$1, bhs $$2) {
      this($$0, bht.b, $$1, $$2);
   }

   public bhw(String $$0, float $$1) {
      this($$0, bht.b, $$1);
   }

   public String a() {
      return this.b;
   }

   public bht b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public bhs d() {
      return this.e;
   }

   public bhy e() {
      return this.f;
   }
}
