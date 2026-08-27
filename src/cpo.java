import java.util.List;
import javax.annotation.Nullable;

public class cpo extends cou {
   private static final int a = 32;

   public cpo(cou.a $$0) {
      super($$0);
   }

   @Override
   public coz ao_() {
      return cqx.a(super.ao_(), cqy.c);
   }

   @Override
   public coz a(coz $$0, cvn $$1, bog $$2) {
      chh $$3 = $$2 instanceof chh ? (chh)$$2 : null;
      if ($$3 instanceof aow) {
         am.A.a((aow)$$3, $$0);
      }

      if (!$$1.B) {
         for (bnb $$5 : cqx.a($$0)) {
            if ($$5.b().a().a()) {
               $$5.b().a().a($$3, $$3, $$2, $$5.d(), 1.0);
            } else {
               $$2.b(new bnb($$5));
            }
         }
      }

      if ($$3 != null) {
         $$3.b(atu.c.b(this));
         if (!$$3.fU().d) {
            $$0.h(1);
         }
      }

      if ($$3 == null || !$$3.fU().d) {
         if ($$0.b()) {
            return new coz(cpc.sk);
         }

         if ($$3 != null) {
            $$3.fT().e(new coz(cpc.sk));
         }
      }

      $$2.b(dpp.l);
      return $$0;
   }

   @Override
   public blu a(cri $$0) {
      cvn $$1 = $$0.q();
      hz $$2 = $$0.a();
      chh $$3 = $$0.o();
      coz $$4 = $$0.n();
      dlf $$5 = $$1.a_($$2);
      if ($$0.k() != ie.a && $$5.a(atz.cb) && cqx.d($$4).a(cqy.c)) {
         $$1.a(null, $$2, atk.jT, atl.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cpb.a($$4, $$3, new coz(cpc.sk)));
         $$3.b(atu.c.b($$4.d()));
         if (!$$1.B) {
            aov $$6 = (aov)$$1;

            for (int $$7 = 0; $$7 < 5; $$7++) {
               $$6.a(jz.aj, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, atk.ct, atl.e, 1.0F, 1.0F);
         $$1.a(null, dpp.z, $$2);
         $$1.b($$2, cyq.sI.o());
         return blu.a($$1.B);
      } else {
         return blu.d;
      }
   }

   @Override
   public int b(coz $$0) {
      return 32;
   }

   @Override
   public cqs c(coz $$0) {
      return cqs.c;
   }

   @Override
   public blv<coz> a(cvn $$0, chh $$1, blt $$2) {
      return cpb.a($$0, $$1, $$2);
   }

   @Override
   public String j(coz $$0) {
      return cqv.a(cqx.d($$0), this.a() + ".effect.");
   }

   @Override
   public void a(coz $$0, @Nullable cvn $$1, List<vq> $$2, cqq $$3) {
      cqx.a($$0, $$2, 1.0F, $$1 == null ? 20.0F : $$1.s().f());
   }
}
