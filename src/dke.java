import java.util.List;
import org.apache.commons.lang3.mutable.MutableInt;

public class dke extends dkg {
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
   private List<bpo> m;
   private boolean n;
   private int r;

   public dke(ib $$0, dmz $$1) {
      super(dki.E, $$0, $$1);
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

   private static void a(cwz $$0, ib $$1, dmz $$2, dke $$3, dke.a $$4) {
      if ($$3.b) {
         $$3.a++;
      }

      if ($$3.a >= 50) {
         $$3.b = false;
         $$3.a = 0;
      }

      if ($$3.a >= 5 && $$3.r == 0 && a($$1, $$3.m)) {
         $$3.n = true;
         $$0.a(null, $$1, aty.ca, atz.e, 1.0F, 1.0F);
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

   public static void a(cwz $$0, ib $$1, dmz $$2, dke $$3) {
      a($$0, $$1, $$2, $$3, dke::b);
   }

   public static void b(cwz $$0, ib $$1, dmz $$2, dke $$3) {
      a($$0, $$1, $$2, $$3, dke::a);
   }

   public void a(ih $$0) {
      ib $$1 = this.aC_();
      this.c = $$0;
      if (this.b) {
         this.a = 0;
      } else {
         this.b = true;
      }

      this.o.a($$1, this.n().b(), 1, $$0.d());
   }

   private void b() {
      ib $$0 = this.aC_();
      if (this.o.X() > this.l + 60L || this.m == null) {
         this.l = this.o.X();
         epm $$1 = new epm($$0).g(48.0);
         this.m = this.o.a(bpo.class, $$1);
      }

      if (!this.o.B) {
         for (bpo $$2 : this.m) {
            if ($$2.bA() && !$$2.dH() && $$0.a($$2.dk(), 32.0)) {
               $$2.dP().a(byr.D, this.o.X());
            }
         }
      }
   }

   private static boolean a(ib $$0, List<bpo> $$1) {
      for (bpo $$2 : $$1) {
         if ($$2.bA() && !$$2.dH() && $$0.a($$2.dk(), 32.0) && $$2.ai().a(auq.c)) {
            return true;
         }
      }

      return false;
   }

   private static void a(cwz $$0, ib $$1, List<bpo> $$2) {
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach(dke::a);
   }

   private static void b(cwz $$0, ib $$1, List<bpo> $$2) {
      MutableInt $$3 = new MutableInt(16700985);
      int $$4 = (int)$$2.stream().filter($$1x -> $$1.a($$1x.dk(), 48.0)).count();
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach($$4x -> {
         float $$5 = 1.0F;
         double $$6 = Math.sqrt(($$4x.dr() - (double)$$1.u()) * ($$4x.dr() - (double)$$1.u()) + ($$4x.dx() - (double)$$1.w()) * ($$4x.dx() - (double)$$1.w()));
         double $$7 = (double)((float)$$1.u() + 0.5F) + 1.0 / $$6 * ($$4x.dr() - (double)$$1.u());
         double $$8 = (double)((float)$$1.w() + 0.5F) + 1.0 / $$6 * ($$4x.dx() - (double)$$1.w());
         int $$9 = aww.a(($$4 - 21) / -2, 3, 15);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            int $$11 = $$3.addAndGet(5);
            double $$12 = (double)awg.b.b($$11) / 255.0;
            double $$13 = (double)awg.b.c($$11) / 255.0;
            double $$14 = (double)awg.b.d($$11) / 255.0;
            $$0.a(kc.v, $$7, (double)((float)$$1.v() + 0.5F), $$8, $$12, $$13, $$14);
         }
      });
   }

   private static boolean a(ib $$0, bpo $$1) {
      return $$1.bA() && !$$1.dH() && $$0.a($$1.dk(), 48.0) && $$1.ai().a(auq.c);
   }

   private static void a(bpo $$0) {
      $$0.b(new boj(bol.x, 60));
   }

   @FunctionalInterface
   interface a {
      void run(cwz var1, ib var2, List<bpo> var3);
   }
}
