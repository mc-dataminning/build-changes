import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bny(String b, bnv c, float d, bnu e, boa f) {
   public static final Codec<bny> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bny::a),
               bnv.d.fieldOf("scaling").forGetter(bny::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bny::c),
               bnu.g.optionalFieldOf("effects", bnu.a).forGetter(bny::d),
               boa.d.optionalFieldOf("death_message_type", boa.a).forGetter(bny::e)
            )
            .apply($$0, bny::new)
   );

   public bny(String $$0, bnv $$1, float $$2) {
      this($$0, $$1, $$2, bnu.a, boa.a);
   }

   public bny(String $$0, bnv $$1, float $$2, bnu $$3) {
      this($$0, $$1, $$2, $$3, boa.a);
   }

   public bny(String $$0, float $$1, bnu $$2) {
      this($$0, bnv.b, $$1, $$2);
   }

   public bny(String $$0, float $$1) {
      this($$0, bnv.b, $$1);
   }

   public String a() {
      return this.b;
   }

   public bnv b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public bnu d() {
      return this.e;
   }

   public boa e() {
      return this.f;
   }
}
