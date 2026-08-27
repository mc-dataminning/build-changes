import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class ddr extends ddn implements bgx {
   public static final int c = 9;
   public static final int f = 3;
   public static final int g = 27;
   public static final int j = 1;
   public static final int k = 10;
   public static final float l = 0.5F;
   public static final float m = 270.0F;
   public static final String n = "Items";
   private static final int[] r = IntStream.range(0, 27).toArray();
   private ho<ciw> s = ho.a(27, ciw.b);
   private int t;
   private ddr.a u = ddr.a.a;
   private float v;
   private float w;
   @Nullable
   private final chk x;

   public ddr(@Nullable chk $$0, gv $$1, dey $$2) {
      super(dcm.x, $$1, $$2);
      this.x = $$0;
   }

   public ddr(gv $$0, dey $$1) {
      super(dcm.x, $$0, $$1);
      this.x = czj.a($$1.b());
   }

   public static void a(cpk $$0, gv $$1, dey $$2, ddr $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(cpk $$0, gv $$1, dey $$2) {
      this.w = this.v;
      switch (this.u) {
         case a:
            this.v = 0.0F;
            break;
         case b:
            this.v += 0.1F;
            if (this.w == 0.0F) {
               d($$0, $$1, $$2);
            }

            if (this.v >= 1.0F) {
               this.u = ddr.a.c;
               this.v = 1.0F;
               d($$0, $$1, $$2);
            }

            this.c($$0, $$1, $$2);
            break;
         case d:
            this.v -= 0.1F;
            if (this.w == 1.0F) {
               d($$0, $$1, $$2);
            }

            if (this.v <= 0.0F) {
               this.u = ddr.a.a;
               this.v = 0.0F;
               d($$0, $$1, $$2);
            }
            break;
         case c:
            this.v = 1.0F;
      }
   }

   public ddr.a i() {
      return this.u;
   }

   public eha a(dey $$0) {
      return bzf.a($$0.c(czj.a), 0.5F * this.a(1.0F));
   }

   private void c(cpk $$0, gv $$1, dey $$2) {
      if ($$2.b() instanceof czj) {
         hb $$3 = $$2.c(czj.a);
         eha $$4 = bzf.a($$3, this.w, this.v).a($$1);
         List<big> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               big $$7 = $$5.get($$6);
               if ($$7.l_() != eag.d) {
                  $$7.a(bjc.d, new ehf(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
               }
            }
         }
      }
   }

   @Override
   public int b() {
      return this.s.size();
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.t = $$1;
         if ($$1 == 0) {
            this.u = ddr.a.d;
         }

         if ($$1 == 1) {
            this.u = ddr.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(cpk $$0, gv $$1, dey $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void d_(cbl $$0) {
      if (!this.q && !$$0.G_()) {
         if (this.t < 0) {
            this.t = 0;
         }

         this.t++;
         this.o.a(this.p, this.q().b(), 1, this.t);
         if (this.t == 1) {
            this.o.a($$0, dji.k, this.p);
            this.o.a(null, this.p, aou.va, aov.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cbl $$0) {
      if (!this.q && !$$0.G_()) {
         this.t--;
         this.o.a(this.p, this.q().b(), 1, this.t);
         if (this.t <= 0) {
            this.o.a($$0, dji.j, this.p);
            this.o.a(null, this.p, aou.uZ, aov.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected te g() {
      return te.c("container.shulkerBox");
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.f($$0);
   }

   @Override
   protected void b(qs $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bgi.a($$0, this.s, false);
      }
   }

   public void f(qs $$0) {
      this.s = ho.a(this.b(), ciw.b);
      if (!this.d($$0) && $$0.b("Items", 9)) {
         bgi.b($$0, this.s);
      }
   }

   @Override
   protected ho<ciw> f() {
      return this.s;
   }

   @Override
   protected void a(ho<ciw> $$0) {
      this.s = $$0;
   }

   @Override
   public int[] a(hb $$0) {
      return r;
   }

   @Override
   public boolean a(int $$0, ciw $$1, @Nullable hb $$2) {
      return !(csk.a($$1.d()) instanceof czj);
   }

   @Override
   public boolean b(int $$0, ciw $$1, hb $$2) {
      return true;
   }

   public float a(float $$0) {
      return aro.i($$0, this.w, this.v);
   }

   @Nullable
   public chk j() {
      return this.x;
   }

   @Override
   protected cec a(int $$0, cbk $$1) {
      return new cfr($$0, $$1, this);
   }

   public boolean v() {
      return this.u == ddr.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
