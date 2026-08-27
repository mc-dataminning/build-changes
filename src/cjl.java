import java.util.List;
import javax.annotation.Nullable;

public class cjl extends cir {
   private static final int a = 32;

   public cjl(cir.a $$0) {
      super($$0);
   }

   @Override
   public ciw ae_() {
      return ckv.a(super.ae_(), ckw.c);
   }

   @Override
   public ciw a(ciw $$0, cpk $$1, biw $$2) {
      cbl $$3 = $$2 instanceof cbl ? (cbl)$$2 : null;
      if ($$3 instanceof akj) {
         ai.z.a((akj)$$3, $$0);
      }

      if (!$$1.B) {
         for (bht $$5 : ckv.a($$0)) {
            if ($$5.c().a()) {
               $$5.c().a($$3, $$3, $$2, $$5.e(), 1.0);
            } else {
               $$2.b(new bht($$5));
            }
         }
      }

      if ($$3 != null) {
         $$3.b(ape.c.b(this));
         if (!$$3.fR().d) {
            $$0.h(1);
         }
      }

      if ($$3 == null || !$$3.fR().d) {
         if ($$0.b()) {
            return new ciw(ciz.rw);
         }

         if ($$3 != null) {
            $$3.fQ().e(new ciw(ciz.rw));
         }
      }

      $$2.a(dji.l);
      return $$0;
   }

   @Override
   public bgo a(clg $$0) {
      cpk $$1 = $$0.q();
      gv $$2 = $$0.a();
      cbl $$3 = $$0.o();
      ciw $$4 = $$0.n();
      dey $$5 = $$1.a_($$2);
      if ($$0.k() != hb.a && $$5.a(apj.ca) && ckv.d($$4) == ckw.c) {
         $$1.a(null, $$2, aou.jb, aov.e, 1.0F, 1.0F);
         $$3.a($$0.p(), ciy.a($$4, $$3, new ciw(ciz.rw)));
         $$3.b(ape.c.b($$4.d()));
         if (!$$1.B) {
            aki $$6 = (aki)$$1;

            for (int $$7 = 0; $$7 < 5; $$7++) {
               $$6.a(iw.ag, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, aou.ch, aov.e, 1.0F, 1.0F);
         $$1.a(null, dji.z, $$2);
         $$1.b($$2, csl.rH.n());
         return bgo.a($$1.B);
      } else {
         return bgo.d;
      }
   }

   @Override
   public int b(ciw $$0) {
      return 32;
   }

   @Override
   public ckp c(ciw $$0) {
      return ckp.c;
   }

   @Override
   public bgp<ciw> a(cpk $$0, cbl $$1, bgn $$2) {
      return ciy.a($$0, $$1, $$2);
   }

   @Override
   public String j(ciw $$0) {
      return ckv.d($$0).b(this.a() + ".effect.");
   }

   @Override
   public void a(ciw $$0, @Nullable cpk $$1, List<te> $$2, ckn $$3) {
      ckv.a($$0, $$2, 1.0F);
   }
}
