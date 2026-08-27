import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dfz extends dfv implements biz {
   public static final int c = 9;
   public static final int d = 3;
   public static final int e = 27;
   public static final int f = 1;
   public static final int g = 10;
   public static final float h = 0.5F;
   public static final float i = 270.0F;
   public static final String j = "Items";
   private static final int[] r = IntStream.range(0, 27).toArray();
   private il<clb> s = il.a(27, clb.b);
   private int t;
   private dfz.a u = dfz.a.a;
   private float v;
   private float w;
   @Nullable
   private final cjp x;

   public dfz(@Nullable cjp $$0, ht $$1, dgw $$2) {
      super(det.x, $$1, $$2);
      this.x = $$0;
   }

   public dfz(ht $$0, dgw $$1) {
      super(det.x, $$0, $$1);
      this.x = dbr.a($$1.b());
   }

   public static void a(crs $$0, ht $$1, dgw $$2, dfz $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(crs $$0, ht $$1, dgw $$2) {
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
               this.u = dfz.a.c;
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
               this.u = dfz.a.a;
               this.v = 0.0F;
               d($$0, $$1, $$2);
            }
            break;
         case c:
            this.v = 1.0F;
      }
   }

   public dfz.a i() {
      return this.u;
   }

   public ejd a(dgw $$0) {
      return cbg.a($$0.c(dbr.b), 0.5F * this.a(1.0F));
   }

   private void c(crs $$0, ht $$1, dgw $$2) {
      if ($$2.b() instanceof dbr) {
         hx $$3 = $$2.c(dbr.b);
         ejd $$4 = cbg.a($$3, this.w, this.v).a($$1);
         List<bki> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (bki $$6 : $$5) {
               if ($$6.r_() != ecl.d) {
                  $$6.a(ble.d, new eji(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
            this.u = dfz.a.d;
         }

         if ($$1 == 1) {
            this.u = dfz.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(crs $$0, ht $$1, dgw $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void d_(cdm $$0) {
      if (!this.q && !$$0.N_()) {
         if (this.t < 0) {
            this.t = 0;
         }

         this.t++;
         this.o.a(this.p, this.q().b(), 1, this.t);
         if (this.t == 1) {
            this.o.a($$0, dlg.k, this.p);
            this.o.a(null, this.p, aqn.ve, aqo.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cdm $$0) {
      if (!this.q && !$$0.N_()) {
         this.t--;
         this.o.a(this.p, this.q().b(), 1, this.t);
         if (this.t <= 0) {
            this.o.a($$0, dlg.j, this.p);
            this.o.a(null, this.p, aqn.vd, aqo.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected ur g() {
      return ur.c("container.shulkerBox");
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.f($$0);
   }

   @Override
   protected void b(rz $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bik.a($$0, this.s, false);
      }
   }

   public void f(rz $$0) {
      this.s = il.a(this.b(), clb.b);
      if (!this.d($$0) && $$0.b("Items", 9)) {
         bik.b($$0, this.s);
      }
   }

   @Override
   protected il<clb> f() {
      return this.s;
   }

   @Override
   protected void a(il<clb> $$0) {
      this.s = $$0;
   }

   @Override
   public int[] a(hx $$0) {
      return r;
   }

   @Override
   public boolean a(int $$0, clb $$1, @Nullable hx $$2) {
      return !(cut.a($$1.d()) instanceof dbr);
   }

   @Override
   public boolean b(int $$0, clb $$1, hx $$2) {
      return true;
   }

   public float a(float $$0) {
      return ati.i($$0, this.w, this.v);
   }

   @Nullable
   public cjp j() {
      return this.x;
   }

   @Override
   protected cge a(int $$0, cdl $$1) {
      return new chw($$0, $$1, this);
   }

   public boolean v() {
      return this.u == dfz.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
