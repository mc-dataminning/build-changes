import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record buw(String d, but e, float f, bus g, buy h) {
   public static final Codec<buw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(buw::a),
               but.d.fieldOf("scaling").forGetter(buw::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(buw::c),
               bus.g.optionalFieldOf("effects", bus.a).forGetter(buw::d),
               buy.d.optionalFieldOf("death_message_type", buy.a).forGetter(buw::e)
            )
            .apply($$0, buw::new)
   );
   public static final Codec<je<buw>> b = ald.a(mg.aN);
   public static final yw<wj, je<buw>> c = yu.b(mg.aN);

   public buw(String $$0, but $$1, float $$2) {
      this($$0, $$1, $$2, bus.a, buy.a);
   }

   public buw(String $$0, but $$1, float $$2, bus $$3) {
      this($$0, $$1, $$2, $$3, buy.a);
   }

   public buw(String $$0, float $$1, bus $$2) {
      this($$0, but.b, $$1, $$2);
   }

   public buw(String $$0, float $$1) {
      this($$0, but.b, $$1);
   }

   public String a() {
      return this.d;
   }

   public but b() {
      return this.e;
   }

   public float c() {
      return this.f;
   }

   public bus d() {
      return this.g;
   }

   public buy e() {
      return this.h;
   }
}
