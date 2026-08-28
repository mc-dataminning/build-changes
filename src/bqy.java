import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bqy(String c, bqv d, float e, bqu f, bra g) {
   public static final Codec<bqy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bqy::a),
               bqv.d.fieldOf("scaling").forGetter(bqy::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bqy::c),
               bqu.g.optionalFieldOf("effects", bqu.a).forGetter(bqy::d),
               bra.d.optionalFieldOf("death_message_type", bra.a).forGetter(bqy::e)
            )
            .apply($$0, bqy::new)
   );
   public static final Codec<jj<bqy>> b = akh.a(lr.s);

   public bqy(String $$0, bqv $$1, float $$2) {
      this($$0, $$1, $$2, bqu.a, bra.a);
   }

   public bqy(String $$0, bqv $$1, float $$2, bqu $$3) {
      this($$0, $$1, $$2, $$3, bra.a);
   }

   public bqy(String $$0, float $$1, bqu $$2) {
      this($$0, bqv.b, $$1, $$2);
   }

   public bqy(String $$0, float $$1) {
      this($$0, bqv.b, $$1);
   }

   public String a() {
      return this.c;
   }

   public bqv b() {
      return this.d;
   }

   public float c() {
      return this.e;
   }

   public bqu d() {
      return this.f;
   }

   public bra e() {
      return this.g;
   }
}
