import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bte(String d, btb e, float f, bta g, btg h) {
   public static final Codec<bte> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bte::a),
               btb.d.fieldOf("scaling").forGetter(bte::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bte::c),
               bta.g.optionalFieldOf("effects", bta.a).forGetter(bte::d),
               btg.d.optionalFieldOf("death_message_type", btg.a).forGetter(bte::e)
            )
            .apply($$0, bte::new)
   );
   public static final Codec<jr<bte>> b = aks.a(mc.s);
   public static final yn<wa, jr<bte>> c = yl.b(mc.s);

   public bte(String $$0, btb $$1, float $$2) {
      this($$0, $$1, $$2, bta.a, btg.a);
   }

   public bte(String $$0, btb $$1, float $$2, bta $$3) {
      this($$0, $$1, $$2, $$3, btg.a);
   }

   public bte(String $$0, float $$1, bta $$2) {
      this($$0, btb.b, $$1, $$2);
   }

   public bte(String $$0, float $$1) {
      this($$0, btb.b, $$1);
   }

   public String a() {
      return this.d;
   }

   public btb b() {
      return this.e;
   }

   public float c() {
      return this.f;
   }

   public bta d() {
      return this.g;
   }

   public btg e() {
      return this.h;
   }
}
