import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dyz extends dyv implements buq {
   public static final int d = 9;
   public static final int e = 3;
   public static final int f = 27;
   public static final int g = 1;
   public static final int h = 10;
   public static final float i = 0.5F;
   public static final float j = 270.0F;
   private static final int[] k = IntStream.range(0, 27).toArray();
   private jo<czk> q = jo.a(27, czk.k);
   private int r;
   private dyz.a s = dyz.a.a;
   private float t;
   private float u;
   @Nullable
   private final cyi v;

   public dyz(@Nullable cyi $$0, iv $$1, eao $$2) {
      super(dxo.y, $$1, $$2);
      this.v = $$0;
   }

   public dyz(iv $$0, eao $$1) {
      super(dxo.y, $$0, $$1);
      this.v = $$1.b() instanceof dtv $$2 ? $$2.b() : null;
   }

   public static void a(djh $$0, iv $$1, eao $$2, dyz $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(djh $$0, iv $$1, eao $$2) {
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
               this.s = dyz.a.c;
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
               this.s = dyz.a.a;
               this.t = 0.0F;
               d($$0, $$1, $$2);
            }
      }
   }

   public dyz.a k() {
      return this.s;
   }

   public fes a(eao $$0) {
      fex $$1 = new fex(0.5, 0.0, 0.5);
      return cor.a(1.0F, $$0.c(dtv.c), 0.5F * this.a(1.0F), $$1);
   }

   private void c(djh $$0, iv $$1, eao $$2) {
      if ($$2.b() instanceof dtv) {
         jb $$3 = $$2.c(dtv.c);
         fes $$4 = cor.a(1.0F, $$3, this.u, this.t, $$1.c());
         List<bwi> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (bwi $$6 : $$5) {
               if ($$6.j_() != exa.d) {
                  $$6.a(bxn.d, new fex(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
            this.s = dyz.a.d;
         }

         if ($$1 == 1) {
            this.s = dyz.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(djh $$0, iv $$1, eao $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void a(iv $$0, eao $$1) {
   }

   @Override
   public void c_(crj $$0) {
      if (!this.p && !$$0.V_()) {
         if (this.r < 0) {
            this.r = 0;
         }

         this.r++;
         this.n.a(this.o, this.m().b(), 1, this.r);
         if (this.r == 1) {
            this.n.a($$0, efo.k, this.o);
            this.n.a(null, this.o, awn.xD, awo.e, 0.5F, this.n.A.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(crj $$0) {
      if (!this.p && !$$0.V_()) {
         this.r--;
         this.n.a(this.o, this.m().b(), 1, this.r);
         if (this.r <= 0) {
            this.n.a($$0, efo.j, this.o);
            this.n.a(null, this.o, awn.xC, awo.e, 0.5F, this.n.A.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected wy j() {
      return wy.c("container.shulkerBox");
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.e($$0, $$1);
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bua.a($$0, this.q, false, $$1);
      }
   }

   public void e(tz $$0, jh.a $$1) {
      this.q = jo.a(this.b(), czk.k);
      if (!this.b_($$0) && $$0.b("Items", 9)) {
         bua.b($$0, this.q, $$1);
      }
   }

   @Override
   protected jo<czk> f() {
      return this.q;
   }

   @Override
   protected void a(jo<czk> $$0) {
      this.q = $$0;
   }

   @Override
   public int[] a(jb $$0) {
      return k;
   }

   @Override
   public boolean a(int $$0, czk $$1, @Nullable jb $$2) {
      return !(dmm.a($$1.h()) instanceof dtv);
   }

   @Override
   public boolean b(int $$0, czk $$1, jb $$2) {
      return true;
   }

   public float a(float $$0) {
      return azm.h($$0, this.u, this.t);
   }

   @Nullable
   public cyi s() {
      return this.v;
   }

   @Override
   protected cvc a(int $$0, cri $$1) {
      return new cww($$0, $$1, this);
   }

   public boolean t() {
      return this.s == dyz.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
