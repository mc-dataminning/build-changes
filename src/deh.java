import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class deh extends dfr {
   public static final MapCodec<deh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lc.e.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), u()).apply($$0, deh::new)
   );
   private final dcv b;

   @Override
   public MapCodec<deh> a() {
      return a;
   }

   public deh(dcv $$0, dpx.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(czu $$0, im $$1, dpy $$2, dpy $$3, cgu $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.n(), 3);
      }
   }

   @Override
   public dpy a(cvl $$0) {
      cza $$1 = $$0.q();
      im $$2 = $$0.a();
      dpy $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.n() : super.a($$0);
   }

   private static boolean a(cza $$0, im $$1, dpy $$2) {
      return n($$2) || a($$0, $$1);
   }

   private static boolean a(cza $$0, im $$1) {
      boolean $$2 = false;
      im.a $$3 = $$1.j();

      for (ir $$4 : ir.values()) {
         dpy $$5 = $$0.a_($$3);
         if ($$4 != ir.a || n($$5)) {
            $$3.a($$1, $$4);
            $$5 = $$0.a_($$3);
            if (n($$5) && !$$5.d($$0, $$1, $$4.g())) {
               $$2 = true;
               break;
            }
         }
      }

      return $$2;
   }

   private static boolean n(dpy $$0) {
      return $$0.u().a(avt.a);
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      return a($$3, $$4) ? this.b.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int b(dpy $$0, cza $$1, im $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
