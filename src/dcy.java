import java.util.Arrays;
import javax.annotation.Nullable;

public class dcy extends dcp implements bhh {
   private static final int h = 3;
   private static final int i = 4;
   private static final int[] j = new int[]{3};
   private static final int[] k = new int[]{0, 1, 2, 3};
   private static final int[] l = new int[]{0, 1, 2, 4};
   public static final int c = 20;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   private hp<cjf> m = hp.a(5, cjf.b);
   int n;
   private boolean[] r;
   private cja s;
   int t;
   protected final cev g = new cev() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dcy.this.n;
            case 1:
               return dcy.this.t;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dcy.this.n = $$1;
               break;
            case 1:
               dcy.this.t = $$1;
         }
      }

      @Override
      public int a() {
         return 2;
      }
   };

   public dcy(gw $$0, dfj $$1) {
      super(dcx.l, $$0, $$1);
   }

   @Override
   protected tm g() {
      return tm.c("container.brewing");
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   public boolean af_() {
      for (cjf $$0 : this.m) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   public static void a(cpv $$0, gw $$1, dfj $$2, dcy $$3) {
      cjf $$4 = $$3.m.get(4);
      if ($$3.t <= 0 && $$4.a(cji.rz)) {
         $$3.t = 20;
         $$4.h(1);
         a($$0, $$1, $$2);
      }

      boolean $$5 = a($$3.m);
      boolean $$6 = $$3.n > 0;
      cjf $$7 = $$3.m.get(3);
      if ($$6) {
         $$3.n--;
         boolean $$8 = $$3.n == 0;
         if ($$8 && $$5) {
            a($$0, $$1, $$3.m);
            a($$0, $$1, $$2);
         } else if (!$$5 || !$$7.a($$3.s)) {
            $$3.n = 0;
            a($$0, $$1, $$2);
         }
      } else if ($$5 && $$3.t > 0) {
         $$3.t--;
         $$3.n = 400;
         $$3.s = $$7.d();
         a($$0, $$1, $$2);
      }

      boolean[] $$9 = $$3.f();
      if (!Arrays.equals($$9, $$3.r)) {
         $$3.r = $$9;
         dfj $$10 = $$2;
         if (!($$2.b() instanceof csy)) {
            return;
         }

         for (int $$11 = 0; $$11 < csy.a.length; $$11++) {
            $$10 = $$10.a(csy.a[$$11], Boolean.valueOf($$9[$$11]));
         }

         $$0.a($$1, $$10, 2);
      }
   }

   private boolean[] f() {
      boolean[] $$0 = new boolean[3];

      for (int $$1 = 0; $$1 < 3; $$1++) {
         if (!this.m.get($$1).b()) {
            $$0[$$1] = true;
         }
      }

      return $$0;
   }

   private static boolean a(hp<cjf> $$0) {
      cjf $$1 = $$0.get(3);
      if ($$1.b()) {
         return false;
      } else if (!cld.a($$1)) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            cjf $$3 = $$0.get($$2);
            if (!$$3.b() && cld.a($$3, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   private static void a(cpv $$0, gw $$1, hp<cjf> $$2) {
      cjf $$3 = $$2.get(3);

      for (int $$4 = 0; $$4 < 3; $$4++) {
         $$2.set($$4, cld.d($$3, $$2.get($$4)));
      }

      $$3.h(1);
      if ($$3.d().t()) {
         cjf $$5 = new cjf($$3.d().s());
         if ($$3.b()) {
            $$3 = $$5;
         } else {
            bgu.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$5);
         }
      }

      $$2.set(3, $$3);
      $$0.c(1035, $$1, 0);
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.m = hp.a(this.b(), cjf.b);
      bgs.b($$0, this.m);
      this.n = $$0.g("BrewTime");
      this.t = $$0.f("Fuel");
   }

   @Override
   protected void b(qy $$0) {
      super.b($$0);
      $$0.a("BrewTime", (short)this.n);
      bgs.a($$0, this.m);
      $$0.a("Fuel", (byte)this.t);
   }

   @Override
   public cjf a(int $$0) {
      return $$0 >= 0 && $$0 < this.m.size() ? this.m.get($$0) : cjf.b;
   }

   @Override
   public cjf a(int $$0, int $$1) {
      return bgs.a(this.m, $$0, $$1);
   }

   @Override
   public cjf b(int $$0) {
      return bgs.a(this.m, $$0);
   }

   @Override
   public void a(int $$0, cjf $$1) {
      if ($$0 >= 0 && $$0 < this.m.size()) {
         this.m.set($$0, $$1);
      }
   }

   @Override
   public boolean a(cbu $$0) {
      return bgr.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cjf $$1) {
      if ($$0 == 3) {
         return cld.a($$1);
      } else {
         return $$0 == 4 ? $$1.a(cji.rz) : ($$1.a(cji.rv) || $$1.a(cji.uu) || $$1.a(cji.ux) || $$1.a(cji.rw)) && this.a($$0).b();
      }
   }

   @Override
   public int[] a(hc $$0) {
      if ($$0 == hc.b) {
         return j;
      } else {
         return $$0 == hc.a ? k : l;
      }
   }

   @Override
   public boolean a(int $$0, cjf $$1, @Nullable hc $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cjf $$1, hc $$2) {
      return $$0 == 3 ? $$1.a(cji.rw) : true;
   }

   @Override
   public void a() {
      this.m.clear();
   }

   @Override
   protected cel a(int $$0, cbt $$1) {
      return new ceq($$0, $$1, this, this.g);
   }
}
