import java.util.List;
import javax.annotation.Nullable;

public class cnm extends cms {
   private static final int a = 32;

   public cnm(cms.a $$0) {
      super($$0);
   }

   @Override
   public cmx am_() {
      return cox.a(super.am_(), coy.c);
   }

   @Override
   public cmx a(cmx $$0, cto $$1, bmk $$2) {
      cfh $$3 = $$2 instanceof cfh ? (cfh)$$2 : null;
      if ($$3 instanceof ane) {
         am.A.a((ane)$$3, $$0);
      }

      if (!$$1.B) {
         for (blh $$5 : cox.a($$0)) {
            if ($$5.c().a()) {
               $$5.c().a($$3, $$3, $$2, $$5.e(), 1.0);
            } else {
               $$2.b(new blh($$5));
            }
         }
      }

      if ($$3 != null) {
         $$3.b(asb.c.b(this));
         if (!$$3.fT().d) {
            $$0.h(1);
         }
      }

      if ($$3 == null || !$$3.fT().d) {
         if ($$0.b()) {
            return new cmx(cna.si);
         }

         if ($$3 != null) {
            $$3.fS().e(new cmx(cna.si));
         }
      }

      $$2.a(dnq.l);
      return $$0;
   }

   @Override
   public bka a(cpi $$0) {
      cto $$1 = $$0.q();
      hx $$2 = $$0.a();
      cfh $$3 = $$0.o();
      cmx $$4 = $$0.n();
      djg $$5 = $$1.a_($$2);
      if ($$0.k() != ic.a && $$5.a(asg.ca) && cox.d($$4) == coy.c) {
         $$1.a(null, $$2, arr.jE, ars.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cmz.a($$4, $$3, new cmx(cna.si)));
         $$3.b(asb.c.b($$4.d()));
         if (!$$1.B) {
            and $$6 = (and)$$1;

            for (int $$7 = 0; $$7 < 5; $$7++) {
               $$6.a(jx.aj, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, arr.ch, ars.e, 1.0F, 1.0F);
         $$1.a(null, dnq.z, $$2);
         $$1.b($$2, cwr.sI.o());
         return bka.a($$1.B);
      } else {
         return bka.d;
      }
   }

   @Override
   public int b(cmx $$0) {
      return 32;
   }

   @Override
   public cor c(cmx $$0) {
      return cor.c;
   }

   @Override
   public bkb<cmx> a(cto $$0, cfh $$1, bjz $$2) {
      return cmz.a($$0, $$1, $$2);
   }

   @Override
   public String j(cmx $$0) {
      return cox.d($$0).b(this.a() + ".effect.");
   }

   @Override
   public void a(cmx $$0, @Nullable cto $$1, List<vf> $$2, cop $$3) {
      cox.a($$0, $$2, 1.0F);
   }
}
