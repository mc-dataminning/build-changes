import java.util.List;
import org.apache.commons.lang3.mutable.MutableInt;

public class dya extends dyc {
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
   public jb c;
   private List<bxu> m;
   private boolean q;
   private int r;

   public dya(iv $$0, ebe $$1) {
      super(dye.F, $$0, $$1);
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.a();
         this.r = 0;
         this.c = jb.a($$1);
         this.a = 0;
         this.b = true;
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void a(djx $$0, iv $$1, ebe $$2, dya $$3, dya.a $$4) {
      if ($$3.b) {
         $$3.a++;
      }

      if ($$3.a >= 50) {
         $$3.b = false;
         $$3.a = 0;
      }

      if ($$3.a >= 5 && $$3.r == 0 && a($$1, $$3.m)) {
         $$3.q = true;
         $$0.a(null, $$1, awp.ca, awq.e, 1.0F, 1.0F);
      }

      if ($$3.q) {
         if ($$3.r < 40) {
            $$3.r++;
         } else {
            $$4.run($$0, $$1, $$3.m);
            $$3.q = false;
         }
      }
   }

   public static void a(djx $$0, iv $$1, ebe $$2, dya $$3) {
      a($$0, $$1, $$2, $$3, dya::b);
   }

   public static void b(djx $$0, iv $$1, ebe $$2, dya $$3) {
      a($$0, $$1, $$2, $$3, dya::a);
   }

   public void a(jb $$0) {
      iv $$1 = this.aB_();
      this.c = $$0;
      if (this.b) {
         this.a = 0;
      } else {
         this.b = true;
      }

      this.n.a($$1, this.m().b(), 1, $$0.d());
   }

   private void a() {
      iv $$0 = this.aB_();
      if (this.n.ae() > this.l + 60L || this.m == null) {
         this.l = this.n.ae();
         ffl $$1 = new ffl($$0).g(48.0);
         this.m = this.n.a(bxu.class, $$1);
      }

      if (!this.n.C) {
         for (bxu $$2 : this.m) {
            if ($$2.bJ() && !$$2.dQ() && $$0.a($$2.dt(), 32.0)) {
               $$2.ec().a(cgw.E, this.n.ae());
            }
         }
      }
   }

   private static boolean a(iv $$0, List<bxu> $$1) {
      for (bxu $$2 : $$1) {
         if ($$2.bJ() && !$$2.dQ() && $$0.a($$2.dt(), 32.0) && $$2.an().a(axh.c)) {
            return true;
         }
      }

      return false;
   }

   private static void a(djx $$0, iv $$1, List<bxu> $$2) {
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach(dya::a);
   }

   private static void b(djx $$0, iv $$1, List<bxu> $$2) {
      MutableInt $$3 = new MutableInt(16700985);
      int $$4 = (int)$$2.stream().filter($$1x -> $$1.a($$1x.dt(), 48.0)).count();
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach($$4x -> {
         float $$5 = 1.0F;
         double $$6 = Math.sqrt(($$4x.dA() - (double)$$1.u()) * ($$4x.dA() - (double)$$1.u()) + ($$4x.dG() - (double)$$1.w()) * ($$4x.dG() - (double)$$1.w()));
         double $$7 = (double)((float)$$1.u() + 0.5F) + 1.0 / $$6 * ($$4x.dA() - (double)$$1.u());
         double $$8 = (double)((float)$$1.w() + 0.5F) + 1.0 / $$6 * ($$4x.dG() - (double)$$1.w());
         int $$9 = azo.a(($$4 - 21) / -2, 3, 15);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            int $$11 = $$3.addAndGet(5);
            $$0.a(lr.a(ly.u, $$11), $$7, (double)((float)$$1.v() + 0.5F), $$8, 0.0, 0.0, 0.0);
         }
      });
   }

   private static boolean a(iv $$0, bxu $$1) {
      return $$1.bJ() && !$$1.dQ() && $$0.a($$1.dt(), 48.0) && $$1.an().a(axh.c);
   }

   private static void a(bxu $$0) {
      $$0.a(new bvx(bvz.x, 60));
   }

   @FunctionalInterface
   interface a {
      void run(djx var1, iv var2, List<bxu> var3);
   }
}
