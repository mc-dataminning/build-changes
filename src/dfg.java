import java.util.List;
import org.apache.commons.lang3.mutable.MutableInt;

public class dfg extends dfi {
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
   public ib c;
   private List<bll> m;
   private boolean n;
   private int r;

   public dfg(hx $$0, dhn $$1) {
      super(dfk.E, $$0, $$1);
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.c();
         this.r = 0;
         this.c = ib.a($$1);
         this.a = 0;
         this.b = true;
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void a(csf $$0, hx $$1, dhn $$2, dfg $$3, dfg.a $$4) {
      if ($$3.b) {
         $$3.a++;
      }

      if ($$3.a >= 50) {
         $$3.b = false;
         $$3.a = 0;
      }

      if ($$3.a >= 5 && $$3.r == 0 && a($$1, $$3.m)) {
         $$3.n = true;
         $$0.a(null, $$1, aqv.bL, aqw.e, 1.0F, 1.0F);
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

   public static void a(csf $$0, hx $$1, dhn $$2, dfg $$3) {
      a($$0, $$1, $$2, $$3, dfg::b);
   }

   public static void b(csf $$0, hx $$1, dhn $$2, dfg $$3) {
      a($$0, $$1, $$2, $$3, dfg::a);
   }

   public void a(ib $$0) {
      hx $$1 = this.aC_();
      this.c = $$0;
      if (this.b) {
         this.a = 0;
      } else {
         this.b = true;
      }

      this.o.a($$1, this.r().b(), 1, $$0.d());
   }

   private void c() {
      hx $$0 = this.aC_();
      if (this.o.W() > this.l + 60L || this.m == null) {
         this.l = this.o.W();
         eju $$1 = new eju($$0).g(48.0);
         this.m = this.o.a(bll.class, $$1);
      }

      if (!this.o.B) {
         for (bll $$2 : this.m) {
            if ($$2.bx() && !$$2.dI() && $$0.a($$2.dl(), 32.0)) {
               $$2.dP().a(bum.D, this.o.W());
            }
         }
      }
   }

   private static boolean a(hx $$0, List<bll> $$1) {
      for (bll $$2 : $$1) {
         if ($$2.bx() && !$$2.dI() && $$0.a($$2.dl(), 32.0) && $$2.ai().a(arn.c)) {
            return true;
         }
      }

      return false;
   }

   private static void a(csf $$0, hx $$1, List<bll> $$2) {
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach(dfg::a);
   }

   private static void b(csf $$0, hx $$1, List<bll> $$2) {
      MutableInt $$3 = new MutableInt(16700985);
      int $$4 = (int)$$2.stream().filter($$1x -> $$1.a($$1x.dl(), 48.0)).count();
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach($$4x -> {
         float $$5 = 1.0F;
         double $$6 = Math.sqrt(($$4x.ds() - (double)$$1.u()) * ($$4x.ds() - (double)$$1.u()) + ($$4x.dy() - (double)$$1.w()) * ($$4x.dy() - (double)$$1.w()));
         double $$7 = (double)((float)$$1.u() + 0.5F) + 1.0 / $$6 * ($$4x.ds() - (double)$$1.u());
         double $$8 = (double)((float)$$1.w() + 0.5F) + 1.0 / $$6 * ($$4x.dy() - (double)$$1.w());
         int $$9 = atq.a(($$4 - 21) / -2, 3, 15);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            int $$11 = $$3.addAndGet(5);
            double $$12 = (double)ata.b.b($$11) / 255.0;
            double $$13 = (double)ata.b.c($$11) / 255.0;
            double $$14 = (double)ata.b.d($$11) / 255.0;
            $$0.a(jw.v, $$7, (double)((float)$$1.v() + 0.5F), $$8, $$12, $$13, $$14);
         }
      });
   }

   private static boolean a(hx $$0, bll $$1) {
      return $$1.bx() && !$$1.dI() && $$0.a($$1.dl(), 48.0) && $$1.ai().a(arn.c);
   }

   private static void a(bll $$0) {
      $$0.b(new bki(bkk.x, 60));
   }

   @FunctionalInterface
   interface a {
      void run(csf var1, hx var2, List<bll> var3);
   }
}
