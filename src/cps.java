import java.util.List;
import javax.annotation.Nullable;

public class cps extends coy {
   private static final int a = 32;

   public cps(coy.a $$0) {
      super($$0);
   }

   @Override
   public cpd ao_() {
      return crb.a(super.ao_(), crc.c);
   }

   @Override
   public cpd a(cpd $$0, cvr $$1, boi $$2) {
      chl $$3 = $$2 instanceof chl ? (chl)$$2 : null;
      if ($$3 instanceof aox) {
         am.A.a((aox)$$3, $$0);
      }

      if (!$$1.B) {
         for (bnd $$5 : crb.a($$0)) {
            if ($$5.b().a().a()) {
               $$5.b().a().a($$3, $$3, $$2, $$5.d(), 1.0);
            } else {
               $$2.b(new bnd($$5));
            }
         }
      }

      if ($$3 != null) {
         $$3.b(atv.c.b(this));
         if (!$$3.fU().d) {
            $$0.h(1);
         }
      }

      if ($$3 == null || !$$3.fU().d) {
         if ($$0.b()) {
            return new cpd(cpg.sk);
         }

         if ($$3 != null) {
            $$3.fT().e(new cpd(cpg.sk));
         }
      }

      $$2.b(dpw.l);
      return $$0;
   }

   @Override
   public blw a(crm $$0) {
      cvr $$1 = $$0.q();
      hz $$2 = $$0.a();
      chl $$3 = $$0.o();
      cpd $$4 = $$0.n();
      dlj $$5 = $$1.a_($$2);
      if ($$0.k() != ie.a && $$5.a(aua.cb) && crb.d($$4).a(crc.c)) {
         $$1.a(null, $$2, atl.jU, atm.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cpf.a($$4, $$3, new cpd(cpg.sk)));
         $$3.b(atv.c.b($$4.d()));
         if (!$$1.B) {
            aow $$6 = (aow)$$1;

            for (int $$7 = 0; $$7 < 5; $$7++) {
               $$6.a(jz.aj, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, atl.cu, atm.e, 1.0F, 1.0F);
         $$1.a(null, dpw.z, $$2);
         $$1.b($$2, cyu.sI.o());
         return blw.a($$1.B);
      } else {
         return blw.d;
      }
   }

   @Override
   public int b(cpd $$0) {
      return 32;
   }

   @Override
   public cqw c(cpd $$0) {
      return cqw.c;
   }

   @Override
   public blx<cpd> a(cvr $$0, chl $$1, blv $$2) {
      return cpf.a($$0, $$1, $$2);
   }

   @Override
   public String j(cpd $$0) {
      return cqz.a(crb.d($$0), this.a() + ".effect.");
   }

   @Override
   public void a(cpd $$0, @Nullable cvr $$1, List<vq> $$2, cqu $$3) {
      crb.a($$0, $$2, 1.0F, $$1 == null ? 20.0F : $$1.s().f());
   }
}
