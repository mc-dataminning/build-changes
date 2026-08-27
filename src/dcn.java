import java.util.Arrays;
import javax.annotation.Nullable;

public class dcn extends dce implements bgx {
   private static final int h = 3;
   private static final int i = 4;
   private static final int[] j = new int[]{3};
   private static final int[] k = new int[]{0, 1, 2, 3};
   private static final int[] l = new int[]{0, 1, 2, 4};
   public static final int c = 20;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   private ho<ciw> m = ho.a(5, ciw.b);
   int n;
   private boolean[] r;
   private cir s;
   int t;
   protected final cem g = new cem() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dcn.this.n;
            case 1:
               return dcn.this.t;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dcn.this.n = $$1;
               break;
            case 1:
               dcn.this.t = $$1;
         }
      }

      @Override
      public int a() {
         return 2;
      }
   };

   public dcn(gv $$0, dey $$1) {
      super(dcm.l, $$0, $$1);
   }

   @Override
   protected te g() {
      return te.c("container.brewing");
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   public boolean ab_() {
      for (ciw $$0 : this.m) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   public static void a(cpk $$0, gv $$1, dey $$2, dcn $$3) {
      ciw $$4 = $$3.m.get(4);
      if ($$3.t <= 0 && $$4.a(ciz.rz)) {
         $$3.t = 20;
         $$4.h(1);
         a($$0, $$1, $$2);
      }

      boolean $$5 = a($$3.m);
      boolean $$6 = $$3.n > 0;
      ciw $$7 = $$3.m.get(3);
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
         dey $$10 = $$2;
         if (!($$2.b() instanceof csn)) {
            return;
         }

         for (int $$11 = 0; $$11 < csn.a.length; $$11++) {
            $$10 = $$10.a(csn.a[$$11], Boolean.valueOf($$9[$$11]));
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

   private static boolean a(ho<ciw> $$0) {
      ciw $$1 = $$0.get(3);
      if ($$1.b()) {
         return false;
      } else if (!cku.a($$1)) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            ciw $$3 = $$0.get($$2);
            if (!$$3.b() && cku.a($$3, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   private static void a(cpk $$0, gv $$1, ho<ciw> $$2) {
      ciw $$3 = $$2.get(3);

      for (int $$4 = 0; $$4 < 3; $$4++) {
         $$2.set($$4, cku.d($$3, $$2.get($$4)));
      }

      $$3.h(1);
      if ($$3.d().t()) {
         ciw $$5 = new ciw($$3.d().s());
         if ($$3.b()) {
            $$3 = $$5;
         } else {
            bgk.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$5);
         }
      }

      $$2.set(3, $$3);
      $$0.c(1035, $$1, 0);
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.m = ho.a(this.b(), ciw.b);
      bgi.b($$0, this.m);
      this.n = $$0.g("BrewTime");
      this.t = $$0.f("Fuel");
   }

   @Override
   protected void b(qs $$0) {
      super.b($$0);
      $$0.a("BrewTime", (short)this.n);
      bgi.a($$0, this.m);
      $$0.a("Fuel", (byte)this.t);
   }

   @Override
   public ciw a(int $$0) {
      return $$0 >= 0 && $$0 < this.m.size() ? this.m.get($$0) : ciw.b;
   }

   @Override
   public ciw a(int $$0, int $$1) {
      return bgi.a(this.m, $$0, $$1);
   }

   @Override
   public ciw b(int $$0) {
      return bgi.a(this.m, $$0);
   }

   @Override
   public void a(int $$0, ciw $$1) {
      if ($$0 >= 0 && $$0 < this.m.size()) {
         this.m.set($$0, $$1);
      }
   }

   @Override
   public boolean a(cbl $$0) {
      return bgh.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, ciw $$1) {
      if ($$0 == 3) {
         return cku.a($$1);
      } else {
         return $$0 == 4 ? $$1.a(ciz.rz) : ($$1.a(ciz.rv) || $$1.a(ciz.uu) || $$1.a(ciz.ux) || $$1.a(ciz.rw)) && this.a($$0).b();
      }
   }

   @Override
   public int[] a(hb $$0) {
      if ($$0 == hb.b) {
         return j;
      } else {
         return $$0 == hb.a ? k : l;
      }
   }

   @Override
   public boolean a(int $$0, ciw $$1, @Nullable hb $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, ciw $$1, hb $$2) {
      return $$0 == 3 ? $$1.a(ciz.rw) : true;
   }

   @Override
   public void a() {
      this.m.clear();
   }

   @Override
   protected cec a(int $$0, cbk $$1) {
      return new ceh($$0, $$1, this, this.g);
   }
}
