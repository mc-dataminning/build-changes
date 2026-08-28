import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record btd(String d, bta e, float f, bsz g, btf h) {
   public static final Codec<btd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(btd::a),
               bta.d.fieldOf("scaling").forGetter(btd::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(btd::c),
               bsz.g.optionalFieldOf("effects", bsz.a).forGetter(btd::d),
               btf.d.optionalFieldOf("death_message_type", btf.a).forGetter(btd::e)
            )
            .apply($$0, btd::new)
   );
   public static final Codec<jr<btd>> b = aks.a(mc.s);
   public static final yn<wa, jr<btd>> c = yl.b(mc.s);

   public btd(String $$0, bta $$1, float $$2) {
      this($$0, $$1, $$2, bsz.a, btf.a);
   }

   public btd(String $$0, bta $$1, float $$2, bsz $$3) {
      this($$0, $$1, $$2, $$3, btf.a);
   }

   public btd(String $$0, float $$1, bsz $$2) {
      this($$0, bta.b, $$1, $$2);
   }

   public btd(String $$0, float $$1) {
      this($$0, bta.b, $$1);
   }

   public String a() {
      return this.d;
   }

   public bta b() {
      return this.e;
   }

   public float c() {
      return this.f;
   }

   public bsz d() {
      return this.g;
   }

   public btf e() {
      return this.h;
   }
}
