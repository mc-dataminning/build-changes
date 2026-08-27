import java.util.List;
import org.apache.commons.lang3.mutable.MutableInt;

public class doe extends dog {
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
   public it c;
   private List<bso> m;
   private boolean q;
   private int r;

   public doe(io $$0, drb $$1) {
      super(doi.E, $$0, $$1);
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.b();
         this.r = 0;
         this.c = it.a($$1);
         this.a = 0;
         this.b = true;
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void a(dax $$0, io $$1, drb $$2, doe $$3, doe.a $$4) {
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

   public static void a(dax $$0, io $$1, drb $$2, doe $$3) {
      a($$0, $$1, $$2, $$3, doe::b);
   }

   public static void b(dax $$0, io $$1, drb $$2, doe $$3) {
      a($$0, $$1, $$2, $$3, doe::a);
   }

   public void a(it $$0) {
      io $$1 = this.az_();
      this.c = $$0;
      if (this.b) {
         this.a = 0;
      } else {
         this.b = true;
      }

      this.n.a($$1, this.n().b(), 1, $$0.d());
   }

   private void b() {
      io $$0 = this.az_();
      if (this.n.Y() > this.l + 60L || this.m == null) {
         this.l = this.n.Y();
         euf $$1 = new euf($$0).g(48.0);
         this.m = this.n.a(bso.class, $$1);
      }

      if (!this.n.B) {
         for (bso $$2 : this.m) {
            if ($$2.bD() && !$$2.dK() && $$0.a($$2.dn(), 32.0)) {
               $$2.dS().a(cbs.D, this.n.Y());
            }
         }
      }
   }

   private static boolean a(io $$0, List<bso> $$1) {
      for (bso $$2 : $$1) {
         if ($$2.bD() && !$$2.dK() && $$0.a($$2.dn(), 32.0) && $$2.ak().a(avz.c)) {
            return true;
         }
      }

      return false;
   }

   private static void a(dax $$0, io $$1, List<bso> $$2) {
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach(doe::a);
   }

   private static void b(dax $$0, io $$1, List<bso> $$2) {
      MutableInt $$3 = new MutableInt(16700985);
      int $$4 = (int)$$2.stream().filter($$1x -> $$1.a($$1x.dn(), 48.0)).count();
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach($$4x -> {
         float $$5 = 1.0F;
         double $$6 = Math.sqrt(($$4x.du() - (double)$$1.u()) * ($$4x.du() - (double)$$1.u()) + ($$4x.dA() - (double)$$1.w()) * ($$4x.dA() - (double)$$1.w()));
         double $$7 = (double)((float)$$1.u() + 0.5F) + 1.0 / $$6 * ($$4x.du() - (double)$$1.u());
         double $$8 = (double)((float)$$1.w() + 0.5F) + 1.0 / $$6 * ($$4x.dA() - (double)$$1.w());
         int $$9 = ayd.a(($$4 - 21) / -2, 3, 15);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            int $$11 = $$3.addAndGet(5);
            $$0.a(kq.a(ky.u, $$11), $$7, (double)((float)$$1.v() + 0.5F), $$8, 0.0, 0.0, 0.0);
         }
      });
   }

   private static boolean a(io $$0, bso $$1) {
      return $$1.bD() && !$$1.dK() && $$0.a($$1.dn(), 48.0) && $$1.ak().a(avz.c);
   }

   private static void a(bso $$0) {
      $$0.b(new brc(bre.x, 60));
   }

   @FunctionalInterface
   interface a {
      void run(dax var1, io var2, List<bso> var3);
   }
}
