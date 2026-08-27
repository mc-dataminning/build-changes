import java.util.List;
import org.apache.commons.lang3.mutable.MutableInt;

public class dci extends dck {
   private static final int d = 50;
   private static final int e = 60;
   private static final int f = 60;
   private static final int g = 40;
   private static final int h = 5;
   private static final int i = 48;
   private static final int j = 32;
   private static final int k = 48;
   private long l;
   public int a;
   public boolean b;
   public hb c;
   private List<biw> m;
   private boolean n;
   private int r;

   public dci(gv $$0, dey $$1) {
      super(dcm.E, $$0, $$1);
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.c();
         this.r = 0;
         this.c = hb.a($$1);
         this.a = 0;
         this.b = true;
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void a(cpk $$0, gv $$1, dey $$2, dci $$3, dci.a $$4) {
      if ($$3.b) {
         $$3.a++;
      }

      if ($$3.a >= 50) {
         $$3.b = false;
         $$3.a = 0;
      }

      if ($$3.a >= 5 && $$3.r == 0 && a($$1, $$3.m)) {
         $$3.n = true;
         $$0.a(null, $$1, aou.bL, aov.e, 1.0F, 1.0F);
      }

      if ($$3.n) {
         if ($$3.r < 40) {
            $$3.r++;
         } else {
            $$4.run($$0, $$1, $$3.m);
            $$3.n = false;
         }
      }
   }

   public static void a(cpk $$0, gv $$1, dey $$2, dci $$3) {
      a($$0, $$1, $$2, $$3, dci::b);
   }

   public static void b(cpk $$0, gv $$1, dey $$2, dci $$3) {
      a($$0, $$1, $$2, $$3, dci::a);
   }

   public void a(hb $$0) {
      gv $$1 = this.p();
      this.c = $$0;
      if (this.b) {
         this.a = 0;
      } else {
         this.b = true;
      }

      this.o.a($$1, this.q().b(), 1, $$0.d());
   }

   private void c() {
      gv $$0 = this.p();
      if (this.o.V() > this.l + 60L || this.m == null) {
         this.l = this.o.V();
         eha $$1 = new eha($$0).g(48.0);
         this.m = this.o.a(biw.class, $$1);
      }

      if (!this.o.B) {
         for (biw $$2 : this.m) {
            if ($$2.bv() && !$$2.dF() && $$0.a($$2.di(), 32.0)) {
               $$2.dM().a(bry.D, this.o.V());
            }
         }
      }
   }

   private static boolean a(gv $$0, List<biw> $$1) {
      for (biw $$2 : $$1) {
         if ($$2.bv() && !$$2.dF() && $$0.a($$2.di(), 32.0) && $$2.ag().a(apm.b)) {
            return true;
         }
      }

      return false;
   }

   private static void a(cpk $$0, gv $$1, List<biw> $$2) {
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach(dci::a);
   }

   private static void b(cpk $$0, gv $$1, List<biw> $$2) {
      MutableInt $$3 = new MutableInt(16700985);
      int $$4 = (int)$$2.stream().filter($$1x -> $$1.a($$1x.di(), 48.0)).count();
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach($$4x -> {
         float $$5 = 1.0F;
         double $$6 = Math.sqrt(($$4x.dp() - (double)$$1.u()) * ($$4x.dp() - (double)$$1.u()) + ($$4x.dv() - (double)$$1.w()) * ($$4x.dv() - (double)$$1.w()));
         double $$7 = (double)((float)$$1.u() + 0.5F) + 1.0 / $$6 * ($$4x.dp() - (double)$$1.u());
         double $$8 = (double)((float)$$1.w() + 0.5F) + 1.0 / $$6 * ($$4x.dv() - (double)$$1.w());
         int $$9 = aro.a(($$4 - 21) / -2, 3, 15);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            int $$11 = $$3.addAndGet(5);
            double $$12 = (double)aqy.b.b($$11) / 255.0;
            double $$13 = (double)aqy.b.c($$11) / 255.0;
            double $$14 = (double)aqy.b.d($$11) / 255.0;
            $$0.a(iw.v, $$7, (double)((float)$$1.v() + 0.5F), $$8, $$12, $$13, $$14);
         }
      });
   }

   private static boolean a(gv $$0, biw $$1) {
      return $$1.bv() && !$$1.dF() && $$0.a($$1.di(), 48.0) && $$1.ag().a(apm.b);
   }

   private static void a(biw $$0) {
      $$0.b(new bht(bhv.x, 60));
   }

   @FunctionalInterface
   interface a {
      void run(cpk var1, gv var2, List<biw> var3);
   }
}
