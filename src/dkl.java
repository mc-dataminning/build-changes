import java.util.Arrays;
import javax.annotation.Nullable;

public class dkl extends dkc implements bnp {
   private static final int h = 3;
   private static final int i = 4;
   private static final int[] j = new int[]{3};
   private static final int[] k = new int[]{0, 1, 2, 3};
   private static final int[] l = new int[]{0, 1, 2, 4};
   public static final int c = 20;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   private iu<cqm> m = iu.a(5, cqm.h);
   int n;
   private boolean[] r;
   private cqh s;
   int t;
   protected final cma g = new cma() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dkl.this.n;
            case 1:
               return dkl.this.t;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dkl.this.n = $$1;
               break;
            case 1:
               dkl.this.t = $$1;
         }
      }

      @Override
      public int a() {
         return 2;
      }
   };

   public dkl(ib $$0, dnb $$1) {
      super(dkk.l, $$0, $$1);
   }

   @Override
   protected vu k() {
      return vu.c("container.brewing");
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   public boolean ai_() {
      for (cqm $$0 : this.m) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   public static void a(cxb $$0, ib $$1, dnb $$2, dkl $$3) {
      cqm $$4 = $$3.m.get(4);
      if ($$3.t <= 0 && $$4.a(cqp.sn)) {
         $$3.t = 20;
         $$4.h(1);
         a($$0, $$1, $$2);
      }

      boolean $$5 = a($$3.m);
      boolean $$6 = $$3.n > 0;
      cqm $$7 = $$3.m.get(3);
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
         dnb $$10 = $$2;
         if (!($$2.b() instanceof dag)) {
            return;
         }

         for (int $$11 = 0; $$11 < dag.b.length; $$11++) {
            $$10 = $$10.a(dag.b[$$11], Boolean.valueOf($$9[$$11]));
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

   private static boolean a(iu<cqm> $$0) {
      cqm $$1 = $$0.get(3);
      if ($$1.b()) {
         return false;
      } else if (!csk.a($$1)) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            cqm $$3 = $$0.get($$2);
            if (!$$3.b() && csk.a($$3, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   private static void a(cxb $$0, ib $$1, iu<cqm> $$2) {
      cqm $$3 = $$2.get(3);

      for (int $$4 = 0; $$4 < 3; $$4++) {
         $$2.set($$4, csk.d($$3, $$2.get($$4)));
      }

      $$3.h(1);
      if ($$3.d().u()) {
         cqm $$5 = new cqm($$3.d().t());
         if ($$3.b()) {
            $$3 = $$5;
         } else {
            bmz.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$5);
         }
      }

      $$2.set(3, $$3);
      $$0.c(1035, $$1, 0);
   }

   @Override
   public void a(ta $$0, in.a $$1) {
      super.a($$0, $$1);
      this.m = iu.a(this.b(), cqm.h);
      bmx.b($$0, this.m);
      this.n = $$0.g("BrewTime");
      this.t = $$0.f("Fuel");
   }

   @Override
   protected void b(ta $$0, in.a $$1) {
      super.b($$0, $$1);
      $$0.a("BrewTime", (short)this.n);
      bmx.a($$0, this.m);
      $$0.a("Fuel", (byte)this.t);
   }

   @Override
   public cqm a(int $$0) {
      return $$0 >= 0 && $$0 < this.m.size() ? this.m.get($$0) : cqm.h;
   }

   @Override
   public cqm a(int $$0, int $$1) {
      return bmx.a(this.m, $$0, $$1);
   }

   @Override
   public cqm b(int $$0) {
      return bmx.a(this.m, $$0);
   }

   @Override
   public void a(int $$0, cqm $$1) {
      if ($$0 >= 0 && $$0 < this.m.size()) {
         this.m.set($$0, $$1);
      }
   }

   @Override
   public boolean a(ciu $$0) {
      return bmw.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cqm $$1) {
      if ($$0 == 3) {
         return csk.a($$1);
      } else {
         return $$0 == 4 ? $$1.a(cqp.sn) : ($$1.a(cqp.sj) || $$1.a(cqp.vm) || $$1.a(cqp.vp) || $$1.a(cqp.sk)) && this.a($$0).b();
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
   public boolean a(int $$0, cqm $$1, @Nullable ih $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cqm $$1, ih $$2) {
      return $$0 == 3 ? $$1.a(cqp.sk) : true;
   }

   @Override
   public void a() {
      this.m.clear();
   }

   @Override
   protected clq a(int $$0, cit $$1) {
      return new clv($$0, $$1, this, this.g);
   }
}
