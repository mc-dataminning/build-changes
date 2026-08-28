import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bsr(String d, bso e, float f, bsn g, bst h) {
   public static final Codec<bsr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bsr::a),
               bso.d.fieldOf("scaling").forGetter(bsr::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bsr::c),
               bsn.g.optionalFieldOf("effects", bsn.a).forGetter(bsr::d),
               bst.d.optionalFieldOf("death_message_type", bst.a).forGetter(bsr::e)
            )
            .apply($$0, bsr::new)
   );
   public static final Codec<jp<bsr>> b = ale.a(ly.s);
   public static final zf<ws, jp<bsr>> c = zd.b(ly.s);

   public bsr(String $$0, bso $$1, float $$2) {
      this($$0, $$1, $$2, bsn.a, bst.a);
   }

   public bsr(String $$0, bso $$1, float $$2, bsn $$3) {
      this($$0, $$1, $$2, $$3, bst.a);
   }

   public bsr(String $$0, float $$1, bsn $$2) {
      this($$0, bso.b, $$1, $$2);
   }

   public bsr(String $$0, float $$1) {
      this($$0, bso.b, $$1);
   }

   public String a() {
      return this.d;
   }

   public bso b() {
      return this.e;
   }

   public float c() {
      return this.f;
   }

   public bsn d() {
      return this.g;
   }

   public bst e() {
      return this.h;
   }
}
