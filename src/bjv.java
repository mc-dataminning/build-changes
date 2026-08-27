import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bjv(String b, bjs c, float d, bjr e, bjx f) {
   public static final Codec<bjv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bjv::a),
               bjs.d.fieldOf("scaling").forGetter(bjv::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bjv::c),
               bjr.g.optionalFieldOf("effects", bjr.a).forGetter(bjv::d),
               bjx.d.optionalFieldOf("death_message_type", bjx.a).forGetter(bjv::e)
            )
            .apply($$0, bjv::new)
   );

   public bjv(String $$0, bjs $$1, float $$2) {
      this($$0, $$1, $$2, bjr.a, bjx.a);
   }

   public bjv(String $$0, bjs $$1, float $$2, bjr $$3) {
      this($$0, $$1, $$2, $$3, bjx.a);
   }

   public bjv(String $$0, float $$1, bjr $$2) {
      this($$0, bjs.b, $$1, $$2);
   }

   public bjv(String $$0, float $$1) {
      this($$0, bjs.b, $$1);
   }

   public String a() {
      return this.b;
   }

   public bjs b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public bjr d() {
      return this.e;
   }

   public bjx e() {
      return this.f;
   }
}
