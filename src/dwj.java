import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dwj extends dwf implements btt {
   public static final int d = 9;
   public static final int e = 3;
   public static final int f = 27;
   public static final int g = 1;
   public static final int h = 10;
   public static final float i = 0.5F;
   public static final float j = 270.0F;
   private static final int[] k = IntStream.range(0, 27).toArray();
   private jz<cxp> n = jz.a(27, cxp.j);
   private int r;
   private dwj.a s = dwj.a.a;
   private float t;
   private float u;
   @Nullable
   private final cwm v;

   public dwj(@Nullable cwm $$0, jh $$1, dxv $$2) {
      super(duz.y, $$1, $$2);
      this.v = $$0;
   }

   public dwj(jh $$0, dxv $$1) {
      super(duz.y, $$0, $$1);
      this.v = dro.a($$1.b());
   }

   public static void a(dhi $$0, jh $$1, dxv $$2, dwj $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(dhi $$0, jh $$1, dxv $$2) {
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
               this.s = dwj.a.c;
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
               this.s = dwj.a.a;
               this.t = 0.0F;
               d($$0, $$1, $$2);
            }
      }
   }

   public dwj.a k() {
      return this.s;
   }

   public fbt a(dxv $$0) {
      return cnd.a(1.0F, $$0.c(dro.b), 0.5F * this.a(1.0F));
   }

   private void c(dhi $$0, jh $$1, dxv $$2) {
      if ($$2.b() instanceof dro) {
         jm $$3 = $$2.c(dro.b);
         fbt $$4 = cnd.a(1.0F, $$3, this.u, this.t).a($$1);
         List<bvk> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (bvk $$6 : $$5) {
               if ($$6.n_() != euc.d) {
                  $$6.a(bwk.d, new fby(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
            this.s = dwj.a.d;
         }

         if ($$1 == 1) {
            this.s = dwj.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(dhi $$0, jh $$1, dxv $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void c_(cpx $$0) {
      if (!this.q && !$$0.aa_()) {
         if (this.r < 0) {
            this.r = 0;
         }

         this.r++;
         this.o.a(this.p, this.m().b(), 1, this.r);
         if (this.r == 1) {
            this.o.a($$0, ecr.k, this.p);
            this.o.a(null, this.p, axf.xh, axg.e, 0.5F, this.o.A.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cpx $$0) {
      if (!this.q && !$$0.aa_()) {
         this.r--;
         this.o.a(this.p, this.m().b(), 1, this.r);
         if (this.r <= 0) {
            this.o.a($$0, ecr.j, this.p);
            this.o.a(null, this.p, axf.xg, axg.e, 0.5F, this.o.A.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected xv j() {
      return xv.c("container.shulkerBox");
   }

   @Override
   protected void a(ux $$0, js.a $$1) {
      super.a($$0, $$1);
      this.e($$0, $$1);
   }

   @Override
   protected void b(ux $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         btd.a($$0, this.n, false, $$1);
      }
   }

   public void e(ux $$0, js.a $$1) {
      this.n = jz.a(this.b(), cxp.j);
      if (!this.b_($$0) && $$0.b("Items", 9)) {
         btd.b($$0, this.n, $$1);
      }
   }

   @Override
   protected jz<cxp> f() {
      return this.n;
   }

   @Override
   protected void a(jz<cxp> $$0) {
      this.n = $$0;
   }

   @Override
   public int[] a(jm $$0) {
      return k;
   }

   @Override
   public boolean a(int $$0, cxp $$1, @Nullable jm $$2) {
      return !(dkm.a($$1.h()) instanceof dro);
   }

   @Override
   public boolean b(int $$0, cxp $$1, jm $$2) {
      return true;
   }

   public float a(float $$0) {
      return bae.h($$0, this.u, this.t);
   }

   @Nullable
   public cwm t() {
      return this.v;
   }

   @Override
   protected ctc a(int $$0, cpw $$1) {
      return new cuw($$0, $$1, this);
   }

   public boolean u() {
      return this.s == dwj.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
