import java.util.Arrays;
import javax.annotation.Nullable;

public class deu extends del implements biz {
   private static final int h = 3;
   private static final int i = 4;
   private static final int[] j = new int[]{3};
   private static final int[] k = new int[]{0, 1, 2, 3};
   private static final int[] l = new int[]{0, 1, 2, 4};
   public static final int c = 20;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   private il<clb> m = il.a(5, clb.b);
   int n;
   private boolean[] r;
   private ckw s;
   int t;
   protected final cgo g = new cgo() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return deu.this.n;
            case 1:
               return deu.this.t;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               deu.this.n = $$1;
               break;
            case 1:
               deu.this.t = $$1;
         }
      }

      @Override
      public int a() {
         return 2;
      }
   };

   public deu(ht $$0, dgw $$1) {
      super(det.l, $$0, $$1);
   }

   @Override
   protected ur g() {
      return ur.c("container.brewing");
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   public boolean ai_() {
      for (clb $$0 : this.m) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   public static void a(crs $$0, ht $$1, dgw $$2, deu $$3) {
      clb $$4 = $$3.m.get(4);
      if ($$3.t <= 0 && $$4.a(cle.rA)) {
         $$3.t = 20;
         $$4.h(1);
         a($$0, $$1, $$2);
      }

      boolean $$5 = a($$3.m);
      boolean $$6 = $$3.n > 0;
      clb $$7 = $$3.m.get(3);
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
         dgw $$10 = $$2;
         if (!($$2.b() instanceof cux)) {
            return;
         }

         for (int $$11 = 0; $$11 < cux.b.length; $$11++) {
            $$10 = $$10.a(cux.b[$$11], Boolean.valueOf($$9[$$11]));
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

   private static boolean a(il<clb> $$0) {
      clb $$1 = $$0.get(3);
      if ($$1.b()) {
         return false;
      } else if (!cmz.a($$1)) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            clb $$3 = $$0.get($$2);
            if (!$$3.b() && cmz.a($$3, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   private static void a(crs $$0, ht $$1, il<clb> $$2) {
      clb $$3 = $$2.get(3);

      for (int $$4 = 0; $$4 < 3; $$4++) {
         $$2.set($$4, cmz.d($$3, $$2.get($$4)));
      }

      $$3.h(1);
      if ($$3.d().t()) {
         clb $$5 = new clb($$3.d().s());
         if ($$3.b()) {
            $$3 = $$5;
         } else {
            bim.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$5);
         }
      }

      $$2.set(3, $$3);
      $$0.c(1035, $$1, 0);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.m = il.a(this.b(), clb.b);
      bik.b($$0, this.m);
      this.n = $$0.g("BrewTime");
      this.t = $$0.f("Fuel");
   }

   @Override
   protected void b(rz $$0) {
      super.b($$0);
      $$0.a("BrewTime", (short)this.n);
      bik.a($$0, this.m);
      $$0.a("Fuel", (byte)this.t);
   }

   @Override
   public clb a(int $$0) {
      return $$0 >= 0 && $$0 < this.m.size() ? this.m.get($$0) : clb.b;
   }

   @Override
   public clb a(int $$0, int $$1) {
      return bik.a(this.m, $$0, $$1);
   }

   @Override
   public clb b(int $$0) {
      return bik.a(this.m, $$0);
   }

   @Override
   public void a(int $$0, clb $$1) {
      if ($$0 >= 0 && $$0 < this.m.size()) {
         this.m.set($$0, $$1);
      }
   }

   @Override
   public boolean a(cdm $$0) {
      return bij.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, clb $$1) {
      if ($$0 == 3) {
         return cmz.a($$1);
      } else {
         return $$0 == 4 ? $$1.a(cle.rA) : ($$1.a(cle.rw) || $$1.a(cle.uv) || $$1.a(cle.uy) || $$1.a(cle.rx)) && this.a($$0).b();
      }
   }

   @Override
   public int[] a(hx $$0) {
      if ($$0 == hx.b) {
         return j;
      } else {
         return $$0 == hx.a ? k : l;
      }
   }

   @Override
   public boolean a(int $$0, clb $$1, @Nullable hx $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, clb $$1, hx $$2) {
      return $$0 == 3 ? $$1.a(cle.rx) : true;
   }

   @Override
   public void a() {
      this.m.clear();
   }

   @Override
   protected cge a(int $$0, cdl $$1) {
      return new cgj($$0, $$1, this, this.g);
   }
}
