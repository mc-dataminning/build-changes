import java.util.List;
import org.apache.commons.lang3.mutable.MutableInt;

public class dpz extends dqc {
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
   public iw c;
   private List<bso> m;
   private boolean q;
   private int r;

   public dpz(ir $$0, dtc $$1) {
      super(dqe.F, $$0, $$1);
   }

   @Override
   public boolean b_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.b();
         this.r = 0;
         this.c = iw.a($$1);
         this.a = 0;
         this.b = true;
         return true;
      } else {
         return super.b_($$0, $$1);
      }
   }

   private static void a(dca $$0, ir $$1, dtc $$2, dpz $$3, dpz.a $$4) {
      if ($$3.b) {
         $$3.a++;
      }

      if ($$3.a >= 50) {
         $$3.b = false;
         $$3.a = 0;
      }

      if ($$3.a >= 5 && $$3.r == 0 && a($$1, $$3.m)) {
         $$3.q = true;
         $$0.a(null, $$1, avo.cf, avq.e, 1.0F, 1.0F);
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

   public static void a(dca $$0, ir $$1, dtc $$2, dpz $$3) {
      a($$0, $$1, $$2, $$3, dpz::b);
   }

   public static void b(dca $$0, ir $$1, dtc $$2, dpz $$3) {
      a($$0, $$1, $$2, $$3, dpz::a);
   }

   public void a(iw $$0) {
      ir $$1 = this.az_();
      this.c = $$0;
      if (this.b) {
         this.a = 0;
      } else {
         this.b = true;
      }

      this.n.a($$1, this.n().b(), 1, $$0.d());
   }

   private void b() {
      ir $$0 = this.az_();
      if (this.n.Z() > this.l + 60L || this.m == null) {
         this.l = this.n.Z();
         ewp $$1 = new ewp($$0).g(48.0);
         this.m = this.n.a(bso.class, $$1);
      }

      if (!this.n.C) {
         for (bso $$2 : this.m) {
            if ($$2.bI() && !$$2.dP() && $$0.a($$2.ds(), 32.0)) {
               $$2.dZ().a(cbr.D, this.n.Z());
            }
         }
      }
   }

   private static boolean a(ir $$0, List<bso> $$1) {
      for (bso $$2 : $$1) {
         if ($$2.bI() && !$$2.dP() && $$0.a($$2.ds(), 32.0) && $$2.ak().a(awh.c)) {
            return true;
         }
      }

      return false;
   }

   private static void a(dca $$0, ir $$1, List<bso> $$2) {
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach(dpz::a);
   }

   private static void b(dca $$0, ir $$1, List<bso> $$2) {
      MutableInt $$3 = new MutableInt(16700985);
      int $$4 = (int)$$2.stream().filter($$1x -> $$1.a($$1x.ds(), 48.0)).count();
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach($$4x -> {
         float $$5 = 1.0F;
         double $$6 = Math.sqrt(($$4x.dz() - (double)$$1.u()) * ($$4x.dz() - (double)$$1.u()) + ($$4x.dF() - (double)$$1.w()) * ($$4x.dF() - (double)$$1.w()));
         double $$7 = (double)((float)$$1.u() + 0.5F) + 1.0 / $$6 * ($$4x.dz() - (double)$$1.u());
         double $$8 = (double)((float)$$1.w() + 0.5F) + 1.0 / $$6 * ($$4x.dF() - (double)$$1.w());
         int $$9 = aym.a(($$4 - 21) / -2, 3, 15);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            int $$11 = $$3.addAndGet(5);
            $$0.a(kt.a(lb.u, $$11), $$7, (double)((float)$$1.v() + 0.5F), $$8, 0.0, 0.0, 0.0);
         }
      });
   }

   private static boolean a(ir $$0, bso $$1) {
      return $$1.bI() && !$$1.dP() && $$0.a($$1.ds(), 48.0) && $$1.ak().a(awh.c);
   }

   private static void a(bso $$0) {
      $$0.b(new brh(brj.x, 60));
   }

   @FunctionalInterface
   interface a {
      void run(dca var1, ir var2, List<bso> var3);
   }
}
