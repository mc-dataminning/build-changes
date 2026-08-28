import java.util.List;
import org.apache.commons.lang3.mutable.MutableInt;

public class duq extends dus {
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
   public jn c;
   private List<bvy> m;
   private boolean q;
   private int r;

   public duq(ji $$0, dxq $$1) {
      super(duu.F, $$0, $$1);
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.b();
         this.r = 0;
         this.c = jn.a($$1);
         this.a = 0;
         this.b = true;
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void a(dgz $$0, ji $$1, dxq $$2, duq $$3, duq.a $$4) {
      if ($$3.b) {
         $$3.a++;
      }

      if ($$3.a >= 50) {
         $$3.b = false;
         $$3.a = 0;
      }

      if ($$3.a >= 5 && $$3.r == 0 && a($$1, $$3.m)) {
         $$3.q = true;
         $$0.a(null, $$1, awa.ca, awb.e, 1.0F, 1.0F);
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

   public static void a(dgz $$0, ji $$1, dxq $$2, duq $$3) {
      a($$0, $$1, $$2, $$3, duq::b);
   }

   public static void b(dgz $$0, ji $$1, dxq $$2, duq $$3) {
      a($$0, $$1, $$2, $$3, duq::a);
   }

   public void a(jn $$0) {
      ji $$1 = this.aA_();
      this.c = $$0;
      if (this.b) {
         this.a = 0;
      } else {
         this.b = true;
      }

      this.n.a($$1, this.m().b(), 1, $$0.d());
   }

   private void b() {
      ji $$0 = this.aA_();
      if (this.n.ae() > this.l + 60L || this.m == null) {
         this.l = this.n.ae();
         fbs $$1 = new fbs($$0).g(48.0);
         this.m = this.n.a(bvy.class, $$1);
      }

      if (!this.n.C) {
         for (bvy $$2 : this.m) {
            if ($$2.bJ() && !$$2.dP() && $$0.a($$2.ds(), 32.0)) {
               $$2.ea().a(cfc.D, this.n.ae());
            }
         }
      }
   }

   private static boolean a(ji $$0, List<bvy> $$1) {
      for (bvy $$2 : $$1) {
         if ($$2.bJ() && !$$2.dP() && $$0.a($$2.ds(), 32.0) && $$2.aq().a(awt.c)) {
            return true;
         }
      }

      return false;
   }

   private static void a(dgz $$0, ji $$1, List<bvy> $$2) {
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach(duq::a);
   }

   private static void b(dgz $$0, ji $$1, List<bvy> $$2) {
      MutableInt $$3 = new MutableInt(16700985);
      int $$4 = (int)$$2.stream().filter($$1x -> $$1.a($$1x.ds(), 48.0)).count();
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach($$4x -> {
         float $$5 = 1.0F;
         double $$6 = Math.sqrt(($$4x.dz() - (double)$$1.u()) * ($$4x.dz() - (double)$$1.u()) + ($$4x.dF() - (double)$$1.w()) * ($$4x.dF() - (double)$$1.w()));
         double $$7 = (double)((float)$$1.u() + 0.5F) + 1.0 / $$6 * ($$4x.dz() - (double)$$1.u());
         double $$8 = (double)((float)$$1.w() + 0.5F) + 1.0 / $$6 * ($$4x.dF() - (double)$$1.w());
         int $$9 = ayz.a(($$4 - 21) / -2, 3, 15);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            int $$11 = $$3.addAndGet(5);
            $$0.a(lm.a(lt.u, $$11), $$7, (double)((float)$$1.v() + 0.5F), $$8, 0.0, 0.0, 0.0);
         }
      });
   }

   private static boolean a(ji $$0, bvy $$1) {
      return $$1.bJ() && !$$1.dP() && $$0.a($$1.ds(), 48.0) && $$1.aq().a(awt.c);
   }

   private static void a(bvy $$0) {
      $$0.a(new bue(bug.x, 60));
   }

   @FunctionalInterface
   interface a {
      void run(dgz var1, ji var2, List<bvy> var3);
   }
}
