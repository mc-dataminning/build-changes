import java.util.Arrays;
import javax.annotation.Nullable;

public class dsu extends dsl implements bsr {
   private static final int g = 3;
   private static final int h = 4;
   private static final int[] i = new int[]{3};
   private static final int[] j = new int[]{0, 1, 2, 3};
   private static final int[] k = new int[]{0, 1, 2, 4};
   public static final int b = 20;
   public static final int c = 0;
   public static final int d = 1;
   public static final int e = 2;
   private jz<cwf> l = jz.a(5, cwf.k);
   int m;
   private boolean[] n;
   private cwb r;
   int s;
   protected final cse f = new cse() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dsu.this.m;
            case 1 -> dsu.this.s;
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dsu.this.m = $$1;
               break;
            case 1:
               dsu.this.s = $$1;
         }
      }

      @Override
      public int a() {
         return 2;
      }
   };

   public dsu(jh $$0, dvo $$1) {
      super(dst.l, $$0, $$1);
   }

   @Override
   protected xl j() {
      return xl.c("container.brewing");
   }

   @Override
   public int b() {
      return this.l.size();
   }

   @Override
   protected jz<cwf> f() {
      return this.l;
   }

   @Override
   protected void a(jz<cwf> $$0) {
      this.l = $$0;
   }

   public static void a(dff $$0, jh $$1, dvo $$2, dsu $$3) {
      cwf $$4 = $$3.l.get(4);
      if ($$3.s <= 0 && $$4.a(axm.Y)) {
         $$3.s = 20;
         $$4.h(1);
         a($$0, $$1, $$2);
      }

      boolean $$5 = a($$0.K(), $$3.l);
      boolean $$6 = $$3.m > 0;
      cwf $$7 = $$3.l.get(3);
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
         dvo $$10 = $$2;
         if (!($$2.b() instanceof din)) {
            return;
         }

         for (int $$11 = 0; $$11 < din.b.length; $$11++) {
            $$10 = $$10.b(din.b[$$11], Boolean.valueOf($$9[$$11]));
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

   private static boolean a(cyd $$0, jz<cwf> $$1) {
      cwf $$2 = $$1.get(3);
      if ($$2.f()) {
         return false;
      } else if (!$$0.a($$2)) {
         return false;
      } else {
         for (int $$3 = 0; $$3 < 3; $$3++) {
            cwf $$4 = $$1.get($$3);
            if (!$$4.f() && $$0.a($$4, $$2)) {
               return true;
            }
         }

         return false;
      }
   }

   private static void a(dff $$0, jh $$1, jz<cwf> $$2) {
      cwf $$3 = $$2.get(3);
      cyd $$4 = $$0.K();

      for (int $$5 = 0; $$5 < 3; $$5++) {
         $$2.set($$5, $$4.d($$3, $$2.get($$5)));
      }

      $$3.h(1);
      if ($$3.h().l()) {
         cwf $$6 = new cwf($$3.h().k());
         if ($$3.f()) {
            $$3 = $$6;
         } else {
            bsd.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$6);
         }
      }

      $$2.set(3, $$3);
      $$0.c(1035, $$1, 0);
   }

   @Override
   protected void a(un $$0, js.a $$1) {
      super.a($$0, $$1);
      this.l = jz.a(this.b(), cwf.k);
      bsb.b($$0, this.l, $$1);
      this.m = $$0.g("BrewTime");
      if (this.m > 0) {
         this.r = this.l.get(3).h();
      }

      this.s = $$0.f("Fuel");
   }

   @Override
   protected void b(un $$0, js.a $$1) {
      super.b($$0, $$1);
      $$0.a("BrewTime", (short)this.m);
      bsb.a($$0, this.l, $$1);
      $$0.a("Fuel", (byte)this.s);
   }

   @Override
   public boolean b(int $$0, cwf $$1) {
      if ($$0 == 3) {
         cyd $$2 = this.o != null ? this.o.K() : cyd.b;
         return $$2.a($$1);
      } else {
         return $$0 == 4 ? $$1.a(axm.Y) : ($$1.a(cwj.sC) || $$1.a(cwj.vG) || $$1.a(cwj.vJ) || $$1.a(cwj.sB)) && this.a($$0).f();
      }
   }

   @Override
   public int[] a(jm $$0) {
      if ($$0 == jm.b) {
         return i;
      } else {
         return $$0 == jm.a ? j : k;
      }
   }

   @Override
   public boolean a(int $$0, cwf $$1, @Nullable jm $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cwf $$1, jm $$2) {
      return $$0 == 3 ? $$1.a(cwj.sB) : true;
   }

   @Override
   protected crs a(int $$0, coq $$1) {
      return new crz($$0, $$1, this, this.f);
   }
}
