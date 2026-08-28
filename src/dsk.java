import java.util.List;
import org.apache.commons.lang3.mutable.MutableInt;

public class dsk extends dsm {
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
   public jm c;
   private List<bva> m;
   private boolean n;
   private int r;

   public dsk(jh $$0, dvj $$1) {
      super(dso.E, $$0, $$1);
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.b();
         this.r = 0;
         this.c = jm.a($$1);
         this.a = 0;
         this.b = true;
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void a(dfb $$0, jh $$1, dvj $$2, dsk $$3, dsk.a $$4) {
      if ($$3.b) {
         $$3.a++;
      }

      if ($$3.a >= 50) {
         $$3.b = false;
         $$3.a = 0;
      }

      if ($$3.a >= 5 && $$3.r == 0 && a($$1, $$3.m)) {
         $$3.n = true;
         $$0.a(null, $$1, awl.ca, awm.e, 1.0F, 1.0F);
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

   public static void a(dfb $$0, jh $$1, dvj $$2, dsk $$3) {
      a($$0, $$1, $$2, $$3, dsk::b);
   }

   public static void b(dfb $$0, jh $$1, dvj $$2, dsk $$3) {
      a($$0, $$1, $$2, $$3, dsk::a);
   }

   public void a(jm $$0) {
      jh $$1 = this.aB_();
      this.c = $$0;
      if (this.b) {
         this.a = 0;
      } else {
         this.b = true;
      }

      this.o.a($$1, this.m().b(), 1, $$0.d());
   }

   private void b() {
      jh $$0 = this.aB_();
      if (this.o.aa() > this.l + 60L || this.m == null) {
         this.l = this.o.aa();
         ezi $$1 = new ezi($$0).g(48.0);
         this.m = this.o.a(bva.class, $$1);
      }

      if (!this.o.C) {
         for (bva $$2 : this.m) {
            if ($$2.bM() && !$$2.dS() && $$0.a($$2.dv(), 32.0)) {
               $$2.ed().a(cee.D, this.o.aa());
            }
         }
      }
   }

   private static boolean a(jh $$0, List<bva> $$1) {
      for (bva $$2 : $$1) {
         if ($$2.bM() && !$$2.dS() && $$0.a($$2.dv(), 32.0) && $$2.ar().a(axe.c)) {
            return true;
         }
      }

      return false;
   }

   private static void a(dfb $$0, jh $$1, List<bva> $$2) {
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach(dsk::a);
   }

   private static void b(dfb $$0, jh $$1, List<bva> $$2) {
      MutableInt $$3 = new MutableInt(16700985);
      int $$4 = (int)$$2.stream().filter($$1x -> $$1.a($$1x.dv(), 48.0)).count();
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach($$4x -> {
         float $$5 = 1.0F;
         double $$6 = Math.sqrt(($$4x.dC() - (double)$$1.u()) * ($$4x.dC() - (double)$$1.u()) + ($$4x.dI() - (double)$$1.w()) * ($$4x.dI() - (double)$$1.w()));
         double $$7 = (double)((float)$$1.u() + 0.5F) + 1.0 / $$6 * ($$4x.dC() - (double)$$1.u());
         double $$8 = (double)((float)$$1.w() + 0.5F) + 1.0 / $$6 * ($$4x.dI() - (double)$$1.w());
         int $$9 = azk.a(($$4 - 21) / -2, 3, 15);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            int $$11 = $$3.addAndGet(5);
            $$0.a(lk.a(lr.u, $$11), $$7, (double)((float)$$1.v() + 0.5F), $$8, 0.0, 0.0, 0.0);
         }
      });
   }

   private static boolean a(jh $$0, bva $$1) {
      return $$1.bM() && !$$1.dS() && $$0.a($$1.dv(), 48.0) && $$1.ar().a(axe.c);
   }

   private static void a(bva $$0) {
      $$0.a(new btj(btl.x, 60));
   }

   @FunctionalInterface
   interface a {
      void run(dfb var1, jh var2, List<bva> var3);
   }
}
