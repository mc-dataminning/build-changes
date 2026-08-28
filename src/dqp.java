import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dqp extends dql implements brf {
   public static final int d = 9;
   public static final int e = 3;
   public static final int f = 27;
   public static final int g = 1;
   public static final int h = 10;
   public static final float i = 0.5F;
   public static final float j = 270.0F;
   private static final int[] k = IntStream.range(0, 27).toArray();
   private jr<cuo> q = jr.a(27, cuo.l);
   private int r;
   private dqp.a s = dqp.a.a;
   private float t;
   private float u;
   @Nullable
   private final cth v;

   public dqp(@Nullable cth $$0, iz $$1, dsb $$2) {
      super(dpi.x, $$1, $$2);
      this.v = $$0;
   }

   public dqp(iz $$0, dsb $$1) {
      super(dpi.x, $$0, $$1);
      this.v = dlx.a($$1.b());
   }

   public static void a(dbx $$0, iz $$1, dsb $$2, dqp $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(dbx $$0, iz $$1, dsb $$2) {
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
               this.s = dqp.a.c;
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
               this.s = dqp.a.a;
               this.t = 0.0F;
               d($$0, $$1, $$2);
            }
      }
   }

   public dqp.a l() {
      return this.s;
   }

   public evl a(dsb $$0) {
      return cki.a(1.0F, $$0.c(dlx.b), 0.5F * this.a(1.0F));
   }

   private void c(dbx $$0, iz $$1, dsb $$2) {
      if ($$2.b() instanceof dlx) {
         je $$3 = $$2.c(dlx.b);
         evl $$4 = cki.a(1.0F, $$3, this.u, this.t).a($$1);
         List<bst> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (bst $$6 : $$5) {
               if ($$6.k_() != enz.d) {
                  $$6.a(btt.d, new evq(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
               }
            }
         }
      }
   }

   @Override
   public int b() {
      return this.q.size();
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.r = $$1;
         if ($$1 == 0) {
            this.s = dqp.a.d;
         }

         if ($$1 == 1) {
            this.s = dqp.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(dbx $$0, iz $$1, dsb $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void d_(cmw $$0) {
      if (!this.p && !$$0.N_()) {
         if (this.r < 0) {
            this.r = 0;
         }

         this.r++;
         this.n.a(this.o, this.n().b(), 1, this.r);
         if (this.r == 1) {
            this.n.a($$0, dwu.k, this.o);
            this.n.a(null, this.o, avz.wK, awa.e, 0.5F, this.n.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cmw $$0) {
      if (!this.p && !$$0.N_()) {
         this.r--;
         this.n.a(this.o, this.n().b(), 1, this.r);
         if (this.r <= 0) {
            this.n.a($$0, dwu.j, this.o);
            this.n.a(null, this.o, avz.wJ, awa.e, 0.5F, this.n.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected xo k() {
      return xo.c("container.shulkerBox");
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.e($$0, $$1);
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bqn.a($$0, this.q, false, $$1);
      }
   }

   public void e(ur $$0, jk.a $$1) {
      this.q = jr.a(this.b(), cuo.l);
      if (!this.a_($$0) && $$0.b("Items", 9)) {
         bqn.b($$0, this.q, $$1);
      }
   }

   @Override
   protected jr<cuo> j() {
      return this.q;
   }

   @Override
   protected void a(jr<cuo> $$0) {
      this.q = $$0;
   }

   @Override
   public int[] a(je $$0) {
      return k;
   }

   @Override
   public boolean a(int $$0, cuo $$1, @Nullable je $$2) {
      return !(dey.a($$1.g()) instanceof dlx);
   }

   @Override
   public boolean b(int $$0, cuo $$1, je $$2) {
      return true;
   }

   public float a(float $$0) {
      return ayy.i($$0, this.u, this.t);
   }

   @Nullable
   public cth u() {
      return this.v;
   }

   @Override
   protected cpt a(int $$0, cmv $$1) {
      return new crl($$0, $$1, this);
   }

   public boolean v() {
      return this.s == dqp.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
