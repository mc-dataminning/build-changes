import javax.annotation.Nullable;

public class dau extends csk {
   public static final dfp a = dfo.B;

   public dau(dex.d $$0) {
      super($$0);
      this.k(this.n().a(a, Boolean.valueOf(false)));
   }

   @Override
   public void b(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.B($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, csk $$3, gv $$4, boolean $$5) {
      if ($$1.B($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public void a(cpk $$0, gv $$1, dey $$2, cbl $$3) {
      if (!$$0.r_() && !$$3.f() && $$2.c(a)) {
         a($$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cpk $$0, gv $$1, cpc $$2) {
      if (!$$0.B) {
         byf $$3 = new byf($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.e());
         int $$4 = $$3.m();
         $$3.b((short)($$0.z.a($$4 / 4) + $$4 / 8));
         $$0.b($$3);
      }
   }

   public static void a(cpk $$0, gv $$1) {
      a($$0, $$1, null);
   }

   private static void a(cpk $$0, gv $$1, @Nullable biw $$2) {
      if (!$$0.B) {
         byf $$3 = new byf($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dp(), $$3.dr(), $$3.dv(), aou.xG, aov.e, 1.0F, 1.0F);
         $$0.a($$2, dji.I, $$1);
      }
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      ciw $$6 = $$3.b($$4);
      if (!$$6.a(ciz.nE) && !$$6.a(ciz.tf)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         a($$1, $$2, $$3);
         $$1.a($$2, csl.a.n(), 11);
         cir $$7 = $$6.d();
         if (!$$3.f()) {
            if ($$6.a(ciz.nE)) {
               $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            } else {
               $$6.h(1);
            }
         }

         $$3.b(ape.c.b($$7));
         return bgo.a($$1.B);
      }
   }

   @Override
   public void a(cpk $$0, dey $$1, ehb $$2, ccd $$3) {
      if (!$$0.B) {
         gv $$4 = $$2.a();
         big $$5 = $$3.v();
         if ($$3.bM() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof biw ? (biw)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(cpc $$0) {
      return false;
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a);
   }
}
