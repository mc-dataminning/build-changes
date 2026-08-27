import java.util.List;
import javax.annotation.Nullable;

public class cng extends cmm {
   private static final int a = 32;

   public cng(cmm.a $$0) {
      super($$0);
   }

   @Override
   public cmr am_() {
      return cor.a(super.am_(), cos.c);
   }

   @Override
   public cmr a(cmr $$0, cti $$1, bmf $$2) {
      cfb $$3 = $$2 instanceof cfb ? (cfb)$$2 : null;
      if ($$3 instanceof ana) {
         am.A.a((ana)$$3, $$0);
      }

      if (!$$1.B) {
         for (blc $$5 : cor.a($$0)) {
            if ($$5.c().a()) {
               $$5.c().a($$3, $$3, $$2, $$5.e(), 1.0);
            } else {
               $$2.b(new blc($$5));
            }
         }
      }

      if ($$3 != null) {
         $$3.b(arw.c.b(this));
         if (!$$3.fT().d) {
            $$0.h(1);
         }
      }

      if ($$3 == null || !$$3.fT().d) {
         if ($$0.b()) {
            return new cmr(cmu.si);
         }

         if ($$3 != null) {
            $$3.fS().e(new cmr(cmu.si));
         }
      }

      $$2.a(dnk.l);
      return $$0;
   }

   @Override
   public bjv a(cpc $$0) {
      cti $$1 = $$0.q();
      hx $$2 = $$0.a();
      cfb $$3 = $$0.o();
      cmr $$4 = $$0.n();
      dja $$5 = $$1.a_($$2);
      if ($$0.k() != ic.a && $$5.a(asb.ca) && cor.d($$4) == cos.c) {
         $$1.a(null, $$2, arm.jE, arn.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cmt.a($$4, $$3, new cmr(cmu.si)));
         $$3.b(arw.c.b($$4.d()));
         if (!$$1.B) {
            amz $$6 = (amz)$$1;

            for (int $$7 = 0; $$7 < 5; $$7++) {
               $$6.a(jx.aj, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, arm.ch, arn.e, 1.0F, 1.0F);
         $$1.a(null, dnk.z, $$2);
         $$1.b($$2, cwl.sI.o());
         return bjv.a($$1.B);
      } else {
         return bjv.d;
      }
   }

   @Override
   public int b(cmr $$0) {
      return 32;
   }

   @Override
   public cok c(cmr $$0) {
      return cok.c;
   }

   @Override
   public bjw<cmr> a(cti $$0, cfb $$1, bju $$2) {
      return cmt.a($$0, $$1, $$2);
   }

   @Override
   public String j(cmr $$0) {
      return cor.d($$0).b(this.a() + ".effect.");
   }

   @Override
   public void a(cmr $$0, @Nullable cti $$1, List<vd> $$2, coi $$3) {
      cor.a($$0, $$2, 1.0F);
   }
}
