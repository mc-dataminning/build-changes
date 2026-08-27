import com.mojang.serialization.MapCodec;

public abstract class dfr extends dcv implements dfq {
   public dfr(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dfr> a();

   @Override
   protected void b(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      $$3.a($$4, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if (m($$1.a_($$2.d())) && $$2.v() >= $$1.I_()) {
         cgu $$4 = cgu.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(cgu $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean m(dpy $$0) {
      return $$0.i() || $$0.a(avo.aK) || $$0.k() || $$0.r();
   }

   @Override
   public void a(dpy $$0, czu $$1, im $$2, ayd $$3) {
      if ($$3.a(16) == 0) {
         im $$4 = $$2.d();
         if (m($$1.a_($$4))) {
            axz.a($$1, $$2, $$3, new kn(kw.B, $$0));
         }
      }
   }

   public int b(dpy $$0, cza $$1, im $$2) {
      return -16777216;
   }
}
