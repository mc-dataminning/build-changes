import java.util.List;
import org.apache.commons.lang3.mutable.MutableInt;

public class dse extends dsg {
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
   public jl c;
   private List<buv> m;
   private boolean n;
   private int r;

   public dse(jg $$0, dvd $$1) {
      super(dsi.E, $$0, $$1);
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.b();
         this.r = 0;
         this.c = jl.a($$1);
         this.a = 0;
         this.b = true;
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void a(dev $$0, jg $$1, dvd $$2, dse $$3, dse.a $$4) {
      if ($$3.b) {
         $$3.a++;
      }

      if ($$3.a >= 50) {
         $$3.b = false;
         $$3.a = 0;
      }

      if ($$3.a >= 5 && $$3.r == 0 && a($$1, $$3.m)) {
         $$3.n = true;
         $$0.a(null, $$1, awk.ca, awl.e, 1.0F, 1.0F);
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

   public static void a(dev $$0, jg $$1, dvd $$2, dse $$3) {
      a($$0, $$1, $$2, $$3, dse::b);
   }

   public static void b(dev $$0, jg $$1, dvd $$2, dse $$3) {
      a($$0, $$1, $$2, $$3, dse::a);
   }

   public void a(jl $$0) {
      jg $$1 = this.aC_();
      this.c = $$0;
      if (this.b) {
         this.a = 0;
      } else {
         this.b = true;
      }

      this.o.a($$1, this.m().b(), 1, $$0.d());
   }

   private void b() {
      jg $$0 = this.aC_();
      if (this.o.aa() > this.l + 60L || this.m == null) {
         this.l = this.o.aa();
         ezc $$1 = new ezc($$0).g(48.0);
         this.m = this.o.a(buv.class, $$1);
      }

      if (!this.o.C) {
         for (buv $$2 : this.m) {
            if ($$2.bM() && !$$2.dS() && $$0.a($$2.dv(), 32.0)) {
               $$2.ed().a(cdz.D, this.o.aa());
            }
         }
      }
   }

   private static boolean a(jg $$0, List<buv> $$1) {
      for (buv $$2 : $$1) {
         if ($$2.bM() && !$$2.dS() && $$0.a($$2.dv(), 32.0) && $$2.aq().a(axd.c)) {
            return true;
         }
      }

      return false;
   }

   private static void a(dev $$0, jg $$1, List<buv> $$2) {
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach(dse::a);
   }

   private static void b(dev $$0, jg $$1, List<buv> $$2) {
      MutableInt $$3 = new MutableInt(16700985);
      int $$4 = (int)$$2.stream().filter($$1x -> $$1.a($$1x.dv(), 48.0)).count();
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach($$4x -> {
         float $$5 = 1.0F;
         double $$6 = Math.sqrt(($$4x.dC() - (double)$$1.u()) * ($$4x.dC() - (double)$$1.u()) + ($$4x.dI() - (double)$$1.w()) * ($$4x.dI() - (double)$$1.w()));
         double $$7 = (double)((float)$$1.u() + 0.5F) + 1.0 / $$6 * ($$4x.dC() - (double)$$1.u());
         double $$8 = (double)((float)$$1.w() + 0.5F) + 1.0 / $$6 * ($$4x.dI() - (double)$$1.w());
         int $$9 = azj.a(($$4 - 21) / -2, 3, 15);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            int $$11 = $$3.addAndGet(5);
            $$0.a(lj.a(lq.u, $$11), $$7, (double)((float)$$1.v() + 0.5F), $$8, 0.0, 0.0, 0.0);
         }
      });
   }

   private static boolean a(jg $$0, buv $$1) {
      return $$1.bM() && !$$1.dS() && $$0.a($$1.dv(), 48.0) && $$1.aq().a(axd.c);
   }

   private static void a(buv $$0) {
      $$0.a(new bte(btg.x, 60));
   }

   @FunctionalInterface
   interface a {
      void run(dev var1, jg var2, List<buv> var3);
   }
}
