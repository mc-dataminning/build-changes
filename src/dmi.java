import java.util.Arrays;
import javax.annotation.Nullable;

public class dmi extends dlz implements bom {
   private static final int h = 3;
   private static final int i = 4;
   private static final int[] j = new int[]{3};
   private static final int[] k = new int[]{0, 1, 2, 3};
   private static final int[] l = new int[]{0, 1, 2, 4};
   public static final int c = 20;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   private iu<crj> m = iu.a(5, crj.i);
   int n;
   private boolean[] r;
   private cre s;
   int t;
   protected final cmz g = new cmz() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dmi.this.n;
            case 1:
               return dmi.this.t;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dmi.this.n = $$1;
               break;
            case 1:
               dmi.this.t = $$1;
         }
      }

      @Override
      public int a() {
         return 2;
      }
   };

   public dmi(ib $$0, doz $$1) {
      super(dmh.l, $$0, $$1);
   }

   @Override
   protected wg k() {
      return wg.c("container.brewing");
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   public boolean ah_() {
      for (crj $$0 : this.m) {
         if (!$$0.d()) {
            return false;
         }
      }

      return true;
   }

   public static void a(cyx $$0, ib $$1, doz $$2, dmi $$3) {
      crj $$4 = $$3.m.get(4);
      if ($$3.t <= 0 && $$4.a(crm.sn)) {
         $$3.t = 20;
         $$4.g(1);
         a($$0, $$1, $$2);
      }

      boolean $$5 = a($$3.m);
      boolean $$6 = $$3.n > 0;
      crj $$7 = $$3.m.get(3);
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
         $$3.s = $$7.f();
         a($$0, $$1, $$2);
      }

      boolean[] $$9 = $$3.f();
      if (!Arrays.equals($$9, $$3.r)) {
         $$3.r = $$9;
         doz $$10 = $$2;
         if (!($$2.b() instanceof dcc)) {
            return;
         }

         for (int $$11 = 0; $$11 < dcc.b.length; $$11++) {
            $$10 = $$10.a(dcc.b[$$11], Boolean.valueOf($$9[$$11]));
         }

         $$0.a($$1, $$10, 2);
      }
   }

   private boolean[] f() {
      boolean[] $$0 = new boolean[3];

      for (int $$1 = 0; $$1 < 3; $$1++) {
         if (!this.m.get($$1).d()) {
            $$0[$$1] = true;
         }
      }

      return $$0;
   }

   private static boolean a(iu<crj> $$0) {
      crj $$1 = $$0.get(3);
      if ($$1.d()) {
         return false;
      } else if (!ctg.a($$1)) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            crj $$3 = $$0.get($$2);
            if (!$$3.d() && ctg.a($$3, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   private static void a(cyx $$0, ib $$1, iu<crj> $$2) {
      crj $$3 = $$2.get(3);

      for (int $$4 = 0; $$4 < 3; $$4++) {
         $$2.set($$4, ctg.d($$3, $$2.get($$4)));
      }

      $$3.g(1);
      if ($$3.f().w()) {
         crj $$5 = new crj($$3.f().v());
         if ($$3.d()) {
            $$3 = $$5;
         } else {
            bnw.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$5);
         }
      }

      $$2.set(3, $$3);
      $$0.c(1035, $$1, 0);
   }

   @Override
   public void a(tm $$0, in.a $$1) {
      super.a($$0, $$1);
      this.m = iu.a(this.b(), crj.i);
      bnu.b($$0, this.m, $$1);
      this.n = $$0.g("BrewTime");
      this.t = $$0.f("Fuel");
   }

   @Override
   protected void b(tm $$0, in.a $$1) {
      super.b($$0, $$1);
      $$0.a("BrewTime", (short)this.n);
      bnu.a($$0, this.m, $$1);
      $$0.a("Fuel", (byte)this.t);
   }

   @Override
   public crj a(int $$0) {
      return $$0 >= 0 && $$0 < this.m.size() ? this.m.get($$0) : crj.i;
   }

   @Override
   public crj a(int $$0, int $$1) {
      return bnu.a(this.m, $$0, $$1);
   }

   @Override
   public crj b(int $$0) {
      return bnu.a(this.m, $$0);
   }

   @Override
   public void a(int $$0, crj $$1) {
      if ($$0 >= 0 && $$0 < this.m.size()) {
         this.m.set($$0, $$1);
      }
   }

   @Override
   public boolean a(cjt $$0) {
      return bnt.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, crj $$1) {
      if ($$0 == 3) {
         return ctg.a($$1);
      } else {
         return $$0 == 4 ? $$1.a(crm.sn) : ($$1.a(crm.sj) || $$1.a(crm.vm) || $$1.a(crm.vp) || $$1.a(crm.sk)) && this.a($$0).d();
      }
   }

   @Override
   public int[] a(ih $$0) {
      if ($$0 == ih.b) {
         return j;
      } else {
         return $$0 == ih.a ? k : l;
      }
   }

   @Override
   public boolean a(int $$0, crj $$1, @Nullable ih $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, crj $$1, ih $$2) {
      return $$0 == 3 ? $$1.a(crm.sk) : true;
   }

   @Override
   public void a() {
      this.m.clear();
   }

   @Override
   protected cmp a(int $$0, cjs $$1) {
      return new cmu($$0, $$1, this, this.g);
   }
}
