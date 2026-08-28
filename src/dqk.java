import java.util.Arrays;
import javax.annotation.Nullable;

public class dqk extends dqb implements brd {
   private static final int g = 3;
   private static final int h = 4;
   private static final int[] i = new int[]{3};
   private static final int[] j = new int[]{0, 1, 2, 3};
   private static final int[] k = new int[]{0, 1, 2, 4};
   public static final int b = 20;
   public static final int c = 0;
   public static final int d = 1;
   public static final int e = 2;
   private jv<cuq> l = jv.a(5, cuq.l);
   int m;
   private boolean[] q;
   private cul r;
   int s;
   protected final cqf f = new cqf() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dqk.this.m;
            case 1 -> dqk.this.s;
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dqk.this.m = $$1;
               break;
            case 1:
               dqk.this.s = $$1;
         }
      }

      @Override
      public int a() {
         return 2;
      }
   };

   public dqk(jd $$0, dtc $$1) {
      super(dqj.l, $$0, $$1);
   }

   @Override
   protected wz k() {
      return wz.c("container.brewing");
   }

   @Override
   public int b() {
      return this.l.size();
   }

   @Override
   protected jv<cuq> j() {
      return this.l;
   }

   @Override
   protected void a(jv<cuq> $$0) {
      this.l = $$0;
   }

   public static void a(dcw $$0, jd $$1, dtc $$2, dqk $$3) {
      cuq $$4 = $$3.l.get(4);
      if ($$3.s <= 0 && $$4.a(cut.so)) {
         $$3.s = 20;
         $$4.h(1);
         a($$0, $$1, $$2);
      }

      boolean $$5 = a($$0.K(), $$3.l);
      boolean $$6 = $$3.m > 0;
      cuq $$7 = $$3.l.get(3);
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
         $$3.r = $$7.g();
         a($$0, $$1, $$2);
      }

      boolean[] $$9 = $$3.f();
      if (!Arrays.equals($$9, $$3.q)) {
         $$3.q = $$9;
         dtc $$10 = $$2;
         if (!($$2.b() instanceof dgc)) {
            return;
         }

         for (int $$11 = 0; $$11 < dgc.b.length; $$11++) {
            $$10 = $$10.a(dgc.b[$$11], Boolean.valueOf($$9[$$11]));
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

   private static boolean a(cwt $$0, jv<cuq> $$1) {
      cuq $$2 = $$1.get(3);
      if ($$2.e()) {
         return false;
      } else if (!$$0.a($$2)) {
         return false;
      } else {
         for (int $$3 = 0; $$3 < 3; $$3++) {
            cuq $$4 = $$1.get($$3);
            if (!$$4.e() && $$0.a($$4, $$2)) {
               return true;
            }
         }

         return false;
      }
   }

   private static void a(dcw $$0, jd $$1, jv<cuq> $$2) {
      cuq $$3 = $$2.get(3);
      cwt $$4 = $$0.K();

      for (int $$5 = 0; $$5 < 3; $$5++) {
         $$2.set($$5, $$4.d($$3, $$2.get($$5)));
      }

      $$3.h(1);
      if ($$3.g().v()) {
         cuq $$6 = new cuq($$3.g().u());
         if ($$3.e()) {
            $$3 = $$6;
         } else {
            bqn.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$6);
         }
      }

      $$2.set(3, $$3);
      $$0.c(1035, $$1, 0);
   }

   @Override
   protected void a(ub $$0, jo.a $$1) {
      super.a($$0, $$1);
      this.l = jv.a(this.b(), cuq.l);
      bql.b($$0, this.l, $$1);
      this.m = $$0.g("BrewTime");
      if (this.m > 0) {
         this.r = this.l.get(3).g();
      }

      this.s = $$0.f("Fuel");
   }

   @Override
   protected void b(ub $$0, jo.a $$1) {
      super.b($$0, $$1);
      $$0.a("BrewTime", (short)this.m);
      bql.a($$0, this.l, $$1);
      $$0.a("Fuel", (byte)this.s);
   }

   @Override
   public boolean b(int $$0, cuq $$1) {
      if ($$0 == 3) {
         cwt $$2 = this.n != null ? this.n.K() : cwt.b;
         return $$2.a($$1);
      } else {
         return $$0 == 4 ? $$1.a(cut.so) : ($$1.a(cut.sk) || $$1.a(cut.vo) || $$1.a(cut.vr) || $$1.a(cut.sl)) && this.a($$0).e();
      }
   }

   @Override
   public int[] a(ji $$0) {
      if ($$0 == ji.b) {
         return i;
      } else {
         return $$0 == ji.a ? j : k;
      }
   }

   @Override
   public boolean a(int $$0, cuq $$1, @Nullable ji $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cuq $$1, ji $$2) {
      return $$0 == 3 ? $$1.a(cut.sl) : true;
   }

   @Override
   protected cpu a(int $$0, cmw $$1) {
      return new cqa($$0, $$1, this, this.f);
   }
}
