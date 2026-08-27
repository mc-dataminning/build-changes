import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bpl(String b, bpi c, float d, bph e, bpn f) {
   public static final Codec<bpl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("message_id").forGetter(bpl::a),
               bpi.d.fieldOf("scaling").forGetter(bpl::b),
               Codec.FLOAT.fieldOf("exhaustion").forGetter(bpl::c),
               bph.g.optionalFieldOf("effects", bph.a).forGetter(bpl::d),
               bpn.d.optionalFieldOf("death_message_type", bpn.a).forGetter(bpl::e)
            )
            .apply($$0, bpl::new)
   );

   public bpl(String $$0, bpi $$1, float $$2) {
      this($$0, $$1, $$2, bph.a, bpn.a);
   }

   public bpl(String $$0, bpi $$1, float $$2, bph $$3) {
      this($$0, $$1, $$2, $$3, bpn.a);
   }

   public bpl(String $$0, float $$1, bph $$2) {
      this($$0, bpi.b, $$1, $$2);
   }

   public bpl(String $$0, float $$1) {
      this($$0, bpi.b, $$1);
   }

   public String a() {
      return this.b;
   }

   public bpi b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public bph d() {
      return this.e;
   }

   public bpn e() {
      return this.f;
   }
}
