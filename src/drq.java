import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class drq extends drm implements bqm {
   public static final int d = 9;
   public static final int e = 3;
   public static final int f = 27;
   public static final int g = 1;
   public static final int h = 10;
   public static final float i = 0.5F;
   public static final float j = 270.0F;
   private static final int[] k = IntStream.range(0, 27).toArray();
   private jj<cuh> q = jj.a(27, cuh.i);
   private int r;
   private drq.a s = drq.a.a;
   private float t;
   private float u;
   @Nullable
   private final csy v;

   public drq(@Nullable csy $$0, ir $$1, dtc $$2) {
      super(dqe.y, $$1, $$2);
      this.v = $$0;
   }

   public drq(ir $$0, dtc $$1) {
      super(dqe.y, $$0, $$1);
      this.v = dmp.a($$1.b());
   }

   public static void a(dca $$0, ir $$1, dtc $$2, drq $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(dca $$0, ir $$1, dtc $$2) {
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
               this.s = drq.a.c;
               this.t = 1.0F;
               d($$0, $$1, $$2);
            }

            this.c($$0, $$1, $$2);
            break;
         case d:
            this.t -= 0.1F;
            if (this.u == 1.0F) {
               d($$0, $$1, $$2);
            }

            if (this.t <= 0.0F) {
               this.s = drq.a.a;
               this.t = 0.0F;
               d($$0, $$1, $$2);
            }
            break;
         case c:
            this.t = 1.0F;
      }
   }

   public drq.a l() {
      return this.s;
   }

   public ewp a(dtc $$0) {
      return cjk.a(1.0F, $$0.c(dmp.b), 0.5F * this.a(1.0F));
   }

   private void c(dca $$0, ir $$1, dtc $$2) {
      if ($$2.b() instanceof dmp) {
         iw $$3 = $$2.c(dmp.b);
         ewp $$4 = cjk.a(1.0F, $$3, this.u, this.t).a($$1);
         List<brv> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (brv $$6 : $$5) {
               if ($$6.j_() != epj.d) {
                  $$6.a(bst.d, new ewu(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
   public boolean b_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.r = $$1;
         if ($$1 == 0) {
            this.s = drq.a.d;
         }

         if ($$1 == 1) {
            this.s = drq.a.b;
         }

         return true;
      } else {
         return super.b_($$0, $$1);
      }
   }

   private static void d(dca $$0, ir $$1, dtc $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void d_(cly $$0) {
      if (!this.p && !$$0.O_()) {
         if (this.r < 0) {
            this.r = 0;
         }

         this.r++;
         this.n.a(this.o, this.n().b(), 1, this.r);
         if (this.r == 1) {
            this.n.a($$0, dxv.k, this.o);
            this.n.a(null, this.o, avo.xi, avq.e, 0.5F, this.n.A.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cly $$0) {
      if (!this.p && !$$0.O_()) {
         this.r--;
         this.n.a(this.o, this.n().b(), 1, this.r);
         if (this.r <= 0) {
            this.n.a($$0, dxv.j, this.o);
            this.n.a(null, this.o, avo.xh, avq.e, 0.5F, this.n.A.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected xe k() {
      return xe.c("container.shulkerBox");
   }

   @Override
   public void a(uk $$0, jc.a $$1) {
      super.a($$0, $$1);
      this.c($$0, $$1);
   }

   @Override
   protected void b(uk $$0, jc.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bpu.a($$0, this.q, false, $$1);
      }
   }

   public void c(uk $$0, jc.a $$1) {
      this.q = jj.a(this.b(), cuh.i);
      if (!this.a_($$0) && $$0.b("Items", 9)) {
         bpu.b($$0, this.q, $$1);
      }
   }

   @Override
   protected jj<cuh> j() {
      return this.q;
   }

   @Override
   protected void a(jj<cuh> $$0) {
      this.q = $$0;
   }

   @Override
   public int[] a(iw $$0) {
      return k;
   }

   @Override
   public boolean a(int $$0, cuh $$1, @Nullable iw $$2) {
      return !(dfc.a($$1.f()) instanceof dmp);
   }

   @Override
   public boolean b(int $$0, cuh $$1, iw $$2) {
      return true;
   }

   public float a(float $$0) {
      return aym.i($$0, this.u, this.t);
   }

   @Nullable
   public csy t() {
      return this.v;
   }

   @Override
   protected cpg a(int $$0, clx $$1) {
      return new crb($$0, $$1, this);
   }

   public boolean u() {
      return this.s == drq.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
