import java.util.List;
import org.apache.commons.lang3.mutable.MutableInt;

public class dep extends der {
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
   public hx c;
   private List<bky> m;
   private boolean n;
   private int r;

   public dep(ht $$0, dgw $$1) {
      super(det.E, $$0, $$1);
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.c();
         this.r = 0;
         this.c = hx.a($$1);
         this.a = 0;
         this.b = true;
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void a(crs $$0, ht $$1, dgw $$2, dep $$3, dep.a $$4) {
      if ($$3.b) {
         $$3.a++;
      }

      if ($$3.a >= 50) {
         $$3.b = false;
         $$3.a = 0;
      }

      if ($$3.a >= 5 && $$3.r == 0 && a($$1, $$3.m)) {
         $$3.n = true;
         $$0.a(null, $$1, aqn.bL, aqo.e, 1.0F, 1.0F);
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

   public static void a(crs $$0, ht $$1, dgw $$2, dep $$3) {
      a($$0, $$1, $$2, $$3, dep::b);
   }

   public static void b(crs $$0, ht $$1, dgw $$2, dep $$3) {
      a($$0, $$1, $$2, $$3, dep::a);
   }

   public void a(hx $$0) {
      ht $$1 = this.p();
      this.c = $$0;
      if (this.b) {
         this.a = 0;
      } else {
         this.b = true;
      }

      this.o.a($$1, this.q().b(), 1, $$0.d());
   }

   private void c() {
      ht $$0 = this.p();
      if (this.o.V() > this.l + 60L || this.m == null) {
         this.l = this.o.V();
         ejd $$1 = new ejd($$0).g(48.0);
         this.m = this.o.a(bky.class, $$1);
      }

      if (!this.o.B) {
         for (bky $$2 : this.m) {
            if ($$2.bv() && !$$2.dG() && $$0.a($$2.dj(), 32.0)) {
               $$2.dN().a(btz.D, this.o.V());
            }
         }
      }
   }

   private static boolean a(ht $$0, List<bky> $$1) {
      for (bky $$2 : $$1) {
         if ($$2.bv() && !$$2.dG() && $$0.a($$2.dj(), 32.0) && $$2.ag().a(arf.c)) {
            return true;
         }
      }

      return false;
   }

   private static void a(crs $$0, ht $$1, List<bky> $$2) {
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach(dep::a);
   }

   private static void b(crs $$0, ht $$1, List<bky> $$2) {
      MutableInt $$3 = new MutableInt(16700985);
      int $$4 = (int)$$2.stream().filter($$1x -> $$1.a($$1x.dj(), 48.0)).count();
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach($$4x -> {
         float $$5 = 1.0F;
         double $$6 = Math.sqrt(($$4x.dq() - (double)$$1.u()) * ($$4x.dq() - (double)$$1.u()) + ($$4x.dw() - (double)$$1.w()) * ($$4x.dw() - (double)$$1.w()));
         double $$7 = (double)((float)$$1.u() + 0.5F) + 1.0 / $$6 * ($$4x.dq() - (double)$$1.u());
         double $$8 = (double)((float)$$1.w() + 0.5F) + 1.0 / $$6 * ($$4x.dw() - (double)$$1.w());
         int $$9 = ati.a(($$4 - 21) / -2, 3, 15);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            int $$11 = $$3.addAndGet(5);
            double $$12 = (double)ass.b.b($$11) / 255.0;
            double $$13 = (double)ass.b.c($$11) / 255.0;
            double $$14 = (double)ass.b.d($$11) / 255.0;
            $$0.a(js.v, $$7, (double)((float)$$1.v() + 0.5F), $$8, $$12, $$13, $$14);
         }
      });
   }

   private static boolean a(ht $$0, bky $$1) {
      return $$1.bv() && !$$1.dG() && $$0.a($$1.dj(), 48.0) && $$1.ag().a(arf.c);
   }

   private static void a(bky $$0) {
      $$0.b(new bjv(bjx.x, 60));
   }

   @FunctionalInterface
   interface a {
      void run(crs var1, ht var2, List<bky> var3);
   }
}
