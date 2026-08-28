import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record btc(String d, bsz e, float f, bsy g, bte h) {
   public static final Codec<btc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(btc::a),
               bsz.d.fieldOf("scaling").forGetter(btc::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(btc::c),
               bsy.g.optionalFieldOf("effects", bsy.a).forGetter(btc::d),
               bte.d.optionalFieldOf("death_message_type", bte.a).forGetter(btc::e)
            )
            .apply($$0, btc::new)
   );
   public static final Codec<jr<btc>> b = aks.a(mc.s);
   public static final yn<wa, jr<btc>> c = yl.b(mc.s);

   public btc(String $$0, bsz $$1, float $$2) {
      this($$0, $$1, $$2, bsy.a, bte.a);
   }

   public btc(String $$0, bsz $$1, float $$2, bsy $$3) {
      this($$0, $$1, $$2, $$3, bte.a);
   }

   public btc(String $$0, float $$1, bsy $$2) {
      this($$0, bsz.b, $$1, $$2);
   }

   public btc(String $$0, float $$1) {
      this($$0, bsz.b, $$1);
   }

   public String a() {
      return this.d;
   }

   public bsz b() {
      return this.e;
   }

   public float c() {
      return this.f;
   }

   public bsy d() {
      return this.g;
   }

   public bte e() {
      return this.h;
   }
}
