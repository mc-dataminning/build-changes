import java.util.List;
import org.apache.commons.lang3.mutable.MutableInt;

public class dhb extends dhd {
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
   public ic c;
   private List<bmo> m;
   private boolean n;
   private int r;

   public dhb(hx $$0, djp $$1) {
      super(dhf.E, $$0, $$1);
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.c();
         this.r = 0;
         this.c = ic.a($$1);
         this.a = 0;
         this.b = true;
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void a(ctx $$0, hx $$1, djp $$2, dhb $$3, dhb.a $$4) {
      if ($$3.b) {
         $$3.a++;
      }

      if ($$3.a >= 50) {
         $$3.b = false;
         $$3.a = 0;
      }

      if ($$3.a >= 5 && $$3.r == 0 && a($$1, $$3.m)) {
         $$3.n = true;
         $$0.a(null, $$1, art.bX, aru.e, 1.0F, 1.0F);
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

   public static void a(ctx $$0, hx $$1, djp $$2, dhb $$3) {
      a($$0, $$1, $$2, $$3, dhb::b);
   }

   public static void b(ctx $$0, hx $$1, djp $$2, dhb $$3) {
      a($$0, $$1, $$2, $$3, dhb::a);
   }

   public void a(ic $$0) {
      hx $$1 = this.aE_();
      this.c = $$0;
      if (this.b) {
         this.a = 0;
      } else {
         this.b = true;
      }

      this.o.a($$1, this.r().b(), 1, $$0.d());
   }

   private void c() {
      hx $$0 = this.aE_();
      if (this.o.X() > this.l + 60L || this.m == null) {
         this.l = this.o.X();
         elx $$1 = new elx($$0).g(48.0);
         this.m = this.o.a(bmo.class, $$1);
      }

      if (!this.o.B) {
         for (bmo $$2 : this.m) {
            if ($$2.bx() && !$$2.dG() && $$0.a($$2.dj(), 32.0)) {
               $$2.dN().a(bvq.D, this.o.X());
            }
         }
      }
   }

   private static boolean a(hx $$0, List<bmo> $$1) {
      for (bmo $$2 : $$1) {
         if ($$2.bx() && !$$2.dG() && $$0.a($$2.dj(), 32.0) && $$2.ai().a(asl.c)) {
            return true;
         }
      }

      return false;
   }

   private static void a(ctx $$0, hx $$1, List<bmo> $$2) {
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach(dhb::a);
   }

   private static void b(ctx $$0, hx $$1, List<bmo> $$2) {
      MutableInt $$3 = new MutableInt(16700985);
      int $$4 = (int)$$2.stream().filter($$1x -> $$1.a($$1x.dj(), 48.0)).count();
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach($$4x -> {
         float $$5 = 1.0F;
         double $$6 = Math.sqrt(($$4x.dq() - (double)$$1.u()) * ($$4x.dq() - (double)$$1.u()) + ($$4x.dw() - (double)$$1.w()) * ($$4x.dw() - (double)$$1.w()));
         double $$7 = (double)((float)$$1.u() + 0.5F) + 1.0 / $$6 * ($$4x.dq() - (double)$$1.u());
         double $$8 = (double)((float)$$1.w() + 0.5F) + 1.0 / $$6 * ($$4x.dw() - (double)$$1.w());
         int $$9 = aup.a(($$4 - 21) / -2, 3, 15);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            int $$11 = $$3.addAndGet(5);
            double $$12 = (double)atz.b.b($$11) / 255.0;
            double $$13 = (double)atz.b.c($$11) / 255.0;
            double $$14 = (double)atz.b.d($$11) / 255.0;
            $$0.a(jx.v, $$7, (double)((float)$$1.v() + 0.5F), $$8, $$12, $$13, $$14);
         }
      });
   }

   private static boolean a(hx $$0, bmo $$1) {
      return $$1.bx() && !$$1.dG() && $$0.a($$1.dj(), 48.0) && $$1.ai().a(asl.c);
   }

   private static void a(bmo $$0) {
      $$0.b(new blj(bll.x, 60));
   }

   @FunctionalInterface
   interface a {
      void run(ctx var1, hx var2, List<bmo> var3);
   }
}
