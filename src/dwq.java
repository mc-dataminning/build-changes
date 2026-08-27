import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwq {
   public static final dwq a = new dwq(false, dca.gz.n(), dca.pL.n(), dca.ej.n(), dca.aQ.n());
   public static final Codec<dwq> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(dwq::a),
               doz.b.optionalFieldOf("air_state", a.b()).forGetter(dwq::b),
               doz.b.optionalFieldOf("water_state", a.b()).forGetter(dwq::c),
               doz.b.optionalFieldOf("lava_state", a.b()).forGetter(dwq::d),
               doz.b.optionalFieldOf("barrier_state", a.b()).forGetter(dwq::e)
            )
            .apply($$0, dwq::new)
   );
   private final boolean c;
   private final doz d;
   private final doz e;
   private final doz f;
   private final doz g;

   public static dwq a(boolean $$0, doz $$1, doz $$2, doz $$3, doz $$4) {
      return new dwq($$0, $$1, $$2, $$3, $$4);
   }

   public static dwq a(doz $$0, doz $$1, doz $$2, doz $$3) {
      return new dwq(false, $$0, $$1, $$2, $$3);
   }

   public static dwq a(boolean $$0, doz $$1) {
      return new dwq($$0, $$1, a.c(), a.d(), a.e());
   }

   private dwq(boolean $$0, doz $$1, doz $$2, doz $$3, doz $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public doz b() {
      return this.d;
   }

   public doz c() {
      return this.e;
   }

   public doz d() {
      return this.f;
   }

   public doz e() {
      return this.g;
   }
}
