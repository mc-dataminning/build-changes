import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record btb(String d, bsy e, float f, bsx g, btd h) {
   public static final Codec<btb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(btb::a),
               bsy.d.fieldOf("scaling").forGetter(btb::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(btb::c),
               bsx.g.optionalFieldOf("effects", bsx.a).forGetter(btb::d),
               btd.d.optionalFieldOf("death_message_type", btd.a).forGetter(btb::e)
            )
            .apply($$0, btb::new)
   );
   public static final Codec<jr<btb>> b = akr.a(mc.s);
   public static final ym<vz, jr<btb>> c = yk.b(mc.s);

   public btb(String $$0, bsy $$1, float $$2) {
      this($$0, $$1, $$2, bsx.a, btd.a);
   }

   public btb(String $$0, bsy $$1, float $$2, bsx $$3) {
      this($$0, $$1, $$2, $$3, btd.a);
   }

   public btb(String $$0, float $$1, bsx $$2) {
      this($$0, bsy.b, $$1, $$2);
   }

   public btb(String $$0, float $$1) {
      this($$0, bsy.b, $$1);
   }

   public String a() {
      return this.d;
   }

   public bsy b() {
      return this.e;
   }

   public float c() {
      return this.f;
   }

   public bsx d() {
      return this.g;
   }

   public btd e() {
      return this.h;
   }
}
