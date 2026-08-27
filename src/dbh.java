import javax.annotation.Nullable;

public class dbh extends csq {
   public static final int a = 2;
   public static final int b = 1;
   public static final int c = 4;
   private static final eib f = csq.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final eib g = csq.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final dge d = dfu.aE;
   public static final dge e = dfu.aD;

   public dbh(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(d, Integer.valueOf(0)).a(e, Integer.valueOf(1)));
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, bil $$3) {
      if (!$$3.bS()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cpq $$0, dfe $$1, gw $$2, bil $$3, float $$4) {
      if (!($$3 instanceof bzw)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(cpq $$0, dfe $$1, gw $$2, bil $$3, int $$4) {
      if (this.a($$0, $$3)) {
         if (!$$0.B && $$0.z.a($$4) == 0 && $$1.a(csr.mf)) {
            this.a($$0, $$2, $$1);
         }
      }
   }

   private void a(cpq $$0, gw $$1, dfe $$2) {
      $$0.a(null, $$1, aoz.yl, apa.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      int $$3 = $$2.c(e);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.a(e, Integer.valueOf($$3 - 1)), 2);
         $$0.a(djo.f, $$1, djo.a.a($$2));
         $$0.c(2001, $$1, csq.i($$2));
      }
   }

   @Override
   public void b(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(d);
         if ($$4 < 2) {
            $$1.a(null, $$2, aoz.ym, apa.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.a(d, Integer.valueOf($$4 + 1)), 2);
            $$1.a(djo.c, $$2, djo.a.a($$0));
         } else {
            $$1.a(null, $$2, aoz.yn, apa.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(djo.f, $$2, djo.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(e); $$5++) {
               $$1.c(2001, $$2, csq.i($$0));
               bvn $$6 = bip.bd.a((cpq)$$1);
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

   public static boolean a(cow $$0, gw $$1) {
      return b($$0, $$1.d());
   }

   public static boolean b(cow $$0, gw $$1) {
      return $$0.a_($$1).a(apo.H);
   }

   @Override
   public void b(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.B) {
         $$1.c(2005, $$2, 0);
      }
   }

   private boolean a(cpq $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.z.a(500) == 0;
   }

   @Override
   public void a(cpq $$0, cbp $$1, gw $$2, dfe $$3, @Nullable dcq $$4, cja $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   public boolean a(dfe $$0, cli $$1) {
      return !$$1.h() && $$1.n().a(this.k()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dfe a(cli $$0) {
      dfe $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : super.a($$0);
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return $$0.c(e) > 1 ? g : f;
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(d, e);
   }

   private boolean a(cpq $$0, bil $$1) {
      if ($$1 instanceof bvn || $$1 instanceof buh) {
         return false;
      } else {
         return !($$1 instanceof bjb) ? false : $$1 instanceof cbp || $$0.X().b(cpm.c);
      }
   }
}
