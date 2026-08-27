import javax.annotation.Nullable;

public class cso extends crx implements cvb {
   private static final dfy b = dfo.bv;
   public static final int a = 2;
   private final csk c;
   private final aot d;
   private final aot e;

   public cso(csk $$0, dex.d $$1, aot $$2, aot $$3) {
      super($$1);
      this.c = $$0;
      this.d = $$2;
      this.e = $$3;
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(b);
   }

   @Override
   public cyp b_(dey $$0) {
      return cyp.c;
   }

   @Override
   public void b(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      if ($$1.c_($$2) instanceof dco $$4) {
         $$4.c();
      }

      if (cvc.h($$1.a_($$2.d())) && $$2.v() >= $$1.C_()) {
         byd $$5 = byd.a($$1, $$2, $$0);
         $$5.m();
      }
   }

   @Override
   public void a(cpk $$0, gv $$1, byd $$2) {
      ehf $$3 = $$2.cG().f();
      $$0.c(2001, gv.a($$3), csk.i($$2.o()));
      $$0.a($$2, dji.f, $$3);
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, art $$3) {
      if ($$3.a(16) == 0) {
         gv $$4 = $$2.d();
         if (cvc.h($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new io(iw.z, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dck a(gv $$0, dey $$1) {
      return new dco($$0, $$1);
   }

   public csk a() {
      return this.c;
   }

   public aot b() {
      return this.d;
   }

   public aot c() {
      return this.e;
   }
}
