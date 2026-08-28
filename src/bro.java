import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bro(String b, brl c, float d, brk e, brq f) {
   public static final Codec<bro> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bro::a),
               brl.d.fieldOf("scaling").forGetter(bro::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bro::c),
               brk.g.optionalFieldOf("effects", brk.a).forGetter(bro::d),
               brq.d.optionalFieldOf("death_message_type", brq.a).forGetter(bro::e)
            )
            .apply($$0, bro::new)
   );

   public bro(String $$0, brl $$1, float $$2) {
      this($$0, $$1, $$2, brk.a, brq.a);
   }

   public bro(String $$0, brl $$1, float $$2, brk $$3) {
      this($$0, $$1, $$2, $$3, brq.a);
   }

   public bro(String $$0, float $$1, brk $$2) {
      this($$0, brl.b, $$1, $$2);
   }

   public bro(String $$0, float $$1) {
      this($$0, brl.b, $$1);
   }

   public String a() {
      return this.b;
   }

   public brl b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public brk d() {
      return this.e;
   }

   public brq e() {
      return this.f;
   }
}
