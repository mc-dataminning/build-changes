import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dvm extends dvi implements bsv {
   public static final int d = 9;
   public static final int e = 3;
   public static final int f = 27;
   public static final int g = 1;
   public static final int h = 10;
   public static final float i = 0.5F;
   public static final float j = 270.0F;
   private static final int[] k = IntStream.range(0, 27).toArray();
   private ka<cwq> q = ka.a(27, cwq.j);
   private int r;
   private dvm.a s = dvm.a.a;
   private float t;
   private float u;
   @Nullable
   private final cvn v;

   public dvm(@Nullable cvn $$0, ji $$1, dwy $$2) {
      super(duc.y, $$1, $$2);
      this.v = $$0;
   }

   public dvm(ji $$0, dwy $$1) {
      super(duc.y, $$0, $$1);
      this.v = $$1.b() instanceof dqr $$2 ? $$2.b() : null;
   }

   public static void a(dgj $$0, ji $$1, dwy $$2, dvm $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(dgj $$0, ji $$1, dwy $$2) {
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
               this.s = dvm.a.c;
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
               this.s = dvm.a.a;
               this.t = 0.0F;
               d($$0, $$1, $$2);
            }
      }
   }

   public dvm.a k() {
      return this.s;
   }

   public faw a(dwy $$0) {
      fbb $$1 = new fbb(0.5, 0.0, 0.5);
      return cmf.a(1.0F, $$0.c(dqr.b), 0.5F * this.a(1.0F), $$1);
   }

   private void c(dgj $$0, ji $$1, dwy $$2) {
      if ($$2.b() instanceof dqr) {
         jn $$3 = $$2.c(dqr.b);
         faw $$4 = cmf.a(1.0F, $$3, this.u, this.t, $$1.c());
         List<bum> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (bum $$6 : $$5) {
               if ($$6.n_() != etf.d) {
                  $$6.a(bvm.d, new fbb(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
            this.s = dvm.a.d;
         }

         if ($$1 == 1) {
            this.s = dvm.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(dgj $$0, ji $$1, dwy $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void c_(coy $$0) {
      if (!this.p && !$$0.Z_()) {
         if (this.r < 0) {
            this.r = 0;
         }

         this.r++;
         this.n.a(this.o, this.m().b(), 1, this.r);
         if (this.r == 1) {
            this.n.a($$0, ebu.k, this.o);
            this.n.a(null, this.o, awa.xn, awb.e, 0.5F, this.n.A.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(coy $$0) {
      if (!this.p && !$$0.Z_()) {
         this.r--;
         this.n.a(this.o, this.m().b(), 1, this.r);
         if (this.r <= 0) {
            this.n.a($$0, ebu.j, this.o);
            this.n.a(null, this.o, awa.xm, awb.e, 0.5F, this.n.A.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected wp j() {
      return wp.c("container.shulkerBox");
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.e($$0, $$1);
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bsf.a($$0, this.q, false, $$1);
      }
   }

   public void e(tq $$0, jt.a $$1) {
      this.q = ka.a(this.b(), cwq.j);
      if (!this.b_($$0) && $$0.b("Items", 9)) {
         bsf.b($$0, this.q, $$1);
      }
   }

   @Override
   protected ka<cwq> f() {
      return this.q;
   }

   @Override
   protected void a(ka<cwq> $$0) {
      this.q = $$0;
   }

   @Override
   public int[] a(jn $$0) {
      return k;
   }

   @Override
   public boolean a(int $$0, cwq $$1, @Nullable jn $$2) {
      return !(djn.a($$1.h()) instanceof dqr);
   }

   @Override
   public boolean b(int $$0, cwq $$1, jn $$2) {
      return true;
   }

   public float a(float $$0) {
      return ayz.h($$0, this.u, this.t);
   }

   @Nullable
   public cvn s() {
      return this.v;
   }

   @Override
   protected csd a(int $$0, cox $$1) {
      return new ctx($$0, $$1, this);
   }

   public boolean t() {
      return this.s == dvm.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
