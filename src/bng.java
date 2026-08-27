import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bng(String b, bnd c, float d, bnc e, bni f) {
   public static final Codec<bng> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bng::a),
               bnd.d.fieldOf("scaling").forGetter(bng::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bng::c),
               bnc.g.optionalFieldOf("effects", bnc.a).forGetter(bng::d),
               bni.d.optionalFieldOf("death_message_type", bni.a).forGetter(bng::e)
            )
            .apply($$0, bng::new)
   );

   public bng(String $$0, bnd $$1, float $$2) {
      this($$0, $$1, $$2, bnc.a, bni.a);
   }

   public bng(String $$0, bnd $$1, float $$2, bnc $$3) {
      this($$0, $$1, $$2, $$3, bni.a);
   }

   public bng(String $$0, float $$1, bnc $$2) {
      this($$0, bnd.b, $$1, $$2);
   }

   public bng(String $$0, float $$1) {
      this($$0, bnd.b, $$1);
   }

   public String a() {
      return this.b;
   }

   public bnd b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public bnc d() {
      return this.e;
   }

   public bni e() {
      return this.f;
   }
}
