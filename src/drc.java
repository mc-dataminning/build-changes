import java.util.List;
import org.apache.commons.lang3.mutable.MutableInt;

public class drc extends dre {
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
   public jj c;
   private List<buf> m;
   private boolean n;
   private int r;

   public drc(je $$0, dua $$1) {
      super(drg.E, $$0, $$1);
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.b();
         this.r = 0;
         this.c = jj.a($$1);
         this.a = 0;
         this.b = true;
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void a(dds $$0, je $$1, dua $$2, drc $$3, drc.a $$4) {
      if ($$3.b) {
         $$3.a++;
      }

      if ($$3.a >= 50) {
         $$3.b = false;
         $$3.a = 0;
      }

      if ($$3.a >= 5 && $$3.r == 0 && a($$1, $$3.m)) {
         $$3.n = true;
         $$0.a(null, $$1, awd.ca, awe.e, 1.0F, 1.0F);
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

   public static void a(dds $$0, je $$1, dua $$2, drc $$3) {
      a($$0, $$1, $$2, $$3, drc::b);
   }

   public static void b(dds $$0, je $$1, dua $$2, drc $$3) {
      a($$0, $$1, $$2, $$3, drc::a);
   }

   public void a(jj $$0) {
      je $$1 = this.aD_();
      this.c = $$0;
      if (this.b) {
         this.a = 0;
      } else {
         this.b = true;
      }

      this.o.a($$1, this.m().b(), 1, $$0.d());
   }

   private void b() {
      je $$0 = this.aD_();
      if (this.o.aa() > this.l + 60L || this.m == null) {
         this.l = this.o.aa();
         exz $$1 = new exz($$0).g(48.0);
         this.m = this.o.a(buf.class, $$1);
      }

      if (!this.o.B) {
         for (buf $$2 : this.m) {
            if ($$2.bI() && !$$2.dN() && $$0.a($$2.dq(), 32.0)) {
               $$2.dX().a(cdi.D, this.o.aa());
            }
         }
      }
   }

   private static boolean a(je $$0, List<buf> $$1) {
      for (buf $$2 : $$1) {
         if ($$2.bI() && !$$2.dN() && $$0.a($$2.dq(), 32.0) && $$2.ao().a(aww.c)) {
            return true;
         }
      }

      return false;
   }

   private static void a(dds $$0, je $$1, List<buf> $$2) {
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach(drc::a);
   }

   private static void b(dds $$0, je $$1, List<buf> $$2) {
      MutableInt $$3 = new MutableInt(16700985);
      int $$4 = (int)$$2.stream().filter($$1x -> $$1.a($$1x.dq(), 48.0)).count();
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach($$4x -> {
         float $$5 = 1.0F;
         double $$6 = Math.sqrt(($$4x.dx() - (double)$$1.u()) * ($$4x.dx() - (double)$$1.u()) + ($$4x.dD() - (double)$$1.w()) * ($$4x.dD() - (double)$$1.w()));
         double $$7 = (double)((float)$$1.u() + 0.5F) + 1.0 / $$6 * ($$4x.dx() - (double)$$1.u());
         double $$8 = (double)((float)$$1.w() + 0.5F) + 1.0 / $$6 * ($$4x.dD() - (double)$$1.w());
         int $$9 = azc.a(($$4 - 21) / -2, 3, 15);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            int $$11 = $$3.addAndGet(5);
            $$0.a(lg.a(ln.u, $$11), $$7, (double)((float)$$1.v() + 0.5F), $$8, 0.0, 0.0, 0.0);
         }
      });
   }

   private static boolean a(je $$0, buf $$1) {
      return $$1.bI() && !$$1.dN() && $$0.a($$1.dq(), 48.0) && $$1.ao().a(aww.c);
   }

   private static void a(buf $$0) {
      $$0.b(new bsq(bss.x, 60));
   }

   @FunctionalInterface
   interface a {
      void run(dds var1, je var2, List<buf> var3);
   }
}
