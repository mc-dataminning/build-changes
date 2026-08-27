import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bkf(String b, bkc c, float d, bkb e, bkh f) {
   public static final Codec<bkf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bkf::a),
               bkc.d.fieldOf("scaling").forGetter(bkf::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bkf::c),
               bkb.g.optionalFieldOf("effects", bkb.a).forGetter(bkf::d),
               bkh.d.optionalFieldOf("death_message_type", bkh.a).forGetter(bkf::e)
            )
            .apply($$0, bkf::new)
   );

   public bkf(String $$0, bkc $$1, float $$2) {
      this($$0, $$1, $$2, bkb.a, bkh.a);
   }

   public bkf(String $$0, bkc $$1, float $$2, bkb $$3) {
      this($$0, $$1, $$2, $$3, bkh.a);
   }

   public bkf(String $$0, float $$1, bkb $$2) {
      this($$0, bkc.b, $$1, $$2);
   }

   public bkf(String $$0, float $$1) {
      this($$0, bkc.b, $$1);
   }

   public String a() {
      return this.b;
   }

   public bkc b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public bkb d() {
      return this.e;
   }

   public bkh e() {
      return this.f;
   }
}
