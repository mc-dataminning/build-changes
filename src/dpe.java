import java.util.List;
import org.apache.commons.lang3.mutable.MutableInt;

public class dpe extends dpg {
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
   public je c;
   private List<bto> m;
   private boolean q;
   private int r;

   public dpe(iz $$0, dsb $$1) {
      super(dpi.E, $$0, $$1);
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.b();
         this.r = 0;
         this.c = je.a($$1);
         this.a = 0;
         this.b = true;
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void a(dbx $$0, iz $$1, dsb $$2, dpe $$3, dpe.a $$4) {
      if ($$3.b) {
         $$3.a++;
      }

      if ($$3.a >= 50) {
         $$3.b = false;
         $$3.a = 0;
      }

      if ($$3.a >= 5 && $$3.r == 0 && a($$1, $$3.m)) {
         $$3.q = true;
         $$0.a(null, $$1, avz.ca, awa.e, 1.0F, 1.0F);
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

   public static void a(dbx $$0, iz $$1, dsb $$2, dpe $$3) {
      a($$0, $$1, $$2, $$3, dpe::b);
   }

   public static void b(dbx $$0, iz $$1, dsb $$2, dpe $$3) {
      a($$0, $$1, $$2, $$3, dpe::a);
   }

   public void a(je $$0) {
      iz $$1 = this.ay_();
      this.c = $$0;
      if (this.b) {
         this.a = 0;
      } else {
         this.b = true;
      }

      this.n.a($$1, this.n().b(), 1, $$0.d());
   }

   private void b() {
      iz $$0 = this.ay_();
      if (this.n.Z() > this.l + 60L || this.m == null) {
         this.l = this.n.Z();
         evl $$1 = new evl($$0).g(48.0);
         this.m = this.n.a(bto.class, $$1);
      }

      if (!this.n.B) {
         for (bto $$2 : this.m) {
            if ($$2.bD() && !$$2.dK() && $$0.a($$2.dn(), 32.0)) {
               $$2.dS().a(ccs.D, this.n.Z());
            }
         }
      }
   }

   private static boolean a(iz $$0, List<bto> $$1) {
      for (bto $$2 : $$1) {
         if ($$2.bD() && !$$2.dK() && $$0.a($$2.dn(), 32.0) && $$2.ak().a(aws.c)) {
            return true;
         }
      }

      return false;
   }

   private static void a(dbx $$0, iz $$1, List<bto> $$2) {
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach(dpe::a);
   }

   private static void b(dbx $$0, iz $$1, List<bto> $$2) {
      MutableInt $$3 = new MutableInt(16700985);
      int $$4 = (int)$$2.stream().filter($$1x -> $$1.a($$1x.dn(), 48.0)).count();
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach($$4x -> {
         float $$5 = 1.0F;
         double $$6 = Math.sqrt(($$4x.du() - (double)$$1.u()) * ($$4x.du() - (double)$$1.u()) + ($$4x.dA() - (double)$$1.w()) * ($$4x.dA() - (double)$$1.w()));
         double $$7 = (double)((float)$$1.u() + 0.5F) + 1.0 / $$6 * ($$4x.du() - (double)$$1.u());
         double $$8 = (double)((float)$$1.w() + 0.5F) + 1.0 / $$6 * ($$4x.dA() - (double)$$1.w());
         int $$9 = ayy.a(($$4 - 21) / -2, 3, 15);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            int $$11 = $$3.addAndGet(5);
            $$0.a(lb.a(li.u, $$11), $$7, (double)((float)$$1.v() + 0.5F), $$8, 0.0, 0.0, 0.0);
         }
      });
   }

   private static boolean a(iz $$0, bto $$1) {
      return $$1.bD() && !$$1.dK() && $$0.a($$1.dn(), 48.0) && $$1.ak().a(aws.c);
   }

   private static void a(bto $$0) {
      $$0.b(new bsb(bsd.x, 60));
   }

   @FunctionalInterface
   interface a {
      void run(dbx var1, iz var2, List<bto> var3);
   }
}
