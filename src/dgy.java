import java.util.Arrays;
import javax.annotation.Nullable;

public class dgy extends dgp implements bkm {
   private static final int h = 3;
   private static final int i = 4;
   private static final int[] j = new int[]{3};
   private static final int[] k = new int[]{0, 1, 2, 3};
   private static final int[] l = new int[]{0, 1, 2, 4};
   public static final int c = 20;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   private iq<cmy> m = iq.a(5, cmy.f);
   int n;
   private boolean[] r;
   private cmt s;
   int t;
   protected final cil g = new cil() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dgy.this.n;
            case 1:
               return dgy.this.t;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dgy.this.n = $$1;
               break;
            case 1:
               dgy.this.t = $$1;
         }
      }

      @Override
      public int a() {
         return 2;
      }
   };

   public dgy(hx $$0, djh $$1) {
      super(dgx.l, $$0, $$1);
   }

   @Override
   protected vf l() {
      return vf.c("container.brewing");
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   public boolean ai_() {
      for (cmy $$0 : this.m) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   public static void a(ctp $$0, hx $$1, djh $$2, dgy $$3) {
      cmy $$4 = $$3.m.get(4);
      if ($$3.t <= 0 && $$4.a(cnb.sl)) {
         $$3.t = 20;
         $$4.h(1);
         a($$0, $$1, $$2);
      }

      boolean $$5 = a($$3.m);
      boolean $$6 = $$3.n > 0;
      cmy $$7 = $$3.m.get(3);
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
         djh $$10 = $$2;
         if (!($$2.b() instanceof cwu)) {
            return;
         }

         for (int $$11 = 0; $$11 < cwu.b.length; $$11++) {
            $$10 = $$10.a(cwu.b[$$11], Boolean.valueOf($$9[$$11]));
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

   private static boolean a(iq<cmy> $$0) {
      cmy $$1 = $$0.get(3);
      if ($$1.b()) {
         return false;
      } else if (!cox.a($$1)) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            cmy $$3 = $$0.get($$2);
            if (!$$3.b() && cox.a($$3, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   private static void a(ctp $$0, hx $$1, iq<cmy> $$2) {
      cmy $$3 = $$2.get(3);

      for (int $$4 = 0; $$4 < 3; $$4++) {
         $$2.set($$4, cox.d($$3, $$2.get($$4)));
      }

      $$3.h(1);
      if ($$3.d().t()) {
         cmy $$5 = new cmy($$3.d().s());
         if ($$3.b()) {
            $$3 = $$5;
         } else {
            bjx.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$5);
         }
      }

      $$2.set(3, $$3);
      $$0.c(1035, $$1, 0);
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.m = iq.a(this.b(), cmy.f);
      bjv.b($$0, this.m);
      this.n = $$0.g("BrewTime");
      this.t = $$0.f("Fuel");
   }

   @Override
   protected void b(sn $$0) {
      super.b($$0);
      $$0.a("BrewTime", (short)this.n);
      bjv.a($$0, this.m);
      $$0.a("Fuel", (byte)this.t);
   }

   @Override
   public cmy a(int $$0) {
      return $$0 >= 0 && $$0 < this.m.size() ? this.m.get($$0) : cmy.f;
   }

   @Override
   public cmy a(int $$0, int $$1) {
      return bjv.a(this.m, $$0, $$1);
   }

   @Override
   public cmy b(int $$0) {
      return bjv.a(this.m, $$0);
   }

   @Override
   public void a(int $$0, cmy $$1) {
      if ($$0 >= 0 && $$0 < this.m.size()) {
         this.m.set($$0, $$1);
      }
   }

   @Override
   public boolean a(cfi $$0) {
      return bju.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cmy $$1) {
      if ($$0 == 3) {
         return cox.a($$1);
      } else {
         return $$0 == 4 ? $$1.a(cnb.sl) : ($$1.a(cnb.sh) || $$1.a(cnb.vh) || $$1.a(cnb.vk) || $$1.a(cnb.si)) && this.a($$0).b();
      }
   }

   @Override
   public int[] a(ic $$0) {
      if ($$0 == ic.b) {
         return j;
      } else {
         return $$0 == ic.a ? k : l;
      }
   }

   @Override
   public boolean a(int $$0, cmy $$1, @Nullable ic $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cmy $$1, ic $$2) {
      return $$0 == 3 ? $$1.a(cnb.si) : true;
   }

   @Override
   public void a() {
      this.m.clear();
   }

   @Override
   protected cib a(int $$0, cfh $$1) {
      return new cig($$0, $$1, this, this.g);
   }
}
