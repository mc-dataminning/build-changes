import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record brn(String b, brk c, float d, brj e, brp f) {
   public static final Codec<brn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(brn::a),
               brk.d.fieldOf("scaling").forGetter(brn::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(brn::c),
               brj.g.optionalFieldOf("effects", brj.a).forGetter(brn::d),
               brp.d.optionalFieldOf("death_message_type", brp.a).forGetter(brn::e)
            )
            .apply($$0, brn::new)
   );

   public brn(String $$0, brk $$1, float $$2) {
      this($$0, $$1, $$2, brj.a, brp.a);
   }

   public brn(String $$0, brk $$1, float $$2, brj $$3) {
      this($$0, $$1, $$2, $$3, brp.a);
   }

   public brn(String $$0, float $$1, brj $$2) {
      this($$0, brk.b, $$1, $$2);
   }

   public brn(String $$0, float $$1) {
      this($$0, brk.b, $$1);
   }

   public String a() {
      return this.b;
   }

   public brk b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public brj d() {
      return this.e;
   }

   public brp e() {
      return this.f;
   }
}
