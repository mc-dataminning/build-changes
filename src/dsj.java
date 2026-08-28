import java.util.Arrays;
import javax.annotation.Nullable;

public class dsj extends dsa implements bsi {
   private static final int g = 3;
   private static final int h = 4;
   private static final int[] i = new int[]{3};
   private static final int[] j = new int[]{0, 1, 2, 3};
   private static final int[] k = new int[]{0, 1, 2, 4};
   public static final int b = 20;
   public static final int c = 0;
   public static final int d = 1;
   public static final int e = 2;
   private jy<cvx> l = jy.a(5, cvx.k);
   int m;
   private boolean[] n;
   private cvt r;
   int s;
   protected final crv f = new crv() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dsj.this.m;
            case 1 -> dsj.this.s;
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dsj.this.m = $$1;
               break;
            case 1:
               dsj.this.s = $$1;
         }
      }

      @Override
      public int a() {
         return 2;
      }
   };

   public dsj(jg $$0, dvd $$1) {
      super(dsi.l, $$0, $$1);
   }

   @Override
   protected xh j() {
      return xh.c("container.brewing");
   }

   @Override
   public int b() {
      return this.l.size();
   }

   @Override
   protected jy<cvx> f() {
      return this.l;
   }

   @Override
   protected void a(jy<cvx> $$0) {
      this.l = $$0;
   }

   public static void a(dev $$0, jg $$1, dvd $$2, dsj $$3) {
      cvx $$4 = $$3.l.get(4);
      if ($$3.s <= 0 && $$4.a(cwb.sp)) {
         $$3.s = 20;
         $$4.h(1);
         a($$0, $$1, $$2);
      }

      boolean $$5 = a($$0.K(), $$3.l);
      boolean $$6 = $$3.m > 0;
      cvx $$7 = $$3.l.get(3);
      if ($$6) {
         $$3.m--;
         boolean $$8 = $$3.m == 0;
         if ($$8 && $$5) {
            a($$0, $$1, $$3.l);
         } else if (!$$5 || !$$7.a($$3.r)) {
            $$3.m = 0;
         }

         a($$0, $$1, $$2);
      } else if ($$5 && $$3.s > 0) {
         $$3.s--;
         $$3.m = 400;
         $$3.r = $$7.h();
         a($$0, $$1, $$2);
      }

      boolean[] $$9 = $$3.k();
      if (!Arrays.equals($$9, $$3.n)) {
         $$3.n = $$9;
         dvd $$10 = $$2;
         if (!($$2.b() instanceof dic)) {
            return;
         }

         for (int $$11 = 0; $$11 < dic.b.length; $$11++) {
            $$10 = $$10.b(dic.b[$$11], Boolean.valueOf($$9[$$11]));
         }

         $$0.a($$1, $$10, 2);
      }
   }

   private boolean[] k() {
      boolean[] $$0 = new boolean[3];

      for (int $$1 = 0; $$1 < 3; $$1++) {
         if (!this.l.get($$1).f()) {
            $$0[$$1] = true;
         }
      }

      return $$0;
   }

   private static boolean a(cxv $$0, jy<cvx> $$1) {
      cvx $$2 = $$1.get(3);
      if ($$2.f()) {
         return false;
      } else if (!$$0.a($$2)) {
         return false;
      } else {
         for (int $$3 = 0; $$3 < 3; $$3++) {
            cvx $$4 = $$1.get($$3);
            if (!$$4.f() && $$0.a($$4, $$2)) {
               return true;
            }
         }

         return false;
      }
   }

   private static void a(dev $$0, jg $$1, jy<cvx> $$2) {
      cvx $$3 = $$2.get(3);
      cxv $$4 = $$0.K();

      for (int $$5 = 0; $$5 < 3; $$5++) {
         $$2.set($$5, $$4.d($$3, $$2.get($$5)));
      }

      $$3.h(1);
      if ($$3.h().l()) {
         cvx $$6 = new cvx($$3.h().k());
         if ($$3.f()) {
            $$3 = $$6;
         } else {
            bru.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$6);
         }
      }

      $$2.set(3, $$3);
      $$0.c(1035, $$1, 0);
   }

   @Override
   protected void a(uj $$0, jr.a $$1) {
      super.a($$0, $$1);
      this.l = jy.a(this.b(), cvx.k);
      brs.b($$0, this.l, $$1);
      this.m = $$0.g("BrewTime");
      if (this.m > 0) {
         this.r = this.l.get(3).h();
      }

      this.s = $$0.f("Fuel");
   }

   @Override
   protected void b(uj $$0, jr.a $$1) {
      super.b($$0, $$1);
      $$0.a("BrewTime", (short)this.m);
      brs.a($$0, this.l, $$1);
      $$0.a("Fuel", (byte)this.s);
   }

   @Override
   public boolean b(int $$0, cvx $$1) {
      if ($$0 == 3) {
         cxv $$2 = this.o != null ? this.o.K() : cxv.b;
         return $$2.a($$1);
      } else {
         return $$0 == 4 ? $$1.a(cwb.sp) : ($$1.a(cwb.sm) || $$1.a(cwb.vq) || $$1.a(cwb.vt) || $$1.a(cwb.sl)) && this.a($$0).f();
      }
   }

   @Override
   public int[] a(jl $$0) {
      if ($$0 == jl.b) {
         return i;
      } else {
         return $$0 == jl.a ? j : k;
      }
   }

   @Override
   public boolean a(int $$0, cvx $$1, @Nullable jl $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cvx $$1, jl $$2) {
      return $$0 == 3 ? $$1.a(cwb.sl) : true;
   }

   @Override
   protected crj a(int $$0, cog $$1) {
      return new crq($$0, $$1, this, this.f);
   }
}
