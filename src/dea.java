import java.util.Arrays;
import javax.annotation.Nullable;

public class dea extends ddr implements bik {
   private static final int h = 3;
   private static final int i = 4;
   private static final int[] j = new int[]{3};
   private static final int[] k = new int[]{0, 1, 2, 3};
   private static final int[] l = new int[]{0, 1, 2, 4};
   public static final int c = 20;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   private il<ckj> m = il.a(5, ckj.b);
   int n;
   private boolean[] r;
   private cke s;
   int t;
   protected final cfz g = new cfz() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dea.this.n;
            case 1:
               return dea.this.t;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dea.this.n = $$1;
               break;
            case 1:
               dea.this.t = $$1;
         }
      }

      @Override
      public int a() {
         return 2;
      }
   };

   public dea(ht $$0, dgb $$1) {
      super(ddz.l, $$0, $$1);
   }

   @Override
   protected ui g() {
      return ui.c("container.brewing");
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   public boolean ai_() {
      for (ckj $$0 : this.m) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   public static void a(cqz $$0, ht $$1, dgb $$2, dea $$3) {
      ckj $$4 = $$3.m.get(4);
      if ($$3.t <= 0 && $$4.a(ckm.rz)) {
         $$3.t = 20;
         $$4.h(1);
         a($$0, $$1, $$2);
      }

      boolean $$5 = a($$3.m);
      boolean $$6 = $$3.n > 0;
      ckj $$7 = $$3.m.get(3);
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
         dgb $$10 = $$2;
         if (!($$2.b() instanceof cue)) {
            return;
         }

         for (int $$11 = 0; $$11 < cue.b.length; $$11++) {
            $$10 = $$10.a(cue.b[$$11], Boolean.valueOf($$9[$$11]));
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

   private static boolean a(il<ckj> $$0) {
      ckj $$1 = $$0.get(3);
      if ($$1.b()) {
         return false;
      } else if (!cmh.a($$1)) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            ckj $$3 = $$0.get($$2);
            if (!$$3.b() && cmh.a($$3, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   private static void a(cqz $$0, ht $$1, il<ckj> $$2) {
      ckj $$3 = $$2.get(3);

      for (int $$4 = 0; $$4 < 3; $$4++) {
         $$2.set($$4, cmh.d($$3, $$2.get($$4)));
      }

      $$3.h(1);
      if ($$3.d().t()) {
         ckj $$5 = new ckj($$3.d().s());
         if ($$3.b()) {
            $$3 = $$5;
         } else {
            bhx.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$5);
         }
      }

      $$2.set(3, $$3);
      $$0.c(1035, $$1, 0);
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.m = il.a(this.b(), ckj.b);
      bhv.b($$0, this.m);
      this.n = $$0.g("BrewTime");
      this.t = $$0.f("Fuel");
   }

   @Override
   protected void b(rt $$0) {
      super.b($$0);
      $$0.a("BrewTime", (short)this.n);
      bhv.a($$0, this.m);
      $$0.a("Fuel", (byte)this.t);
   }

   @Override
   public ckj a(int $$0) {
      return $$0 >= 0 && $$0 < this.m.size() ? this.m.get($$0) : ckj.b;
   }

   @Override
   public ckj a(int $$0, int $$1) {
      return bhv.a(this.m, $$0, $$1);
   }

   @Override
   public ckj b(int $$0) {
      return bhv.a(this.m, $$0);
   }

   @Override
   public void a(int $$0, ckj $$1) {
      if ($$0 >= 0 && $$0 < this.m.size()) {
         this.m.set($$0, $$1);
      }
   }

   @Override
   public boolean a(ccx $$0) {
      return bhu.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, ckj $$1) {
      if ($$0 == 3) {
         return cmh.a($$1);
      } else {
         return $$0 == 4 ? $$1.a(ckm.rz) : ($$1.a(ckm.rv) || $$1.a(ckm.uu) || $$1.a(ckm.ux) || $$1.a(ckm.rw)) && this.a($$0).b();
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
   public boolean a(int $$0, ckj $$1, @Nullable hx $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, ckj $$1, hx $$2) {
      return $$0 == 3 ? $$1.a(ckm.rw) : true;
   }

   @Override
   public void a() {
      this.m.clear();
   }

   @Override
   protected cfp a(int $$0, ccw $$1) {
      return new cfu($$0, $$1, this, this.g);
   }
}
