import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record brb(String c, bqy d, float e, bqx f, brd g) {
   public static final Codec<brb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(brb::a),
               bqy.d.fieldOf("scaling").forGetter(brb::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(brb::c),
               bqx.g.optionalFieldOf("effects", bqx.a).forGetter(brb::d),
               brd.d.optionalFieldOf("death_message_type", brd.a).forGetter(brb::e)
            )
            .apply($$0, brb::new)
   );
   public static final Codec<jj<brb>> b = akh.a(lr.s);

   public brb(String $$0, bqy $$1, float $$2) {
      this($$0, $$1, $$2, bqx.a, brd.a);
   }

   public brb(String $$0, bqy $$1, float $$2, bqx $$3) {
      this($$0, $$1, $$2, $$3, brd.a);
   }

   public brb(String $$0, float $$1, bqx $$2) {
      this($$0, bqy.b, $$1, $$2);
   }

   public brb(String $$0, float $$1) {
      this($$0, bqy.b, $$1);
   }

   public String a() {
      return this.c;
   }

   public bqy b() {
      return this.d;
   }

   public float c() {
      return this.e;
   }

   public bqx d() {
      return this.f;
   }

   public brd e() {
      return this.g;
   }
}
