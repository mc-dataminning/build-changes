import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class duc extends dty implements bsr {
   public static final int d = 9;
   public static final int e = 3;
   public static final int f = 27;
   public static final int g = 1;
   public static final int h = 10;
   public static final float i = 0.5F;
   public static final float j = 270.0F;
   private static final int[] k = IntStream.range(0, 27).toArray();
   private jz<cwf> n = jz.a(27, cwf.k);
   private int r;
   private duc.a s = duc.a.a;
   private float t;
   private float u;
   @Nullable
   private final cvc v;

   public duc(@Nullable cvc $$0, jh $$1, dvo $$2) {
      super(dst.x, $$1, $$2);
      this.v = $$0;
   }

   public duc(jh $$0, dvo $$1) {
      super(dst.x, $$0, $$1);
      this.v = dpi.a($$1.b());
   }

   public static void a(dff $$0, jh $$1, dvo $$2, duc $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(dff $$0, jh $$1, dvo $$2) {
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
               this.s = duc.a.c;
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
               this.s = duc.a.a;
               this.t = 0.0F;
               d($$0, $$1, $$2);
            }
      }
   }

   public duc.a k() {
      return this.s;
   }

   public ezm a(dvo $$0) {
      return cmb.a(1.0F, $$0.c(dpi.b), 0.5F * this.a(1.0F));
   }

   private void c(dff $$0, jh $$1, dvo $$2) {
      if ($$2.b() instanceof dpi) {
         jm $$3 = $$2.c(dpi.b);
         ezm $$4 = cmb.a(1.0F, $$3, this.u, this.t).a($$1);
         List<bui> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (bui $$6 : $$5) {
               if ($$6.k_() != ert.d) {
                  $$6.a(bvi.d, new ezr(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
            this.s = duc.a.d;
         }

         if ($$1 == 1) {
            this.s = duc.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(dff $$0, jh $$1, dvo $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void d_(cor $$0) {
      if (!this.q && !$$0.R_()) {
         if (this.r < 0) {
            this.r = 0;
         }

         this.r++;
         this.o.a(this.p, this.m().b(), 1, this.r);
         if (this.r == 1) {
            this.o.a($$0, eak.k, this.p);
            this.o.a(null, this.p, awo.wM, awp.e, 0.5F, this.o.A.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cor $$0) {
      if (!this.q && !$$0.R_()) {
         this.r--;
         this.o.a(this.p, this.m().b(), 1, this.r);
         if (this.r <= 0) {
            this.o.a($$0, eak.j, this.p);
            this.o.a(null, this.p, awo.wL, awp.e, 0.5F, this.o.A.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected xl j() {
      return xl.c("container.shulkerBox");
   }

   @Override
   protected void a(un $$0, js.a $$1) {
      super.a($$0, $$1);
      this.e($$0, $$1);
   }

   @Override
   protected void b(un $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bsb.a($$0, this.n, false, $$1);
      }
   }

   public void e(un $$0, js.a $$1) {
      this.n = jz.a(this.b(), cwf.k);
      if (!this.b_($$0) && $$0.b("Items", 9)) {
         bsb.b($$0, this.n, $$1);
      }
   }

   @Override
   protected jz<cwf> f() {
      return this.n;
   }

   @Override
   protected void a(jz<cwf> $$0) {
      this.n = $$0;
   }

   @Override
   public int[] a(jm $$0) {
      return k;
   }

   @Override
   public boolean a(int $$0, cwf $$1, @Nullable jm $$2) {
      return !(dij.a($$1.h()) instanceof dpi);
   }

   @Override
   public boolean b(int $$0, cwf $$1, jm $$2) {
      return true;
   }

   public float a(float $$0) {
      return azn.h($$0, this.u, this.t);
   }

   @Nullable
   public cvc t() {
      return this.v;
   }

   @Override
   protected crs a(int $$0, coq $$1) {
      return new ctm($$0, $$1, this);
   }

   public boolean u() {
      return this.s == duc.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
