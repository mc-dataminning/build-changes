import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bep(String b, bem c, float d, bel e, ber f) {
   public static final Codec<bep> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bep::a),
               bem.d.fieldOf("scaling").forGetter(bep::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bep::c),
               bel.g.optionalFieldOf("effects", bel.a).forGetter(bep::d),
               ber.d.optionalFieldOf("death_message_type", ber.a).forGetter(bep::e)
            )
            .apply($$0, bep::new)
   );

   public bep(String $$0, bem $$1, float $$2) {
      this($$0, $$1, $$2, bel.a, ber.a);
   }

   public bep(String $$0, bem $$1, float $$2, bel $$3) {
      this($$0, $$1, $$2, $$3, ber.a);
   }

   public bep(String $$0, float $$1, bel $$2) {
      this($$0, bem.b, $$1, $$2);
   }

   public bep(String $$0, float $$1) {
      this($$0, bem.b, $$1);
   }

   public String a() {
      return this.b;
   }

   public bem b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public bel d() {
      return this.e;
   }

   public ber e() {
      return this.f;
   }
}
