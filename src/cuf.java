import java.util.List;
import javax.annotation.Nullable;

public class cuf extends ctj {
   private static final int a = 32;

   public cuf(ctj.a $$0) {
      super($$0);
   }

   @Override
   public cto v() {
      cto $$0 = super.v();
      $$0.b(kb.F, new cvp(cvq.a));
      return $$0;
   }

   @Override
   public cto a(cto $$0, dax $$1, bso $$2) {
      clw $$3 = $$2 instanceof clw ? (clw)$$2 : null;
      if ($$3 instanceof aqn) {
         am.A.a((aqn)$$3, $$0);
      }

      if (!$$1.B) {
         cvp $$4 = $$0.a(kb.F, cvp.a);
         $$4.a($$2x -> {
            if ($$2x.c().a().a()) {
               $$2x.c().a().a($$3, $$3, $$2, $$2x.e(), 1.0);
            } else {
               $$2.b($$2x);
            }
         });
      }

      if ($$3 != null) {
         $$3.b(avr.c.b(this));
         $$0.a(1, $$3);
      }

      if ($$3 == null || !$$3.fP()) {
         if ($$0.e()) {
            return new cto(ctr.sl);
         }

         if ($$3 != null) {
            $$3.gc().f(new cto(ctr.sl));
         }
      }

      $$2.a(dvu.l);
      return $$0;
   }

   @Override
   public bpu a(cxb $$0) {
      dax $$1 = $$0.q();
      io $$2 = $$0.a();
      clw $$3 = $$0.o();
      cto $$4 = $$0.n();
      cvp $$5 = $$4.a(kb.F, cvp.a);
      drb $$6 = $$1.a_($$2);
      if ($$0.k() != it.a && $$6.a(avw.ci) && $$5.a(cvq.a)) {
         $$1.a(null, $$2, avh.ki, avi.e, 1.0F, 1.0F);
         $$3.a($$0.p(), ctq.a($$4, $$3, new cto(ctr.sl)));
         $$3.b(avr.c.b($$4.g()));
         if (!$$1.B) {
            aqm $$7 = (aqm)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(ky.am, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, avh.cB, avi.e, 1.0F, 1.0F);
         $$1.a(null, dvu.z, $$2);
         $$1.b($$2, dea.sI.n());
         return bpu.a($$1.B);
      } else {
         return bpu.d;
      }
   }

   @Override
   public int b(cto $$0) {
      return 32;
   }

   @Override
   public cvj c(cto $$0) {
      return cvj.c;
   }

   @Override
   public bpv<cto> a(dax $$0, clw $$1, bpt $$2) {
      return ctq.a($$0, $$1, $$2);
   }

   @Override
   public String i(cto $$0) {
      return cvn.a($$0.a(kb.F, cvp.a).f(), this.a() + ".effect.");
   }

   @Override
   public void a(cto $$0, @Nullable dax $$1, List<wx> $$2, cvh $$3) {
      cvp $$4 = $$0.a(kb.F);
      if ($$4 != null) {
         $$4.a($$2::add, 1.0F, $$1 == null ? 20.0F : $$1.s().f());
      }
   }
}
