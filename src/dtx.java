import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dtx extends dtt implements bsn {
   public static final int d = 9;
   public static final int e = 3;
   public static final int f = 27;
   public static final int g = 1;
   public static final int h = 10;
   public static final float i = 0.5F;
   public static final float j = 270.0F;
   private static final int[] k = IntStream.range(0, 27).toArray();
   private jz<cwb> n = jz.a(27, cwb.k);
   private int r;
   private dtx.a s = dtx.a.a;
   private float t;
   private float u;
   @Nullable
   private final cuy v;

   public dtx(@Nullable cuy $$0, jh $$1, dvj $$2) {
      super(dso.x, $$1, $$2);
      this.v = $$0;
   }

   public dtx(jh $$0, dvj $$1) {
      super(dso.x, $$0, $$1);
      this.v = dpd.a($$1.b());
   }

   public static void a(dfb $$0, jh $$1, dvj $$2, dtx $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(dfb $$0, jh $$1, dvj $$2) {
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
               this.s = dtx.a.c;
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
               this.s = dtx.a.a;
               this.t = 0.0F;
               d($$0, $$1, $$2);
            }
      }
   }

   public dtx.a k() {
      return this.s;
   }

   public ezi a(dvj $$0) {
      return clx.a(1.0F, $$0.c(dpd.b), 0.5F * this.a(1.0F));
   }

   private void c(dfb $$0, jh $$1, dvj $$2) {
      if ($$2.b() instanceof dpd) {
         jm $$3 = $$2.c(dpd.b);
         ezi $$4 = clx.a(1.0F, $$3, this.u, this.t).a($$1);
         List<bue> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (bue $$6 : $$5) {
               if ($$6.k_() != erp.d) {
                  $$6.a(bve.d, new ezn(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
            this.s = dtx.a.d;
         }

         if ($$1 == 1) {
            this.s = dtx.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(dfb $$0, jh $$1, dvj $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void d_(com $$0) {
      if (!this.q && !$$0.R_()) {
         if (this.r < 0) {
            this.r = 0;
         }

         this.r++;
         this.o.a(this.p, this.m().b(), 1, this.r);
         if (this.r == 1) {
            this.o.a($$0, eag.k, this.p);
            this.o.a(null, this.p, awl.wM, awm.e, 0.5F, this.o.A.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(com $$0) {
      if (!this.q && !$$0.R_()) {
         this.r--;
         this.o.a(this.p, this.m().b(), 1, this.r);
         if (this.r <= 0) {
            this.o.a($$0, eag.j, this.p);
            this.o.a(null, this.p, awl.wL, awm.e, 0.5F, this.o.A.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected xi j() {
      return xi.c("container.shulkerBox");
   }

   @Override
   protected void a(uk $$0, js.a $$1) {
      super.a($$0, $$1);
      this.e($$0, $$1);
   }

   @Override
   protected void b(uk $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         brx.a($$0, this.n, false, $$1);
      }
   }

   public void e(uk $$0, js.a $$1) {
      this.n = jz.a(this.b(), cwb.k);
      if (!this.b_($$0) && $$0.b("Items", 9)) {
         brx.b($$0, this.n, $$1);
      }
   }

   @Override
   protected jz<cwb> f() {
      return this.n;
   }

   @Override
   protected void a(jz<cwb> $$0) {
      this.n = $$0;
   }

   @Override
   public int[] a(jm $$0) {
      return k;
   }

   @Override
   public boolean a(int $$0, cwb $$1, @Nullable jm $$2) {
      return !(die.a($$1.h()) instanceof dpd);
   }

   @Override
   public boolean b(int $$0, cwb $$1, jm $$2) {
      return true;
   }

   public float a(float $$0) {
      return azk.h($$0, this.u, this.t);
   }

   @Nullable
   public cuy t() {
      return this.v;
   }

   @Override
   protected cro a(int $$0, col $$1) {
      return new cti($$0, $$1, this);
   }

   public boolean u() {
      return this.s == dtx.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
