import java.util.Arrays;
import javax.annotation.Nullable;

public class dua extends dtr implements bss {
   private static final int g = 3;
   private static final int h = 4;
   private static final int[] i = new int[]{3};
   private static final int[] j = new int[]{0, 1, 2, 3};
   private static final int[] k = new int[]{0, 1, 2, 4};
   public static final int b = 20;
   public static final int c = 0;
   public static final int d = 1;
   public static final int e = 2;
   private ka<cwn> l = ka.a(5, cwn.j);
   int m;
   private boolean[] n;
   private cwj r;
   int s;
   protected final csm f = new csm() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dua.this.m;
            case 1 -> dua.this.s;
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dua.this.m = $$1;
               break;
            case 1:
               dua.this.s = $$1;
         }
      }

      @Override
      public int a() {
         return 2;
      }
   };

   public dua(ji $$0, dwv $$1) {
      super(dtz.m, $$0, $$1);
   }

   @Override
   protected wo j() {
      return wo.c("container.brewing");
   }

   @Override
   public int b() {
      return this.l.size();
   }

   @Override
   protected ka<cwn> f() {
      return this.l;
   }

   @Override
   protected void a(ka<cwn> $$0) {
      this.l = $$0;
   }

   public static void a(dgg $$0, ji $$1, dwv $$2, dua $$3) {
      cwn $$4 = $$3.l.get(4);
      if ($$3.s <= 0 && $$4.a(awx.X)) {
         $$3.s = 20;
         $$4.h(1);
         a($$0, $$1, $$2);
      }

      boolean $$5 = a($$0.L(), $$3.l);
      boolean $$6 = $$3.m > 0;
      cwn $$7 = $$3.l.get(3);
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
      if (!Arrays.equals($$9, $$3.n)) {
         $$3.n = $$9;
         dwv $$10 = $$2;
         if (!($$2.b() instanceof djp)) {
            return;
         }

         for (int $$11 = 0; $$11 < djp.b.length; $$11++) {
            $$10 = $$10.b(djp.b[$$11], Boolean.valueOf($$9[$$11]));
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

   private static boolean a(cyl $$0, ka<cwn> $$1) {
      cwn $$2 = $$1.get(3);
      if ($$2.f()) {
         return false;
      } else if (!$$0.a($$2)) {
         return false;
      } else {
         for (int $$3 = 0; $$3 < 3; $$3++) {
            cwn $$4 = $$1.get($$3);
            if (!$$4.f() && $$0.a($$4, $$2)) {
               return true;
            }
         }

         return false;
      }
   }

   private static void a(dgg $$0, ji $$1, ka<cwn> $$2) {
      cwn $$3 = $$2.get(3);
      cyl $$4 = $$0.L();

      for (int $$5 = 0; $$5 < 3; $$5++) {
         $$2.set($$5, $$4.d($$3, $$2.get($$5)));
      }

      $$3.h(1);
      cwn $$6 = $$3.h().k();
      if (!$$6.f()) {
         if ($$3.f()) {
            $$3 = $$6;
         } else {
            bse.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$6);
         }
      }

      $$2.set(3, $$3);
      $$0.c(1035, $$1, 0);
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.l = ka.a(this.b(), cwn.j);
      bsc.b($$0, this.l, $$1);
      this.m = $$0.g("BrewTime");
      if (this.m > 0) {
         this.r = this.l.get(3).h();
      }

      this.s = $$0.f("Fuel");
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      $$0.a("BrewTime", (short)this.m);
      bsc.a($$0, this.l, $$1);
      $$0.a("Fuel", (byte)this.s);
   }

   @Override
   public boolean b(int $$0, cwn $$1) {
      if ($$0 == 3) {
         cyl $$2 = this.o != null ? this.o.L() : cyl.b;
         return $$2.a($$1);
      } else {
         return $$0 == 4 ? $$1.a(awx.X) : ($$1.a(cwr.ti) || $$1.a(cwr.wo) || $$1.a(cwr.wr) || $$1.a(cwr.th)) && this.a($$0).f();
      }
   }

   @Override
   public int[] a(jn $$0) {
      if ($$0 == jn.b) {
         return i;
      } else {
         return $$0 == jn.a ? j : k;
      }
   }

   @Override
   public boolean a(int $$0, cwn $$1, @Nullable jn $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cwn $$1, jn $$2) {
      return $$0 == 3 ? $$1.a(cwr.th) : true;
   }

   @Override
   protected csa a(int $$0, cou $$1) {
      return new csh($$0, $$1, this, this.f);
   }
}
