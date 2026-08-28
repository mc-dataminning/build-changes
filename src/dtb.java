import java.util.Arrays;
import javax.annotation.Nullable;

public class dtb extends dss implements bsu {
   private static final int g = 3;
   private static final int h = 4;
   private static final int[] i = new int[]{3};
   private static final int[] j = new int[]{0, 1, 2, 3};
   private static final int[] k = new int[]{0, 1, 2, 4};
   public static final int b = 20;
   public static final int c = 0;
   public static final int d = 1;
   public static final int e = 2;
   private jz<cwm> l = jz.a(5, cwm.k);
   int m;
   private boolean[] n;
   private cwi r;
   int s;
   protected final csl f = new csl() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dtb.this.m;
            case 1 -> dtb.this.s;
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dtb.this.m = $$1;
               break;
            case 1:
               dtb.this.s = $$1;
         }
      }

      @Override
      public int a() {
         return 2;
      }
   };

   public dtb(jh $$0, dvv $$1) {
      super(dta.l, $$0, $$1);
   }

   @Override
   protected xj j() {
      return xj.c("container.brewing");
   }

   @Override
   public int b() {
      return this.l.size();
   }

   @Override
   protected jz<cwm> f() {
      return this.l;
   }

   @Override
   protected void a(jz<cwm> $$0) {
      this.l = $$0;
   }

   public static void a(dfm $$0, jh $$1, dvv $$2, dtb $$3) {
      cwm $$4 = $$3.l.get(4);
      if ($$3.s <= 0 && $$4.a(axl.Y)) {
         $$3.s = 20;
         $$4.h(1);
         a($$0, $$1, $$2);
      }

      boolean $$5 = a($$0.K(), $$3.l);
      boolean $$6 = $$3.m > 0;
      cwm $$7 = $$3.l.get(3);
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
         dvv $$10 = $$2;
         if (!($$2.b() instanceof diu)) {
            return;
         }

         for (int $$11 = 0; $$11 < diu.b.length; $$11++) {
            $$10 = $$10.b(diu.b[$$11], Boolean.valueOf($$9[$$11]));
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

   private static boolean a(cyk $$0, jz<cwm> $$1) {
      cwm $$2 = $$1.get(3);
      if ($$2.f()) {
         return false;
      } else if (!$$0.a($$2)) {
         return false;
      } else {
         for (int $$3 = 0; $$3 < 3; $$3++) {
            cwm $$4 = $$1.get($$3);
            if (!$$4.f() && $$0.a($$4, $$2)) {
               return true;
            }
         }

         return false;
      }
   }

   private static void a(dfm $$0, jh $$1, jz<cwm> $$2) {
      cwm $$3 = $$2.get(3);
      cyk $$4 = $$0.K();

      for (int $$5 = 0; $$5 < 3; $$5++) {
         $$2.set($$5, $$4.d($$3, $$2.get($$5)));
      }

      $$3.h(1);
      if ($$3.h().l()) {
         cwm $$6 = new cwm($$3.h().k());
         if ($$3.f()) {
            $$3 = $$6;
         } else {
            bsg.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$6);
         }
      }

      $$2.set(3, $$3);
      $$0.c(1035, $$1, 0);
   }

   @Override
   protected void a(ul $$0, js.a $$1) {
      super.a($$0, $$1);
      this.l = jz.a(this.b(), cwm.k);
      bse.b($$0, this.l, $$1);
      this.m = $$0.g("BrewTime");
      if (this.m > 0) {
         this.r = this.l.get(3).h();
      }

      this.s = $$0.f("Fuel");
   }

   @Override
   protected void b(ul $$0, js.a $$1) {
      super.b($$0, $$1);
      $$0.a("BrewTime", (short)this.m);
      bse.a($$0, this.l, $$1);
      $$0.a("Fuel", (byte)this.s);
   }

   @Override
   public boolean b(int $$0, cwm $$1) {
      if ($$0 == 3) {
         cyk $$2 = this.o != null ? this.o.K() : cyk.b;
         return $$2.a($$1);
      } else {
         return $$0 == 4 ? $$1.a(axl.Y) : ($$1.a(cwq.sC) || $$1.a(cwq.vG) || $$1.a(cwq.vJ) || $$1.a(cwq.sB)) && this.a($$0).f();
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
   public boolean a(int $$0, cwm $$1, @Nullable jm $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cwm $$1, jm $$2) {
      return $$0 == 3 ? $$1.a(cwq.sB) : true;
   }

   @Override
   protected crz a(int $$0, cot $$1) {
      return new csg($$0, $$1, this, this.f);
   }
}
