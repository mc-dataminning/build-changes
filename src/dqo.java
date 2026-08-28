import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dqo extends dqk implements bre {
   public static final int d = 9;
   public static final int e = 3;
   public static final int f = 27;
   public static final int g = 1;
   public static final int h = 10;
   public static final float i = 0.5F;
   public static final float j = 270.0F;
   private static final int[] k = IntStream.range(0, 27).toArray();
   private jr<cun> q = jr.a(27, cun.l);
   private int r;
   private dqo.a s = dqo.a.a;
   private float t;
   private float u;
   @Nullable
   private final ctg v;

   public dqo(@Nullable ctg $$0, iz $$1, dsa $$2) {
      super(dph.x, $$1, $$2);
      this.v = $$0;
   }

   public dqo(iz $$0, dsa $$1) {
      super(dph.x, $$0, $$1);
      this.v = dlw.a($$1.b());
   }

   public static void a(dbw $$0, iz $$1, dsa $$2, dqo $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(dbw $$0, iz $$1, dsa $$2) {
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
               this.s = dqo.a.c;
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
               this.s = dqo.a.a;
               this.t = 0.0F;
               d($$0, $$1, $$2);
            }
      }
   }

   public dqo.a l() {
      return this.s;
   }

   public evk a(dsa $$0) {
      return ckh.a(1.0F, $$0.c(dlw.b), 0.5F * this.a(1.0F));
   }

   private void c(dbw $$0, iz $$1, dsa $$2) {
      if ($$2.b() instanceof dlw) {
         je $$3 = $$2.c(dlw.b);
         evk $$4 = ckh.a(1.0F, $$3, this.u, this.t).a($$1);
         List<bss> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (bss $$6 : $$5) {
               if ($$6.k_() != eny.d) {
                  $$6.a(bts.d, new evp(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
            this.s = dqo.a.d;
         }

         if ($$1 == 1) {
            this.s = dqo.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(dbw $$0, iz $$1, dsa $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void d_(cmv $$0) {
      if (!this.p && !$$0.N_()) {
         if (this.r < 0) {
            this.r = 0;
         }

         this.r++;
         this.n.a(this.o, this.n().b(), 1, this.r);
         if (this.r == 1) {
            this.n.a($$0, dwt.k, this.o);
            this.n.a(null, this.o, avz.wK, awa.e, 0.5F, this.n.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cmv $$0) {
      if (!this.p && !$$0.N_()) {
         this.r--;
         this.n.a(this.o, this.n().b(), 1, this.r);
         if (this.r <= 0) {
            this.n.a($$0, dwt.j, this.o);
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
         bqm.a($$0, this.q, false, $$1);
      }
   }

   public void e(ur $$0, jk.a $$1) {
      this.q = jr.a(this.b(), cun.l);
      if (!this.a_($$0) && $$0.b("Items", 9)) {
         bqm.b($$0, this.q, $$1);
      }
   }

   @Override
   protected jr<cun> j() {
      return this.q;
   }

   @Override
   protected void a(jr<cun> $$0) {
      this.q = $$0;
   }

   @Override
   public int[] a(je $$0) {
      return k;
   }

   @Override
   public boolean a(int $$0, cun $$1, @Nullable je $$2) {
      return !(dex.a($$1.g()) instanceof dlw);
   }

   @Override
   public boolean b(int $$0, cun $$1, je $$2) {
      return true;
   }

   public float a(float $$0) {
      return ayx.i($$0, this.u, this.t);
   }

   @Nullable
   public ctg u() {
      return this.v;
   }

   @Override
   protected cps a(int $$0, cmu $$1) {
      return new crk($$0, $$1, this);
   }

   public boolean v() {
      return this.s == dqo.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
