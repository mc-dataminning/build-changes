import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bvm(String d, bvj e, float f, bvi g, bvo h) {
   public static final Codec<bvm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bvm::a),
               bvj.d.fieldOf("scaling").forGetter(bvm::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bvm::c),
               bvi.g.optionalFieldOf("effects", bvi.a).forGetter(bvm::d),
               bvo.d.optionalFieldOf("death_message_type", bvo.a).forGetter(bvm::e)
            )
            .apply($$0, bvm::new)
   );
   public static final Codec<jg<bvm>> b = alh.a(mi.aN);
   public static final za<wn, jg<bvm>> c = yy.b(mi.aN);

   public bvm(String $$0, bvj $$1, float $$2) {
      this($$0, $$1, $$2, bvi.a, bvo.a);
   }

   public bvm(String $$0, bvj $$1, float $$2, bvi $$3) {
      this($$0, $$1, $$2, $$3, bvo.a);
   }

   public bvm(String $$0, float $$1, bvi $$2) {
      this($$0, bvj.b, $$1, $$2);
   }

   public bvm(String $$0, float $$1) {
      this($$0, bvj.b, $$1);
   }

   public String a() {
      return this.d;
   }

   public bvj b() {
      return this.e;
   }

   public float c() {
      return this.f;
   }

   public bvi d() {
      return this.g;
   }

   public bvo e() {
      return this.h;
   }
}
