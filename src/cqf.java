import java.util.List;
import javax.annotation.Nullable;

public class cqf extends cpl {
   private static final int a = 32;

   public cqf(cpl.a $$0) {
      super($$0);
   }

   @Override
   public cpq an_() {
      return cro.a(super.an_(), crp.c);
   }

   @Override
   public cpq a(cpq $$0, cwe $$1, box $$2) {
      cia $$3 = $$2 instanceof cia ? (cia)$$2 : null;
      if ($$3 instanceof apb) {
         am.A.a((apb)$$3, $$0);
      }

      if (!$$1.B) {
         for (bns $$5 : cro.a($$0)) {
            if ($$5.b().a().a()) {
               $$5.b().a().a($$3, $$3, $$2, $$5.d(), 1.0);
            } else {
               $$2.b(new bns($$5));
            }
         }
      }

      if ($$3 != null) {
         $$3.b(atz.c.b(this));
         if (!$$3.fW().d) {
            $$0.h(1);
         }
      }

      if ($$3 == null || !$$3.fW().d) {
         if ($$0.b()) {
            return new cpq(cpt.sk);
         }

         if ($$3 != null) {
            $$3.fV().e(new cpq(cpt.sk));
         }
      }

      $$2.b(dqr.l);
      return $$0;
   }

   @Override
   public bml a(crz $$0) {
      cwe $$1 = $$0.q();
      ib $$2 = $$0.a();
      cia $$3 = $$0.o();
      cpq $$4 = $$0.n();
      dme $$5 = $$1.a_($$2);
      if ($$0.k() != ih.a && $$5.a(aue.cb) && cro.d($$4).a(crp.c)) {
         $$1.a(null, $$2, atp.jU, atq.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cps.a($$4, $$3, new cpq(cpt.sk)));
         $$3.b(atz.c.b($$4.d()));
         if (!$$1.B) {
            apa $$6 = (apa)$$1;

            for (int $$7 = 0; $$7 < 5; $$7++) {
               $$6.a(kb.aj, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, atp.cu, atq.e, 1.0F, 1.0F);
         $$1.a(null, dqr.z, $$2);
         $$1.b($$2, czh.sI.o());
         return bml.a($$1.B);
      } else {
         return bml.d;
      }
   }

   @Override
   public int b(cpq $$0) {
      return 32;
   }

   @Override
   public crj c(cpq $$0) {
      return crj.c;
   }

   @Override
   public bmm<cpq> a(cwe $$0, cia $$1, bmk $$2) {
      return cps.a($$0, $$1, $$2);
   }

   @Override
   public String j(cpq $$0) {
      return crm.a(cro.d($$0), this.a() + ".effect.");
   }

   @Override
   public void a(cpq $$0, @Nullable cwe $$1, List<vs> $$2, crh $$3) {
      cro.a($$0, $$2, 1.0F, $$1 == null ? 20.0F : $$1.s().f());
   }
}
