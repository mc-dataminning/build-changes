import java.util.List;
import org.apache.commons.lang3.mutable.MutableInt;

public class dpo extends dpq {
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
   public jf c;
   private List<btc> m;
   private boolean q;
   private int r;

   public dpo(ja $$0, dsl $$1) {
      super(dps.E, $$0, $$1);
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.b();
         this.r = 0;
         this.c = jf.a($$1);
         this.a = 0;
         this.b = true;
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void a(dcg $$0, ja $$1, dsl $$2, dpo $$3, dpo.a $$4) {
      if ($$3.b) {
         $$3.a++;
      }

      if ($$3.a >= 50) {
         $$3.b = false;
         $$3.a = 0;
      }

      if ($$3.a >= 5 && $$3.r == 0 && a($$1, $$3.m)) {
         $$3.q = true;
         $$0.a(null, $$1, avh.ca, avi.e, 1.0F, 1.0F);
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

   public static void a(dcg $$0, ja $$1, dsl $$2, dpo $$3) {
      a($$0, $$1, $$2, $$3, dpo::b);
   }

   public static void b(dcg $$0, ja $$1, dsl $$2, dpo $$3) {
      a($$0, $$1, $$2, $$3, dpo::a);
   }

   public void a(jf $$0) {
      ja $$1 = this.az_();
      this.c = $$0;
      if (this.b) {
         this.a = 0;
      } else {
         this.b = true;
      }

      this.n.a($$1, this.n().b(), 1, $$0.d());
   }

   private void b() {
      ja $$0 = this.az_();
      if (this.n.Z() > this.l + 60L || this.m == null) {
         this.l = this.n.Z();
         ewc $$1 = new ewc($$0).g(48.0);
         this.m = this.n.a(btc.class, $$1);
      }

      if (!this.n.B) {
         for (btc $$2 : this.m) {
            if ($$2.bF() && !$$2.dM() && $$0.a($$2.dp(), 32.0)) {
               $$2.dV().a(ccg.D, this.n.Z());
            }
         }
      }
   }

   private static boolean a(ja $$0, List<btc> $$1) {
      for (btc $$2 : $$1) {
         if ($$2.bF() && !$$2.dM() && $$0.a($$2.dp(), 32.0) && $$2.am().a(awa.c)) {
            return true;
         }
      }

      return false;
   }

   private static void a(dcg $$0, ja $$1, List<btc> $$2) {
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach(dpo::a);
   }

   private static void b(dcg $$0, ja $$1, List<btc> $$2) {
      MutableInt $$3 = new MutableInt(16700985);
      int $$4 = (int)$$2.stream().filter($$1x -> $$1.a($$1x.dp(), 48.0)).count();
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach($$4x -> {
         float $$5 = 1.0F;
         double $$6 = Math.sqrt(($$4x.dw() - (double)$$1.u()) * ($$4x.dw() - (double)$$1.u()) + ($$4x.dC() - (double)$$1.w()) * ($$4x.dC() - (double)$$1.w()));
         double $$7 = (double)((float)$$1.u() + 0.5F) + 1.0 / $$6 * ($$4x.dw() - (double)$$1.u());
         double $$8 = (double)((float)$$1.w() + 0.5F) + 1.0 / $$6 * ($$4x.dC() - (double)$$1.w());
         int $$9 = ayg.a(($$4 - 21) / -2, 3, 15);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            int $$11 = $$3.addAndGet(5);
            $$0.a(lc.a(lj.u, $$11), $$7, (double)((float)$$1.v() + 0.5F), $$8, 0.0, 0.0, 0.0);
         }
      });
   }

   private static boolean a(ja $$0, btc $$1) {
      return $$1.bF() && !$$1.dM() && $$0.a($$1.dp(), 48.0) && $$1.am().a(awa.c);
   }

   private static void a(btc $$0) {
      $$0.b(new brp(brr.x, 60));
   }

   @FunctionalInterface
   interface a {
      void run(dcg var1, ja var2, List<btc> var3);
   }
}
