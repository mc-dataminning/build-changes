import java.util.List;
import javax.annotation.Nullable;

public class cnv extends cnb {
   private static final int a = 32;

   public cnv(cnb.a $$0) {
      super($$0);
   }

   @Override
   public cng ao_() {
      return cpg.a(super.ao_(), cph.c);
   }

   @Override
   public cng a(cng $$0, ctx $$1, bmo $$2) {
      cfq $$3 = $$2 instanceof cfq ? (cfq)$$2 : null;
      if ($$3 instanceof anf) {
         am.A.a((anf)$$3, $$0);
      }

      if (!$$1.B) {
         for (blj $$5 : cpg.a($$0)) {
            if ($$5.b().a().a()) {
               $$5.b().a().a($$3, $$3, $$2, $$5.d(), 1.0);
            } else {
               $$2.b(new blj($$5));
            }
         }
      }

      if ($$3 != null) {
         $$3.b(asd.c.b(this));
         if (!$$3.fT().d) {
            $$0.h(1);
         }
      }

      if ($$3 == null || !$$3.fT().d) {
         if ($$0.b()) {
            return new cng(cnj.sk);
         }

         if ($$3 != null) {
            $$3.fS().e(new cng(cnj.sk));
         }
      }

      $$2.b(dnz.l);
      return $$0;
   }

   @Override
   public bkc a(cpr $$0) {
      ctx $$1 = $$0.q();
      hx $$2 = $$0.a();
      cfq $$3 = $$0.o();
      cng $$4 = $$0.n();
      djp $$5 = $$1.a_($$2);
      if ($$0.k() != ic.a && $$5.a(asi.ca) && cpg.d($$4).a(cph.c)) {
         $$1.a(null, $$2, art.jT, aru.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cni.a($$4, $$3, new cng(cnj.sk)));
         $$3.b(asd.c.b($$4.d()));
         if (!$$1.B) {
            ane $$6 = (ane)$$1;

            for (int $$7 = 0; $$7 < 5; $$7++) {
               $$6.a(jx.aj, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, art.ct, aru.e, 1.0F, 1.0F);
         $$1.a(null, dnz.z, $$2);
         $$1.b($$2, cxa.sI.o());
         return bkc.a($$1.B);
      } else {
         return bkc.d;
      }
   }

   @Override
   public int b(cng $$0) {
      return 32;
   }

   @Override
   public cpa c(cng $$0) {
      return cpa.c;
   }

   @Override
   public bkd<cng> a(ctx $$0, cfq $$1, bkb $$2) {
      return cni.a($$0, $$1, $$2);
   }

   @Override
   public String j(cng $$0) {
      return cpe.a(cpg.d($$0), this.a() + ".effect.");
   }

   @Override
   public void a(cng $$0, @Nullable ctx $$1, List<vg> $$2, coy $$3) {
      cpg.a($$0, $$2, 1.0F, $$1 == null ? 20.0F : $$1.s().f());
   }
}
