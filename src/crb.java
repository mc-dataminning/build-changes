import java.util.List;
import javax.annotation.Nullable;

public class crb extends cqh {
   private static final int a = 32;

   public crb(cqh.a $$0) {
      super($$0);
   }

   @Override
   public cqm am_() {
      return csl.a(super.am_(), csm.c);
   }

   @Override
   public cqm a(cqm $$0, cxb $$1, bpp $$2) {
      ciu $$3 = $$2 instanceof ciu ? (ciu)$$2 : null;
      if ($$3 instanceof apg) {
         am.A.a((apg)$$3, $$0);
      }

      if (!$$1.B) {
         for (bok $$5 : csl.a($$0)) {
            if ($$5.b().a().a()) {
               $$5.b().a().a($$3, $$3, $$2, $$5.d(), 1.0);
            } else {
               $$2.b(new bok($$5));
            }
         }
      }

      if ($$3 != null) {
         $$3.b(aui.c.b(this));
         $$0.a(1, $$3);
      }

      if ($$3 == null || !$$3.fM()) {
         if ($$0.b()) {
            return new cqm(cqp.sk);
         }

         if ($$3 != null) {
            $$3.fZ().e(new cqm(cqp.sk));
         }
      }

      $$2.b(drp.l);
      return $$0;
   }

   @Override
   public bnd a(csw $$0) {
      cxb $$1 = $$0.q();
      ib $$2 = $$0.a();
      ciu $$3 = $$0.o();
      cqm $$4 = $$0.n();
      dnb $$5 = $$1.a_($$2);
      if ($$0.k() != ih.a && $$5.a(aun.cc) && csl.d($$4).a(csm.c)) {
         $$1.a(null, $$2, aty.kb, atz.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cqo.a($$4, $$3, new cqm(cqp.sk)));
         $$3.b(aui.c.b($$4.d()));
         if (!$$1.B) {
            apf $$6 = (apf)$$1;

            for (int $$7 = 0; $$7 < 5; $$7++) {
               $$6.a(kc.ak, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, aty.cA, atz.e, 1.0F, 1.0F);
         $$1.a(null, drp.z, $$2);
         $$1.b($$2, dae.sI.o());
         return bnd.a($$1.B);
      } else {
         return bnd.d;
      }
   }

   @Override
   public int b(cqm $$0) {
      return 32;
   }

   @Override
   public csf c(cqm $$0) {
      return csf.c;
   }

   @Override
   public bne<cqm> a(cxb $$0, ciu $$1, bnc $$2) {
      return cqo.a($$0, $$1, $$2);
   }

   @Override
   public String j(cqm $$0) {
      return csj.a(csl.d($$0), this.a() + ".effect.");
   }

   @Override
   public void a(cqm $$0, @Nullable cxb $$1, List<vu> $$2, csd $$3) {
      csl.a($$0, $$2, 1.0F, $$1 == null ? 20.0F : $$1.s().f());
   }
}
