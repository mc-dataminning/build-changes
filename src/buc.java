import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record buc(String d, btz e, float f, bty g, bue h) {
   public static final Codec<buc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(buc::a),
               btz.d.fieldOf("scaling").forGetter(buc::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(buc::c),
               bty.g.optionalFieldOf("effects", bty.a).forGetter(buc::d),
               bue.d.optionalFieldOf("death_message_type", bue.a).forGetter(buc::e)
            )
            .apply($$0, buc::new)
   );
   public static final Codec<jq<buc>> b = alw.a(mb.s);
   public static final zt<xg, jq<buc>> c = zr.b(mb.s);

   public buc(String $$0, btz $$1, float $$2) {
      this($$0, $$1, $$2, bty.a, bue.a);
   }

   public buc(String $$0, btz $$1, float $$2, bty $$3) {
      this($$0, $$1, $$2, $$3, bue.a);
   }

   public buc(String $$0, float $$1, bty $$2) {
      this($$0, btz.b, $$1, $$2);
   }

   public buc(String $$0, float $$1) {
      this($$0, btz.b, $$1);
   }

   public String a() {
      return this.d;
   }

   public btz b() {
      return this.e;
   }

   public float c() {
      return this.f;
   }

   public bty d() {
      return this.g;
   }

   public bue e() {
      return this.h;
   }
}
