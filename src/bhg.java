import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bhg(String b, bhd c, float d, bhc e, bhi f) {
   public static final Codec<bhg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bhg::a),
               bhd.d.fieldOf("scaling").forGetter(bhg::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bhg::c),
               bhc.g.optionalFieldOf("effects", bhc.a).forGetter(bhg::d),
               bhi.d.optionalFieldOf("death_message_type", bhi.a).forGetter(bhg::e)
            )
            .apply($$0, bhg::new)
   );

   public bhg(String $$0, bhd $$1, float $$2) {
      this($$0, $$1, $$2, bhc.a, bhi.a);
   }

   public bhg(String $$0, bhd $$1, float $$2, bhc $$3) {
      this($$0, $$1, $$2, $$3, bhi.a);
   }

   public bhg(String $$0, float $$1, bhc $$2) {
      this($$0, bhd.b, $$1, $$2);
   }

   public bhg(String $$0, float $$1) {
      this($$0, bhd.b, $$1);
   }

   public String a() {
      return this.b;
   }

   public bhd b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public bhc d() {
      return this.e;
   }

   public bhi e() {
      return this.f;
   }
}
