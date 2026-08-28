import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dtd extends dsz implements brz {
   public static final int d = 9;
   public static final int e = 3;
   public static final int f = 27;
   public static final int g = 1;
   public static final int h = 10;
   public static final float i = 0.5F;
   public static final float j = 270.0F;
   private static final int[] k = IntStream.range(0, 27).toArray();
   private jw<cvp> n = jw.a(27, cvp.k);
   private int r;
   private dtd.a s = dtd.a.a;
   private float t;
   private float u;
   @Nullable
   private final cuj v;

   public dtd(@Nullable cuj $$0, je $$1, duo $$2) {
      super(dru.x, $$1, $$2);
      this.v = $$0;
   }

   public dtd(je $$0, duo $$1) {
      super(dru.x, $$0, $$1);
      this.v = doj.a($$1.b());
   }

   public static void a(deg $$0, je $$1, duo $$2, dtd $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(deg $$0, je $$1, duo $$2) {
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
               this.s = dtd.a.c;
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
               this.s = dtd.a.a;
               this.t = 0.0F;
               d($$0, $$1, $$2);
            }
      }
   }

   public dtd.a k() {
      return this.s;
   }

   public eyn a(duo $$0) {
      return clg.a(1.0F, $$0.c(doj.b), 0.5F * this.a(1.0F));
   }

   private void c(deg $$0, je $$1, duo $$2) {
      if ($$2.b() instanceof doj) {
         jj $$3 = $$2.c(doj.b);
         eyn $$4 = clg.a(1.0F, $$3, this.u, this.t).a($$1);
         List<bto> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (bto $$6 : $$5) {
               if ($$6.j_() != equ.d) {
                  $$6.a(buo.d, new eys(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
            this.s = dtd.a.d;
         }

         if ($$1 == 1) {
            this.s = dtd.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(deg $$0, je $$1, duo $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void d_(cnu $$0) {
      if (!this.q && !$$0.P_()) {
         if (this.r < 0) {
            this.r = 0;
         }

         this.r++;
         this.o.a(this.p, this.m().b(), 1, this.r);
         if (this.r == 1) {
            this.o.a($$0, dzl.k, this.p);
            this.o.a(null, this.p, awe.wO, awf.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cnu $$0) {
      if (!this.q && !$$0.P_()) {
         this.r--;
         this.o.a(this.p, this.m().b(), 1, this.r);
         if (this.r <= 0) {
            this.o.a($$0, dzl.j, this.p);
            this.o.a(null, this.p, awe.wN, awf.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected xd j() {
      return xd.c("container.shulkerBox");
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      this.e($$0, $$1);
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         brj.a($$0, this.n, false, $$1);
      }
   }

   public void e(uf $$0, jp.a $$1) {
      this.n = jw.a(this.b(), cvp.k);
      if (!this.b_($$0) && $$0.b("Items", 9)) {
         brj.b($$0, this.n, $$1);
      }
   }

   @Override
   protected jw<cvp> f() {
      return this.n;
   }

   @Override
   protected void a(jw<cvp> $$0) {
      this.n = $$0;
   }

   @Override
   public int[] a(jj $$0) {
      return k;
   }

   @Override
   public boolean a(int $$0, cvp $$1, @Nullable jj $$2) {
      return !(dhj.a($$1.h()) instanceof doj);
   }

   @Override
   public boolean b(int $$0, cvp $$1, jj $$2) {
      return true;
   }

   public float a(float $$0) {
      return azd.h($$0, this.u, this.t);
   }

   @Nullable
   public cuj t() {
      return this.v;
   }

   @Override
   protected cqw a(int $$0, cnt $$1) {
      return new csq($$0, $$1, this);
   }

   public boolean u() {
      return this.s == dtd.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
