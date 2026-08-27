import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class dkw extends dlm implements cmg {
   public static final int e = 3;
   public static final int f = 3;
   public static final int g = 9;
   public static final int h = 1;
   public static final int i = 0;
   public static final int j = 9;
   public static final int k = 10;
   private iu<cqm> r = iu.a(9, cqm.h);
   private int s = 0;
   protected final cma l = new cma() {
      private final int[] b = new int[9];
      private int c = 0;

      @Override
      public int a(int $$0) {
         return $$0 == 9 ? this.c : this.b[$$0];
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 9) {
            this.c = $$1;
         } else {
            this.b[$$0] = $$1;
         }
      }

      @Override
      public int a() {
         return 10;
      }
   };

   public dkw(ib $$0, dnb $$1) {
      super(dkk.P, $$0, $$1);
   }

   @Override
   protected vu k() {
      return vu.c("container.crafter");
   }

   @Override
   protected clq a(int $$0, cit $$1) {
      return new cme($$0, $$1, this, this.l);
   }

   public void a(int $$0, boolean $$1) {
      if (this.e($$0)) {
         this.l.a($$0, $$1 ? 0 : 1);
         this.e();
      }
   }

   public boolean c(int $$0) {
      return $$0 >= 0 && $$0 < 9 ? this.l.a($$0) == 1 : false;
   }

   @Override
   public boolean b(int $$0, cqm $$1) {
      if (this.l.a($$0) == 1) {
         return false;
      } else {
         cqm $$2 = this.r.get($$0);
         int $$3 = $$2.M();
         if ($$3 >= $$2.g()) {
            return false;
         } else {
            return $$2.b() ? true : !this.a($$3, $$2, $$0);
         }
      }
   }

   private boolean a(int $$0, cqm $$1, int $$2) {
      for (int $$3 = $$2 + 1; $$3 < 9; $$3++) {
         if (!this.c($$3)) {
            cqm $$4 = this.a($$3);
            if ($$4.b() || $$4.M() < $$0 && cqm.c($$4, $$1)) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void a(ta $$0, in.a $$1) {
      super.a($$0, $$1);
      this.s = $$0.h("crafting_ticks_remaining");
      this.r = iu.a(this.b(), cqm.h);
      if (!this.c_($$0)) {
         bmx.b($$0, this.r);
      }

      int[] $$2 = $$0.n("disabled_slots");

      for (int $$3 = 0; $$3 < 9; $$3++) {
         this.l.a($$3, 0);
      }

      for (int $$4 : $$2) {
         if (this.e($$4)) {
            this.l.a($$4, 1);
         }
      }

      this.l.a(9, $$0.h("triggered"));
   }

   @Override
   protected void b(ta $$0, in.a $$1) {
      super.b($$0, $$1);
      $$0.a("crafting_ticks_remaining", this.s);
      if (!this.b($$0)) {
         bmx.a($$0, this.r);
      }

      this.c($$0);
      this.d($$0);
   }

   @Override
   public int b() {
      return 9;
   }

   @Override
   public boolean ai_() {
      for (cqm $$0 : this.r) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cqm a(int $$0) {
      return this.r.get($$0);
   }

   @Override
   public void a(int $$0, cqm $$1) {
      if (this.c($$0)) {
         this.a($$0, true);
      }

      super.a($$0, $$1);
   }

   @Override
   public boolean a(ciu $$0) {
      return bmw.a(this, $$0);
   }

   @Override
   public iu<cqm> j() {
      return this.r;
   }

   @Override
   protected void a(iu<cqm> $$0) {
      this.r = $$0;
   }

   @Override
   public int f() {
      return 3;
   }

   @Override
   public int g() {
      return 3;
   }

   @Override
   public void a(ciy $$0) {
      for (cqm $$1 : this.r) {
         $$0.a($$1);
      }
   }

   private void c(ta $$0) {
      IntList $$1 = new IntArrayList();

      for (int $$2 = 0; $$2 < 9; $$2++) {
         if (this.c($$2)) {
            $$1.add($$2);
         }
      }

      $$0.b("disabled_slots", $$1);
   }

   private void d(ta $$0) {
      $$0.a("triggered", this.l.a(9));
   }

   public void a(boolean $$0) {
      this.l.a(9, $$0 ? 1 : 0);
   }

   @VisibleForTesting
   public boolean l() {
      return this.l.a(9) == 1;
   }

   public static void a(cxb $$0, ib $$1, dnb $$2, dkw $$3) {
      int $$4 = $$3.s - 1;
      if ($$4 >= 0) {
         $$3.s = $$4;
         if ($$4 == 0) {
            $$0.a($$1, $$2.a(dbv.b, Boolean.valueOf(false)), 3);
         }
      }
   }

   public void d(int $$0) {
      this.s = $$0;
   }

   public int s() {
      int $$0 = 0;

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cqm $$2 = this.a($$1);
         if (!$$2.b() || this.c($$1)) {
            $$0++;
         }
      }

      return $$0;
   }

   private boolean e(int $$0) {
      return $$0 > -1 && $$0 < 9 && this.r.get($$0).b();
   }
}
