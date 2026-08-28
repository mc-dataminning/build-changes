import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record brk(String b, brh c, float d, brg e, brm f) {
   public static final Codec<brk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(brk::a),
               brh.d.fieldOf("scaling").forGetter(brk::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(brk::c),
               brg.g.optionalFieldOf("effects", brg.a).forGetter(brk::d),
               brm.d.optionalFieldOf("death_message_type", brm.a).forGetter(brk::e)
            )
            .apply($$0, brk::new)
   );

   public brk(String $$0, brh $$1, float $$2) {
      this($$0, $$1, $$2, brg.a, brm.a);
   }

   public brk(String $$0, brh $$1, float $$2, brg $$3) {
      this($$0, $$1, $$2, $$3, brm.a);
   }

   public brk(String $$0, float $$1, brg $$2) {
      this($$0, brh.b, $$1, $$2);
   }

   public brk(String $$0, float $$1) {
      this($$0, brh.b, $$1);
   }

   public String a() {
      return this.b;
   }

   public brh b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public brg d() {
      return this.e;
   }

   public brm e() {
      return this.f;
   }
}
