import java.util.Arrays;
import javax.annotation.Nullable;

public class ddc extends dct implements bhn {
   private static final int h = 3;
   private static final int i = 4;
   private static final int[] j = new int[]{3};
   private static final int[] k = new int[]{0, 1, 2, 3};
   private static final int[] l = new int[]{0, 1, 2, 4};
   public static final int c = 20;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   private hn<cjl> m = hn.a(5, cjl.b);
   int n;
   private boolean[] r;
   private cjg s;
   int t;
   protected final cfb g = new cfb() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return ddc.this.n;
            case 1:
               return ddc.this.t;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               ddc.this.n = $$1;
               break;
            case 1:
               ddc.this.t = $$1;
         }
      }

      @Override
      public int a() {
         return 2;
      }
   };

   public ddc(gw $$0, dfd $$1) {
      super(ddb.l, $$0, $$1);
   }

   @Override
   protected tl g() {
      return tl.c("container.brewing");
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   public boolean af_() {
      for (cjl $$0 : this.m) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   public static void a(cqb $$0, gw $$1, dfd $$2, ddc $$3) {
      cjl $$4 = $$3.m.get(4);
      if ($$3.t <= 0 && $$4.a(cjo.rz)) {
         $$3.t = 20;
         $$4.h(1);
         a($$0, $$1, $$2);
      }

      boolean $$5 = a($$3.m);
      boolean $$6 = $$3.n > 0;
      cjl $$7 = $$3.m.get(3);
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
         dfd $$10 = $$2;
         if (!($$2.b() instanceof ctg)) {
            return;
         }

         for (int $$11 = 0; $$11 < ctg.b.length; $$11++) {
            $$10 = $$10.a(ctg.b[$$11], Boolean.valueOf($$9[$$11]));
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

   private static boolean a(hn<cjl> $$0) {
      cjl $$1 = $$0.get(3);
      if ($$1.b()) {
         return false;
      } else if (!clj.a($$1)) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            cjl $$3 = $$0.get($$2);
            if (!$$3.b() && clj.a($$3, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   private static void a(cqb $$0, gw $$1, hn<cjl> $$2) {
      cjl $$3 = $$2.get(3);

      for (int $$4 = 0; $$4 < 3; $$4++) {
         $$2.set($$4, clj.d($$3, $$2.get($$4)));
      }

      $$3.h(1);
      if ($$3.d().t()) {
         cjl $$5 = new cjl($$3.d().s());
         if ($$3.b()) {
            $$3 = $$5;
         } else {
            bha.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$5);
         }
      }

      $$2.set(3, $$3);
      $$0.c(1035, $$1, 0);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.m = hn.a(this.b(), cjl.b);
      bgy.b($$0, this.m);
      this.n = $$0.g("BrewTime");
      this.t = $$0.f("Fuel");
   }

   @Override
   protected void b(qw $$0) {
      super.b($$0);
      $$0.a("BrewTime", (short)this.n);
      bgy.a($$0, this.m);
      $$0.a("Fuel", (byte)this.t);
   }

   @Override
   public cjl a(int $$0) {
      return $$0 >= 0 && $$0 < this.m.size() ? this.m.get($$0) : cjl.b;
   }

   @Override
   public cjl a(int $$0, int $$1) {
      return bgy.a(this.m, $$0, $$1);
   }

   @Override
   public cjl b(int $$0) {
      return bgy.a(this.m, $$0);
   }

   @Override
   public void a(int $$0, cjl $$1) {
      if ($$0 >= 0 && $$0 < this.m.size()) {
         this.m.set($$0, $$1);
      }
   }

   @Override
   public boolean a(cca $$0) {
      return bgx.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cjl $$1) {
      if ($$0 == 3) {
         return clj.a($$1);
      } else {
         return $$0 == 4 ? $$1.a(cjo.rz) : ($$1.a(cjo.rv) || $$1.a(cjo.uu) || $$1.a(cjo.ux) || $$1.a(cjo.rw)) && this.a($$0).b();
      }
   }

   @Override
   public int[] a(ha $$0) {
      if ($$0 == ha.b) {
         return j;
      } else {
         return $$0 == ha.a ? k : l;
      }
   }

   @Override
   public boolean a(int $$0, cjl $$1, @Nullable ha $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cjl $$1, ha $$2) {
      return $$0 == 3 ? $$1.a(cjo.rw) : true;
   }

   @Override
   public void a() {
      this.m.clear();
   }

   @Override
   protected cer a(int $$0, cbz $$1) {
      return new cew($$0, $$1, this, this.g);
   }
}
