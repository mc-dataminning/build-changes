import java.util.Arrays;
import javax.annotation.Nullable;

public class dpi extends doz implements bre {
   private static final int g = 3;
   private static final int h = 4;
   private static final int[] i = new int[]{3};
   private static final int[] j = new int[]{0, 1, 2, 3};
   private static final int[] k = new int[]{0, 1, 2, 4};
   public static final int b = 20;
   public static final int c = 0;
   public static final int d = 1;
   public static final int e = 2;
   private jr<cun> l = jr.a(5, cun.l);
   int m;
   private boolean[] q;
   private cui r;
   int s;
   protected final cqc f = new cqc() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dpi.this.m;
            case 1 -> dpi.this.s;
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dpi.this.m = $$1;
               break;
            case 1:
               dpi.this.s = $$1;
         }
      }

      @Override
      public int a() {
         return 2;
      }
   };

   public dpi(iz $$0, dsa $$1) {
      super(dph.l, $$0, $$1);
   }

   @Override
   protected xo k() {
      return xo.c("container.brewing");
   }

   @Override
   public int b() {
      return this.l.size();
   }

   @Override
   protected jr<cun> j() {
      return this.l;
   }

   @Override
   protected void a(jr<cun> $$0) {
      this.l = $$0;
   }

   public static void a(dbw $$0, iz $$1, dsa $$2, dpi $$3) {
      cun $$4 = $$3.l.get(4);
      if ($$3.s <= 0 && $$4.a(cuq.so)) {
         $$3.s = 20;
         $$4.h(1);
         a($$0, $$1, $$2);
      }

      boolean $$5 = a($$0.K(), $$3.l);
      boolean $$6 = $$3.m > 0;
      cun $$7 = $$3.l.get(3);
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
         $$3.r = $$7.g();
         a($$0, $$1, $$2);
      }

      boolean[] $$9 = $$3.f();
      if (!Arrays.equals($$9, $$3.q)) {
         $$3.q = $$9;
         dsa $$10 = $$2;
         if (!($$2.b() instanceof dfb)) {
            return;
         }

         for (int $$11 = 0; $$11 < dfb.b.length; $$11++) {
            $$10 = $$10.a(dfb.b[$$11], Boolean.valueOf($$9[$$11]));
         }

         $$0.a($$1, $$10, 2);
      }
   }

   private boolean[] f() {
      boolean[] $$0 = new boolean[3];

      for (int $$1 = 0; $$1 < 3; $$1++) {
         if (!this.l.get($$1).e()) {
            $$0[$$1] = true;
         }
      }

      return $$0;
   }

   private static boolean a(cwn $$0, jr<cun> $$1) {
      cun $$2 = $$1.get(3);
      if ($$2.e()) {
         return false;
      } else if (!$$0.a($$2)) {
         return false;
      } else {
         for (int $$3 = 0; $$3 < 3; $$3++) {
            cun $$4 = $$1.get($$3);
            if (!$$4.e() && $$0.a($$4, $$2)) {
               return true;
            }
         }

         return false;
      }
   }

   private static void a(dbw $$0, iz $$1, jr<cun> $$2) {
      cun $$3 = $$2.get(3);
      cwn $$4 = $$0.K();

      for (int $$5 = 0; $$5 < 3; $$5++) {
         $$2.set($$5, $$4.d($$3, $$2.get($$5)));
      }

      $$3.h(1);
      if ($$3.g().v()) {
         cun $$6 = new cun($$3.g().u());
         if ($$3.e()) {
            $$3 = $$6;
         } else {
            bqo.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$6);
         }
      }

      $$2.set(3, $$3);
      $$0.c(1035, $$1, 0);
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.l = jr.a(this.b(), cun.l);
      bqm.b($$0, this.l, $$1);
      this.m = $$0.g("BrewTime");
      this.s = $$0.f("Fuel");
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      $$0.a("BrewTime", (short)this.m);
      bqm.a($$0, this.l, $$1);
      $$0.a("Fuel", (byte)this.s);
   }

   @Override
   public boolean b(int $$0, cun $$1) {
      if ($$0 == 3) {
         cwn $$2 = this.n != null ? this.n.K() : cwn.b;
         return $$2.a($$1);
      } else {
         return $$0 == 4 ? $$1.a(cuq.so) : ($$1.a(cuq.sk) || $$1.a(cuq.vo) || $$1.a(cuq.vr) || $$1.a(cuq.sl)) && this.a($$0).e();
      }
   }

   @Override
   public int[] a(je $$0) {
      if ($$0 == je.b) {
         return i;
      } else {
         return $$0 == je.a ? j : k;
      }
   }

   @Override
   public boolean a(int $$0, cun $$1, @Nullable je $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cun $$1, je $$2) {
      return $$0 == 3 ? $$1.a(cuq.sl) : true;
   }

   @Override
   protected cps a(int $$0, cmu $$1) {
      return new cpx($$0, $$1, this, this.f);
   }
}
