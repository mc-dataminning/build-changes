import java.util.List;
import org.apache.commons.lang3.mutable.MutableInt;

public class dwv extends dwx {
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
   public ja c;
   private List<bxc> m;
   private boolean q;
   private int r;

   public dwv(iu $$0, dzz $$1) {
      super(dwz.F, $$0, $$1);
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.a();
         this.r = 0;
         this.c = ja.a($$1);
         this.a = 0;
         this.b = true;
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void a(div $$0, iu $$1, dzz $$2, dwv $$3, dwv.a $$4) {
      if ($$3.b) {
         $$3.a++;
      }

      if ($$3.a >= 50) {
         $$3.b = false;
         $$3.a = 0;
      }

      if ($$3.a >= 5 && $$3.r == 0 && a($$1, $$3.m)) {
         $$3.q = true;
         $$0.a(null, $$1, awn.ca, awo.e, 1.0F, 1.0F);
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

   public static void a(div $$0, iu $$1, dzz $$2, dwv $$3) {
      a($$0, $$1, $$2, $$3, dwv::b);
   }

   public static void b(div $$0, iu $$1, dzz $$2, dwv $$3) {
      a($$0, $$1, $$2, $$3, dwv::a);
   }

   public void a(ja $$0) {
      iu $$1 = this.aw_();
      this.c = $$0;
      if (this.b) {
         this.a = 0;
      } else {
         this.b = true;
      }

      this.n.a($$1, this.m().b(), 1, $$0.d());
   }

   private void a() {
      iu $$0 = this.aw_();
      if (this.n.ae() > this.l + 60L || this.m == null) {
         this.l = this.n.ae();
         fed $$1 = new fed($$0).g(48.0);
         this.m = this.n.a(bxc.class, $$1);
      }

      if (!this.n.C) {
         for (bxc $$2 : this.m) {
            if ($$2.bK() && !$$2.dQ() && $$0.a($$2.dt(), 32.0)) {
               $$2.eb().a(cge.E, this.n.ae());
            }
         }
      }
   }

   private static boolean a(iu $$0, List<bxc> $$1) {
      for (bxc $$2 : $$1) {
         if ($$2.bK() && !$$2.dQ() && $$0.a($$2.dt(), 32.0) && $$2.aq().a(axf.c)) {
            return true;
         }
      }

      return false;
   }

   private static void a(div $$0, iu $$1, List<bxc> $$2) {
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach(dwv::a);
   }

   private static void b(div $$0, iu $$1, List<bxc> $$2) {
      MutableInt $$3 = new MutableInt(16700985);
      int $$4 = (int)$$2.stream().filter($$1x -> $$1.a($$1x.dt(), 48.0)).count();
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach($$4x -> {
         float $$5 = 1.0F;
         double $$6 = Math.sqrt(($$4x.dA() - (double)$$1.u()) * ($$4x.dA() - (double)$$1.u()) + ($$4x.dG() - (double)$$1.w()) * ($$4x.dG() - (double)$$1.w()));
         double $$7 = (double)((float)$$1.u() + 0.5F) + 1.0 / $$6 * ($$4x.dA() - (double)$$1.u());
         double $$8 = (double)((float)$$1.w() + 0.5F) + 1.0 / $$6 * ($$4x.dG() - (double)$$1.w());
         int $$9 = azm.a(($$4 - 21) / -2, 3, 15);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            int $$11 = $$3.addAndGet(5);
            $$0.a(lq.a(lx.u, $$11), $$7, (double)((float)$$1.v() + 0.5F), $$8, 0.0, 0.0, 0.0);
         }
      });
   }

   private static boolean a(iu $$0, bxc $$1) {
      return $$1.bK() && !$$1.dQ() && $$0.a($$1.dt(), 48.0) && $$1.aq().a(axf.c);
   }

   private static void a(bxc $$0) {
      $$0.a(new bvh(bvj.x, 60));
   }

   @FunctionalInterface
   interface a {
      void run(div var1, iu var2, List<bxc> var3);
   }
}
