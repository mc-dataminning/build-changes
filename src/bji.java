import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bji(String b, bjf c, float d, bje e, bjk f) {
   public static final Codec<bji> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bji::a),
               bjf.d.fieldOf("scaling").forGetter(bji::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bji::c),
               bje.g.optionalFieldOf("effects", bje.a).forGetter(bji::d),
               bjk.d.optionalFieldOf("death_message_type", bjk.a).forGetter(bji::e)
            )
            .apply($$0, bji::new)
   );

   public bji(String $$0, bjf $$1, float $$2) {
      this($$0, $$1, $$2, bje.a, bjk.a);
   }

   public bji(String $$0, bjf $$1, float $$2, bje $$3) {
      this($$0, $$1, $$2, $$3, bjk.a);
   }

   public bji(String $$0, float $$1, bje $$2) {
      this($$0, bjf.b, $$1, $$2);
   }

   public bji(String $$0, float $$1) {
      this($$0, bjf.b, $$1);
   }

   public String a() {
      return this.b;
   }

   public bjf b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public bje d() {
      return this.e;
   }

   public bjk e() {
      return this.f;
   }
}
