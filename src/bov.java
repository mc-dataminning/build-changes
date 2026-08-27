import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bov(String b, bos c, float d, bor e, box f) {
   public static final Codec<bov> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bov::a),
               bos.d.fieldOf("scaling").forGetter(bov::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bov::c),
               bor.g.optionalFieldOf("effects", bor.a).forGetter(bov::d),
               box.d.optionalFieldOf("death_message_type", box.a).forGetter(bov::e)
            )
            .apply($$0, bov::new)
   );

   public bov(String $$0, bos $$1, float $$2) {
      this($$0, $$1, $$2, bor.a, box.a);
   }

   public bov(String $$0, bos $$1, float $$2, bor $$3) {
      this($$0, $$1, $$2, $$3, box.a);
   }

   public bov(String $$0, float $$1, bor $$2) {
      this($$0, bos.b, $$1, $$2);
   }

   public bov(String $$0, float $$1) {
      this($$0, bos.b, $$1);
   }

   public String a() {
      return this.b;
   }

   public bos b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public bor d() {
      return this.e;
   }

   public box e() {
      return this.f;
   }
}
