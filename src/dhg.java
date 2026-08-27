import java.util.Arrays;
import javax.annotation.Nullable;

public class dhg extends dgx implements bko {
   private static final int h = 3;
   private static final int i = 4;
   private static final int[] j = new int[]{3};
   private static final int[] k = new int[]{0, 1, 2, 3};
   private static final int[] l = new int[]{0, 1, 2, 4};
   public static final int c = 20;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   private iq<cng> m = iq.a(5, cng.f);
   int n;
   private boolean[] r;
   private cnb s;
   int t;
   protected final cit g = new cit() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dhg.this.n;
            case 1:
               return dhg.this.t;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dhg.this.n = $$1;
               break;
            case 1:
               dhg.this.t = $$1;
         }
      }

      @Override
      public int a() {
         return 2;
      }
   };

   public dhg(hx $$0, djp $$1) {
      super(dhf.l, $$0, $$1);
   }

   @Override
   protected vg l() {
      return vg.c("container.brewing");
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   public boolean aj_() {
      for (cng $$0 : this.m) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   public static void a(ctx $$0, hx $$1, djp $$2, dhg $$3) {
      cng $$4 = $$3.m.get(4);
      if ($$3.t <= 0 && $$4.a(cnj.sn)) {
         $$3.t = 20;
         $$4.h(1);
         a($$0, $$1, $$2);
      }

      boolean $$5 = a($$3.m);
      boolean $$6 = $$3.n > 0;
      cng $$7 = $$3.m.get(3);
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
         djp $$10 = $$2;
         if (!($$2.b() instanceof cxc)) {
            return;
         }

         for (int $$11 = 0; $$11 < cxc.b.length; $$11++) {
            $$10 = $$10.a(cxc.b[$$11], Boolean.valueOf($$9[$$11]));
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

   private static boolean a(iq<cng> $$0) {
      cng $$1 = $$0.get(3);
      if ($$1.b()) {
         return false;
      } else if (!cpf.a($$1)) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            cng $$3 = $$0.get($$2);
            if (!$$3.b() && cpf.a($$3, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   private static void a(ctx $$0, hx $$1, iq<cng> $$2) {
      cng $$3 = $$2.get(3);

      for (int $$4 = 0; $$4 < 3; $$4++) {
         $$2.set($$4, cpf.d($$3, $$2.get($$4)));
      }

      $$3.h(1);
      if ($$3.d().s()) {
         cng $$5 = new cng($$3.d().r());
         if ($$3.b()) {
            $$3 = $$5;
         } else {
            bjy.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$5);
         }
      }

      $$2.set(3, $$3);
      $$0.c(1035, $$1, 0);
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.m = iq.a(this.b(), cng.f);
      bjw.b($$0, this.m);
      this.n = $$0.g("BrewTime");
      this.t = $$0.f("Fuel");
   }

   @Override
   protected void b(so $$0) {
      super.b($$0);
      $$0.a("BrewTime", (short)this.n);
      bjw.a($$0, this.m);
      $$0.a("Fuel", (byte)this.t);
   }

   @Override
   public cng a(int $$0) {
      return $$0 >= 0 && $$0 < this.m.size() ? this.m.get($$0) : cng.f;
   }

   @Override
   public cng a(int $$0, int $$1) {
      return bjw.a(this.m, $$0, $$1);
   }

   @Override
   public cng b(int $$0) {
      return bjw.a(this.m, $$0);
   }

   @Override
   public void a(int $$0, cng $$1) {
      if ($$0 >= 0 && $$0 < this.m.size()) {
         this.m.set($$0, $$1);
      }
   }

   @Override
   public boolean a(cfq $$0) {
      return bjv.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cng $$1) {
      if ($$0 == 3) {
         return cpf.a($$1);
      } else {
         return $$0 == 4 ? $$1.a(cnj.sn) : ($$1.a(cnj.sj) || $$1.a(cnj.vk) || $$1.a(cnj.vn) || $$1.a(cnj.sk)) && this.a($$0).b();
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
   public boolean a(int $$0, cng $$1, @Nullable ic $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cng $$1, ic $$2) {
      return $$0 == 3 ? $$1.a(cnj.sk) : true;
   }

   @Override
   public void a() {
      this.m.clear();
   }

   @Override
   protected cij a(int $$0, cfp $$1) {
      return new cio($$0, $$1, this, this.g);
   }
}
