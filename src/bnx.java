import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bnx(String b, bnu c, float d, bnt e, bnz f) {
   public static final Codec<bnx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bnx::a),
               bnu.d.fieldOf("scaling").forGetter(bnx::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bnx::c),
               bnt.g.optionalFieldOf("effects", bnt.a).forGetter(bnx::d),
               bnz.d.optionalFieldOf("death_message_type", bnz.a).forGetter(bnx::e)
            )
            .apply($$0, bnx::new)
   );

   public bnx(String $$0, bnu $$1, float $$2) {
      this($$0, $$1, $$2, bnt.a, bnz.a);
   }

   public bnx(String $$0, bnu $$1, float $$2, bnt $$3) {
      this($$0, $$1, $$2, $$3, bnz.a);
   }

   public bnx(String $$0, float $$1, bnt $$2) {
      this($$0, bnu.b, $$1, $$2);
   }

   public bnx(String $$0, float $$1) {
      this($$0, bnu.b, $$1);
   }

   public String a() {
      return this.b;
   }

   public bnu b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public bnt d() {
      return this.e;
   }

   public bnz e() {
      return this.f;
   }
}
