import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dqs extends dqo implements bri {
   public static final int d = 9;
   public static final int e = 3;
   public static final int f = 27;
   public static final int g = 1;
   public static final int h = 10;
   public static final float i = 0.5F;
   public static final float j = 270.0F;
   private static final int[] k = IntStream.range(0, 27).toArray();
   private jr<cur> q = jr.a(27, cur.l);
   private int r;
   private dqs.a s = dqs.a.a;
   private float t;
   private float u;
   @Nullable
   private final ctk v;

   public dqs(@Nullable ctk $$0, iz $$1, dse $$2) {
      super(dpl.x, $$1, $$2);
      this.v = $$0;
   }

   public dqs(iz $$0, dse $$1) {
      super(dpl.x, $$0, $$1);
      this.v = dma.a($$1.b());
   }

   public static void a(dca $$0, iz $$1, dse $$2, dqs $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(dca $$0, iz $$1, dse $$2) {
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
               this.s = dqs.a.c;
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
               this.s = dqs.a.a;
               this.t = 0.0F;
               d($$0, $$1, $$2);
            }
      }
   }

   public dqs.a l() {
      return this.s;
   }

   public evo a(dse $$0) {
      return ckl.a(1.0F, $$0.c(dma.b), 0.5F * this.a(1.0F));
   }

   private void c(dca $$0, iz $$1, dse $$2) {
      if ($$2.b() instanceof dma) {
         je $$3 = $$2.c(dma.b);
         evo $$4 = ckl.a(1.0F, $$3, this.u, this.t).a($$1);
         List<bsw> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (bsw $$6 : $$5) {
               if ($$6.k_() != eoc.d) {
                  $$6.a(btw.d, new evt(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
            this.s = dqs.a.d;
         }

         if ($$1 == 1) {
            this.s = dqs.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(dca $$0, iz $$1, dse $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void d_(cmz $$0) {
      if (!this.p && !$$0.N_()) {
         if (this.r < 0) {
            this.r = 0;
         }

         this.r++;
         this.n.a(this.o, this.n().b(), 1, this.r);
         if (this.r == 1) {
            this.n.a($$0, dwx.k, this.o);
            this.n.a(null, this.o, awa.wK, awb.e, 0.5F, this.n.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cmz $$0) {
      if (!this.p && !$$0.N_()) {
         this.r--;
         this.n.a(this.o, this.n().b(), 1, this.r);
         if (this.r <= 0) {
            this.n.a($$0, dwx.j, this.o);
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
         bqq.a($$0, this.q, false, $$1);
      }
   }

   public void e(us $$0, jk.a $$1) {
      this.q = jr.a(this.b(), cur.l);
      if (!this.a_($$0) && $$0.b("Items", 9)) {
         bqq.b($$0, this.q, $$1);
      }
   }

   @Override
   protected jr<cur> j() {
      return this.q;
   }

   @Override
   protected void a(jr<cur> $$0) {
      this.q = $$0;
   }

   @Override
   public int[] a(je $$0) {
      return k;
   }

   @Override
   public boolean a(int $$0, cur $$1, @Nullable je $$2) {
      return !(dfb.a($$1.g()) instanceof dma);
   }

   @Override
   public boolean b(int $$0, cur $$1, je $$2) {
      return true;
   }

   public float a(float $$0) {
      return ayz.i($$0, this.u, this.t);
   }

   @Nullable
   public ctk u() {
      return this.v;
   }

   @Override
   protected cpw a(int $$0, cmy $$1) {
      return new cro($$0, $$1, this);
   }

   public boolean v() {
      return this.s == dqs.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
