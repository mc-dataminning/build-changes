import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record btx(String d, btu e, float f, btt g, btz h) {
   public static final Codec<btx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(btx::a),
               btu.d.fieldOf("scaling").forGetter(btx::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(btx::c),
               btt.g.optionalFieldOf("effects", btt.a).forGetter(btx::d),
               btz.d.optionalFieldOf("death_message_type", btz.a).forGetter(btx::e)
            )
            .apply($$0, btx::new)
   );
   public static final Codec<jq<btx>> b = alw.a(mb.s);
   public static final zt<xg, jq<btx>> c = zr.b(mb.s);

   public btx(String $$0, btu $$1, float $$2) {
      this($$0, $$1, $$2, btt.a, btz.a);
   }

   public btx(String $$0, btu $$1, float $$2, btt $$3) {
      this($$0, $$1, $$2, $$3, btz.a);
   }

   public btx(String $$0, float $$1, btt $$2) {
      this($$0, btu.b, $$1, $$2);
   }

   public btx(String $$0, float $$1) {
      this($$0, btu.b, $$1);
   }

   public String a() {
      return this.d;
   }

   public btu b() {
      return this.e;
   }

   public float c() {
      return this.f;
   }

   public btt d() {
      return this.g;
   }

   public btz e() {
      return this.h;
   }
}
