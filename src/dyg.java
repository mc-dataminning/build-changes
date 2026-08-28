import java.util.Arrays;
import javax.annotation.Nullable;

public class dyg extends dxv implements bvb {
   private static final int g = 3;
   private static final int h = 4;
   private static final int[] i = new int[]{3};
   private static final int[] j = new int[]{0, 1, 2, 3};
   private static final int[] k = new int[]{0, 1, 2, 4};
   public static final int b = 20;
   public static final int c = 0;
   public static final int d = 1;
   public static final int e = 2;
   private static final short l = 0;
   private static final byte m = 0;
   private jo<czy> q = jo.a(5, czy.k);
   int r;
   private boolean[] s;
   private czu t;
   int u;
   protected final cwc f = new cwc() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dyg.this.r;
            case 1 -> dyg.this.u;
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dyg.this.r = $$1;
               break;
            case 1:
               dyg.this.u = $$1;
         }
      }

      @Override
      public int a() {
         return 2;
      }
   };

   public dyg(iv $$0, ebe $$1) {
      super(dye.m, $$0, $$1);
   }

   @Override
   protected xa j() {
      return xa.c("container.brewing");
   }

   @Override
   public int b() {
      return this.q.size();
   }

   @Override
   protected jo<czy> f() {
      return this.q;
   }

   @Override
   protected void a(jo<czy> $$0) {
      this.q = $$0;
   }

   public static void a(djx $$0, iv $$1, ebe $$2, dyg $$3) {
      czy $$4 = $$3.q.get(4);
      if ($$3.u <= 0 && $$4.a(axm.X)) {
         $$3.u = 20;
         $$4.h(1);
         a($$0, $$1, $$2);
      }

      boolean $$5 = a($$0.L(), $$3.q);
      boolean $$6 = $$3.r > 0;
      czy $$7 = $$3.q.get(3);
      if ($$6) {
         $$3.r--;
         boolean $$8 = $$3.r == 0;
         if ($$8 && $$5) {
            a($$0, $$1, $$3.q);
         } else if (!$$5 || !$$7.a($$3.t)) {
            $$3.r = 0;
         }

         a($$0, $$1, $$2);
      } else if ($$5 && $$3.u > 0) {
         $$3.u--;
         $$3.r = 400;
         $$3.t = $$7.h();
         a($$0, $$1, $$2);
      }

      boolean[] $$9 = $$3.k();
      if (!Arrays.equals($$9, $$3.s)) {
         $$3.s = $$9;
         ebe $$10 = $$2;
         if (!($$2.b() instanceof dnh)) {
            return;
         }

         for (int $$11 = 0; $$11 < dnh.b.length; $$11++) {
            $$10 = $$10.b(dnh.b[$$11], Boolean.valueOf($$9[$$11]));
         }

         $$0.a($$1, $$10, 2);
      }
   }

   private boolean[] k() {
      boolean[] $$0 = new boolean[3];

      for (int $$1 = 0; $$1 < 3; $$1++) {
         if (!this.q.get($$1).f()) {
            $$0[$$1] = true;
         }
      }

      return $$0;
   }

   private static boolean a(dbt $$0, jo<czy> $$1) {
      czy $$2 = $$1.get(3);
      if ($$2.f()) {
         return false;
      } else if (!$$0.a($$2)) {
         return false;
      } else {
         for (int $$3 = 0; $$3 < 3; $$3++) {
            czy $$4 = $$1.get($$3);
            if (!$$4.f() && $$0.a($$4, $$2)) {
               return true;
            }
         }

         return false;
      }
   }

   private static void a(djx $$0, iv $$1, jo<czy> $$2) {
      czy $$3 = $$2.get(3);
      dbt $$4 = $$0.L();

      for (int $$5 = 0; $$5 < 3; $$5++) {
         $$2.set($$5, $$4.d($$3, $$2.get($$5)));
      }

      $$3.h(1);
      czy $$6 = $$3.h().i();
      if (!$$6.f()) {
         if ($$3.f()) {
            $$3 = $$6;
         } else {
            bun.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$6);
         }
      }

      $$2.set(3, $$3);
      $$0.c(1035, $$1, 0);
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.q = jo.a(this.b(), czy.k);
      bul.b($$0, this.q, $$1);
      this.r = $$0.b("BrewTime", (short)0);
      if (this.r > 0) {
         this.t = this.q.get(3).h();
      }

      this.u = $$0.b("Fuel", (byte)0);
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      $$0.a("BrewTime", (short)this.r);
      bul.a($$0, this.q, $$1);
      $$0.a("Fuel", (byte)this.u);
   }

   @Override
   public boolean b(int $$0, czy $$1) {
      if ($$0 == 3) {
         dbt $$2 = this.n != null ? this.n.L() : dbt.b;
         return $$2.a($$1);
      } else {
         return $$0 == 4 ? $$1.a(axm.X) : ($$1.a(dac.tt) || $$1.a(dac.wz) || $$1.a(dac.wC) || $$1.a(dac.ts)) && this.a($$0).f();
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
   public boolean a(int $$0, czy $$1, @Nullable jb $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, czy $$1, jb $$2) {
      return $$0 == 3 ? $$1.a(dac.ts) : true;
   }

   @Override
   protected cvq a(int $$0, crw $$1) {
      return new cvx($$0, $$1, this, this.f);
   }
}
