import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record brc(String d, bqz e, float f, bqy g, bre h) {
   public static final Codec<brc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(brc::a),
               bqz.d.fieldOf("scaling").forGetter(brc::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(brc::c),
               bqy.g.optionalFieldOf("effects", bqy.a).forGetter(brc::d),
               bre.d.optionalFieldOf("death_message_type", bre.a).forGetter(brc::e)
            )
            .apply($$0, brc::new)
   );
   public static final Codec<jj<brc>> b = akh.a(lr.s);
   public static final ys<wf, jj<brc>> c = yq.b(lr.s);

   public brc(String $$0, bqz $$1, float $$2) {
      this($$0, $$1, $$2, bqy.a, bre.a);
   }

   public brc(String $$0, bqz $$1, float $$2, bqy $$3) {
      this($$0, $$1, $$2, $$3, bre.a);
   }

   public brc(String $$0, float $$1, bqy $$2) {
      this($$0, bqz.b, $$1, $$2);
   }

   public brc(String $$0, float $$1) {
      this($$0, bqz.b, $$1);
   }

   public String a() {
      return this.d;
   }

   public bqz b() {
      return this.e;
   }

   public float c() {
      return this.f;
   }

   public bqy d() {
      return this.g;
   }

   public bre e() {
      return this.h;
   }
}
