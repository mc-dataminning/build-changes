import java.util.Arrays;
import javax.annotation.Nullable;

public class dcp extends dcg implements bgz {
   private static final int h = 3;
   private static final int i = 4;
   private static final int[] j = new int[]{3};
   private static final int[] k = new int[]{0, 1, 2, 3};
   private static final int[] l = new int[]{0, 1, 2, 4};
   public static final int c = 20;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   private hn<ciy> m = hn.a(5, ciy.b);
   int n;
   private boolean[] r;
   private cit s;
   int t;
   protected final ceo g = new ceo() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dcp.this.n;
            case 1:
               return dcp.this.t;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dcp.this.n = $$1;
               break;
            case 1:
               dcp.this.t = $$1;
         }
      }

      @Override
      public int a() {
         return 2;
      }
   };

   public dcp(gu $$0, dfa $$1) {
      super(dco.l, $$0, $$1);
   }

   @Override
   protected tf g() {
      return tf.c("container.brewing");
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   public boolean ab_() {
      for (ciy $$0 : this.m) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   public static void a(cpm $$0, gu $$1, dfa $$2, dcp $$3) {
      ciy $$4 = $$3.m.get(4);
      if ($$3.t <= 0 && $$4.a(cjb.rz)) {
         $$3.t = 20;
         $$4.h(1);
         a($$0, $$1, $$2);
      }

      boolean $$5 = a($$3.m);
      boolean $$6 = $$3.n > 0;
      ciy $$7 = $$3.m.get(3);
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
         dfa $$10 = $$2;
         if (!($$2.b() instanceof csp)) {
            return;
         }

         for (int $$11 = 0; $$11 < csp.a.length; $$11++) {
            $$10 = $$10.a(csp.a[$$11], Boolean.valueOf($$9[$$11]));
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

   private static boolean a(hn<ciy> $$0) {
      ciy $$1 = $$0.get(3);
      if ($$1.b()) {
         return false;
      } else if (!ckw.a($$1)) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            ciy $$3 = $$0.get($$2);
            if (!$$3.b() && ckw.a($$3, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   private static void a(cpm $$0, gu $$1, hn<ciy> $$2) {
      ciy $$3 = $$2.get(3);

      for (int $$4 = 0; $$4 < 3; $$4++) {
         $$2.set($$4, ckw.d($$3, $$2.get($$4)));
      }

      $$3.h(1);
      if ($$3.d().t()) {
         ciy $$5 = new ciy($$3.d().s());
         if ($$3.b()) {
            $$3 = $$5;
         } else {
            bgm.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$5);
         }
      }

      $$2.set(3, $$3);
      $$0.c(1035, $$1, 0);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.m = hn.a(this.b(), ciy.b);
      bgk.b($$0, this.m);
      this.n = $$0.g("BrewTime");
      this.t = $$0.f("Fuel");
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      $$0.a("BrewTime", (short)this.n);
      bgk.a($$0, this.m);
      $$0.a("Fuel", (byte)this.t);
   }

   @Override
   public ciy a(int $$0) {
      return $$0 >= 0 && $$0 < this.m.size() ? this.m.get($$0) : ciy.b;
   }

   @Override
   public ciy a(int $$0, int $$1) {
      return bgk.a(this.m, $$0, $$1);
   }

   @Override
   public ciy b(int $$0) {
      return bgk.a(this.m, $$0);
   }

   @Override
   public void a(int $$0, ciy $$1) {
      if ($$0 >= 0 && $$0 < this.m.size()) {
         this.m.set($$0, $$1);
      }
   }

   @Override
   public boolean a(cbn $$0) {
      return bgj.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, ciy $$1) {
      if ($$0 == 3) {
         return ckw.a($$1);
      } else {
         return $$0 == 4 ? $$1.a(cjb.rz) : ($$1.a(cjb.rv) || $$1.a(cjb.uu) || $$1.a(cjb.ux) || $$1.a(cjb.rw)) && this.a($$0).b();
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
   public boolean a(int $$0, ciy $$1, @Nullable ha $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, ciy $$1, ha $$2) {
      return $$0 == 3 ? $$1.a(cjb.rw) : true;
   }

   @Override
   public void a() {
      this.m.clear();
   }

   @Override
   protected cee a(int $$0, cbm $$1) {
      return new cej($$0, $$1, this, this.g);
   }
}
