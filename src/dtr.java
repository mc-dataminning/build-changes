import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dtr extends dtn implements bsi {
   public static final int d = 9;
   public static final int e = 3;
   public static final int f = 27;
   public static final int g = 1;
   public static final int h = 10;
   public static final float i = 0.5F;
   public static final float j = 270.0F;
   private static final int[] k = IntStream.range(0, 27).toArray();
   private jy<cvx> n = jy.a(27, cvx.k);
   private int r;
   private dtr.a s = dtr.a.a;
   private float t;
   private float u;
   @Nullable
   private final cuu v;

   public dtr(@Nullable cuu $$0, jg $$1, dvd $$2) {
      super(dsi.x, $$1, $$2);
      this.v = $$0;
   }

   public dtr(jg $$0, dvd $$1) {
      super(dsi.x, $$0, $$1);
      this.v = dox.a($$1.b());
   }

   public static void a(dev $$0, jg $$1, dvd $$2, dtr $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(dev $$0, jg $$1, dvd $$2) {
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
               this.s = dtr.a.c;
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
               this.s = dtr.a.a;
               this.t = 0.0F;
               d($$0, $$1, $$2);
            }
      }
   }

   public dtr.a k() {
      return this.s;
   }

   public ezc a(dvd $$0) {
      return cls.a(1.0F, $$0.c(dox.b), 0.5F * this.a(1.0F));
   }

   private void c(dev $$0, jg $$1, dvd $$2) {
      if ($$2.b() instanceof dox) {
         jl $$3 = $$2.c(dox.b);
         ezc $$4 = cls.a(1.0F, $$3, this.u, this.t).a($$1);
         List<btz> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (btz $$6 : $$5) {
               if ($$6.k_() != erj.d) {
                  $$6.a(buz.d, new ezh(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
            this.s = dtr.a.d;
         }

         if ($$1 == 1) {
            this.s = dtr.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(dev $$0, jg $$1, dvd $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void d_(coh $$0) {
      if (!this.q && !$$0.R_()) {
         if (this.r < 0) {
            this.r = 0;
         }

         this.r++;
         this.o.a(this.p, this.m().b(), 1, this.r);
         if (this.r == 1) {
            this.o.a($$0, eaa.k, this.p);
            this.o.a(null, this.p, awk.wM, awl.e, 0.5F, this.o.A.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(coh $$0) {
      if (!this.q && !$$0.R_()) {
         this.r--;
         this.o.a(this.p, this.m().b(), 1, this.r);
         if (this.r <= 0) {
            this.o.a($$0, eaa.j, this.p);
            this.o.a(null, this.p, awk.wL, awl.e, 0.5F, this.o.A.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected xh j() {
      return xh.c("container.shulkerBox");
   }

   @Override
   protected void a(uj $$0, jr.a $$1) {
      super.a($$0, $$1);
      this.e($$0, $$1);
   }

   @Override
   protected void b(uj $$0, jr.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         brs.a($$0, this.n, false, $$1);
      }
   }

   public void e(uj $$0, jr.a $$1) {
      this.n = jy.a(this.b(), cvx.k);
      if (!this.b_($$0) && $$0.b("Items", 9)) {
         brs.b($$0, this.n, $$1);
      }
   }

   @Override
   protected jy<cvx> f() {
      return this.n;
   }

   @Override
   protected void a(jy<cvx> $$0) {
      this.n = $$0;
   }

   @Override
   public int[] a(jl $$0) {
      return k;
   }

   @Override
   public boolean a(int $$0, cvx $$1, @Nullable jl $$2) {
      return !(dhy.a($$1.h()) instanceof dox);
   }

   @Override
   public boolean b(int $$0, cvx $$1, jl $$2) {
      return true;
   }

   public float a(float $$0) {
      return azj.h($$0, this.u, this.t);
   }

   @Nullable
   public cuu t() {
      return this.v;
   }

   @Override
   protected crj a(int $$0, cog $$1) {
      return new ctd($$0, $$1, this);
   }

   public boolean u() {
      return this.s == dtr.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
