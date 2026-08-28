import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bsl(String d, bsi e, float f, bsh g, bsn h) {
   public static final Codec<bsl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bsl::a),
               bsi.d.fieldOf("scaling").forGetter(bsl::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bsl::c),
               bsh.g.optionalFieldOf("effects", bsh.a).forGetter(bsl::d),
               bsn.d.optionalFieldOf("death_message_type", bsn.a).forGetter(bsl::e)
            )
            .apply($$0, bsl::new)
   );
   public static final Codec<jo<bsl>> b = alb.a(lw.s);
   public static final zc<wp, jo<bsl>> c = za.b(lw.s);

   public bsl(String $$0, bsi $$1, float $$2) {
      this($$0, $$1, $$2, bsh.a, bsn.a);
   }

   public bsl(String $$0, bsi $$1, float $$2, bsh $$3) {
      this($$0, $$1, $$2, $$3, bsn.a);
   }

   public bsl(String $$0, float $$1, bsh $$2) {
      this($$0, bsi.b, $$1, $$2);
   }

   public bsl(String $$0, float $$1) {
      this($$0, bsi.b, $$1);
   }

   public String a() {
      return this.d;
   }

   public bsi b() {
      return this.e;
   }

   public float c() {
      return this.f;
   }

   public bsh d() {
      return this.g;
   }

   public bsn e() {
      return this.h;
   }
}
