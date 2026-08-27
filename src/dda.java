import java.util.Arrays;
import javax.annotation.Nullable;

public class dda extends dcr implements bhj {
   private static final int h = 3;
   private static final int i = 4;
   private static final int[] j = new int[]{3};
   private static final int[] k = new int[]{0, 1, 2, 3};
   private static final int[] l = new int[]{0, 1, 2, 4};
   public static final int c = 20;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   private hp<cjh> m = hp.a(5, cjh.b);
   int n;
   private boolean[] r;
   private cjc s;
   int t;
   protected final cex g = new cex() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dda.this.n;
            case 1:
               return dda.this.t;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dda.this.n = $$1;
               break;
            case 1:
               dda.this.t = $$1;
         }
      }

      @Override
      public int a() {
         return 2;
      }
   };

   public dda(gw $$0, dfl $$1) {
      super(dcz.l, $$0, $$1);
   }

   @Override
   protected tn g() {
      return tn.c("container.brewing");
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   public boolean af_() {
      for (cjh $$0 : this.m) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   public static void a(cpx $$0, gw $$1, dfl $$2, dda $$3) {
      cjh $$4 = $$3.m.get(4);
      if ($$3.t <= 0 && $$4.a(cjk.rz)) {
         $$3.t = 20;
         $$4.h(1);
         a($$0, $$1, $$2);
      }

      boolean $$5 = a($$3.m);
      boolean $$6 = $$3.n > 0;
      cjh $$7 = $$3.m.get(3);
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
         dfl $$10 = $$2;
         if (!($$2.b() instanceof cta)) {
            return;
         }

         for (int $$11 = 0; $$11 < cta.a.length; $$11++) {
            $$10 = $$10.a(cta.a[$$11], Boolean.valueOf($$9[$$11]));
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

   private static boolean a(hp<cjh> $$0) {
      cjh $$1 = $$0.get(3);
      if ($$1.b()) {
         return false;
      } else if (!clf.a($$1)) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            cjh $$3 = $$0.get($$2);
            if (!$$3.b() && clf.a($$3, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   private static void a(cpx $$0, gw $$1, hp<cjh> $$2) {
      cjh $$3 = $$2.get(3);

      for (int $$4 = 0; $$4 < 3; $$4++) {
         $$2.set($$4, clf.d($$3, $$2.get($$4)));
      }

      $$3.h(1);
      if ($$3.d().t()) {
         cjh $$5 = new cjh($$3.d().s());
         if ($$3.b()) {
            $$3 = $$5;
         } else {
            bgw.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$5);
         }
      }

      $$2.set(3, $$3);
      $$0.c(1035, $$1, 0);
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.m = hp.a(this.b(), cjh.b);
      bgu.b($$0, this.m);
      this.n = $$0.g("BrewTime");
      this.t = $$0.f("Fuel");
   }

   @Override
   protected void b(qy $$0) {
      super.b($$0);
      $$0.a("BrewTime", (short)this.n);
      bgu.a($$0, this.m);
      $$0.a("Fuel", (byte)this.t);
   }

   @Override
   public cjh a(int $$0) {
      return $$0 >= 0 && $$0 < this.m.size() ? this.m.get($$0) : cjh.b;
   }

   @Override
   public cjh a(int $$0, int $$1) {
      return bgu.a(this.m, $$0, $$1);
   }

   @Override
   public cjh b(int $$0) {
      return bgu.a(this.m, $$0);
   }

   @Override
   public void a(int $$0, cjh $$1) {
      if ($$0 >= 0 && $$0 < this.m.size()) {
         this.m.set($$0, $$1);
      }
   }

   @Override
   public boolean a(cbw $$0) {
      return bgt.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cjh $$1) {
      if ($$0 == 3) {
         return clf.a($$1);
      } else {
         return $$0 == 4 ? $$1.a(cjk.rz) : ($$1.a(cjk.rv) || $$1.a(cjk.uu) || $$1.a(cjk.ux) || $$1.a(cjk.rw)) && this.a($$0).b();
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
   public boolean a(int $$0, cjh $$1, @Nullable hc $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cjh $$1, hc $$2) {
      return $$0 == 3 ? $$1.a(cjk.rw) : true;
   }

   @Override
   public void a() {
      this.m.clear();
   }

   @Override
   protected cen a(int $$0, cbv $$1) {
      return new ces($$0, $$1, this, this.g);
   }
}
