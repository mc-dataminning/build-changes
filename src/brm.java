import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record brm(String d, brj e, float f, bri g, bro h) {
   public static final Codec<brm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(brm::a),
               brj.d.fieldOf("scaling").forGetter(brm::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(brm::c),
               bri.g.optionalFieldOf("effects", bri.a).forGetter(brm::d),
               bro.d.optionalFieldOf("death_message_type", bro.a).forGetter(brm::e)
            )
            .apply($$0, brm::new)
   );
   public static final Codec<jm<brm>> b = ako.a(lu.s);
   public static final yx<wk, jm<brm>> c = yv.b(lu.s);

   public brm(String $$0, brj $$1, float $$2) {
      this($$0, $$1, $$2, bri.a, bro.a);
   }

   public brm(String $$0, brj $$1, float $$2, bri $$3) {
      this($$0, $$1, $$2, $$3, bro.a);
   }

   public brm(String $$0, float $$1, bri $$2) {
      this($$0, brj.b, $$1, $$2);
   }

   public brm(String $$0, float $$1) {
      this($$0, brj.b, $$1);
   }

   public String a() {
      return this.d;
   }

   public brj b() {
      return this.e;
   }

   public float c() {
      return this.f;
   }

   public bri d() {
      return this.g;
   }

   public bro e() {
      return this.h;
   }
}
