import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doq {
   public static final doq a = new doq(false, cvc.gz.o(), cvc.pL.o(), cvc.ej.o(), cvc.aQ.o());
   public static final Codec<doq> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(doq::a),
               dhi.b.optionalFieldOf("air_state", a.b()).forGetter(doq::b),
               dhi.b.optionalFieldOf("water_state", a.b()).forGetter(doq::c),
               dhi.b.optionalFieldOf("lava_state", a.b()).forGetter(doq::d),
               dhi.b.optionalFieldOf("barrier_state", a.b()).forGetter(doq::e)
            )
            .apply($$0, doq::new)
   );
   private final boolean c;
   private final dhi d;
   private final dhi e;
   private final dhi f;
   private final dhi g;

   public static doq a(boolean $$0, dhi $$1, dhi $$2, dhi $$3, dhi $$4) {
      return new doq($$0, $$1, $$2, $$3, $$4);
   }

   public static doq a(dhi $$0, dhi $$1, dhi $$2, dhi $$3) {
      return new doq(false, $$0, $$1, $$2, $$3);
   }

   public static doq a(boolean $$0, dhi $$1) {
      return new doq($$0, $$1, a.c(), a.d(), a.e());
   }

   private doq(boolean $$0, dhi $$1, dhi $$2, dhi $$3, dhi $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dhi b() {
      return this.d;
   }

   public dhi c() {
      return this.e;
   }

   public dhi d() {
      return this.f;
   }

   public dhi e() {
      return this.g;
   }
}
