import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bsd(String d, bsa e, float f, brz g, bsf h) {
   public static final Codec<bsd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bsd::a),
               bsa.d.fieldOf("scaling").forGetter(bsd::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bsd::c),
               brz.g.optionalFieldOf("effects", brz.a).forGetter(bsd::d),
               bsf.d.optionalFieldOf("death_message_type", bsf.a).forGetter(bsd::e)
            )
            .apply($$0, bsd::new)
   );
   public static final Codec<jn<bsd>> b = aky.a(lv.s);
   public static final zb<wo, jn<bsd>> c = yz.b(lv.s);

   public bsd(String $$0, bsa $$1, float $$2) {
      this($$0, $$1, $$2, brz.a, bsf.a);
   }

   public bsd(String $$0, bsa $$1, float $$2, brz $$3) {
      this($$0, $$1, $$2, $$3, bsf.a);
   }

   public bsd(String $$0, float $$1, brz $$2) {
      this($$0, bsa.b, $$1, $$2);
   }

   public bsd(String $$0, float $$1) {
      this($$0, bsa.b, $$1);
   }

   public String a() {
      return this.d;
   }

   public bsa b() {
      return this.e;
   }

   public float c() {
      return this.f;
   }

   public brz d() {
      return this.g;
   }

   public bsf e() {
      return this.h;
   }
}
