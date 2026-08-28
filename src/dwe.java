import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dwe extends dwa implements bti {
   public static final int d = 9;
   public static final int e = 3;
   public static final int f = 27;
   public static final int g = 1;
   public static final int h = 10;
   public static final float i = 0.5F;
   public static final float j = 270.0F;
   private static final int[] k = IntStream.range(0, 27).toArray();
   private ka<cxh> q = ka.a(27, cxh.k);
   private int r;
   private dwe.a s = dwe.a.a;
   private float t;
   private float u;
   @Nullable
   private final cwe v;

   public dwe(@Nullable cwe $$0, ji $$1, dxq $$2) {
      super(duu.y, $$1, $$2);
      this.v = $$0;
   }

   public dwe(ji $$0, dxq $$1) {
      super(duu.y, $$0, $$1);
      this.v = $$1.b() instanceof drj $$2 ? $$2.b() : null;
   }

   public static void a(dgz $$0, ji $$1, dxq $$2, dwe $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(dgz $$0, ji $$1, dxq $$2) {
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
               this.s = dwe.a.c;
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
               this.s = dwe.a.a;
               this.t = 0.0F;
               d($$0, $$1, $$2);
            }
      }
   }

   public dwe.a k() {
      return this.s;
   }

   public fbs a(dxq $$0) {
      fbx $$1 = new fbx(0.5, 0.0, 0.5);
      return cmy.a(1.0F, $$0.c(drj.c), 0.5F * this.a(1.0F), $$1);
   }

   private void c(dgz $$0, ji $$1, dxq $$2) {
      if ($$2.b() instanceof drj) {
         jn $$3 = $$2.c(drj.c);
         fbs $$4 = cmy.a(1.0F, $$3, this.u, this.t, $$1.c());
         List<bva> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (bva $$6 : $$5) {
               if ($$6.j_() != eub.d) {
                  $$6.a(bwc.d, new fbx(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
            this.s = dwe.a.d;
         }

         if ($$1 == 1) {
            this.s = dwe.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(dgz $$0, ji $$1, dxq $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void c_(cpr $$0) {
      if (!this.p && !$$0.U_()) {
         if (this.r < 0) {
            this.r = 0;
         }

         this.r++;
         this.n.a(this.o, this.m().b(), 1, this.r);
         if (this.r == 1) {
            this.n.a($$0, ecp.k, this.o);
            this.n.a(null, this.o, awa.xx, awb.e, 0.5F, this.n.A.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cpr $$0) {
      if (!this.p && !$$0.U_()) {
         this.r--;
         this.n.a(this.o, this.m().b(), 1, this.r);
         if (this.r <= 0) {
            this.n.a($$0, ecp.j, this.o);
            this.n.a(null, this.o, awa.xw, awb.e, 0.5F, this.n.A.i() * 0.1F + 0.9F);
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
         bss.a($$0, this.q, false, $$1);
      }
   }

   public void e(tq $$0, jt.a $$1) {
      this.q = ka.a(this.b(), cxh.k);
      if (!this.b_($$0) && $$0.b("Items", 9)) {
         bss.b($$0, this.q, $$1);
      }
   }

   @Override
   protected ka<cxh> f() {
      return this.q;
   }

   @Override
   protected void a(ka<cxh> $$0) {
      this.q = $$0;
   }

   @Override
   public int[] a(jn $$0) {
      return k;
   }

   @Override
   public boolean a(int $$0, cxh $$1, @Nullable jn $$2) {
      return !(dke.a($$1.h()) instanceof drj);
   }

   @Override
   public boolean b(int $$0, cxh $$1, jn $$2) {
      return true;
   }

   public float a(float $$0) {
      return ayz.h($$0, this.u, this.t);
   }

   @Nullable
   public cwe s() {
      return this.v;
   }

   @Override
   protected csw a(int $$0, cpq $$1) {
      return new cuq($$0, $$1, this);
   }

   public boolean t() {
      return this.s == dwe.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
