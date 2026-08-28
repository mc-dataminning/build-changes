import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record buu(String d, bur e, float f, buq g, buw h) {
   public static final Codec<buu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(buu::a),
               bur.d.fieldOf("scaling").forGetter(buu::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(buu::c),
               buq.g.optionalFieldOf("effects", buq.a).forGetter(buu::d),
               buw.d.optionalFieldOf("death_message_type", buw.a).forGetter(buu::e)
            )
            .apply($$0, buu::new)
   );
   public static final Codec<je<buu>> b = ald.a(mg.aM);
   public static final yw<wj, je<buu>> c = yu.b(mg.aM);

   public buu(String $$0, bur $$1, float $$2) {
      this($$0, $$1, $$2, buq.a, buw.a);
   }

   public buu(String $$0, bur $$1, float $$2, buq $$3) {
      this($$0, $$1, $$2, $$3, buw.a);
   }

   public buu(String $$0, float $$1, buq $$2) {
      this($$0, bur.b, $$1, $$2);
   }

   public buu(String $$0, float $$1) {
      this($$0, bur.b, $$1);
   }

   public String a() {
      return this.d;
   }

   public bur b() {
      return this.e;
   }

   public float c() {
      return this.f;
   }

   public buq d() {
      return this.g;
   }

   public buw e() {
      return this.h;
   }
}
