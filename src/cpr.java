import org.jetbrains.annotations.Nullable;

public class cpr extends cpa implements cse {
   private static final ddb b = dcr.bv;
   public static final int a = 2;
   private final cpn c;
   private final amg d;
   private final amg e;

   public cpr(cpn $$0, dca.d $$1, amg $$2, amg $$3) {
      super($$1);
      this.c = $$0;
      this.d = $$2;
      this.e = $$3;
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(b);
   }

   @Override
   public cvs b_(dcb $$0) {
      return cvs.c;
   }

   @Override
   public void b(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
      if ($$1.c_($$2) instanceof czr $$4) {
         $$4.c();
      }

      if (csf.h($$1.a_($$2.d())) && $$2.v() >= $$1.C_()) {
         bvg $$5 = bvg.a($$1, $$2, $$0);
         $$5.k();
      }
   }

   @Override
   public void a(cmm $$0, gu $$1, bvg $$2) {
      eei $$3 = $$2.cE().f();
      $$0.c(2001, gu.a($$3), cpn.i($$2.o()));
      $$0.a($$2, dgl.f, $$3);
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, apf $$3) {
      if ($$3.a(16) == 0) {
         gu $$4 = $$2.d();
         if (csf.h($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new in(iv.z, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public czn a(gu $$0, dcb $$1) {
      return new czr($$0, $$1);
   }

   public cpn a() {
      return this.c;
   }

   public amg b() {
      return this.d;
   }

   public amg c() {
      return this.e;
   }
}
