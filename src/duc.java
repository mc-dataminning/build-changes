import java.util.Arrays;
import javax.annotation.Nullable;

public class duc extends dtt implements bsu {
   private static final int g = 3;
   private static final int h = 4;
   private static final int[] i = new int[]{3};
   private static final int[] j = new int[]{0, 1, 2, 3};
   private static final int[] k = new int[]{0, 1, 2, 4};
   public static final int b = 20;
   public static final int c = 0;
   public static final int d = 1;
   public static final int e = 2;
   private ka<cwp> l = ka.a(5, cwp.j);
   int m;
   private boolean[] q;
   private cwl r;
   int s;
   protected final cso f = new cso() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> duc.this.m;
            case 1 -> duc.this.s;
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               duc.this.m = $$1;
               break;
            case 1:
               duc.this.s = $$1;
         }
      }

      @Override
      public int a() {
         return 2;
      }
   };

   public duc(ji $$0, dwx $$1) {
      super(dub.m, $$0, $$1);
   }

   @Override
   protected wp j() {
      return wp.c("container.brewing");
   }

   @Override
   public int b() {
      return this.l.size();
   }

   @Override
   protected ka<cwp> f() {
      return this.l;
   }

   @Override
   protected void a(ka<cwp> $$0) {
      this.l = $$0;
   }

   public static void a(dgi $$0, ji $$1, dwx $$2, duc $$3) {
      cwp $$4 = $$3.l.get(4);
      if ($$3.s <= 0 && $$4.a(awy.X)) {
         $$3.s = 20;
         $$4.h(1);
         a($$0, $$1, $$2);
      }

      boolean $$5 = a($$0.L(), $$3.l);
      boolean $$6 = $$3.m > 0;
      cwp $$7 = $$3.l.get(3);
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
         dwx $$10 = $$2;
         if (!($$2.b() instanceof djr)) {
            return;
         }

         for (int $$11 = 0; $$11 < djr.b.length; $$11++) {
            $$10 = $$10.b(djr.b[$$11], Boolean.valueOf($$9[$$11]));
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

   private static boolean a(cyn $$0, ka<cwp> $$1) {
      cwp $$2 = $$1.get(3);
      if ($$2.f()) {
         return false;
      } else if (!$$0.a($$2)) {
         return false;
      } else {
         for (int $$3 = 0; $$3 < 3; $$3++) {
            cwp $$4 = $$1.get($$3);
            if (!$$4.f() && $$0.a($$4, $$2)) {
               return true;
            }
         }

         return false;
      }
   }

   private static void a(dgi $$0, ji $$1, ka<cwp> $$2) {
      cwp $$3 = $$2.get(3);
      cyn $$4 = $$0.L();

      for (int $$5 = 0; $$5 < 3; $$5++) {
         $$2.set($$5, $$4.d($$3, $$2.get($$5)));
      }

      $$3.h(1);
      cwp $$6 = $$3.h().k();
      if (!$$6.f()) {
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
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.l = ka.a(this.b(), cwp.j);
      bse.b($$0, this.l, $$1);
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
      bse.a($$0, this.l, $$1);
      $$0.a("Fuel", (byte)this.s);
   }

   @Override
   public boolean b(int $$0, cwp $$1) {
      if ($$0 == 3) {
         cyn $$2 = this.n != null ? this.n.L() : cyn.b;
         return $$2.a($$1);
      } else {
         return $$0 == 4 ? $$1.a(awy.X) : ($$1.a(cwt.ti) || $$1.a(cwt.wo) || $$1.a(cwt.wr) || $$1.a(cwt.th)) && this.a($$0).f();
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
   public boolean a(int $$0, cwp $$1, @Nullable jn $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cwp $$1, jn $$2) {
      return $$0 == 3 ? $$1.a(cwt.th) : true;
   }

   @Override
   protected csc a(int $$0, cow $$1) {
      return new csj($$0, $$1, this, this.f);
   }
}
