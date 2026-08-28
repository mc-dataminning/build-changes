import java.util.List;

public class cwg extends cvg {
   private static final int a = 32;

   public cwg(cvg.a $$0) {
      super($$0);
   }

   @Override
   public cvl w() {
      cvl $$0 = super.w();
      $$0.b(kr.I, new cxn(cxo.a));
      return $$0;
   }

   @Override
   public cvl a(cvl $$0, dds $$1, buf $$2) {
      cnp $$3 = $$2 instanceof cnp ? (cnp)$$2 : null;
      if ($$3 instanceof arh) {
         an.A.a((arh)$$3, $$0);
      }

      if (!$$1.B) {
         cxn $$4 = $$0.a(kr.I, cxn.a);
         $$4.a($$2x -> {
            if ($$2x.c().a().a()) {
               $$2x.c().a().a($$3, $$3, $$2, $$2x.e(), 1.0);
            } else {
               $$2.b($$2x);
            }
         });
      }

      if ($$3 != null) {
         $$3.b(awn.c.b(this));
         $$0.a(1, $$3);
      }

      if ($$3 == null || !$$3.fP()) {
         if ($$0.f()) {
            return new cvl(cvo.sm);
         }

         if ($$3 != null) {
            $$3.gc().f(new cvl(cvo.sm));
         }
      }

      $$2.a(dyx.l);
      return $$0;
   }

   @Override
   public brk a(cyy $$0) {
      dds $$1 = $$0.q();
      je $$2 = $$0.a();
      cnp $$3 = $$0.o();
      cvl $$4 = $$0.n();
      cxn $$5 = $$4.a(kr.I, cxn.a);
      dua $$6 = $$1.a_($$2);
      if ($$0.k() != jj.a && $$6.a(aws.cj) && $$5.a(cxo.a)) {
         $$1.a(null, $$2, awd.kj, awe.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cvn.a($$4, $$3, new cvl(cvo.sm)));
         $$3.b(awn.c.b($$4.h()));
         if (!$$1.B) {
            arg $$7 = (arg)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(ln.am, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, awd.cB, awe.e, 1.0F, 1.0F);
         $$1.a(null, dyx.z, $$2);
         $$1.b($$2, dgx.sI.o());
         return brk.a;
      } else {
         return brk.e;
      }
   }

   @Override
   public int a(cvl $$0, buf $$1) {
      return 32;
   }

   @Override
   public cxh b(cvl $$0) {
      return cxh.c;
   }

   @Override
   public brk a(dds $$0, cnp $$1, brj $$2) {
      return cvn.a($$0, $$1, $$2);
   }

   @Override
   public String d_(cvl $$0) {
      return cxl.a($$0.a(kr.I, cxn.a).e(), this.a() + ".effect.");
   }

   @Override
   public void a(cvl $$0, cvg.b $$1, List<xd> $$2, cxf $$3) {
      cxn $$4 = $$0.a(kr.I);
      if ($$4 != null) {
         $$4.a($$2::add, 1.0F, $$1.b());
      }
   }
}
