import java.util.List;
import org.apache.commons.lang3.mutable.MutableInt;

public class duo extends duq {
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
   private List<bvx> m;
   private boolean n;
   private int r;

   public duo(jh $$0, dxo $$1) {
      super(dus.F, $$0, $$1);
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

   private static void a(dgz $$0, jh $$1, dxo $$2, duo $$3, duo.a $$4) {
      if ($$3.b) {
         $$3.a++;
      }

      if ($$3.a >= 50) {
         $$3.b = false;
         $$3.a = 0;
      }

      if ($$3.a >= 5 && $$3.r == 0 && a($$1, $$3.m)) {
         $$3.n = true;
         $$0.a(null, $$1, awv.ca, aww.e, 1.0F, 1.0F);
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

   public static void a(dgz $$0, jh $$1, dxo $$2, duo $$3) {
      a($$0, $$1, $$2, $$3, duo::b);
   }

   public static void b(dgz $$0, jh $$1, dxo $$2, duo $$3) {
      a($$0, $$1, $$2, $$3, duo::a);
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
      if (this.o.ad() > this.l + 60L || this.m == null) {
         this.l = this.o.ad();
         fbm $$1 = new fbm($$0).g(48.0);
         this.m = this.o.a(bvx.class, $$1);
      }

      if (!this.o.C) {
         for (bvx $$2 : this.m) {
            if ($$2.bL() && !$$2.dR() && $$0.a($$2.du(), 32.0)) {
               $$2.ec().a(cfb.D, this.o.ad());
            }
         }
      }
   }

   private static boolean a(jh $$0, List<bvx> $$1) {
      for (bvx $$2 : $$1) {
         if ($$2.bL() && !$$2.dR() && $$0.a($$2.du(), 32.0) && $$2.aq().a(axo.c)) {
            return true;
         }
      }

      return false;
   }

   private static void a(dgz $$0, jh $$1, List<bvx> $$2) {
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach(duo::a);
   }

   private static void b(dgz $$0, jh $$1, List<bvx> $$2) {
      MutableInt $$3 = new MutableInt(16700985);
      int $$4 = (int)$$2.stream().filter($$1x -> $$1.a($$1x.du(), 48.0)).count();
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach($$4x -> {
         float $$5 = 1.0F;
         double $$6 = Math.sqrt(($$4x.dB() - (double)$$1.u()) * ($$4x.dB() - (double)$$1.u()) + ($$4x.dH() - (double)$$1.w()) * ($$4x.dH() - (double)$$1.w()));
         double $$7 = (double)((float)$$1.u() + 0.5F) + 1.0 / $$6 * ($$4x.dB() - (double)$$1.u());
         double $$8 = (double)((float)$$1.w() + 0.5F) + 1.0 / $$6 * ($$4x.dH() - (double)$$1.w());
         int $$9 = azu.a(($$4 - 21) / -2, 3, 15);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            int $$11 = $$3.addAndGet(5);
            $$0.a(ll.a(ls.u, $$11), $$7, (double)((float)$$1.v() + 0.5F), $$8, 0.0, 0.0, 0.0);
         }
      });
   }

   private static boolean a(jh $$0, bvx $$1) {
      return $$1.bL() && !$$1.dR() && $$0.a($$1.du(), 48.0) && $$1.aq().a(axo.c);
   }

   private static void a(bvx $$0) {
      $$0.a(new bug(bui.x, 60));
   }

   @FunctionalInterface
   interface a {
      void run(dgz var1, jh var2, List<bvx> var3);
   }
}
