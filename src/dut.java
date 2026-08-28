import java.util.Arrays;
import javax.annotation.Nullable;

public class dut extends duk implements btk {
   private static final int g = 3;
   private static final int h = 4;
   private static final int[] i = new int[]{3};
   private static final int[] j = new int[]{0, 1, 2, 3};
   private static final int[] k = new int[]{0, 1, 2, 4};
   public static final int b = 20;
   public static final int c = 0;
   public static final int d = 1;
   public static final int e = 2;
   private jz<cxg> l = jz.a(5, cxg.j);
   int m;
   private boolean[] n;
   private cxc r;
   int s;
   protected final ctf f = new ctf() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dut.this.m;
            case 1 -> dut.this.s;
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dut.this.m = $$1;
               break;
            case 1:
               dut.this.s = $$1;
         }
      }

      @Override
      public int a() {
         return 2;
      }
   };

   public dut(jh $$0, dxo $$1) {
      super(dus.m, $$0, $$1);
   }

   @Override
   protected xk j() {
      return xk.c("container.brewing");
   }

   @Override
   public int b() {
      return this.l.size();
   }

   @Override
   protected jz<cxg> f() {
      return this.l;
   }

   @Override
   protected void a(jz<cxg> $$0) {
      this.l = $$0;
   }

   public static void a(dgz $$0, jh $$1, dxo $$2, dut $$3) {
      cxg $$4 = $$3.l.get(4);
      if ($$3.s <= 0 && $$4.a(axt.Z)) {
         $$3.s = 20;
         $$4.h(1);
         a($$0, $$1, $$2);
      }

      boolean $$5 = a($$0.L(), $$3.l);
      boolean $$6 = $$3.m > 0;
      cxg $$7 = $$3.l.get(3);
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
         dxo $$10 = $$2;
         if (!($$2.b() instanceof dki)) {
            return;
         }

         for (int $$11 = 0; $$11 < dki.b.length; $$11++) {
            $$10 = $$10.b(dki.b[$$11], Boolean.valueOf($$9[$$11]));
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

   private static boolean a(cze $$0, jz<cxg> $$1) {
      cxg $$2 = $$1.get(3);
      if ($$2.f()) {
         return false;
      } else if (!$$0.a($$2)) {
         return false;
      } else {
         for (int $$3 = 0; $$3 < 3; $$3++) {
            cxg $$4 = $$1.get($$3);
            if (!$$4.f() && $$0.a($$4, $$2)) {
               return true;
            }
         }

         return false;
      }
   }

   private static void a(dgz $$0, jh $$1, jz<cxg> $$2) {
      cxg $$3 = $$2.get(3);
      cze $$4 = $$0.L();

      for (int $$5 = 0; $$5 < 3; $$5++) {
         $$2.set($$5, $$4.d($$3, $$2.get($$5)));
      }

      $$3.h(1);
      cxg $$6 = $$3.h().k();
      if (!$$6.f()) {
         if ($$3.f()) {
            $$3 = $$6;
         } else {
            bsw.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$6);
         }
      }

      $$2.set(3, $$3);
      $$0.c(1035, $$1, 0);
   }

   @Override
   protected void a(um $$0, js.a $$1) {
      super.a($$0, $$1);
      this.l = jz.a(this.b(), cxg.j);
      bsu.b($$0, this.l, $$1);
      this.m = $$0.g("BrewTime");
      if (this.m > 0) {
         this.r = this.l.get(3).h();
      }

      this.s = $$0.f("Fuel");
   }

   @Override
   protected void b(um $$0, js.a $$1) {
      super.b($$0, $$1);
      $$0.a("BrewTime", (short)this.m);
      bsu.a($$0, this.l, $$1);
      $$0.a("Fuel", (byte)this.s);
   }

   @Override
   public boolean b(int $$0, cxg $$1) {
      if ($$0 == 3) {
         cze $$2 = this.o != null ? this.o.L() : cze.b;
         return $$2.a($$1);
      } else {
         return $$0 == 4 ? $$1.a(axt.Z) : ($$1.a(cxk.ti) || $$1.a(cxk.wo) || $$1.a(cxk.wr) || $$1.a(cxk.th)) && this.a($$0).f();
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
   public boolean a(int $$0, cxg $$1, @Nullable jm $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cxg $$1, jm $$2) {
      return $$0 == 3 ? $$1.a(cxk.th) : true;
   }

   @Override
   protected cst a(int $$0, cpn $$1) {
      return new cta($$0, $$1, this, this.f);
   }
}
