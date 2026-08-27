import java.util.List;
import org.apache.commons.lang3.mutable.MutableInt;

public class dfb extends dfd {
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
   private List<blg> m;
   private boolean n;
   private int r;

   public dfb(ht $$0, dhi $$1) {
      super(dff.E, $$0, $$1);
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

   private static void a(csa $$0, ht $$1, dhi $$2, dfb $$3, dfb.a $$4) {
      if ($$3.b) {
         $$3.a++;
      }

      if ($$3.a >= 50) {
         $$3.b = false;
         $$3.a = 0;
      }

      if ($$3.a >= 5 && $$3.r == 0 && a($$1, $$3.m)) {
         $$3.n = true;
         $$0.a(null, $$1, aqr.bL, aqs.e, 1.0F, 1.0F);
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

   public static void a(csa $$0, ht $$1, dhi $$2, dfb $$3) {
      a($$0, $$1, $$2, $$3, dfb::b);
   }

   public static void b(csa $$0, ht $$1, dhi $$2, dfb $$3) {
      a($$0, $$1, $$2, $$3, dfb::a);
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
      if (this.o.W() > this.l + 60L || this.m == null) {
         this.l = this.o.W();
         ejp $$1 = new ejp($$0).g(48.0);
         this.m = this.o.a(blg.class, $$1);
      }

      if (!this.o.B) {
         for (blg $$2 : this.m) {
            if ($$2.bx() && !$$2.dI() && $$0.a($$2.dl(), 32.0)) {
               $$2.dP().a(buh.D, this.o.W());
            }
         }
      }
   }

   private static boolean a(ht $$0, List<blg> $$1) {
      for (blg $$2 : $$1) {
         if ($$2.bx() && !$$2.dI() && $$0.a($$2.dl(), 32.0) && $$2.ai().a(arj.c)) {
            return true;
         }
      }

      return false;
   }

   private static void a(csa $$0, ht $$1, List<blg> $$2) {
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach(dfb::a);
   }

   private static void b(csa $$0, ht $$1, List<blg> $$2) {
      MutableInt $$3 = new MutableInt(16700985);
      int $$4 = (int)$$2.stream().filter($$1x -> $$1.a($$1x.dl(), 48.0)).count();
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach($$4x -> {
         float $$5 = 1.0F;
         double $$6 = Math.sqrt(($$4x.ds() - (double)$$1.u()) * ($$4x.ds() - (double)$$1.u()) + ($$4x.dy() - (double)$$1.w()) * ($$4x.dy() - (double)$$1.w()));
         double $$7 = (double)((float)$$1.u() + 0.5F) + 1.0 / $$6 * ($$4x.ds() - (double)$$1.u());
         double $$8 = (double)((float)$$1.w() + 0.5F) + 1.0 / $$6 * ($$4x.dy() - (double)$$1.w());
         int $$9 = atm.a(($$4 - 21) / -2, 3, 15);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            int $$11 = $$3.addAndGet(5);
            double $$12 = (double)asw.b.b($$11) / 255.0;
            double $$13 = (double)asw.b.c($$11) / 255.0;
            double $$14 = (double)asw.b.d($$11) / 255.0;
            $$0.a(js.v, $$7, (double)((float)$$1.v() + 0.5F), $$8, $$12, $$13, $$14);
         }
      });
   }

   private static boolean a(ht $$0, blg $$1) {
      return $$1.bx() && !$$1.dI() && $$0.a($$1.dl(), 48.0) && $$1.ai().a(arj.c);
   }

   private static void a(blg $$0) {
      $$0.b(new bkd(bkf.x, 60));
   }

   @FunctionalInterface
   interface a {
      void run(csa var1, ht var2, List<blg> var3);
   }
}
