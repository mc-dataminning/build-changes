import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eav {
   public static final eav a = new eav(false, dfy.gz.o(), dfy.pL.o(), dfy.ej.o(), dfy.aQ.o());
   public static final Codec<eav> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(eav::a),
               dta.b.optionalFieldOf("air_state", a.b()).forGetter(eav::b),
               dta.b.optionalFieldOf("water_state", a.b()).forGetter(eav::c),
               dta.b.optionalFieldOf("lava_state", a.b()).forGetter(eav::d),
               dta.b.optionalFieldOf("barrier_state", a.b()).forGetter(eav::e)
            )
            .apply($$0, eav::new)
   );
   private final boolean c;
   private final dta d;
   private final dta e;
   private final dta f;
   private final dta g;

   public static eav a(boolean $$0, dta $$1, dta $$2, dta $$3, dta $$4) {
      return new eav($$0, $$1, $$2, $$3, $$4);
   }

   public static eav a(dta $$0, dta $$1, dta $$2, dta $$3) {
      return new eav(false, $$0, $$1, $$2, $$3);
   }

   public static eav a(boolean $$0, dta $$1) {
      return new eav($$0, $$1, a.c(), a.d(), a.e());
   }

   private eav(boolean $$0, dta $$1, dta $$2, dta $$3, dta $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dta b() {
      return this.d;
   }

   public dta c() {
      return this.e;
   }

   public dta d() {
      return this.f;
   }

   public dta e() {
      return this.g;
   }
}
