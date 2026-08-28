import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bub(String d, bty e, float f, btx g, bud h) {
   public static final Codec<bub> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bub::a),
               bty.d.fieldOf("scaling").forGetter(bub::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bub::c),
               btx.g.optionalFieldOf("effects", btx.a).forGetter(bub::d),
               bud.d.optionalFieldOf("death_message_type", bud.a).forGetter(bub::e)
            )
            .apply($$0, bub::new)
   );
   public static final Codec<jq<bub>> b = alw.a(mb.s);
   public static final zt<xg, jq<bub>> c = zr.b(mb.s);

   public bub(String $$0, bty $$1, float $$2) {
      this($$0, $$1, $$2, btx.a, bud.a);
   }

   public bub(String $$0, bty $$1, float $$2, btx $$3) {
      this($$0, $$1, $$2, $$3, bud.a);
   }

   public bub(String $$0, float $$1, btx $$2) {
      this($$0, bty.b, $$1, $$2);
   }

   public bub(String $$0, float $$1) {
      this($$0, bty.b, $$1);
   }

   public String a() {
      return this.d;
   }

   public bty b() {
      return this.e;
   }

   public float c() {
      return this.f;
   }

   public btx d() {
      return this.g;
   }

   public bud e() {
      return this.h;
   }
}
