import java.util.Arrays;
import javax.annotation.Nullable;

public class dfl extends dfc implements bjm {
   private static final int h = 3;
   private static final int i = 4;
   private static final int[] j = new int[]{3};
   private static final int[] k = new int[]{0, 1, 2, 3};
   private static final int[] l = new int[]{0, 1, 2, 4};
   public static final int c = 20;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   private ip<clo> m = ip.a(5, clo.b);
   int n;
   private boolean[] r;
   private clj s;
   int t;
   protected final chb g = new chb() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dfl.this.n;
            case 1:
               return dfl.this.t;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dfl.this.n = $$1;
               break;
            case 1:
               dfl.this.t = $$1;
         }
      }

      @Override
      public int a() {
         return 2;
      }
   };

   public dfl(hx $$0, dhn $$1) {
      super(dfk.l, $$0, $$1);
   }

   @Override
   protected uv l() {
      return uv.c("container.brewing");
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   public boolean aj_() {
      for (clo $$0 : this.m) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   public static void a(csf $$0, hx $$1, dhn $$2, dfl $$3) {
      clo $$4 = $$3.m.get(4);
      if ($$3.t <= 0 && $$4.a(clr.sl)) {
         $$3.t = 20;
         $$4.h(1);
         a($$0, $$1, $$2);
      }

      boolean $$5 = a($$3.m);
      boolean $$6 = $$3.n > 0;
      clo $$7 = $$3.m.get(3);
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
         dhn $$10 = $$2;
         if (!($$2.b() instanceof cvj)) {
            return;
         }

         for (int $$11 = 0; $$11 < cvj.b.length; $$11++) {
            $$10 = $$10.a(cvj.b[$$11], Boolean.valueOf($$9[$$11]));
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

   private static boolean a(ip<clo> $$0) {
      clo $$1 = $$0.get(3);
      if ($$1.b()) {
         return false;
      } else if (!cnm.a($$1)) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            clo $$3 = $$0.get($$2);
            if (!$$3.b() && cnm.a($$3, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   private static void a(csf $$0, hx $$1, ip<clo> $$2) {
      clo $$3 = $$2.get(3);

      for (int $$4 = 0; $$4 < 3; $$4++) {
         $$2.set($$4, cnm.d($$3, $$2.get($$4)));
      }

      $$3.h(1);
      if ($$3.d().t()) {
         clo $$5 = new clo($$3.d().s());
         if ($$3.b()) {
            $$3 = $$5;
         } else {
            bix.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$5);
         }
      }

      $$2.set(3, $$3);
      $$0.c(1035, $$1, 0);
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.m = ip.a(this.b(), clo.b);
      biv.b($$0, this.m);
      this.n = $$0.g("BrewTime");
      this.t = $$0.f("Fuel");
   }

   @Override
   protected void b(sd $$0) {
      super.b($$0);
      $$0.a("BrewTime", (short)this.n);
      biv.a($$0, this.m);
      $$0.a("Fuel", (byte)this.t);
   }

   @Override
   public clo a(int $$0) {
      return $$0 >= 0 && $$0 < this.m.size() ? this.m.get($$0) : clo.b;
   }

   @Override
   public clo a(int $$0, int $$1) {
      return biv.a(this.m, $$0, $$1);
   }

   @Override
   public clo b(int $$0) {
      return biv.a(this.m, $$0);
   }

   @Override
   public void a(int $$0, clo $$1) {
      if ($$0 >= 0 && $$0 < this.m.size()) {
         this.m.set($$0, $$1);
      }
   }

   @Override
   public boolean a(cdz $$0) {
      return biu.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, clo $$1) {
      if ($$0 == 3) {
         return cnm.a($$1);
      } else {
         return $$0 == 4 ? $$1.a(clr.sl) : ($$1.a(clr.sh) || $$1.a(clr.vg) || $$1.a(clr.vj) || $$1.a(clr.si)) && this.a($$0).b();
      }
   }

   @Override
   public int[] a(ib $$0) {
      if ($$0 == ib.b) {
         return j;
      } else {
         return $$0 == ib.a ? k : l;
      }
   }

   @Override
   public boolean a(int $$0, clo $$1, @Nullable ib $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, clo $$1, ib $$2) {
      return $$0 == 3 ? $$1.a(clr.si) : true;
   }

   @Override
   public void a() {
      this.m.clear();
   }

   @Override
   protected cgr a(int $$0, cdy $$1) {
      return new cgw($$0, $$1, this, this.g);
   }
}
