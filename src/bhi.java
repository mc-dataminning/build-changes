import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bhi(String b, bhf c, float d, bhe e, bhk f) {
   public static final Codec<bhi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bhi::a),
               bhf.d.fieldOf("scaling").forGetter(bhi::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bhi::c),
               bhe.g.optionalFieldOf("effects", bhe.a).forGetter(bhi::d),
               bhk.d.optionalFieldOf("death_message_type", bhk.a).forGetter(bhi::e)
            )
            .apply($$0, bhi::new)
   );

   public bhi(String $$0, bhf $$1, float $$2) {
      this($$0, $$1, $$2, bhe.a, bhk.a);
   }

   public bhi(String $$0, bhf $$1, float $$2, bhe $$3) {
      this($$0, $$1, $$2, $$3, bhk.a);
   }

   public bhi(String $$0, float $$1, bhe $$2) {
      this($$0, bhf.b, $$1, $$2);
   }

   public bhi(String $$0, float $$1) {
      this($$0, bhf.b, $$1);
   }

   public String a() {
      return this.b;
   }

   public bhf b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public bhe d() {
      return this.e;
   }

   public bhk e() {
      return this.f;
   }
}
