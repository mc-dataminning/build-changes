import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bjq(String b, bjn c, float d, bjm e, bjs f) {
   public static final Codec<bjq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bjq::a),
               bjn.d.fieldOf("scaling").forGetter(bjq::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bjq::c),
               bjm.g.optionalFieldOf("effects", bjm.a).forGetter(bjq::d),
               bjs.d.optionalFieldOf("death_message_type", bjs.a).forGetter(bjq::e)
            )
            .apply($$0, bjq::new)
   );

   public bjq(String $$0, bjn $$1, float $$2) {
      this($$0, $$1, $$2, bjm.a, bjs.a);
   }

   public bjq(String $$0, bjn $$1, float $$2, bjm $$3) {
      this($$0, $$1, $$2, $$3, bjs.a);
   }

   public bjq(String $$0, float $$1, bjm $$2) {
      this($$0, bjn.b, $$1, $$2);
   }

   public bjq(String $$0, float $$1) {
      this($$0, bjn.b, $$1);
   }

   public String a() {
      return this.b;
   }

   public bjn b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public bjm d() {
      return this.e;
   }

   public bjs e() {
      return this.f;
   }
}
