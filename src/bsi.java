import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bsi(String d, bsf e, float f, bse g, bsk h) {
   public static final Codec<bsi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bsi::a),
               bsf.d.fieldOf("scaling").forGetter(bsi::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bsi::c),
               bse.g.optionalFieldOf("effects", bse.a).forGetter(bsi::d),
               bsk.d.optionalFieldOf("death_message_type", bsk.a).forGetter(bsi::e)
            )
            .apply($$0, bsi::new)
   );
   public static final Codec<jn<bsi>> b = akz.a(lv.s);
   public static final zb<wo, jn<bsi>> c = yz.b(lv.s);

   public bsi(String $$0, bsf $$1, float $$2) {
      this($$0, $$1, $$2, bse.a, bsk.a);
   }

   public bsi(String $$0, bsf $$1, float $$2, bse $$3) {
      this($$0, $$1, $$2, $$3, bsk.a);
   }

   public bsi(String $$0, float $$1, bse $$2) {
      this($$0, bsf.b, $$1, $$2);
   }

   public bsi(String $$0, float $$1) {
      this($$0, bsf.b, $$1);
   }

   public String a() {
      return this.d;
   }

   public bsf b() {
      return this.e;
   }

   public float c() {
      return this.f;
   }

   public bse d() {
      return this.g;
   }

   public bsk e() {
      return this.h;
   }
}
