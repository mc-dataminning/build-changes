import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bsw(String d, bst e, float f, bss g, bsy h) {
   public static final Codec<bsw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bsw::a),
               bst.d.fieldOf("scaling").forGetter(bsw::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bsw::c),
               bss.g.optionalFieldOf("effects", bss.a).forGetter(bsw::d),
               bsy.d.optionalFieldOf("death_message_type", bsy.a).forGetter(bsw::e)
            )
            .apply($$0, bsw::new)
   );
   public static final Codec<jq<bsw>> b = alf.a(lz.s);
   public static final zg<wt, jq<bsw>> c = ze.b(lz.s);

   public bsw(String $$0, bst $$1, float $$2) {
      this($$0, $$1, $$2, bss.a, bsy.a);
   }

   public bsw(String $$0, bst $$1, float $$2, bss $$3) {
      this($$0, $$1, $$2, $$3, bsy.a);
   }

   public bsw(String $$0, float $$1, bss $$2) {
      this($$0, bst.b, $$1, $$2);
   }

   public bsw(String $$0, float $$1) {
      this($$0, bst.b, $$1);
   }

   public String a() {
      return this.d;
   }

   public bst b() {
      return this.e;
   }

   public float c() {
      return this.f;
   }

   public bss d() {
      return this.g;
   }

   public bsy e() {
      return this.h;
   }
}
