import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bur(String d, buo e, float f, bun g, but h) {
   public static final Codec<bur> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bur::a),
               buo.d.fieldOf("scaling").forGetter(bur::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bur::c),
               bun.g.optionalFieldOf("effects", bun.a).forGetter(bur::d),
               but.d.optionalFieldOf("death_message_type", but.a).forGetter(bur::e)
            )
            .apply($$0, bur::new)
   );
   public static final Codec<je<bur>> b = alb.a(mg.aL);
   public static final yu<wh, je<bur>> c = ys.b(mg.aL);

   public bur(String $$0, buo $$1, float $$2) {
      this($$0, $$1, $$2, bun.a, but.a);
   }

   public bur(String $$0, buo $$1, float $$2, bun $$3) {
      this($$0, $$1, $$2, $$3, but.a);
   }

   public bur(String $$0, float $$1, bun $$2) {
      this($$0, buo.b, $$1, $$2);
   }

   public bur(String $$0, float $$1) {
      this($$0, buo.b, $$1);
   }

   public String a() {
      return this.d;
   }

   public buo b() {
      return this.e;
   }

   public float c() {
      return this.f;
   }

   public bun d() {
      return this.g;
   }

   public but e() {
      return this.h;
   }
}
