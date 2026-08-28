import java.util.Arrays;
import javax.annotation.Nullable;

public class dxq extends dxf implements buq {
   private static final int g = 3;
   private static final int h = 4;
   private static final int[] i = new int[]{3};
   private static final int[] j = new int[]{0, 1, 2, 3};
   private static final int[] k = new int[]{0, 1, 2, 4};
   public static final int b = 20;
   public static final int c = 0;
   public static final int d = 1;
   public static final int e = 2;
   private jo<czk> l = jo.a(5, czk.k);
   int m;
   private boolean[] q;
   private czg r;
   int s;
   protected final cvo f = new cvo() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dxq.this.m;
            case 1 -> dxq.this.s;
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dxq.this.m = $$1;
               break;
            case 1:
               dxq.this.s = $$1;
         }
      }

      @Override
      public int a() {
         return 2;
      }
   };

   public dxq(iv $$0, eao $$1) {
      super(dxo.m, $$0, $$1);
   }

   @Override
   protected wy j() {
      return wy.c("container.brewing");
   }

   @Override
   public int b() {
      return this.l.size();
   }

   @Override
   protected jo<czk> f() {
      return this.l;
   }

   @Override
   protected void a(jo<czk> $$0) {
      this.l = $$0;
   }

   public static void a(djh $$0, iv $$1, eao $$2, dxq $$3) {
      czk $$4 = $$3.l.get(4);
      if ($$3.s <= 0 && $$4.a(axk.X)) {
         $$3.s = 20;
         $$4.h(1);
         a($$0, $$1, $$2);
      }

      boolean $$5 = a($$0.L(), $$3.l);
      boolean $$6 = $$3.m > 0;
      czk $$7 = $$3.l.get(3);
      if ($$6) {
         $$3.m--;
         boolean $$8 = $$3.m == 0;
         if ($$8 && $$5) {
            a($$0, $$1, $$3.l);
         } else if (!$$5 || !$$7.a($$3.r)) {
            $$3.m = 0;
         }

         a($$0, $$1, $$2);
      } else if ($$5 && $$3.s > 0) {
         $$3.s--;
         $$3.m = 400;
         $$3.r = $$7.h();
         a($$0, $$1, $$2);
      }

      boolean[] $$9 = $$3.k();
      if (!Arrays.equals($$9, $$3.q)) {
         $$3.q = $$9;
         eao $$10 = $$2;
         if (!($$2.b() instanceof dmr)) {
            return;
         }

         for (int $$11 = 0; $$11 < dmr.b.length; $$11++) {
            $$10 = $$10.b(dmr.b[$$11], Boolean.valueOf($$9[$$11]));
         }

         $$0.a($$1, $$10, 2);
      }
   }

   private boolean[] k() {
      boolean[] $$0 = new boolean[3];

      for (int $$1 = 0; $$1 < 3; $$1++) {
         if (!this.l.get($$1).f()) {
            $$0[$$1] = true;
         }
      }

      return $$0;
   }

   private static boolean a(dbf $$0, jo<czk> $$1) {
      czk $$2 = $$1.get(3);
      if ($$2.f()) {
         return false;
      } else if (!$$0.a($$2)) {
         return false;
      } else {
         for (int $$3 = 0; $$3 < 3; $$3++) {
            czk $$4 = $$1.get($$3);
            if (!$$4.f() && $$0.a($$4, $$2)) {
               return true;
            }
         }

         return false;
      }
   }

   private static void a(djh $$0, iv $$1, jo<czk> $$2) {
      czk $$3 = $$2.get(3);
      dbf $$4 = $$0.L();

      for (int $$5 = 0; $$5 < 3; $$5++) {
         $$2.set($$5, $$4.d($$3, $$2.get($$5)));
      }

      $$3.h(1);
      czk $$6 = $$3.h().i();
      if (!$$6.f()) {
         if ($$3.f()) {
            $$3 = $$6;
         } else {
            buc.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$6);
         }
      }

      $$2.set(3, $$3);
      $$0.c(1035, $$1, 0);
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.l = jo.a(this.b(), czk.k);
      bua.b($$0, this.l, $$1);
      this.m = $$0.e("BrewTime");
      if (this.m > 0) {
         this.r = this.l.get(3).h();
      }

      this.s = $$0.d("Fuel");
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      $$0.a("BrewTime", (short)this.m);
      bua.a($$0, this.l, $$1);
      $$0.a("Fuel", (byte)this.s);
   }

   @Override
   public boolean b(int $$0, czk $$1) {
      if ($$0 == 3) {
         dbf $$2 = this.n != null ? this.n.L() : dbf.b;
         return $$2.a($$1);
      } else {
         return $$0 == 4 ? $$1.a(axk.X) : ($$1.a(czo.tt) || $$1.a(czo.wz) || $$1.a(czo.wC) || $$1.a(czo.ts)) && this.a($$0).f();
      }
   }

   @Override
   public int[] a(jb $$0) {
      if ($$0 == jb.b) {
         return i;
      } else {
         return $$0 == jb.a ? j : k;
      }
   }

   @Override
   public boolean a(int $$0, czk $$1, @Nullable jb $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, czk $$1, jb $$2) {
      return $$0 == 3 ? $$1.a(czo.ts) : true;
   }

   @Override
   protected cvc a(int $$0, cri $$1) {
      return new cvj($$0, $$1, this, this.f);
   }
}
