import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bta(String d, bsx e, float f, bsw g, btc h) {
   public static final Codec<bta> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bta::a),
               bsx.d.fieldOf("scaling").forGetter(bta::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bta::c),
               bsw.g.optionalFieldOf("effects", bsw.a).forGetter(bta::d),
               btc.d.optionalFieldOf("death_message_type", btc.a).forGetter(bta::e)
            )
            .apply($$0, bta::new)
   );
   public static final Codec<jq<bta>> b = ali.a(ma.s);
   public static final zj<ww, jq<bta>> c = zh.b(ma.s);

   public bta(String $$0, bsx $$1, float $$2) {
      this($$0, $$1, $$2, bsw.a, btc.a);
   }

   public bta(String $$0, bsx $$1, float $$2, bsw $$3) {
      this($$0, $$1, $$2, $$3, btc.a);
   }

   public bta(String $$0, float $$1, bsw $$2) {
      this($$0, bsx.b, $$1, $$2);
   }

   public bta(String $$0, float $$1) {
      this($$0, bsx.b, $$1);
   }

   public String a() {
      return this.d;
   }

   public bsx b() {
      return this.e;
   }

   public float c() {
      return this.f;
   }

   public bsw d() {
      return this.g;
   }

   public btc e() {
      return this.h;
   }
}
