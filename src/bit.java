import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bit(String b, biq c, float d, bip e, biv f) {
   public static final Codec<bit> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bit::a),
               biq.d.fieldOf("scaling").forGetter(bit::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bit::c),
               bip.g.optionalFieldOf("effects", bip.a).forGetter(bit::d),
               biv.d.optionalFieldOf("death_message_type", biv.a).forGetter(bit::e)
            )
            .apply($$0, bit::new)
   );

   public bit(String $$0, biq $$1, float $$2) {
      this($$0, $$1, $$2, bip.a, biv.a);
   }

   public bit(String $$0, biq $$1, float $$2, bip $$3) {
      this($$0, $$1, $$2, $$3, biv.a);
   }

   public bit(String $$0, float $$1, bip $$2) {
      this($$0, biq.b, $$1, $$2);
   }

   public bit(String $$0, float $$1) {
      this($$0, biq.b, $$1);
   }

   public String a() {
      return this.b;
   }

   public biq b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public bip d() {
      return this.e;
   }

   public biv e() {
      return this.f;
   }
}
