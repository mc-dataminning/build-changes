import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dqw extends dqs implements bqp {
   public static final int d = 9;
   public static final int e = 3;
   public static final int f = 27;
   public static final int g = 1;
   public static final int h = 10;
   public static final float i = 0.5F;
   public static final float j = 270.0F;
   private static final int[] k = IntStream.range(0, 27).toArray();
   private js<cua> q = js.a(27, cua.l);
   private int r;
   private dqw.a s = dqw.a.a;
   private float t;
   private float u;
   @Nullable
   private final cst v;

   public dqw(@Nullable cst $$0, ja $$1, dsh $$2) {
      super(dpp.x, $$1, $$2);
      this.v = $$0;
   }

   public dqw(ja $$0, dsh $$1) {
      super(dpp.x, $$0, $$1);
      this.v = dme.a($$1.b());
   }

   public static void a(dcd $$0, ja $$1, dsh $$2, dqw $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(dcd $$0, ja $$1, dsh $$2) {
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
               this.s = dqw.a.c;
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
               this.s = dqw.a.a;
               this.t = 0.0F;
               d($$0, $$1, $$2);
            }
      }
   }

   public dqw.a l() {
      return this.s;
   }

   public evu a(dsh $$0) {
      return cjt.a(1.0F, $$0.c(dme.b), 0.5F * this.a(1.0F));
   }

   private void c(dcd $$0, ja $$1, dsh $$2) {
      if ($$2.b() instanceof dme) {
         jf $$3 = $$2.c(dme.b);
         evu $$4 = cjt.a(1.0F, $$3, this.u, this.t).a($$1);
         List<bsd> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (bsd $$6 : $$5) {
               if ($$6.k_() != eog.d) {
                  $$6.a(btd.d, new evz(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
            this.s = dqw.a.d;
         }

         if ($$1 == 1) {
            this.s = dqw.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(dcd $$0, ja $$1, dsh $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void d_(cmh $$0) {
      if (!this.p && !$$0.N_()) {
         if (this.r < 0) {
            this.r = 0;
         }

         this.r++;
         this.n.a(this.o, this.n().b(), 1, this.r);
         if (this.r == 1) {
            this.n.a($$0, dxa.k, this.o);
            this.n.a(null, this.o, avf.wN, avg.e, 0.5F, this.n.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cmh $$0) {
      if (!this.p && !$$0.N_()) {
         this.r--;
         this.n.a(this.o, this.n().b(), 1, this.r);
         if (this.r <= 0) {
            this.n.a($$0, dxa.j, this.o);
            this.n.a(null, this.o, avf.wM, avg.e, 0.5F, this.n.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected wu k() {
      return wu.c("container.shulkerBox");
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      this.e($$0, $$1);
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bpx.a($$0, this.q, false, $$1);
      }
   }

   public void e(tx $$0, jl.a $$1) {
      this.q = js.a(this.b(), cua.l);
      if (!this.a_($$0) && $$0.b("Items", 9)) {
         bpx.b($$0, this.q, $$1);
      }
   }

   @Override
   protected js<cua> j() {
      return this.q;
   }

   @Override
   protected void a(js<cua> $$0) {
      this.q = $$0;
   }

   @Override
   public int[] a(jf $$0) {
      return k;
   }

   @Override
   public boolean a(int $$0, cua $$1, @Nullable jf $$2) {
      return !(dff.a($$1.g()) instanceof dme);
   }

   @Override
   public boolean b(int $$0, cua $$1, jf $$2) {
      return true;
   }

   public float a(float $$0) {
      return aye.i($$0, this.u, this.t);
   }

   @Nullable
   public cst u() {
      return this.v;
   }

   @Override
   protected cpe a(int $$0, cmg $$1) {
      return new cqx($$0, $$1, this);
   }

   public boolean v() {
      return this.s == dqw.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
