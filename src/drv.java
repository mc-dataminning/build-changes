import java.util.Arrays;
import javax.annotation.Nullable;

public class drv extends drm implements brz {
   private static final int g = 3;
   private static final int h = 4;
   private static final int[] i = new int[]{3};
   private static final int[] j = new int[]{0, 1, 2, 3};
   private static final int[] k = new int[]{0, 1, 2, 4};
   public static final int b = 20;
   public static final int c = 0;
   public static final int d = 1;
   public static final int e = 2;
   private jw<cvp> l = jw.a(5, cvp.k);
   int m;
   private boolean[] n;
   private cvk r;
   int s;
   protected final cri f = new cri() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> drv.this.m;
            case 1 -> drv.this.s;
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               drv.this.m = $$1;
               break;
            case 1:
               drv.this.s = $$1;
         }
      }

      @Override
      public int a() {
         return 2;
      }
   };

   public drv(je $$0, duo $$1) {
      super(dru.l, $$0, $$1);
   }

   @Override
   protected xd j() {
      return xd.c("container.brewing");
   }

   @Override
   public int b() {
      return this.l.size();
   }

   @Override
   protected jw<cvp> f() {
      return this.l;
   }

   @Override
   protected void a(jw<cvp> $$0) {
      this.l = $$0;
   }

   public static void a(deg $$0, je $$1, duo $$2, drv $$3) {
      cvp $$4 = $$3.l.get(4);
      if ($$3.s <= 0 && $$4.a(cvt.sp)) {
         $$3.s = 20;
         $$4.h(1);
         a($$0, $$1, $$2);
      }

      boolean $$5 = a($$0.K(), $$3.l);
      boolean $$6 = $$3.m > 0;
      cvp $$7 = $$3.l.get(3);
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
         duo $$10 = $$2;
         if (!($$2.b() instanceof dhn)) {
            return;
         }

         for (int $$11 = 0; $$11 < dhn.b.length; $$11++) {
            $$10 = $$10.b(dhn.b[$$11], Boolean.valueOf($$9[$$11]));
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

   private static boolean a(cxn $$0, jw<cvp> $$1) {
      cvp $$2 = $$1.get(3);
      if ($$2.f()) {
         return false;
      } else if (!$$0.a($$2)) {
         return false;
      } else {
         for (int $$3 = 0; $$3 < 3; $$3++) {
            cvp $$4 = $$1.get($$3);
            if (!$$4.f() && $$0.a($$4, $$2)) {
               return true;
            }
         }

         return false;
      }
   }

   private static void a(deg $$0, je $$1, jw<cvp> $$2) {
      cvp $$3 = $$2.get(3);
      cxn $$4 = $$0.K();

      for (int $$5 = 0; $$5 < 3; $$5++) {
         $$2.set($$5, $$4.d($$3, $$2.get($$5)));
      }

      $$3.h(1);
      if ($$3.h().u()) {
         cvp $$6 = new cvp($$3.h().t());
         if ($$3.f()) {
            $$3 = $$6;
         } else {
            brl.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$6);
         }
      }

      $$2.set(3, $$3);
      $$0.c(1035, $$1, 0);
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      this.l = jw.a(this.b(), cvp.k);
      brj.b($$0, this.l, $$1);
      this.m = $$0.g("BrewTime");
      if (this.m > 0) {
         this.r = this.l.get(3).h();
      }

      this.s = $$0.f("Fuel");
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
      super.b($$0, $$1);
      $$0.a("BrewTime", (short)this.m);
      brj.a($$0, this.l, $$1);
      $$0.a("Fuel", (byte)this.s);
   }

   @Override
   public boolean b(int $$0, cvp $$1) {
      if ($$0 == 3) {
         cxn $$2 = this.o != null ? this.o.K() : cxn.b;
         return $$2.a($$1);
      } else {
         return $$0 == 4 ? $$1.a(cvt.sp) : ($$1.a(cvt.sm) || $$1.a(cvt.vq) || $$1.a(cvt.vt) || $$1.a(cvt.sl)) && this.a($$0).f();
      }
   }

   @Override
   public int[] a(jj $$0) {
      if ($$0 == jj.b) {
         return i;
      } else {
         return $$0 == jj.a ? j : k;
      }
   }

   @Override
   public boolean a(int $$0, cvp $$1, @Nullable jj $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cvp $$1, jj $$2) {
      return $$0 == 3 ? $$1.a(cvt.sl) : true;
   }

   @Override
   protected cqw a(int $$0, cnt $$1) {
      return new crd($$0, $$1, this, this.f);
   }
}
