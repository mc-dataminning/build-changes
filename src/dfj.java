import com.mojang.serialization.MapCodec;

public class dfj extends dch {
   public static final MapCodec<dfj> a = b(dfj::new);
   protected static final ety b = dcv.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<dfj> a() {
      return a;
   }

   protected dfj(dpx.d $$0) {
      super($$0);
   }

   @Override
   public dnd a(im $$0, dpy $$1) {
      return new dou($$0, $$1);
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return b;
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, bql $$3) {
      if ($$1 instanceof aqe && $$3.cu() && etv.c(etv.a($$3.cI().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), etj.i)) {
         ake<czu> $$4 = $$1.ae() == czu.j ? czu.h : czu.j;
         aqe $$5 = ((aqe)$$1).o().a($$4);
         if ($$5 == null) {
            return;
         }

         $$3.b($$5);
      }
   }

   @Override
   public void a(dpy $$0, czu $$1, im $$2, ayd $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(kw.ab, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public csd a(czx $$0, im $$1, dpy $$2) {
      return csd.i;
   }

   @Override
   protected boolean a(dpy $$0, elq $$1) {
      return false;
   }
}
