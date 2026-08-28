import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dvj extends dvf implements bss {
   public static final int d = 9;
   public static final int e = 3;
   public static final int f = 27;
   public static final int g = 1;
   public static final int h = 10;
   public static final float i = 0.5F;
   public static final float j = 270.0F;
   private static final int[] k = IntStream.range(0, 27).toArray();
   private ka<cwn> n = ka.a(27, cwn.j);
   private int r;
   private dvj.a s = dvj.a.a;
   private float t;
   private float u;
   @Nullable
   private final cvk v;

   public dvj(@Nullable cvk $$0, ji $$1, dwv $$2) {
      super(dtz.y, $$1, $$2);
      this.v = $$0;
   }

   public dvj(ji $$0, dwv $$1) {
      super(dtz.y, $$0, $$1);
      this.v = $$1.b() instanceof dqo $$2 ? $$2.b() : null;
   }

   public static void a(dgg $$0, ji $$1, dwv $$2, dvj $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(dgg $$0, ji $$1, dwv $$2) {
      this.u = this.t;
      switch (this.s) {
         case a:
            this.t = 0.0F;
            break;
         case b:
            this.t += 0.1F;
            if (this.u == 0.0F) {
               d($$0, $$1, $$2);
            }

            if (this.t >= 1.0F) {
               this.s = dvj.a.c;
               this.t = 1.0F;
               d($$0, $$1, $$2);
            }

            this.c($$0, $$1, $$2);
            break;
         case c:
            this.t = 1.0F;
            break;
         case d:
            this.t -= 0.1F;
            if (this.u == 1.0F) {
               d($$0, $$1, $$2);
            }

            if (this.t <= 0.0F) {
               this.s = dvj.a.a;
               this.t = 0.0F;
               d($$0, $$1, $$2);
            }
      }
   }

   public dvj.a k() {
      return this.s;
   }

   public fat a(dwv $$0) {
      return cmc.a(1.0F, $$0.c(dqo.b), 0.5F * this.a(1.0F));
   }

   private void c(dgg $$0, ji $$1, dwv $$2) {
      if ($$2.b() instanceof dqo) {
         jn $$3 = $$2.c(dqo.b);
         fat $$4 = cmc.a(1.0F, $$3, this.u, this.t).a($$1);
         List<buj> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (buj $$6 : $$5) {
               if ($$6.n_() != etc.d) {
                  $$6.a(bvj.d, new fay(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
               }
            }
         }
      }
   }

   @Override
   public int b() {
      return this.n.size();
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.r = $$1;
         if ($$1 == 0) {
            this.s = dvj.a.d;
         }

         if ($$1 == 1) {
            this.s = dvj.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(dgg $$0, ji $$1, dwv $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void c_(cov $$0) {
      if (!this.q && !$$0.Z_()) {
         if (this.r < 0) {
            this.r = 0;
         }

         this.r++;
         this.o.a(this.p, this.m().b(), 1, this.r);
         if (this.r == 1) {
            this.o.a($$0, ebr.k, this.p);
            this.o.a(null, this.p, avz.xn, awa.e, 0.5F, this.o.A.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cov $$0) {
      if (!this.q && !$$0.Z_()) {
         this.r--;
         this.o.a(this.p, this.m().b(), 1, this.r);
         if (this.r <= 0) {
            this.o.a($$0, ebr.j, this.p);
            this.o.a(null, this.p, avz.xm, awa.e, 0.5F, this.o.A.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected wo j() {
      return wo.c("container.shulkerBox");
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.e($$0, $$1);
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bsc.a($$0, this.n, false, $$1);
      }
   }

   public void e(tq $$0, jt.a $$1) {
      this.n = ka.a(this.b(), cwn.j);
      if (!this.b_($$0) && $$0.b("Items", 9)) {
         bsc.b($$0, this.n, $$1);
      }
   }

   @Override
   protected ka<cwn> f() {
      return this.n;
   }

   @Override
   protected void a(ka<cwn> $$0) {
      this.n = $$0;
   }

   @Override
   public int[] a(jn $$0) {
      return k;
   }

   @Override
   public boolean a(int $$0, cwn $$1, @Nullable jn $$2) {
      return !(djk.a($$1.h()) instanceof dqo);
   }

   @Override
   public boolean b(int $$0, cwn $$1, jn $$2) {
      return true;
   }

   public float a(float $$0) {
      return ayy.h($$0, this.u, this.t);
   }

   @Nullable
   public cvk s() {
      return this.v;
   }

   @Override
   protected csa a(int $$0, cou $$1) {
      return new ctu($$0, $$1, this);
   }

   public boolean t() {
      return this.s == dvj.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
