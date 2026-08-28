import java.util.Arrays;
import javax.annotation.Nullable;

public class dxv extends dxk implements buq {
   private static final int g = 3;
   private static final int h = 4;
   private static final int[] i = new int[]{3};
   private static final int[] j = new int[]{0, 1, 2, 3};
   private static final int[] k = new int[]{0, 1, 2, 4};
   public static final int b = 20;
   public static final int c = 0;
   public static final int d = 1;
   public static final int e = 2;
   private jo<czn> l = jo.a(5, czn.k);
   int m;
   private boolean[] q;
   private czj r;
   int s;
   protected final cvr f = new cvr() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dxv.this.m;
            case 1 -> dxv.this.s;
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dxv.this.m = $$1;
               break;
            case 1:
               dxv.this.s = $$1;
         }
      }

      @Override
      public int a() {
         return 2;
      }
   };

   public dxv(iv $$0, eat $$1) {
      super(dxt.m, $$0, $$1);
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
   protected jo<czn> f() {
      return this.l;
   }

   @Override
   protected void a(jo<czn> $$0) {
      this.l = $$0;
   }

   public static void a(djm $$0, iv $$1, eat $$2, dxv $$3) {
      czn $$4 = $$3.l.get(4);
      if ($$3.s <= 0 && $$4.a(axk.X)) {
         $$3.s = 20;
         $$4.h(1);
         a($$0, $$1, $$2);
      }

      boolean $$5 = a($$0.L(), $$3.l);
      boolean $$6 = $$3.m > 0;
      czn $$7 = $$3.l.get(3);
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
         eat $$10 = $$2;
         if (!($$2.b() instanceof dmw)) {
            return;
         }

         for (int $$11 = 0; $$11 < dmw.b.length; $$11++) {
            $$10 = $$10.b(dmw.b[$$11], Boolean.valueOf($$9[$$11]));
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

   private static boolean a(dbi $$0, jo<czn> $$1) {
      czn $$2 = $$1.get(3);
      if ($$2.f()) {
         return false;
      } else if (!$$0.a($$2)) {
         return false;
      } else {
         for (int $$3 = 0; $$3 < 3; $$3++) {
            czn $$4 = $$1.get($$3);
            if (!$$4.f() && $$0.a($$4, $$2)) {
               return true;
            }
         }

         return false;
      }
   }

   private static void a(djm $$0, iv $$1, jo<czn> $$2) {
      czn $$3 = $$2.get(3);
      dbi $$4 = $$0.L();

      for (int $$5 = 0; $$5 < 3; $$5++) {
         $$2.set($$5, $$4.d($$3, $$2.get($$5)));
      }

      $$3.h(1);
      czn $$6 = $$3.h().i();
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
      this.l = jo.a(this.b(), czn.k);
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
   public boolean b(int $$0, czn $$1) {
      if ($$0 == 3) {
         dbi $$2 = this.n != null ? this.n.L() : dbi.b;
         return $$2.a($$1);
      } else {
         return $$0 == 4 ? $$1.a(axk.X) : ($$1.a(czr.tt) || $$1.a(czr.wz) || $$1.a(czr.wC) || $$1.a(czr.ts)) && this.a($$0).f();
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
   public boolean a(int $$0, czn $$1, @Nullable jb $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, czn $$1, jb $$2) {
      return $$0 == 3 ? $$1.a(czr.ts) : true;
   }

   @Override
   protected cvf a(int $$0, crl $$1) {
      return new cvm($$0, $$1, this, this.f);
   }
}
