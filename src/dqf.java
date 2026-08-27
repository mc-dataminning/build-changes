import java.util.Arrays;
import javax.annotation.Nullable;

public class dqf extends dpv implements bqm {
   private static final int g = 3;
   private static final int h = 4;
   private static final int[] i = new int[]{3};
   private static final int[] j = new int[]{0, 1, 2, 3};
   private static final int[] k = new int[]{0, 1, 2, 4};
   public static final int b = 20;
   public static final int c = 0;
   public static final int d = 1;
   public static final int e = 2;
   private jj<cuh> l = jj.a(5, cuh.i);
   int m;
   private boolean[] q;
   private cuc r;
   int s;
   protected final cpq f = new cpq() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dqf.this.m;
            case 1 -> dqf.this.s;
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dqf.this.m = $$1;
               break;
            case 1:
               dqf.this.s = $$1;
         }
      }

      @Override
      public int a() {
         return 2;
      }
   };

   public dqf(ir $$0, dtc $$1) {
      super(dqe.m, $$0, $$1);
   }

   @Override
   protected xe k() {
      return xe.c("container.brewing");
   }

   @Override
   public int b() {
      return this.l.size();
   }

   @Override
   protected jj<cuh> j() {
      return this.l;
   }

   @Override
   protected void a(jj<cuh> $$0) {
      this.l = $$0;
   }

   public static void a(dca $$0, ir $$1, dtc $$2, dqf $$3) {
      cuh $$4 = $$3.l.get(4);
      if ($$3.s <= 0 && $$4.a(cuk.tL)) {
         $$3.s = 20;
         $$4.h(1);
         a($$0, $$1, $$2);
      }

      boolean $$5 = b($$3.l);
      boolean $$6 = $$3.m > 0;
      cuh $$7 = $$3.l.get(3);
      if ($$6) {
         $$3.m--;
         boolean $$8 = $$3.m == 0;
         if ($$8 && $$5) {
            a($$0, $$1, $$3.l);
            a($$0, $$1, $$2);
         } else if (!$$5 || !$$7.a($$3.r)) {
            $$3.m = 0;
            a($$0, $$1, $$2);
         }
      } else if ($$5 && $$3.s > 0) {
         $$3.s--;
         $$3.m = 400;
         $$3.r = $$7.f();
         a($$0, $$1, $$2);
      }

      boolean[] $$9 = $$3.f();
      if (!Arrays.equals($$9, $$3.q)) {
         $$3.q = $$9;
         dtc $$10 = $$2;
         if (!($$2.b() instanceof dfg)) {
            return;
         }

         for (int $$11 = 0; $$11 < dfg.b.length; $$11++) {
            $$10 = $$10.a(dfg.b[$$11], Boolean.valueOf($$9[$$11]));
         }

         $$0.a($$1, $$10, 2);
      }
   }

   private boolean[] f() {
      boolean[] $$0 = new boolean[3];

      for (int $$1 = 0; $$1 < 3; $$1++) {
         if (!this.l.get($$1).d()) {
            $$0[$$1] = true;
         }
      }

      return $$0;
   }

   private static boolean b(jj<cuh> $$0) {
      cuh $$1 = $$0.get(3);
      if ($$1.d()) {
         return false;
      } else if (!cwq.a($$1)) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            cuh $$3 = $$0.get($$2);
            if (!$$3.d() && cwq.a($$3, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   private static void a(dca $$0, ir $$1, jj<cuh> $$2) {
      cuh $$3 = $$2.get(3);

      for (int $$4 = 0; $$4 < 3; $$4++) {
         $$2.set($$4, cwq.d($$3, $$2.get($$4)));
      }

      $$3.h(1);
      if ($$3.f().u()) {
         cuh $$5 = new cuh($$3.f().t());
         if ($$3.d()) {
            $$3 = $$5;
         } else {
            bpw.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$5);
         }
      }

      $$2.set(3, $$3);
      $$0.c(1035, $$1, 0);
   }

   @Override
   public void a(uk $$0, jc.a $$1) {
      super.a($$0, $$1);
      this.l = jj.a(this.b(), cuh.i);
      bpu.b($$0, this.l, $$1);
      this.m = $$0.g("BrewTime");
      this.s = $$0.f("Fuel");
   }

   @Override
   protected void b(uk $$0, jc.a $$1) {
      super.b($$0, $$1);
      $$0.a("BrewTime", (short)this.m);
      bpu.a($$0, this.l, $$1);
      $$0.a("Fuel", (byte)this.s);
   }

   @Override
   public boolean b(int $$0, cuh $$1) {
      if ($$0 == 3) {
         return cwq.a($$1);
      } else {
         return $$0 == 4 ? $$1.a(cuk.tL) : ($$1.a(cuk.tH) || $$1.a(cuk.wZ) || $$1.a(cuk.xc) || $$1.a(cuk.tI)) && this.a($$0).d();
      }
   }

   @Override
   public int[] a(iw $$0) {
      if ($$0 == iw.b) {
         return i;
      } else {
         return $$0 == iw.a ? j : k;
      }
   }

   @Override
   public boolean a(int $$0, cuh $$1, @Nullable iw $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cuh $$1, iw $$2) {
      return $$0 == 3 ? $$1.a(cuk.tI) : true;
   }

   @Override
   protected cpg a(int $$0, clx $$1) {
      return new cpl($$0, $$1, this, this.f);
   }
}
