import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record buz(String d, buw e, float f, buv g, bvb h) {
   public static final Codec<buz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(buz::a),
               buw.d.fieldOf("scaling").forGetter(buz::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(buz::c),
               buv.g.optionalFieldOf("effects", buv.a).forGetter(buz::d),
               bvb.d.optionalFieldOf("death_message_type", bvb.a).forGetter(buz::e)
            )
            .apply($$0, buz::new)
   );
   public static final Codec<jf<buz>> b = ald.a(mh.aN);
   public static final yw<wj, jf<buz>> c = yu.b(mh.aN);

   public buz(String $$0, buw $$1, float $$2) {
      this($$0, $$1, $$2, buv.a, bvb.a);
   }

   public buz(String $$0, buw $$1, float $$2, buv $$3) {
      this($$0, $$1, $$2, $$3, bvb.a);
   }

   public buz(String $$0, float $$1, buv $$2) {
      this($$0, buw.b, $$1, $$2);
   }

   public buz(String $$0, float $$1) {
      this($$0, buw.b, $$1);
   }

   public String a() {
      return this.d;
   }

   public buw b() {
      return this.e;
   }

   public float c() {
      return this.f;
   }

   public buv d() {
      return this.g;
   }

   public bvb e() {
      return this.h;
   }
}
