import java.util.Arrays;
import javax.annotation.Nullable;

public class dfg extends dex implements bjh {
   private static final int h = 3;
   private static final int i = 4;
   private static final int[] j = new int[]{3};
   private static final int[] k = new int[]{0, 1, 2, 3};
   private static final int[] l = new int[]{0, 1, 2, 4};
   public static final int c = 20;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   private il<clj> m = il.a(5, clj.b);
   int n;
   private boolean[] r;
   private cle s;
   int t;
   protected final cgw g = new cgw() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dfg.this.n;
            case 1:
               return dfg.this.t;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dfg.this.n = $$1;
               break;
            case 1:
               dfg.this.t = $$1;
         }
      }

      @Override
      public int a() {
         return 2;
      }
   };

   public dfg(ht $$0, dhi $$1) {
      super(dff.l, $$0, $$1);
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
      for (clj $$0 : this.m) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   public static void a(csa $$0, ht $$1, dhi $$2, dfg $$3) {
      clj $$4 = $$3.m.get(4);
      if ($$3.t <= 0 && $$4.a(clm.sl)) {
         $$3.t = 20;
         $$4.h(1);
         a($$0, $$1, $$2);
      }

      boolean $$5 = a($$3.m);
      boolean $$6 = $$3.n > 0;
      clj $$7 = $$3.m.get(3);
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
         dhi $$10 = $$2;
         if (!($$2.b() instanceof cve)) {
            return;
         }

         for (int $$11 = 0; $$11 < cve.b.length; $$11++) {
            $$10 = $$10.a(cve.b[$$11], Boolean.valueOf($$9[$$11]));
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

   private static boolean a(il<clj> $$0) {
      clj $$1 = $$0.get(3);
      if ($$1.b()) {
         return false;
      } else if (!cnh.a($$1)) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            clj $$3 = $$0.get($$2);
            if (!$$3.b() && cnh.a($$3, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   private static void a(csa $$0, ht $$1, il<clj> $$2) {
      clj $$3 = $$2.get(3);

      for (int $$4 = 0; $$4 < 3; $$4++) {
         $$2.set($$4, cnh.d($$3, $$2.get($$4)));
      }

      $$3.h(1);
      if ($$3.d().t()) {
         clj $$5 = new clj($$3.d().s());
         if ($$3.b()) {
            $$3 = $$5;
         } else {
            bit.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$5);
         }
      }

      $$2.set(3, $$3);
      $$0.c(1035, $$1, 0);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.m = il.a(this.b(), clj.b);
      bir.b($$0, this.m);
      this.n = $$0.g("BrewTime");
      this.t = $$0.f("Fuel");
   }

   @Override
   protected void b(rz $$0) {
      super.b($$0);
      $$0.a("BrewTime", (short)this.n);
      bir.a($$0, this.m);
      $$0.a("Fuel", (byte)this.t);
   }

   @Override
   public clj a(int $$0) {
      return $$0 >= 0 && $$0 < this.m.size() ? this.m.get($$0) : clj.b;
   }

   @Override
   public clj a(int $$0, int $$1) {
      return bir.a(this.m, $$0, $$1);
   }

   @Override
   public clj b(int $$0) {
      return bir.a(this.m, $$0);
   }

   @Override
   public void a(int $$0, clj $$1) {
      if ($$0 >= 0 && $$0 < this.m.size()) {
         this.m.set($$0, $$1);
      }
   }

   @Override
   public boolean a(cdu $$0) {
      return biq.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, clj $$1) {
      if ($$0 == 3) {
         return cnh.a($$1);
      } else {
         return $$0 == 4 ? $$1.a(clm.sl) : ($$1.a(clm.sh) || $$1.a(clm.vg) || $$1.a(clm.vj) || $$1.a(clm.si)) && this.a($$0).b();
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
   public boolean a(int $$0, clj $$1, @Nullable hx $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, clj $$1, hx $$2) {
      return $$0 == 3 ? $$1.a(clm.si) : true;
   }

   @Override
   public void a() {
      this.m.clear();
   }

   @Override
   protected cgm a(int $$0, cdt $$1) {
      return new cgr($$0, $$1, this, this.g);
   }
}
