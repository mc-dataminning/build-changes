import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bmr(String b, bmo c, float d, bmn e, bmt f) {
   public static final Codec<bmr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bmr::a),
               bmo.d.fieldOf("scaling").forGetter(bmr::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bmr::c),
               bmn.g.optionalFieldOf("effects", bmn.a).forGetter(bmr::d),
               bmt.d.optionalFieldOf("death_message_type", bmt.a).forGetter(bmr::e)
            )
            .apply($$0, bmr::new)
   );

   public bmr(String $$0, bmo $$1, float $$2) {
      this($$0, $$1, $$2, bmn.a, bmt.a);
   }

   public bmr(String $$0, bmo $$1, float $$2, bmn $$3) {
      this($$0, $$1, $$2, $$3, bmt.a);
   }

   public bmr(String $$0, float $$1, bmn $$2) {
      this($$0, bmo.b, $$1, $$2);
   }

   public bmr(String $$0, float $$1) {
      this($$0, bmo.b, $$1);
   }

   public String a() {
      return this.b;
   }

   public bmo b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public bmn d() {
      return this.e;
   }

   public bmt e() {
      return this.f;
   }
}
