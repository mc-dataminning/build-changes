import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bkv(String b, bks c, float d, bkr e, bkx f) {
   public static final Codec<bkv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bkv::a),
               bks.d.fieldOf("scaling").forGetter(bkv::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bkv::c),
               bkr.g.optionalFieldOf("effects", bkr.a).forGetter(bkv::d),
               bkx.d.optionalFieldOf("death_message_type", bkx.a).forGetter(bkv::e)
            )
            .apply($$0, bkv::new)
   );

   public bkv(String $$0, bks $$1, float $$2) {
      this($$0, $$1, $$2, bkr.a, bkx.a);
   }

   public bkv(String $$0, bks $$1, float $$2, bkr $$3) {
      this($$0, $$1, $$2, $$3, bkx.a);
   }

   public bkv(String $$0, float $$1, bkr $$2) {
      this($$0, bks.b, $$1, $$2);
   }

   public bkv(String $$0, float $$1) {
      this($$0, bks.b, $$1);
   }

   public String a() {
      return this.b;
   }

   public bks b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public bkr d() {
      return this.e;
   }

   public bkx e() {
      return this.f;
   }
}
