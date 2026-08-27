import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyu {
   public static final dyu a = new dyu(false, dec.gz.n(), dec.pL.n(), dec.ej.n(), dec.aQ.n());
   public static final Codec<dyu> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(dyu::a),
               drd.b.optionalFieldOf("air_state", a.b()).forGetter(dyu::b),
               drd.b.optionalFieldOf("water_state", a.b()).forGetter(dyu::c),
               drd.b.optionalFieldOf("lava_state", a.b()).forGetter(dyu::d),
               drd.b.optionalFieldOf("barrier_state", a.b()).forGetter(dyu::e)
            )
            .apply($$0, dyu::new)
   );
   private final boolean c;
   private final drd d;
   private final drd e;
   private final drd f;
   private final drd g;

   public static dyu a(boolean $$0, drd $$1, drd $$2, drd $$3, drd $$4) {
      return new dyu($$0, $$1, $$2, $$3, $$4);
   }

   public static dyu a(drd $$0, drd $$1, drd $$2, drd $$3) {
      return new dyu(false, $$0, $$1, $$2, $$3);
   }

   public static dyu a(boolean $$0, drd $$1) {
      return new dyu($$0, $$1, a.c(), a.d(), a.e());
   }

   private dyu(boolean $$0, drd $$1, drd $$2, drd $$3, drd $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public drd b() {
      return this.d;
   }

   public drd c() {
      return this.e;
   }

   public drd d() {
      return this.f;
   }

   public drd e() {
      return this.g;
   }
}
