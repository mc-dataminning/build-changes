import java.util.List;
import org.apache.commons.lang3.mutable.MutableInt;

public class dvj extends dvl {
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
   public jo c;
   private List<bwr> m;
   private boolean q;
   private int r;

   public dvj(jj $$0, dym $$1) {
      super(dvn.F, $$0, $$1);
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.a();
         this.r = 0;
         this.c = jo.a($$1);
         this.a = 0;
         this.b = true;
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void a(dhp $$0, jj $$1, dym $$2, dvj $$3, dvj.a $$4) {
      if ($$3.b) {
         $$3.a++;
      }

      if ($$3.a >= 50) {
         $$3.b = false;
         $$3.a = 0;
      }

      if ($$3.a >= 5 && $$3.r == 0 && a($$1, $$3.m)) {
         $$3.q = true;
         $$0.a(null, $$1, awk.ca, awl.e, 1.0F, 1.0F);
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

   public static void a(dhp $$0, jj $$1, dym $$2, dvj $$3) {
      a($$0, $$1, $$2, $$3, dvj::b);
   }

   public static void b(dhp $$0, jj $$1, dym $$2, dvj $$3) {
      a($$0, $$1, $$2, $$3, dvj::a);
   }

   public void a(jo $$0) {
      jj $$1 = this.aw_();
      this.c = $$0;
      if (this.b) {
         this.a = 0;
      } else {
         this.b = true;
      }

      this.n.a($$1, this.m().b(), 1, $$0.d());
   }

   private void a() {
      jj $$0 = this.aw_();
      if (this.n.ae() > this.l + 60L || this.m == null) {
         this.l = this.n.ae();
         fcp $$1 = new fcp($$0).g(48.0);
         this.m = this.n.a(bwr.class, $$1);
      }

      if (!this.n.C) {
         for (bwr $$2 : this.m) {
            if ($$2.bK() && !$$2.dQ() && $$0.a($$2.dt(), 32.0)) {
               $$2.eb().a(cft.E, this.n.ae());
            }
         }
      }
   }

   private static boolean a(jj $$0, List<bwr> $$1) {
      for (bwr $$2 : $$1) {
         if ($$2.bK() && !$$2.dQ() && $$0.a($$2.dt(), 32.0) && $$2.aq().a(axd.c)) {
            return true;
         }
      }

      return false;
   }

   private static void a(dhp $$0, jj $$1, List<bwr> $$2) {
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach(dvj::a);
   }

   private static void b(dhp $$0, jj $$1, List<bwr> $$2) {
      MutableInt $$3 = new MutableInt(16700985);
      int $$4 = (int)$$2.stream().filter($$1x -> $$1.a($$1x.dt(), 48.0)).count();
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach($$4x -> {
         float $$5 = 1.0F;
         double $$6 = Math.sqrt(($$4x.dA() - (double)$$1.u()) * ($$4x.dA() - (double)$$1.u()) + ($$4x.dG() - (double)$$1.w()) * ($$4x.dG() - (double)$$1.w()));
         double $$7 = (double)((float)$$1.u() + 0.5F) + 1.0 / $$6 * ($$4x.dA() - (double)$$1.u());
         double $$8 = (double)((float)$$1.w() + 0.5F) + 1.0 / $$6 * ($$4x.dG() - (double)$$1.w());
         int $$9 = azk.a(($$4 - 21) / -2, 3, 15);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            int $$11 = $$3.addAndGet(5);
            $$0.a(lo.a(lv.u, $$11), $$7, (double)((float)$$1.v() + 0.5F), $$8, 0.0, 0.0, 0.0);
         }
      });
   }

   private static boolean a(jj $$0, bwr $$1) {
      return $$1.bK() && !$$1.dQ() && $$0.a($$1.dt(), 48.0) && $$1.aq().a(axd.c);
   }

   private static void a(bwr $$0) {
      $$0.a(new buw(buy.x, 60));
   }

   @FunctionalInterface
   interface a {
      void run(dhp var1, jj var2, List<bwr> var3);
   }
}
