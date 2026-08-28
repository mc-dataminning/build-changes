import java.util.List;
import org.apache.commons.lang3.mutable.MutableInt;

public class dqf extends dqh {
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
   public ji c;
   private List<btn> m;
   private boolean q;
   private int r;

   public dqf(jd $$0, dtc $$1) {
      super(dqj.E, $$0, $$1);
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.b();
         this.r = 0;
         this.c = ji.a($$1);
         this.a = 0;
         this.b = true;
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void a(dcw $$0, jd $$1, dtc $$2, dqf $$3, dqf.a $$4) {
      if ($$3.b) {
         $$3.a++;
      }

      if ($$3.a >= 50) {
         $$3.b = false;
         $$3.a = 0;
      }

      if ($$3.a >= 5 && $$3.r == 0 && a($$1, $$3.m)) {
         $$3.q = true;
         $$0.a(null, $$1, avp.ca, avq.e, 1.0F, 1.0F);
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

   public static void a(dcw $$0, jd $$1, dtc $$2, dqf $$3) {
      a($$0, $$1, $$2, $$3, dqf::b);
   }

   public static void b(dcw $$0, jd $$1, dtc $$2, dqf $$3) {
      a($$0, $$1, $$2, $$3, dqf::a);
   }

   public void a(ji $$0) {
      jd $$1 = this.aD_();
      this.c = $$0;
      if (this.b) {
         this.a = 0;
      } else {
         this.b = true;
      }

      this.n.a($$1, this.n().b(), 1, $$0.d());
   }

   private void b() {
      jd $$0 = this.aD_();
      if (this.n.Z() > this.l + 60L || this.m == null) {
         this.l = this.n.Z();
         ewx $$1 = new ewx($$0).g(48.0);
         this.m = this.n.a(btn.class, $$1);
      }

      if (!this.n.B) {
         for (btn $$2 : this.m) {
            if ($$2.bE() && !$$2.dJ() && $$0.a($$2.dm(), 32.0)) {
               $$2.dT().a(ccs.D, this.n.Z());
            }
         }
      }
   }

   private static boolean a(jd $$0, List<btn> $$1) {
      for (btn $$2 : $$1) {
         if ($$2.bE() && !$$2.dJ() && $$0.a($$2.dm(), 32.0) && $$2.am().a(awi.c)) {
            return true;
         }
      }

      return false;
   }

   private static void a(dcw $$0, jd $$1, List<btn> $$2) {
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach(dqf::a);
   }

   private static void b(dcw $$0, jd $$1, List<btn> $$2) {
      MutableInt $$3 = new MutableInt(16700985);
      int $$4 = (int)$$2.stream().filter($$1x -> $$1.a($$1x.dm(), 48.0)).count();
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach($$4x -> {
         float $$5 = 1.0F;
         double $$6 = Math.sqrt(($$4x.dt() - (double)$$1.u()) * ($$4x.dt() - (double)$$1.u()) + ($$4x.dz() - (double)$$1.w()) * ($$4x.dz() - (double)$$1.w()));
         double $$7 = (double)((float)$$1.u() + 0.5F) + 1.0 / $$6 * ($$4x.dt() - (double)$$1.u());
         double $$8 = (double)((float)$$1.w() + 0.5F) + 1.0 / $$6 * ($$4x.dz() - (double)$$1.w());
         int $$9 = ayo.a(($$4 - 21) / -2, 3, 15);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            int $$11 = $$3.addAndGet(5);
            $$0.a(lf.a(lm.u, $$11), $$7, (double)((float)$$1.v() + 0.5F), $$8, 0.0, 0.0, 0.0);
         }
      });
   }

   private static boolean a(jd $$0, btn $$1) {
      return $$1.bE() && !$$1.dJ() && $$0.a($$1.dm(), 48.0) && $$1.am().a(awi.c);
   }

   private static void a(btn $$0) {
      $$0.b(new brz(bsb.x, 60));
   }

   @FunctionalInterface
   interface a {
      void run(dcw var1, jd var2, List<btn> var3);
   }
}
