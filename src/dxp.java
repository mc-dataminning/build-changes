import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxp {
   public static final dxp a = new dxp(false, dcx.gz.n(), dcx.pL.n(), dcx.ej.n(), dcx.aQ.n());
   public static final Codec<dxp> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(dxp::a),
               dpy.b.optionalFieldOf("air_state", a.b()).forGetter(dxp::b),
               dpy.b.optionalFieldOf("water_state", a.b()).forGetter(dxp::c),
               dpy.b.optionalFieldOf("lava_state", a.b()).forGetter(dxp::d),
               dpy.b.optionalFieldOf("barrier_state", a.b()).forGetter(dxp::e)
            )
            .apply($$0, dxp::new)
   );
   private final boolean c;
   private final dpy d;
   private final dpy e;
   private final dpy f;
   private final dpy g;

   public static dxp a(boolean $$0, dpy $$1, dpy $$2, dpy $$3, dpy $$4) {
      return new dxp($$0, $$1, $$2, $$3, $$4);
   }

   public static dxp a(dpy $$0, dpy $$1, dpy $$2, dpy $$3) {
      return new dxp(false, $$0, $$1, $$2, $$3);
   }

   public static dxp a(boolean $$0, dpy $$1) {
      return new dxp($$0, $$1, a.c(), a.d(), a.e());
   }

   private dxp(boolean $$0, dpy $$1, dpy $$2, dpy $$3, dpy $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dpy b() {
      return this.d;
   }

   public dpy c() {
      return this.e;
   }

   public dpy d() {
      return this.f;
   }

   public dpy e() {
      return this.g;
   }
}
