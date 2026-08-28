import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record brr(String b, bro c, float d, brn e, brt f) {
   public static final Codec<brr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(brr::a),
               bro.d.fieldOf("scaling").forGetter(brr::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(brr::c),
               brn.g.optionalFieldOf("effects", brn.a).forGetter(brr::d),
               brt.d.optionalFieldOf("death_message_type", brt.a).forGetter(brr::e)
            )
            .apply($$0, brr::new)
   );

   public brr(String $$0, bro $$1, float $$2) {
      this($$0, $$1, $$2, brn.a, brt.a);
   }

   public brr(String $$0, bro $$1, float $$2, brn $$3) {
      this($$0, $$1, $$2, $$3, brt.a);
   }

   public brr(String $$0, float $$1, brn $$2) {
      this($$0, bro.b, $$1, $$2);
   }

   public brr(String $$0, float $$1) {
      this($$0, bro.b, $$1);
   }

   public String a() {
      return this.b;
   }

   public bro b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public brn d() {
      return this.e;
   }

   public brt e() {
      return this.f;
   }
}
