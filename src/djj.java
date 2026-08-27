import java.util.List;
import org.apache.commons.lang3.mutable.MutableInt;

public class djj extends djl {
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
   public ih c;
   private List<box> m;
   private boolean n;
   private int r;

   public djj(ib $$0, dme $$1) {
      super(djn.E, $$0, $$1);
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.b();
         this.r = 0;
         this.c = ih.a($$1);
         this.a = 0;
         this.b = true;
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void a(cwe $$0, ib $$1, dme $$2, djj $$3, djj.a $$4) {
      if ($$3.b) {
         $$3.a++;
      }

      if ($$3.a >= 50) {
         $$3.b = false;
         $$3.a = 0;
      }

      if ($$3.a >= 5 && $$3.r == 0 && a($$1, $$3.m)) {
         $$3.n = true;
         $$0.a(null, $$1, atp.bY, atq.e, 1.0F, 1.0F);
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

   public static void a(cwe $$0, ib $$1, dme $$2, djj $$3) {
      a($$0, $$1, $$2, $$3, djj::b);
   }

   public static void b(cwe $$0, ib $$1, dme $$2, djj $$3) {
      a($$0, $$1, $$2, $$3, djj::a);
   }

   public void a(ih $$0) {
      ib $$1 = this.aD_();
      this.c = $$0;
      if (this.b) {
         this.a = 0;
      } else {
         this.b = true;
      }

      this.o.a($$1, this.n().b(), 1, $$0.d());
   }

   private void b() {
      ib $$0 = this.aD_();
      if (this.o.X() > this.l + 60L || this.m == null) {
         this.l = this.o.X();
         eoq $$1 = new eoq($$0).g(48.0);
         this.m = this.o.a(box.class, $$1);
      }

      if (!this.o.B) {
         for (box $$2 : this.m) {
            if ($$2.bx() && !$$2.dE() && $$0.a($$2.dh(), 32.0)) {
               $$2.dM().a(bya.D, this.o.X());
            }
         }
      }
   }

   private static boolean a(ib $$0, List<box> $$1) {
      for (box $$2 : $$1) {
         if ($$2.bx() && !$$2.dE() && $$0.a($$2.dh(), 32.0) && $$2.ai().a(auh.c)) {
            return true;
         }
      }

      return false;
   }

   private static void a(cwe $$0, ib $$1, List<box> $$2) {
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach(djj::a);
   }

   private static void b(cwe $$0, ib $$1, List<box> $$2) {
      MutableInt $$3 = new MutableInt(16700985);
      int $$4 = (int)$$2.stream().filter($$1x -> $$1.a($$1x.dh(), 48.0)).count();
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach($$4x -> {
         float $$5 = 1.0F;
         double $$6 = Math.sqrt(($$4x.do() - (double)$$1.u()) * ($$4x.do() - (double)$$1.u()) + ($$4x.du() - (double)$$1.w()) * ($$4x.du() - (double)$$1.w()));
         double $$7 = (double)((float)$$1.u() + 0.5F) + 1.0 / $$6 * ($$4x.do() - (double)$$1.u());
         double $$8 = (double)((float)$$1.w() + 0.5F) + 1.0 / $$6 * ($$4x.du() - (double)$$1.w());
         int $$9 = awm.a(($$4 - 21) / -2, 3, 15);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            int $$11 = $$3.addAndGet(5);
            double $$12 = (double)avw.b.b($$11) / 255.0;
            double $$13 = (double)avw.b.c($$11) / 255.0;
            double $$14 = (double)avw.b.d($$11) / 255.0;
            $$0.a(kb.v, $$7, (double)((float)$$1.v() + 0.5F), $$8, $$12, $$13, $$14);
         }
      });
   }

   private static boolean a(ib $$0, box $$1) {
      return $$1.bx() && !$$1.dE() && $$0.a($$1.dh(), 48.0) && $$1.ai().a(auh.c);
   }

   private static void a(box $$0) {
      $$0.b(new bns(bnu.x, 60));
   }

   @FunctionalInterface
   interface a {
      void run(cwe var1, ib var2, List<box> var3);
   }
}
