import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record buj(String d, bug e, float f, buf g, bul h) {
   public static final Codec<buj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(buj::a),
               bug.d.fieldOf("scaling").forGetter(buj::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(buj::c),
               buf.g.optionalFieldOf("effects", buf.a).forGetter(buj::d),
               bul.d.optionalFieldOf("death_message_type", bul.a).forGetter(buj::e)
            )
            .apply($$0, buj::new)
   );
   public static final Codec<js<buj>> b = ala.a(me.s);
   public static final yt<wg, js<buj>> c = yr.b(me.s);

   public buj(String $$0, bug $$1, float $$2) {
      this($$0, $$1, $$2, buf.a, bul.a);
   }

   public buj(String $$0, bug $$1, float $$2, buf $$3) {
      this($$0, $$1, $$2, $$3, bul.a);
   }

   public buj(String $$0, float $$1, buf $$2) {
      this($$0, bug.b, $$1, $$2);
   }

   public buj(String $$0, float $$1) {
      this($$0, bug.b, $$1);
   }

   public String a() {
      return this.d;
   }

   public bug b() {
      return this.e;
   }

   public float c() {
      return this.f;
   }

   public buf d() {
      return this.g;
   }

   public bul e() {
      return this.h;
   }
}
