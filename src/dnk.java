import java.util.List;
import org.apache.commons.lang3.mutable.MutableInt;

public class dnk extends dnm {
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
   public is c;
   private List<bsa> m;
   private boolean q;
   private int r;

   public dnk(in $$0, dqh $$1) {
      super(dno.E, $$0, $$1);
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.b();
         this.r = 0;
         this.c = is.a($$1);
         this.a = 0;
         this.b = true;
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void a(dad $$0, in $$1, dqh $$2, dnk $$3, dnk.a $$4) {
      if ($$3.b) {
         $$3.a++;
      }

      if ($$3.a >= 50) {
         $$3.b = false;
         $$3.a = 0;
      }

      if ($$3.a >= 5 && $$3.r == 0 && a($$1, $$3.m)) {
         $$3.q = true;
         $$0.a(null, $$1, avc.ca, avd.e, 1.0F, 1.0F);
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

   public static void a(dad $$0, in $$1, dqh $$2, dnk $$3) {
      a($$0, $$1, $$2, $$3, dnk::b);
   }

   public static void b(dad $$0, in $$1, dqh $$2, dnk $$3) {
      a($$0, $$1, $$2, $$3, dnk::a);
   }

   public void a(is $$0) {
      in $$1 = this.az_();
      this.c = $$0;
      if (this.b) {
         this.a = 0;
      } else {
         this.b = true;
      }

      this.n.a($$1, this.n().b(), 1, $$0.d());
   }

   private void b() {
      in $$0 = this.az_();
      if (this.n.Y() > this.l + 60L || this.m == null) {
         this.l = this.n.Y();
         etk $$1 = new etk($$0).g(48.0);
         this.m = this.n.a(bsa.class, $$1);
      }

      if (!this.n.B) {
         for (bsa $$2 : this.m) {
            if ($$2.bB() && !$$2.dI() && $$0.a($$2.dl(), 32.0)) {
               $$2.dQ().a(cbd.D, this.n.Y());
            }
         }
      }
   }

   private static boolean a(in $$0, List<bsa> $$1) {
      for (bsa $$2 : $$1) {
         if ($$2.bB() && !$$2.dI() && $$0.a($$2.dl(), 32.0) && $$2.ai().a(avu.c)) {
            return true;
         }
      }

      return false;
   }

   private static void a(dad $$0, in $$1, List<bsa> $$2) {
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach(dnk::a);
   }

   private static void b(dad $$0, in $$1, List<bsa> $$2) {
      MutableInt $$3 = new MutableInt(16700985);
      int $$4 = (int)$$2.stream().filter($$1x -> $$1.a($$1x.dl(), 48.0)).count();
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach($$4x -> {
         float $$5 = 1.0F;
         double $$6 = Math.sqrt(($$4x.ds() - (double)$$1.u()) * ($$4x.ds() - (double)$$1.u()) + ($$4x.dy() - (double)$$1.w()) * ($$4x.dy() - (double)$$1.w()));
         double $$7 = (double)((float)$$1.u() + 0.5F) + 1.0 / $$6 * ($$4x.ds() - (double)$$1.u());
         double $$8 = (double)((float)$$1.w() + 0.5F) + 1.0 / $$6 * ($$4x.dy() - (double)$$1.w());
         int $$9 = axz.a(($$4 - 21) / -2, 3, 15);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            int $$11 = $$3.addAndGet(5);
            $$0.a(kp.a(kx.u, $$11), $$7, (double)((float)$$1.v() + 0.5F), $$8, 0.0, 0.0, 0.0);
         }
      });
   }

   private static boolean a(in $$0, bsa $$1) {
      return $$1.bB() && !$$1.dI() && $$0.a($$1.dl(), 48.0) && $$1.ai().a(avu.c);
   }

   private static void a(bsa $$0) {
      $$0.b(new bqt(bqv.x, 60));
   }

   @FunctionalInterface
   interface a {
      void run(dad var1, in var2, List<bsa> var3);
   }
}
