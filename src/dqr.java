import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dqr extends dqn implements brh {
   public static final int d = 9;
   public static final int e = 3;
   public static final int f = 27;
   public static final int g = 1;
   public static final int h = 10;
   public static final float i = 0.5F;
   public static final float j = 270.0F;
   private static final int[] k = IntStream.range(0, 27).toArray();
   private jr<cuq> q = jr.a(27, cuq.l);
   private int r;
   private dqr.a s = dqr.a.a;
   private float t;
   private float u;
   @Nullable
   private final ctj v;

   public dqr(@Nullable ctj $$0, iz $$1, dsd $$2) {
      super(dpk.x, $$1, $$2);
      this.v = $$0;
   }

   public dqr(iz $$0, dsd $$1) {
      super(dpk.x, $$0, $$1);
      this.v = dlz.a($$1.b());
   }

   public static void a(dbz $$0, iz $$1, dsd $$2, dqr $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(dbz $$0, iz $$1, dsd $$2) {
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
               this.s = dqr.a.c;
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
               this.s = dqr.a.a;
               this.t = 0.0F;
               d($$0, $$1, $$2);
            }
      }
   }

   public dqr.a l() {
      return this.s;
   }

   public evn a(dsd $$0) {
      return ckk.a(1.0F, $$0.c(dlz.b), 0.5F * this.a(1.0F));
   }

   private void c(dbz $$0, iz $$1, dsd $$2) {
      if ($$2.b() instanceof dlz) {
         je $$3 = $$2.c(dlz.b);
         evn $$4 = ckk.a(1.0F, $$3, this.u, this.t).a($$1);
         List<bsv> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (bsv $$6 : $$5) {
               if ($$6.k_() != eob.d) {
                  $$6.a(btv.d, new evs(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
            this.s = dqr.a.d;
         }

         if ($$1 == 1) {
            this.s = dqr.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(dbz $$0, iz $$1, dsd $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void d_(cmy $$0) {
      if (!this.p && !$$0.N_()) {
         if (this.r < 0) {
            this.r = 0;
         }

         this.r++;
         this.n.a(this.o, this.n().b(), 1, this.r);
         if (this.r == 1) {
            this.n.a($$0, dww.k, this.o);
            this.n.a(null, this.o, awa.wK, awb.e, 0.5F, this.n.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cmy $$0) {
      if (!this.p && !$$0.N_()) {
         this.r--;
         this.n.a(this.o, this.n().b(), 1, this.r);
         if (this.r <= 0) {
            this.n.a($$0, dww.j, this.o);
            this.n.a(null, this.o, awa.wJ, awb.e, 0.5F, this.n.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected xp k() {
      return xp.c("container.shulkerBox");
   }

   @Override
   protected void a(us $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.e($$0, $$1);
   }

   @Override
   protected void b(us $$0, jk.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bqp.a($$0, this.q, false, $$1);
      }
   }

   public void e(us $$0, jk.a $$1) {
      this.q = jr.a(this.b(), cuq.l);
      if (!this.a_($$0) && $$0.b("Items", 9)) {
         bqp.b($$0, this.q, $$1);
      }
   }

   @Override
   protected jr<cuq> j() {
      return this.q;
   }

   @Override
   protected void a(jr<cuq> $$0) {
      this.q = $$0;
   }

   @Override
   public int[] a(je $$0) {
      return k;
   }

   @Override
   public boolean a(int $$0, cuq $$1, @Nullable je $$2) {
      return !(dfa.a($$1.g()) instanceof dlz);
   }

   @Override
   public boolean b(int $$0, cuq $$1, je $$2) {
      return true;
   }

   public float a(float $$0) {
      return ayz.i($$0, this.u, this.t);
   }

   @Nullable
   public ctj u() {
      return this.v;
   }

   @Override
   protected cpv a(int $$0, cmx $$1) {
      return new crn($$0, $$1, this);
   }

   public boolean v() {
      return this.s == dqr.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
