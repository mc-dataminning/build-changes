import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bku(String b, bkr c, float d, bkq e, bkw f) {
   public static final Codec<bku> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bku::a),
               bkr.d.fieldOf("scaling").forGetter(bku::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bku::c),
               bkq.g.optionalFieldOf("effects", bkq.a).forGetter(bku::d),
               bkw.d.optionalFieldOf("death_message_type", bkw.a).forGetter(bku::e)
            )
            .apply($$0, bku::new)
   );

   public bku(String $$0, bkr $$1, float $$2) {
      this($$0, $$1, $$2, bkq.a, bkw.a);
   }

   public bku(String $$0, bkr $$1, float $$2, bkq $$3) {
      this($$0, $$1, $$2, $$3, bkw.a);
   }

   public bku(String $$0, float $$1, bkq $$2) {
      this($$0, bkr.b, $$1, $$2);
   }

   public bku(String $$0, float $$1) {
      this($$0, bkr.b, $$1);
   }

   public String a() {
      return this.b;
   }

   public bkr b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public bkq d() {
      return this.e;
   }

   public bkw e() {
      return this.f;
   }
}
