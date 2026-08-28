import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record btt(String d, btq e, float f, btp g, btv h) {
   public static final Codec<btt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(btt::a),
               btq.d.fieldOf("scaling").forGetter(btt::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(btt::c),
               btp.g.optionalFieldOf("effects", btp.a).forGetter(btt::d),
               btv.d.optionalFieldOf("death_message_type", btv.a).forGetter(btt::e)
            )
            .apply($$0, btt::new)
   );
   public static final Codec<jq<btt>> b = alm.a(mb.s);
   public static final zi<wv, jq<btt>> c = zg.b(mb.s);

   public btt(String $$0, btq $$1, float $$2) {
      this($$0, $$1, $$2, btp.a, btv.a);
   }

   public btt(String $$0, btq $$1, float $$2, btp $$3) {
      this($$0, $$1, $$2, $$3, btv.a);
   }

   public btt(String $$0, float $$1, btp $$2) {
      this($$0, btq.b, $$1, $$2);
   }

   public btt(String $$0, float $$1) {
      this($$0, btq.b, $$1);
   }

   public String a() {
      return this.d;
   }

   public btq b() {
      return this.e;
   }

   public float c() {
      return this.f;
   }

   public btp d() {
      return this.g;
   }

   public btv e() {
      return this.h;
   }
}
