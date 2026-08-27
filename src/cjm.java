import java.util.List;
import javax.annotation.Nullable;

public class cjm extends cis {
   private static final int a = 32;

   public cjm(cis.a $$0) {
      super($$0);
   }

   @Override
   public cix ad_() {
      return ckw.a(super.ad_(), ckx.c);
   }

   @Override
   public cix a(cix $$0, cpl $$1, biy $$2) {
      cbm $$3 = $$2 instanceof cbm ? (cbm)$$2 : null;
      if ($$3 instanceof akl) {
         ai.z.a((akl)$$3, $$0);
      }

      if (!$$1.B) {
         for (bhv $$5 : ckw.a($$0)) {
            if ($$5.c().a()) {
               $$5.c().a($$3, $$3, $$2, $$5.e(), 1.0);
            } else {
               $$2.b(new bhv($$5));
            }
         }
      }

      if ($$3 != null) {
         $$3.b(apg.c.b(this));
         if (!$$3.fR().d) {
            $$0.h(1);
         }
      }

      if ($$3 == null || !$$3.fR().d) {
         if ($$0.b()) {
            return new cix(cja.rw);
         }

         if ($$3 != null) {
            $$3.fQ().e(new cix(cja.rw));
         }
      }

      $$2.a(djj.l);
      return $$0;
   }

   @Override
   public bgq a(clh $$0) {
      cpl $$1 = $$0.q();
      gu $$2 = $$0.a();
      cbm $$3 = $$0.o();
      cix $$4 = $$0.n();
      dez $$5 = $$1.a_($$2);
      if ($$0.k() != ha.a && $$5.a(apl.ca) && ckw.d($$4) == ckx.c) {
         $$1.a(null, $$2, aow.jb, aox.e, 1.0F, 1.0F);
         $$3.a($$0.p(), ciz.a($$4, $$3, new cix(cja.rw)));
         $$3.b(apg.c.b($$4.d()));
         if (!$$1.B) {
            akk $$6 = (akk)$$1;

            for (int $$7 = 0; $$7 < 5; $$7++) {
               $$6.a(iv.ag, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, aow.ch, aox.e, 1.0F, 1.0F);
         $$1.a(null, djj.z, $$2);
         $$1.b($$2, csm.rH.n());
         return bgq.a($$1.B);
      } else {
         return bgq.d;
      }
   }

   @Override
   public int b(cix $$0) {
      return 32;
   }

   @Override
   public ckq c(cix $$0) {
      return ckq.c;
   }

   @Override
   public bgr<cix> a(cpl $$0, cbm $$1, bgp $$2) {
      return ciz.a($$0, $$1, $$2);
   }

   @Override
   public String j(cix $$0) {
      return ckw.d($$0).b(this.a() + ".effect.");
   }

   @Override
   public void a(cix $$0, @Nullable cpl $$1, List<tf> $$2, cko $$3) {
      ckw.a($$0, $$2, 1.0F);
   }
}
