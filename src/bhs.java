import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bhs(String b, bhp c, float d, bho e, bhu f) {
   public static final Codec<bhs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bhs::a),
               bhp.d.fieldOf("scaling").forGetter(bhs::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bhs::c),
               bho.g.optionalFieldOf("effects", bho.a).forGetter(bhs::d),
               bhu.d.optionalFieldOf("death_message_type", bhu.a).forGetter(bhs::e)
            )
            .apply($$0, bhs::new)
   );

   public bhs(String $$0, bhp $$1, float $$2) {
      this($$0, $$1, $$2, bho.a, bhu.a);
   }

   public bhs(String $$0, bhp $$1, float $$2, bho $$3) {
      this($$0, $$1, $$2, $$3, bhu.a);
   }

   public bhs(String $$0, float $$1, bho $$2) {
      this($$0, bhp.b, $$1, $$2);
   }

   public bhs(String $$0, float $$1) {
      this($$0, bhp.b, $$1);
   }

   public String a() {
      return this.b;
   }

   public bhp b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public bho d() {
      return this.e;
   }

   public bhu e() {
      return this.f;
   }
}
