import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bpa(String b, box c, float d, bow e, bpc f) {
   public static final Codec<bpa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bpa::a),
               box.d.fieldOf("scaling").forGetter(bpa::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bpa::c),
               bow.g.optionalFieldOf("effects", bow.a).forGetter(bpa::d),
               bpc.d.optionalFieldOf("death_message_type", bpc.a).forGetter(bpa::e)
            )
            .apply($$0, bpa::new)
   );

   public bpa(String $$0, box $$1, float $$2) {
      this($$0, $$1, $$2, bow.a, bpc.a);
   }

   public bpa(String $$0, box $$1, float $$2, bow $$3) {
      this($$0, $$1, $$2, $$3, bpc.a);
   }

   public bpa(String $$0, float $$1, bow $$2) {
      this($$0, box.b, $$1, $$2);
   }

   public bpa(String $$0, float $$1) {
      this($$0, box.b, $$1);
   }

   public String a() {
      return this.b;
   }

   public box b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public bow d() {
      return this.e;
   }

   public bpc e() {
      return this.f;
   }
}
