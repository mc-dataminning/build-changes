import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dvl extends dvh implements bst {
   public static final int d = 9;
   public static final int e = 3;
   public static final int f = 27;
   public static final int g = 1;
   public static final int h = 10;
   public static final float i = 0.5F;
   public static final float j = 270.0F;
   private static final int[] k = IntStream.range(0, 27).toArray();
   private ka<cwp> n = ka.a(27, cwp.j);
   private int r;
   private dvl.a s = dvl.a.a;
   private float t;
   private float u;
   @Nullable
   private final cvm v;

   public dvl(@Nullable cvm $$0, ji $$1, dwx $$2) {
      super(dub.y, $$1, $$2);
      this.v = $$0;
   }

   public dvl(ji $$0, dwx $$1) {
      super(dub.y, $$0, $$1);
      this.v = $$1.b() instanceof dqq $$2 ? $$2.b() : null;
   }

   public static void a(dgi $$0, ji $$1, dwx $$2, dvl $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(dgi $$0, ji $$1, dwx $$2) {
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
               this.s = dvl.a.c;
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
               this.s = dvl.a.a;
               this.t = 0.0F;
               d($$0, $$1, $$2);
            }
      }
   }

   public dvl.a k() {
      return this.s;
   }

   public fav a(dwx $$0) {
      return cmd.a(1.0F, $$0.c(dqq.b), 0.5F * this.a(1.0F));
   }

   private void c(dgi $$0, ji $$1, dwx $$2) {
      if ($$2.b() instanceof dqq) {
         jn $$3 = $$2.c(dqq.b);
         fav $$4 = cmd.a(1.0F, $$3, this.u, this.t).a($$1);
         List<buk> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (buk $$6 : $$5) {
               if ($$6.n_() != ete.d) {
                  $$6.a(bvk.d, new fba(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
            this.s = dvl.a.d;
         }

         if ($$1 == 1) {
            this.s = dvl.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(dgi $$0, ji $$1, dwx $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void c_(cox $$0) {
      if (!this.q && !$$0.Z_()) {
         if (this.r < 0) {
            this.r = 0;
         }

         this.r++;
         this.o.a(this.p, this.m().b(), 1, this.r);
         if (this.r == 1) {
            this.o.a($$0, ebt.k, this.p);
            this.o.a(null, this.p, awa.xn, awb.e, 0.5F, this.o.A.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cox $$0) {
      if (!this.q && !$$0.Z_()) {
         this.r--;
         this.o.a(this.p, this.m().b(), 1, this.r);
         if (this.r <= 0) {
            this.o.a($$0, ebt.j, this.p);
            this.o.a(null, this.p, awa.xm, awb.e, 0.5F, this.o.A.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected wo j() {
      return wo.c("container.shulkerBox");
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
      this.n = ka.a(this.b(), cwp.j);
      if (!this.b_($$0) && $$0.b("Items", 9)) {
         bsd.b($$0, this.n, $$1);
      }
   }

   @Override
   protected ka<cwp> f() {
      return this.n;
   }

   @Override
   protected void a(ka<cwp> $$0) {
      this.n = $$0;
   }

   @Override
   public int[] a(jn $$0) {
      return k;
   }

   @Override
   public boolean a(int $$0, cwp $$1, @Nullable jn $$2) {
      return !(djm.a($$1.h()) instanceof dqq);
   }

   @Override
   public boolean b(int $$0, cwp $$1, jn $$2) {
      return true;
   }

   public float a(float $$0) {
      return ayz.h($$0, this.u, this.t);
   }

   @Nullable
   public cvm s() {
      return this.v;
   }

   @Override
   protected csc a(int $$0, cow $$1) {
      return new ctw($$0, $$1, this);
   }

   public boolean t() {
      return this.s == dvl.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
