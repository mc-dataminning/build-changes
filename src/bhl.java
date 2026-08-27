import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bhl(String b, bhi c, float d, bhh e, bhn f) {
   public static final Codec<bhl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bhl::a),
               bhi.d.fieldOf("scaling").forGetter(bhl::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bhl::c),
               bhh.g.optionalFieldOf("effects", bhh.a).forGetter(bhl::d),
               bhn.d.optionalFieldOf("death_message_type", bhn.a).forGetter(bhl::e)
            )
            .apply($$0, bhl::new)
   );

   public bhl(String $$0, bhi $$1, float $$2) {
      this($$0, $$1, $$2, bhh.a, bhn.a);
   }

   public bhl(String $$0, bhi $$1, float $$2, bhh $$3) {
      this($$0, $$1, $$2, $$3, bhn.a);
   }

   public bhl(String $$0, float $$1, bhh $$2) {
      this($$0, bhi.b, $$1, $$2);
   }

   public bhl(String $$0, float $$1) {
      this($$0, bhi.b, $$1);
   }

   public String a() {
      return this.b;
   }

   public bhi b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public bhh d() {
      return this.e;
   }

   public bhn e() {
      return this.f;
   }
}
