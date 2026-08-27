import com.mojang.serialization.MapCodec;

public class dif extends dcv implements dcy {
   public static final MapCodec<dif> a = b(dif::new);

   @Override
   public MapCodec<dif> a() {
      return a;
   }

   protected dif(dpx.d $$0) {
      super($$0);
   }

   private static boolean b(dpy $$0, czx $$1, im $$2) {
      im $$3 = $$2.c();
      dpy $$4 = $$1.a_($$3);
      int $$5 = eli.a($$1, $$0, $$2, $$4, $$3, ir.b, $$4.b($$1, $$3));
      return $$5 < $$1.P();
   }

   @Override
   protected void b(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dcx.dV.n());
      }
   }

   @Override
   public boolean b(czx $$0, im $$1, dpy $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(czu $$0, ayd $$1, im $$2, dpy $$3) {
      return true;
   }

   @Override
   public void a(aqe $$0, ayd $$1, im $$2, dpy $$3) {
      dpy $$4 = $$0.a_($$2);
      im $$5 = $$2.c();
      drv $$6 = $$0.l().g();
      ji<dyh<?, ?>> $$7 = $$0.H_().d(ld.aB);
      if ($$4.a(dcx.ow)) {
         this.a($$7, rq.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dcx.on)) {
         this.a($$7, rq.j, $$0, $$6, $$1, $$5);
         this.a($$7, rq.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, rq.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(ji<dyh<?, ?>> $$0, ake<dyh<?, ?>> $$1, aqe $$2, drv $$3, ayd $$4, im $$5) {
      $$0.b($$1).ifPresent($$4x -> ((dyh)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public dcy.a aq_() {
      return dcy.a.a;
   }
}
