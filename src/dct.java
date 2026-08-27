import java.util.List;
import org.apache.commons.lang3.mutable.MutableInt;

public class dct extends dcv {
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
   public ha c;
   private List<bjg> m;
   private boolean n;
   private int r;

   public dct(gw $$0, dfj $$1) {
      super(dcx.E, $$0, $$1);
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.c();
         this.r = 0;
         this.c = ha.a($$1);
         this.a = 0;
         this.b = true;
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void a(cpv $$0, gw $$1, dfj $$2, dct $$3, dct.a $$4) {
      if ($$3.b) {
         $$3.a++;
      }

      if ($$3.a >= 50) {
         $$3.b = false;
         $$3.a = 0;
      }

      if ($$3.a >= 5 && $$3.r == 0 && a($$1, $$3.m)) {
         $$3.n = true;
         $$0.a(null, $$1, apd.bL, ape.e, 1.0F, 1.0F);
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

   public static void a(cpv $$0, gw $$1, dfj $$2, dct $$3) {
      a($$0, $$1, $$2, $$3, dct::b);
   }

   public static void b(cpv $$0, gw $$1, dfj $$2, dct $$3) {
      a($$0, $$1, $$2, $$3, dct::a);
   }

   public void a(ha $$0) {
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
         ehi $$1 = new ehi($$0).g(48.0);
         this.m = this.o.a(bjg.class, $$1);
      }

      if (!this.o.B) {
         for (bjg $$2 : this.m) {
            if ($$2.bv() && !$$2.dG() && $$0.a($$2.dj(), 32.0)) {
               $$2.dN().a(bsh.D, this.o.V());
            }
         }
      }
   }

   private static boolean a(gw $$0, List<bjg> $$1) {
      for (bjg $$2 : $$1) {
         if ($$2.bv() && !$$2.dG() && $$0.a($$2.dj(), 32.0) && $$2.ag().a(apv.b)) {
            return true;
         }
      }

      return false;
   }

   private static void a(cpv $$0, gw $$1, List<bjg> $$2) {
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach(dct::a);
   }

   private static void b(cpv $$0, gw $$1, List<bjg> $$2) {
      MutableInt $$3 = new MutableInt(16700985);
      int $$4 = (int)$$2.stream().filter($$1x -> $$1.a($$1x.dj(), 48.0)).count();
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach($$4x -> {
         float $$5 = 1.0F;
         double $$6 = Math.sqrt(($$4x.dq() - (double)$$1.u()) * ($$4x.dq() - (double)$$1.u()) + ($$4x.dw() - (double)$$1.w()) * ($$4x.dw() - (double)$$1.w()));
         double $$7 = (double)((float)$$1.u() + 0.5F) + 1.0 / $$6 * ($$4x.dq() - (double)$$1.u());
         double $$8 = (double)((float)$$1.w() + 0.5F) + 1.0 / $$6 * ($$4x.dw() - (double)$$1.w());
         int $$9 = arw.a(($$4 - 21) / -2, 3, 15);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            int $$11 = $$3.addAndGet(5);
            double $$12 = (double)arh.b.b($$11) / 255.0;
            double $$13 = (double)arh.b.c($$11) / 255.0;
            double $$14 = (double)arh.b.d($$11) / 255.0;
            $$0.a(iv.v, $$7, (double)((float)$$1.v() + 0.5F), $$8, $$12, $$13, $$14);
         }
      });
   }

   private static boolean a(gw $$0, bjg $$1) {
      return $$1.bv() && !$$1.dG() && $$0.a($$1.dj(), 48.0) && $$1.ag().a(apv.b);
   }

   private static void a(bjg $$0) {
      $$0.b(new bid(bif.x, 60));
   }

   @FunctionalInterface
   interface a {
      void run(cpv var1, gw var2, List<bjg> var3);
   }
}
