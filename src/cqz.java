import java.util.List;
import javax.annotation.Nullable;

public class cqz extends cqf {
   private static final int a = 32;

   public cqz(cqf.a $$0) {
      super($$0);
   }

   @Override
   public cqk am_() {
      return csj.a(super.am_(), csk.c);
   }

   @Override
   public cqk a(cqk $$0, cwz $$1, bpo $$2) {
      cis $$3 = $$2 instanceof cis ? (cis)$$2 : null;
      if ($$3 instanceof apg) {
         am.A.a((apg)$$3, $$0);
      }

      if (!$$1.B) {
         for (boj $$5 : csj.a($$0)) {
            if ($$5.b().a().a()) {
               $$5.b().a().a($$3, $$3, $$2, $$5.d(), 1.0);
            } else {
               $$2.b(new boj($$5));
            }
         }
      }

      if ($$3 != null) {
         $$3.b(aui.c.b(this));
         $$0.a(1, $$3);
      }

      if ($$3 == null || !$$3.fM()) {
         if ($$0.b()) {
            return new cqk(cqn.sk);
         }

         if ($$3 != null) {
            $$3.fZ().e(new cqk(cqn.sk));
         }
      }

      $$2.b(drn.l);
      return $$0;
   }

   @Override
   public bnc a(csu $$0) {
      cwz $$1 = $$0.q();
      ib $$2 = $$0.a();
      cis $$3 = $$0.o();
      cqk $$4 = $$0.n();
      dmz $$5 = $$1.a_($$2);
      if ($$0.k() != ih.a && $$5.a(aun.cc) && csj.d($$4).a(csk.c)) {
         $$1.a(null, $$2, aty.jX, atz.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cqm.a($$4, $$3, new cqk(cqn.sk)));
         $$3.b(aui.c.b($$4.d()));
         if (!$$1.B) {
            apf $$6 = (apf)$$1;

            for (int $$7 = 0; $$7 < 5; $$7++) {
               $$6.a(kc.ak, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, aty.cw, atz.e, 1.0F, 1.0F);
         $$1.a(null, drn.z, $$2);
         $$1.b($$2, dac.sI.o());
         return bnc.a($$1.B);
      } else {
         return bnc.d;
      }
   }

   @Override
   public int b(cqk $$0) {
      return 32;
   }

   @Override
   public csd c(cqk $$0) {
      return csd.c;
   }

   @Override
   public bnd<cqk> a(cwz $$0, cis $$1, bnb $$2) {
      return cqm.a($$0, $$1, $$2);
   }

   @Override
   public String j(cqk $$0) {
      return csh.a(csj.d($$0), this.a() + ".effect.");
   }

   @Override
   public void a(cqk $$0, @Nullable cwz $$1, List<vu> $$2, csb $$3) {
      csj.a($$0, $$2, 1.0F, $$1 == null ? 20.0F : $$1.s().f());
   }
}
