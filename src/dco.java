import java.util.List;
import org.apache.commons.lang3.mutable.MutableInt;

public class dco extends dcq {
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
   public hc c;
   private List<bjb> m;
   private boolean n;
   private int r;

   public dco(gw $$0, dfe $$1) {
      super(dcs.E, $$0, $$1);
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.c();
         this.r = 0;
         this.c = hc.a($$1);
         this.a = 0;
         this.b = true;
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void a(cpq $$0, gw $$1, dfe $$2, dco $$3, dco.a $$4) {
      if ($$3.b) {
         $$3.a++;
      }

      if ($$3.a >= 50) {
         $$3.b = false;
         $$3.a = 0;
      }

      if ($$3.a >= 5 && $$3.r == 0 && a($$1, $$3.m)) {
         $$3.n = true;
         $$0.a(null, $$1, aoz.bL, apa.e, 1.0F, 1.0F);
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

   public static void a(cpq $$0, gw $$1, dfe $$2, dco $$3) {
      a($$0, $$1, $$2, $$3, dco::b);
   }

   public static void b(cpq $$0, gw $$1, dfe $$2, dco $$3) {
      a($$0, $$1, $$2, $$3, dco::a);
   }

   public void a(hc $$0) {
      gw $$1 = this.p();
      this.c = $$0;
      if (this.b) {
         this.a = 0;
      } else {
         this.b = true;
      }

      this.o.a($$1, this.q().b(), 1, $$0.d());
   }

   private void c() {
      gw $$0 = this.p();
      if (this.o.V() > this.l + 60L || this.m == null) {
         this.l = this.o.V();
         ehd $$1 = new ehd($$0).g(48.0);
         this.m = this.o.a(bjb.class, $$1);
      }

      if (!this.o.B) {
         for (bjb $$2 : this.m) {
            if ($$2.bv() && !$$2.dF() && $$0.a($$2.di(), 32.0)) {
               $$2.dM().a(bsc.D, this.o.V());
            }
         }
      }
   }

   private static boolean a(gw $$0, List<bjb> $$1) {
      for (bjb $$2 : $$1) {
         if ($$2.bv() && !$$2.dF() && $$0.a($$2.di(), 32.0) && $$2.ag().a(apr.b)) {
            return true;
         }
      }

      return false;
   }

   private static void a(cpq $$0, gw $$1, List<bjb> $$2) {
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach(dco::a);
   }

   private static void b(cpq $$0, gw $$1, List<bjb> $$2) {
      MutableInt $$3 = new MutableInt(16700985);
      int $$4 = (int)$$2.stream().filter($$1x -> $$1.a($$1x.di(), 48.0)).count();
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach($$4x -> {
         float $$5 = 1.0F;
         double $$6 = Math.sqrt(($$4x.dp() - (double)$$1.u()) * ($$4x.dp() - (double)$$1.u()) + ($$4x.dv() - (double)$$1.w()) * ($$4x.dv() - (double)$$1.w()));
         double $$7 = (double)((float)$$1.u() + 0.5F) + 1.0 / $$6 * ($$4x.dp() - (double)$$1.u());
         double $$8 = (double)((float)$$1.w() + 0.5F) + 1.0 / $$6 * ($$4x.dv() - (double)$$1.w());
         int $$9 = ars.a(($$4 - 21) / -2, 3, 15);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            int $$11 = $$3.addAndGet(5);
            double $$12 = (double)ard.b.b($$11) / 255.0;
            double $$13 = (double)ard.b.c($$11) / 255.0;
            double $$14 = (double)ard.b.d($$11) / 255.0;
            $$0.a(ix.v, $$7, (double)((float)$$1.v() + 0.5F), $$8, $$12, $$13, $$14);
         }
      });
   }

   private static boolean a(gw $$0, bjb $$1) {
      return $$1.bv() && !$$1.dF() && $$0.a($$1.di(), 48.0) && $$1.ag().a(apr.b);
   }

   private static void a(bjb $$0) {
      $$0.b(new bhy(bia.x, 60));
   }

   @FunctionalInterface
   interface a {
      void run(cpq var1, gw var2, List<bjb> var3);
   }
}
