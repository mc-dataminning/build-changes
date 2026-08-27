import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbq extends ctc {
   public static final MapCodec<dbq> a = b(dbq::new);
   public static final int b = 2;
   public static final int c = 1;
   public static final int d = 4;
   private static final eia g = ctc.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final eia h = ctc.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final dgd e = dft.aE;
   public static final dgd f = dft.aD;

   @Override
   public MapCodec<dbq> a() {
      return a;
   }

   public dbq(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(f, Integer.valueOf(1)));
   }

   @Override
   public void a(cqb $$0, gw $$1, dfd $$2, biw $$3) {
      if (!$$3.bS()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cqb $$0, dfd $$1, gw $$2, biw $$3, float $$4) {
      if (!($$3 instanceof cah)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(cqb $$0, dfd $$1, gw $$2, biw $$3, int $$4) {
      if (this.a($$0, $$3)) {
         if (!$$0.B && $$0.z.a($$4) == 0 && $$1.a(cte.mf)) {
            this.a($$0, $$2, $$1);
         }
      }
   }

   private void a(cqb $$0, gw $$1, dfd $$2) {
      $$0.a(null, $$1, apg.yl, aph.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      int $$3 = $$2.c(f);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.a(f, Integer.valueOf($$3 - 1)), 2);
         $$0.a(djn.f, $$1, djn.a.a($$2));
         $$0.c(2001, $$1, ctc.i($$2));
      }
   }

   @Override
   public void b(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(e);
         if ($$4 < 2) {
            $$1.a(null, $$2, apg.ym, aph.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.a(e, Integer.valueOf($$4 + 1)), 2);
            $$1.a(djn.c, $$2, djn.a.a($$0));
         } else {
            $$1.a(null, $$2, apg.yn, aph.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(djn.f, $$2, djn.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(f); $$5++) {
               $$1.c(2001, $$2, ctc.i($$0));
               bvy $$6 = bja.bd.a((cqb)$$1);
               if ($$6 != null) {
                  $$6.c_(-24000);
                  $$6.i($$2);
                  $$6.b((double)$$2.u() + 0.3 + (double)$$5 * 0.2, (double)$$2.v(), (double)$$2.w() + 0.3, 0.0F, 0.0F);
                  $$1.b($$6);
               }
            }
         }
      }
   }

   public static boolean a(cph $$0, gw $$1) {
      return b($$0, $$1.d());
   }

   public static boolean b(cph $$0, gw $$1) {
      return $$0.a_($$1).a(apv.H);
   }

   @Override
   public void b(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.B) {
         $$1.c(2005, $$2, 0);
      }
   }

   private boolean a(cqb $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.z.a(500) == 0;
   }

   @Override
   public void a(cqb $$0, cca $$1, gw $$2, dfd $$3, @Nullable dcz $$4, cjl $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   public boolean a(dfd $$0, clt $$1) {
      return !$$1.h() && $$1.n().a(this.k()) && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dfd a(clt $$0) {
      dfd $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(f, Integer.valueOf(Math.min(4, $$1.c(f) + 1))) : super.a($$0);
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return $$0.c(f) > 1 ? h : g;
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(e, f);
   }

   private boolean a(cqb $$0, biw $$1) {
      if ($$1 instanceof bvy || $$1 instanceof bus) {
         return false;
      } else {
         return !($$1 instanceof bjm) ? false : $$1 instanceof cca || $$0.X().b(cpx.c);
      }
   }
}
