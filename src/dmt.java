import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class dmt extends dnk implements cnf {
   public static final int e = 3;
   public static final int f = 3;
   public static final int g = 9;
   public static final int h = 1;
   public static final int i = 0;
   public static final int j = 9;
   public static final int k = 10;
   private iu<crj> r = iu.a(9, crj.i);
   private int s = 0;
   protected final cmz l = new cmz() {
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

   public dmt(ib $$0, doz $$1) {
      super(dmh.P, $$0, $$1);
   }

   @Override
   protected wg k() {
      return wg.c("container.crafter");
   }

   @Override
   protected cmp a(int $$0, cjs $$1) {
      return new cnd($$0, $$1, this, this.l);
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
   public boolean b(int $$0, crj $$1) {
      if (this.l.a($$0) == 1) {
         return false;
      } else {
         crj $$2 = this.r.get($$0);
         int $$3 = $$2.G();
         if ($$3 >= $$2.i()) {
            return false;
         } else {
            return $$2.d() ? true : !this.a($$3, $$2, $$0);
         }
      }
   }

   private boolean a(int $$0, crj $$1, int $$2) {
      for (int $$3 = $$2 + 1; $$3 < 9; $$3++) {
         if (!this.c($$3)) {
            crj $$4 = this.a($$3);
            if ($$4.d() || $$4.G() < $$0 && crj.c($$4, $$1)) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void a(tm $$0, in.a $$1) {
      super.a($$0, $$1);
      this.s = $$0.h("crafting_ticks_remaining");
      this.r = iu.a(this.b(), crj.i);
      if (!this.a_($$0)) {
         bnu.b($$0, this.r, $$1);
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
   protected void b(tm $$0, in.a $$1) {
      super.b($$0, $$1);
      $$0.a("crafting_ticks_remaining", this.s);
      if (!this.b_($$0)) {
         bnu.a($$0, this.r, $$1);
      }

      this.c($$0);
      this.d($$0);
   }

   @Override
   public int b() {
      return 9;
   }

   @Override
   public boolean ah_() {
      for (crj $$0 : this.r) {
         if (!$$0.d()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public crj a(int $$0) {
      return this.r.get($$0);
   }

   @Override
   public void a(int $$0, crj $$1) {
      if (this.c($$0)) {
         this.a($$0, true);
      }

      super.a($$0, $$1);
   }

   @Override
   public boolean a(cjt $$0) {
      return bnt.a(this, $$0);
   }

   @Override
   public iu<crj> j() {
      return this.r;
   }

   @Override
   protected void a(iu<crj> $$0) {
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
   public void a(cjx $$0) {
      for (crj $$1 : this.r) {
         $$0.a($$1);
      }
   }

   private void c(tm $$0) {
      IntList $$1 = new IntArrayList();

      for (int $$2 = 0; $$2 < 9; $$2++) {
         if (this.c($$2)) {
            $$1.add($$2);
         }
      }

      $$0.b("disabled_slots", $$1);
   }

   private void d(tm $$0) {
      $$0.a("triggered", this.l.a(9));
   }

   public void a(boolean $$0) {
      this.l.a(9, $$0 ? 1 : 0);
   }

   @VisibleForTesting
   public boolean l() {
      return this.l.a(9) == 1;
   }

   public static void a(cyx $$0, ib $$1, doz $$2, dmt $$3) {
      int $$4 = $$3.s - 1;
      if ($$4 >= 0) {
         $$3.s = $$4;
         if ($$4 == 0) {
            $$0.a($$1, $$2.a(ddr.b, Boolean.valueOf(false)), 3);
         }
      }
   }

   public void d(int $$0) {
      this.s = $$0;
   }

   public int t() {
      int $$0 = 0;

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         crj $$2 = this.a($$1);
         if (!$$2.d() || this.c($$1)) {
            $$0++;
         }
      }

      return $$0;
   }

   private boolean e(int $$0) {
      return $$0 > -1 && $$0 < 9 && this.r.get($$0).d();
   }
}
