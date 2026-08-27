import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bkx(String b, bku c, float d, bkt e, bkz f) {
   public static final Codec<bkx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bkx::a),
               bku.d.fieldOf("scaling").forGetter(bkx::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bkx::c),
               bkt.g.optionalFieldOf("effects", bkt.a).forGetter(bkx::d),
               bkz.d.optionalFieldOf("death_message_type", bkz.a).forGetter(bkx::e)
            )
            .apply($$0, bkx::new)
   );

   public bkx(String $$0, bku $$1, float $$2) {
      this($$0, $$1, $$2, bkt.a, bkz.a);
   }

   public bkx(String $$0, bku $$1, float $$2, bkt $$3) {
      this($$0, $$1, $$2, $$3, bkz.a);
   }

   public bkx(String $$0, float $$1, bkt $$2) {
      this($$0, bku.b, $$1, $$2);
   }

   public bkx(String $$0, float $$1) {
      this($$0, bku.b, $$1);
   }

   public String a() {
      return this.b;
   }

   public bku b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public bkt d() {
      return this.e;
   }

   public bkz e() {
      return this.f;
   }
}
