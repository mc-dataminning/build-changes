import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dwc extends dvy implements btk {
   public static final int d = 9;
   public static final int e = 3;
   public static final int f = 27;
   public static final int g = 1;
   public static final int h = 10;
   public static final float i = 0.5F;
   public static final float j = 270.0F;
   private static final int[] k = IntStream.range(0, 27).toArray();
   private jz<cxg> n = jz.a(27, cxg.j);
   private int r;
   private dwc.a s = dwc.a.a;
   private float t;
   private float u;
   @Nullable
   private final cwd v;

   public dwc(@Nullable cwd $$0, jh $$1, dxo $$2) {
      super(dus.y, $$1, $$2);
      this.v = $$0;
   }

   public dwc(jh $$0, dxo $$1) {
      super(dus.y, $$0, $$1);
      this.v = drh.a($$1.b());
   }

   public static void a(dgz $$0, jh $$1, dxo $$2, dwc $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(dgz $$0, jh $$1, dxo $$2) {
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
               this.s = dwc.a.c;
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
               this.s = dwc.a.a;
               this.t = 0.0F;
               d($$0, $$1, $$2);
            }
      }
   }

   public dwc.a k() {
      return this.s;
   }

   public fbm a(dxo $$0) {
      return cmu.a(1.0F, $$0.c(drh.b), 0.5F * this.a(1.0F));
   }

   private void c(dgz $$0, jh $$1, dxo $$2) {
      if ($$2.b() instanceof drh) {
         jm $$3 = $$2.c(drh.b);
         fbm $$4 = cmu.a(1.0F, $$3, this.u, this.t).a($$1);
         List<bvb> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (bvb $$6 : $$5) {
               if ($$6.n_() != etv.d) {
                  $$6.a(bwb.d, new fbr(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
            this.s = dwc.a.d;
         }

         if ($$1 == 1) {
            this.s = dwc.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(dgz $$0, jh $$1, dxo $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void c_(cpo $$0) {
      if (!this.q && !$$0.aa_()) {
         if (this.r < 0) {
            this.r = 0;
         }

         this.r++;
         this.o.a(this.p, this.m().b(), 1, this.r);
         if (this.r == 1) {
            this.o.a($$0, eck.k, this.p);
            this.o.a(null, this.p, awv.xn, aww.e, 0.5F, this.o.A.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cpo $$0) {
      if (!this.q && !$$0.aa_()) {
         this.r--;
         this.o.a(this.p, this.m().b(), 1, this.r);
         if (this.r <= 0) {
            this.o.a($$0, eck.j, this.p);
            this.o.a(null, this.p, awv.xm, aww.e, 0.5F, this.o.A.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected xk j() {
      return xk.c("container.shulkerBox");
   }

   @Override
   protected void a(um $$0, js.a $$1) {
      super.a($$0, $$1);
      this.e($$0, $$1);
   }

   @Override
   protected void b(um $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bsu.a($$0, this.n, false, $$1);
      }
   }

   public void e(um $$0, js.a $$1) {
      this.n = jz.a(this.b(), cxg.j);
      if (!this.b_($$0) && $$0.b("Items", 9)) {
         bsu.b($$0, this.n, $$1);
      }
   }

   @Override
   protected jz<cxg> f() {
      return this.n;
   }

   @Override
   protected void a(jz<cxg> $$0) {
      this.n = $$0;
   }

   @Override
   public int[] a(jm $$0) {
      return k;
   }

   @Override
   public boolean a(int $$0, cxg $$1, @Nullable jm $$2) {
      return !(dkd.a($$1.h()) instanceof drh);
   }

   @Override
   public boolean b(int $$0, cxg $$1, jm $$2) {
      return true;
   }

   public float a(float $$0) {
      return azu.h($$0, this.u, this.t);
   }

   @Nullable
   public cwd s() {
      return this.v;
   }

   @Override
   protected cst a(int $$0, cpn $$1) {
      return new cun($$0, $$1, this);
   }

   public boolean t() {
      return this.s == dwc.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
