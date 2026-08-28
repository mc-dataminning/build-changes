import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dvk extends dvg implements bst {
   public static final int d = 9;
   public static final int e = 3;
   public static final int f = 27;
   public static final int g = 1;
   public static final int h = 10;
   public static final float i = 0.5F;
   public static final float j = 270.0F;
   private static final int[] k = IntStream.range(0, 27).toArray();
   private ka<cwo> n = ka.a(27, cwo.j);
   private int r;
   private dvk.a s = dvk.a.a;
   private float t;
   private float u;
   @Nullable
   private final cvl v;

   public dvk(@Nullable cvl $$0, ji $$1, dww $$2) {
      super(dua.y, $$1, $$2);
      this.v = $$0;
   }

   public dvk(ji $$0, dww $$1) {
      super(dua.y, $$0, $$1);
      this.v = $$1.b() instanceof dqp $$2 ? $$2.b() : null;
   }

   public static void a(dgh $$0, ji $$1, dww $$2, dvk $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(dgh $$0, ji $$1, dww $$2) {
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
               this.s = dvk.a.c;
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
               this.s = dvk.a.a;
               this.t = 0.0F;
               d($$0, $$1, $$2);
            }
      }
   }

   public dvk.a k() {
      return this.s;
   }

   public fau a(dww $$0) {
      faz $$1 = new faz(0.5, 0.0, 0.5);
      return cmd.a(1.0F, $$0.c(dqp.b), 0.5F * this.a(1.0F), $$1);
   }

   private void c(dgh $$0, ji $$1, dww $$2) {
      if ($$2.b() instanceof dqp) {
         jn $$3 = $$2.c(dqp.b);
         fau $$4 = cmd.a(1.0F, $$3, this.u, this.t, $$1.c());
         List<buk> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (buk $$6 : $$5) {
               if ($$6.n_() != etd.d) {
                  $$6.a(bvk.d, new faz(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
            this.s = dvk.a.d;
         }

         if ($$1 == 1) {
            this.s = dvk.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(dgh $$0, ji $$1, dww $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void c_(cow $$0) {
      if (!this.q && !$$0.Z_()) {
         if (this.r < 0) {
            this.r = 0;
         }

         this.r++;
         this.o.a(this.p, this.m().b(), 1, this.r);
         if (this.r == 1) {
            this.o.a($$0, ebs.k, this.p);
            this.o.a(null, this.p, awa.xn, awb.e, 0.5F, this.o.A.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cow $$0) {
      if (!this.q && !$$0.Z_()) {
         this.r--;
         this.o.a(this.p, this.m().b(), 1, this.r);
         if (this.r <= 0) {
            this.o.a($$0, ebs.j, this.p);
            this.o.a(null, this.p, awa.xm, awb.e, 0.5F, this.o.A.i() * 0.1F + 0.9F);
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
         bsd.a($$0, this.n, false, $$1);
      }
   }

   public void e(tq $$0, jt.a $$1) {
      this.n = ka.a(this.b(), cwo.j);
      if (!this.b_($$0) && $$0.b("Items", 9)) {
         bsd.b($$0, this.n, $$1);
      }
   }

   @Override
   protected ka<cwo> f() {
      return this.n;
   }

   @Override
   protected void a(ka<cwo> $$0) {
      this.n = $$0;
   }

   @Override
   public int[] a(jn $$0) {
      return k;
   }

   @Override
   public boolean a(int $$0, cwo $$1, @Nullable jn $$2) {
      return !(djl.a($$1.h()) instanceof dqp);
   }

   @Override
   public boolean b(int $$0, cwo $$1, jn $$2) {
      return true;
   }

   public float a(float $$0) {
      return ayz.h($$0, this.u, this.t);
   }

   @Nullable
   public cvl s() {
      return this.v;
   }

   @Override
   protected csb a(int $$0, cov $$1) {
      return new ctv($$0, $$1, this);
   }

   public boolean t() {
      return this.s == dvk.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
