import java.util.Arrays;
import javax.annotation.Nullable;

public class dgg extends dfx implements bjw {
   private static final int h = 3;
   private static final int i = 4;
   private static final int[] j = new int[]{3};
   private static final int[] k = new int[]{0, 1, 2, 3};
   private static final int[] l = new int[]{0, 1, 2, 4};
   public static final int c = 20;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   private io<cmh> m = io.a(5, cmh.f);
   int n;
   private boolean[] r;
   private cmc s;
   int t;
   protected final chu g = new chu() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dgg.this.n;
            case 1:
               return dgg.this.t;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dgg.this.n = $$1;
               break;
            case 1:
               dgg.this.t = $$1;
         }
      }

      @Override
      public int a() {
         return 2;
      }
   };

   public dgg(hv $$0, dip $$1) {
      super(dgf.l, $$0, $$1);
   }

   @Override
   protected vb l() {
      return vb.c("container.brewing");
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   public boolean ai_() {
      for (cmh $$0 : this.m) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   public static void a(csy $$0, hv $$1, dip $$2, dgg $$3) {
      cmh $$4 = $$3.m.get(4);
      if ($$3.t <= 0 && $$4.a(cmk.sl)) {
         $$3.t = 20;
         $$4.h(1);
         a($$0, $$1, $$2);
      }

      boolean $$5 = a($$3.m);
      boolean $$6 = $$3.n > 0;
      cmh $$7 = $$3.m.get(3);
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
         dip $$10 = $$2;
         if (!($$2.b() instanceof cwd)) {
            return;
         }

         for (int $$11 = 0; $$11 < cwd.b.length; $$11++) {
            $$10 = $$10.a(cwd.b[$$11], Boolean.valueOf($$9[$$11]));
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

   private static boolean a(io<cmh> $$0) {
      cmh $$1 = $$0.get(3);
      if ($$1.b()) {
         return false;
      } else if (!cof.a($$1)) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            cmh $$3 = $$0.get($$2);
            if (!$$3.b() && cof.a($$3, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   private static void a(csy $$0, hv $$1, io<cmh> $$2) {
      cmh $$3 = $$2.get(3);

      for (int $$4 = 0; $$4 < 3; $$4++) {
         $$2.set($$4, cof.d($$3, $$2.get($$4)));
      }

      $$3.h(1);
      if ($$3.d().t()) {
         cmh $$5 = new cmh($$3.d().s());
         if ($$3.b()) {
            $$3 = $$5;
         } else {
            bjh.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$5);
         }
      }

      $$2.set(3, $$3);
      $$0.c(1035, $$1, 0);
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.m = io.a(this.b(), cmh.f);
      bjf.b($$0, this.m);
      this.n = $$0.g("BrewTime");
      this.t = $$0.f("Fuel");
   }

   @Override
   protected void b(sj $$0) {
      super.b($$0);
      $$0.a("BrewTime", (short)this.n);
      bjf.a($$0, this.m);
      $$0.a("Fuel", (byte)this.t);
   }

   @Override
   public cmh a(int $$0) {
      return $$0 >= 0 && $$0 < this.m.size() ? this.m.get($$0) : cmh.f;
   }

   @Override
   public cmh a(int $$0, int $$1) {
      return bjf.a(this.m, $$0, $$1);
   }

   @Override
   public cmh b(int $$0) {
      return bjf.a(this.m, $$0);
   }

   @Override
   public void a(int $$0, cmh $$1) {
      if ($$0 >= 0 && $$0 < this.m.size()) {
         this.m.set($$0, $$1);
      }
   }

   @Override
   public boolean a(cer $$0) {
      return bje.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cmh $$1) {
      if ($$0 == 3) {
         return cof.a($$1);
      } else {
         return $$0 == 4 ? $$1.a(cmk.sl) : ($$1.a(cmk.sh) || $$1.a(cmk.vh) || $$1.a(cmk.vk) || $$1.a(cmk.si)) && this.a($$0).b();
      }
   }

   @Override
   public int[] a(ia $$0) {
      if ($$0 == ia.b) {
         return j;
      } else {
         return $$0 == ia.a ? k : l;
      }
   }

   @Override
   public boolean a(int $$0, cmh $$1, @Nullable ia $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cmh $$1, ia $$2) {
      return $$0 == 3 ? $$1.a(cmk.si) : true;
   }

   @Override
   public void a() {
      this.m.clear();
   }

   @Override
   protected chk a(int $$0, ceq $$1) {
      return new chp($$0, $$1, this, this.g);
   }
}
