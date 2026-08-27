import java.util.List;
import org.apache.commons.lang3.mutable.MutableInt;

public class dck extends dcm {
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
   private List<biy> m;
   private boolean n;
   private int r;

   public dck(gu $$0, dfa $$1) {
      super(dco.E, $$0, $$1);
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

   private static void a(cpm $$0, gu $$1, dfa $$2, dck $$3, dck.a $$4) {
      if ($$3.b) {
         $$3.a++;
      }

      if ($$3.a >= 50) {
         $$3.b = false;
         $$3.a = 0;
      }

      if ($$3.a >= 5 && $$3.r == 0 && a($$1, $$3.m)) {
         $$3.n = true;
         $$0.a(null, $$1, aow.bL, aox.e, 1.0F, 1.0F);
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

   public static void a(cpm $$0, gu $$1, dfa $$2, dck $$3) {
      a($$0, $$1, $$2, $$3, dck::b);
   }

   public static void b(cpm $$0, gu $$1, dfa $$2, dck $$3) {
      a($$0, $$1, $$2, $$3, dck::a);
   }

   public void a(ha $$0) {
      gu $$1 = this.p();
      this.c = $$0;
      if (this.b) {
         this.a = 0;
      } else {
         this.b = true;
      }

      this.o.a($$1, this.q().b(), 1, $$0.d());
   }

   private void c() {
      gu $$0 = this.p();
      if (this.o.V() > this.l + 60L || this.m == null) {
         this.l = this.o.V();
         egz $$1 = new egz($$0).g(48.0);
         this.m = this.o.a(biy.class, $$1);
      }

      if (!this.o.B) {
         for (biy $$2 : this.m) {
            if ($$2.bv() && !$$2.dF() && $$0.a($$2.di(), 32.0)) {
               $$2.dM().a(bsa.D, this.o.V());
            }
         }
      }
   }

   private static boolean a(gu $$0, List<biy> $$1) {
      for (biy $$2 : $$1) {
         if ($$2.bv() && !$$2.dF() && $$0.a($$2.di(), 32.0) && $$2.ag().a(apo.b)) {
            return true;
         }
      }

      return false;
   }

   private static void a(cpm $$0, gu $$1, List<biy> $$2) {
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach(dck::a);
   }

   private static void b(cpm $$0, gu $$1, List<biy> $$2) {
      MutableInt $$3 = new MutableInt(16700985);
      int $$4 = (int)$$2.stream().filter($$1x -> $$1.a($$1x.di(), 48.0)).count();
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach($$4x -> {
         float $$5 = 1.0F;
         double $$6 = Math.sqrt(($$4x.dp() - (double)$$1.u()) * ($$4x.dp() - (double)$$1.u()) + ($$4x.dv() - (double)$$1.w()) * ($$4x.dv() - (double)$$1.w()));
         double $$7 = (double)((float)$$1.u() + 0.5F) + 1.0 / $$6 * ($$4x.dp() - (double)$$1.u());
         double $$8 = (double)((float)$$1.w() + 0.5F) + 1.0 / $$6 * ($$4x.dv() - (double)$$1.w());
         int $$9 = arp.a(($$4 - 21) / -2, 3, 15);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            int $$11 = $$3.addAndGet(5);
            double $$12 = (double)ara.b.b($$11) / 255.0;
            double $$13 = (double)ara.b.c($$11) / 255.0;
            double $$14 = (double)ara.b.d($$11) / 255.0;
            $$0.a(iv.v, $$7, (double)((float)$$1.v() + 0.5F), $$8, $$12, $$13, $$14);
         }
      });
   }

   private static boolean a(gu $$0, biy $$1) {
      return $$1.bv() && !$$1.dF() && $$0.a($$1.di(), 48.0) && $$1.ag().a(apo.b);
   }

   private static void a(biy $$0) {
      $$0.b(new bhv(bhx.x, 60));
   }

   @FunctionalInterface
   interface a {
      void run(cpm var1, gu var2, List<biy> var3);
   }
}
