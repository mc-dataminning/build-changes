import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record btr(String d, bto e, float f, btn g, btt h) {
   public static final Codec<btr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(btr::a),
               bto.d.fieldOf("scaling").forGetter(btr::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(btr::c),
               btn.g.optionalFieldOf("effects", btn.a).forGetter(btr::d),
               btt.d.optionalFieldOf("death_message_type", btt.a).forGetter(btr::e)
            )
            .apply($$0, btr::new)
   );
   public static final Codec<jr<btr>> b = akr.a(mc.s);
   public static final yn<wa, jr<btr>> c = yl.b(mc.s);

   public btr(String $$0, bto $$1, float $$2) {
      this($$0, $$1, $$2, btn.a, btt.a);
   }

   public btr(String $$0, bto $$1, float $$2, btn $$3) {
      this($$0, $$1, $$2, $$3, btt.a);
   }

   public btr(String $$0, float $$1, btn $$2) {
      this($$0, bto.b, $$1, $$2);
   }

   public btr(String $$0, float $$1) {
      this($$0, bto.b, $$1);
   }

   public String a() {
      return this.d;
   }

   public bto b() {
      return this.e;
   }

   public float c() {
      return this.f;
   }

   public btn d() {
      return this.g;
   }

   public btt e() {
      return this.h;
   }
}
