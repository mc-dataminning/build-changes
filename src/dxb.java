import java.util.Arrays;
import javax.annotation.Nullable;

public class dxb extends dwq implements bul {
   private static final int g = 3;
   private static final int h = 4;
   private static final int[] i = new int[]{3};
   private static final int[] j = new int[]{0, 1, 2, 3};
   private static final int[] k = new int[]{0, 1, 2, 4};
   public static final int b = 20;
   public static final int c = 0;
   public static final int d = 1;
   public static final int e = 2;
   private jn<cyy> l = jn.a(5, cyy.k);
   int m;
   private boolean[] q;
   private cyu r;
   int s;
   protected final cvc f = new cvc() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dxb.this.m;
            case 1 -> dxb.this.s;
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dxb.this.m = $$1;
               break;
            case 1:
               dxb.this.s = $$1;
         }
      }

      @Override
      public int a() {
         return 2;
      }
   };

   public dxb(iu $$0, dzz $$1) {
      super(dwz.m, $$0, $$1);
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
   protected jn<cyy> f() {
      return this.l;
   }

   @Override
   protected void a(jn<cyy> $$0) {
      this.l = $$0;
   }

   public static void a(div $$0, iu $$1, dzz $$2, dxb $$3) {
      cyy $$4 = $$3.l.get(4);
      if ($$3.s <= 0 && $$4.a(axk.X)) {
         $$3.s = 20;
         $$4.h(1);
         a($$0, $$1, $$2);
      }

      boolean $$5 = a($$0.L(), $$3.l);
      boolean $$6 = $$3.m > 0;
      cyy $$7 = $$3.l.get(3);
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
         dzz $$10 = $$2;
         if (!($$2.b() instanceof dmf)) {
            return;
         }

         for (int $$11 = 0; $$11 < dmf.b.length; $$11++) {
            $$10 = $$10.b(dmf.b[$$11], Boolean.valueOf($$9[$$11]));
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

   private static boolean a(dat $$0, jn<cyy> $$1) {
      cyy $$2 = $$1.get(3);
      if ($$2.f()) {
         return false;
      } else if (!$$0.a($$2)) {
         return false;
      } else {
         for (int $$3 = 0; $$3 < 3; $$3++) {
            cyy $$4 = $$1.get($$3);
            if (!$$4.f() && $$0.a($$4, $$2)) {
               return true;
            }
         }

         return false;
      }
   }

   private static void a(div $$0, iu $$1, jn<cyy> $$2) {
      cyy $$3 = $$2.get(3);
      dat $$4 = $$0.L();

      for (int $$5 = 0; $$5 < 3; $$5++) {
         $$2.set($$5, $$4.d($$3, $$2.get($$5)));
      }

      $$3.h(1);
      cyy $$6 = $$3.h().i();
      if (!$$6.f()) {
         if ($$3.f()) {
            $$3 = $$6;
         } else {
            btx.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$6);
         }
      }

      $$2.set(3, $$3);
      $$0.c(1035, $$1, 0);
   }

   @Override
   protected void a(tz $$0, jg.a $$1) {
      super.a($$0, $$1);
      this.l = jn.a(this.b(), cyy.k);
      btv.b($$0, this.l, $$1);
      this.m = $$0.g("BrewTime");
      if (this.m > 0) {
         this.r = this.l.get(3).h();
      }

      this.s = $$0.f("Fuel");
   }

   @Override
   protected void b(tz $$0, jg.a $$1) {
      super.b($$0, $$1);
      $$0.a("BrewTime", (short)this.m);
      btv.a($$0, this.l, $$1);
      $$0.a("Fuel", (byte)this.s);
   }

   @Override
   public boolean b(int $$0, cyy $$1) {
      if ($$0 == 3) {
         dat $$2 = this.n != null ? this.n.L() : dat.b;
         return $$2.a($$1);
      } else {
         return $$0 == 4 ? $$1.a(axk.X) : ($$1.a(czc.to) || $$1.a(czc.wu) || $$1.a(czc.wx) || $$1.a(czc.tn)) && this.a($$0).f();
      }
   }

   @Override
   public int[] a(ja $$0) {
      if ($$0 == ja.b) {
         return i;
      } else {
         return $$0 == ja.a ? j : k;
      }
   }

   @Override
   public boolean a(int $$0, cyy $$1, @Nullable ja $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cyy $$1, ja $$2) {
      return $$0 == 3 ? $$1.a(czc.tn) : true;
   }

   @Override
   protected cuq a(int $$0, cqx $$1) {
      return new cux($$0, $$1, this, this.f);
   }
}
