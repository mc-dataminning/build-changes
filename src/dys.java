import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dys {
   public static final dys a = new dys(false, dea.gz.n(), dea.pL.n(), dea.ej.n(), dea.aQ.n());
   public static final Codec<dys> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(dys::a),
               drb.b.optionalFieldOf("air_state", a.b()).forGetter(dys::b),
               drb.b.optionalFieldOf("water_state", a.b()).forGetter(dys::c),
               drb.b.optionalFieldOf("lava_state", a.b()).forGetter(dys::d),
               drb.b.optionalFieldOf("barrier_state", a.b()).forGetter(dys::e)
            )
            .apply($$0, dys::new)
   );
   private final boolean c;
   private final drb d;
   private final drb e;
   private final drb f;
   private final drb g;

   public static dys a(boolean $$0, drb $$1, drb $$2, drb $$3, drb $$4) {
      return new dys($$0, $$1, $$2, $$3, $$4);
   }

   public static dys a(drb $$0, drb $$1, drb $$2, drb $$3) {
      return new dys(false, $$0, $$1, $$2, $$3);
   }

   public static dys a(boolean $$0, drb $$1) {
      return new dys($$0, $$1, a.c(), a.d(), a.e());
   }

   private dys(boolean $$0, drb $$1, drb $$2, drb $$3, drb $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public drb b() {
      return this.d;
   }

   public drb c() {
      return this.e;
   }

   public drb d() {
      return this.f;
   }

   public drb e() {
      return this.g;
   }
}
