import java.util.List;
import org.apache.commons.lang3.mutable.MutableInt;

public class dtv extends dtx {
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
   private List<bvf> m;
   private boolean n;
   private int r;

   public dtv(ji $$0, dwv $$1) {
      super(dtz.F, $$0, $$1);
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

   private static void a(dgg $$0, ji $$1, dwv $$2, dtv $$3, dtv.a $$4) {
      if ($$3.b) {
         $$3.a++;
      }

      if ($$3.a >= 50) {
         $$3.b = false;
         $$3.a = 0;
      }

      if ($$3.a >= 5 && $$3.r == 0 && a($$1, $$3.m)) {
         $$3.n = true;
         $$0.a(null, $$1, avz.ca, awa.e, 1.0F, 1.0F);
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

   public static void a(dgg $$0, ji $$1, dwv $$2, dtv $$3) {
      a($$0, $$1, $$2, $$3, dtv::b);
   }

   public static void b(dgg $$0, ji $$1, dwv $$2, dtv $$3) {
      a($$0, $$1, $$2, $$3, dtv::a);
   }

   public void a(jn $$0) {
      ji $$1 = this.aA_();
      this.c = $$0;
      if (this.b) {
         this.a = 0;
      } else {
         this.b = true;
      }

      this.o.a($$1, this.m().b(), 1, $$0.d());
   }

   private void b() {
      ji $$0 = this.aA_();
      if (this.o.ad() > this.l + 60L || this.m == null) {
         this.l = this.o.ad();
         fat $$1 = new fat($$0).g(48.0);
         this.m = this.o.a(bvf.class, $$1);
      }

      if (!this.o.C) {
         for (bvf $$2 : this.m) {
            if ($$2.bL() && !$$2.dR() && $$0.a($$2.du(), 32.0)) {
               $$2.ec().a(cej.D, this.o.ad());
            }
         }
      }
   }

   private static boolean a(ji $$0, List<bvf> $$1) {
      for (bvf $$2 : $$1) {
         if ($$2.bL() && !$$2.dR() && $$0.a($$2.du(), 32.0) && $$2.aq().a(aws.c)) {
            return true;
         }
      }

      return false;
   }

   private static void a(dgg $$0, ji $$1, List<bvf> $$2) {
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach(dtv::a);
   }

   private static void b(dgg $$0, ji $$1, List<bvf> $$2) {
      MutableInt $$3 = new MutableInt(16700985);
      int $$4 = (int)$$2.stream().filter($$1x -> $$1.a($$1x.du(), 48.0)).count();
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach($$4x -> {
         float $$5 = 1.0F;
         double $$6 = Math.sqrt(($$4x.dB() - (double)$$1.u()) * ($$4x.dB() - (double)$$1.u()) + ($$4x.dH() - (double)$$1.w()) * ($$4x.dH() - (double)$$1.w()));
         double $$7 = (double)((float)$$1.u() + 0.5F) + 1.0 / $$6 * ($$4x.dB() - (double)$$1.u());
         double $$8 = (double)((float)$$1.w() + 0.5F) + 1.0 / $$6 * ($$4x.dH() - (double)$$1.w());
         int $$9 = ayy.a(($$4 - 21) / -2, 3, 15);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            int $$11 = $$3.addAndGet(5);
            $$0.a(lm.a(lt.u, $$11), $$7, (double)((float)$$1.v() + 0.5F), $$8, 0.0, 0.0, 0.0);
         }
      });
   }

   private static boolean a(ji $$0, bvf $$1) {
      return $$1.bL() && !$$1.dR() && $$0.a($$1.du(), 48.0) && $$1.aq().a(aws.c);
   }

   private static void a(bvf $$0) {
      $$0.a(new bto(btq.x, 60));
   }

   @FunctionalInterface
   interface a {
      void run(dgg var1, ji var2, List<bvf> var3);
   }
}
