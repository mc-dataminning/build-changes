import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record brl(String d, bri e, float f, brh g, brn h) {
   public static final Codec<brl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(brl::a),
               bri.d.fieldOf("scaling").forGetter(brl::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(brl::c),
               brh.g.optionalFieldOf("effects", brh.a).forGetter(brl::d),
               brn.d.optionalFieldOf("death_message_type", brn.a).forGetter(brl::e)
            )
            .apply($$0, brl::new)
   );
   public static final Codec<jm<brl>> b = akn.a(lu.s);
   public static final yw<wj, jm<brl>> c = yu.b(lu.s);

   public brl(String $$0, bri $$1, float $$2) {
      this($$0, $$1, $$2, brh.a, brn.a);
   }

   public brl(String $$0, bri $$1, float $$2, brh $$3) {
      this($$0, $$1, $$2, $$3, brn.a);
   }

   public brl(String $$0, float $$1, brh $$2) {
      this($$0, bri.b, $$1, $$2);
   }

   public brl(String $$0, float $$1) {
      this($$0, bri.b, $$1);
   }

   public String a() {
      return this.d;
   }

   public bri b() {
      return this.e;
   }

   public float c() {
      return this.f;
   }

   public brh d() {
      return this.g;
   }

   public brn e() {
      return this.h;
   }
}
