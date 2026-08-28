import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class dsj extends dtc implements crr {
   public static final int d = 3;
   public static final int e = 3;
   public static final int f = 9;
   public static final int g = 1;
   public static final int h = 0;
   public static final int i = 9;
   public static final int j = 10;
   private jx<cvs> n = jx.a(9, cvs.k);
   private int r = 0;
   protected final crl k = new crl() {
      private final int[] a = new int[9];
      private int b = 0;

      @Override
      public int a(int $$0) {
         return $$0 == 9 ? this.b : this.a[$$0];
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 9) {
            this.b = $$1;
         } else {
            this.a[$$0] = $$1;
         }
      }

      @Override
      public int a() {
         return 10;
      }
   };

   public dsj(jf $$0, dus $$1) {
      super(drx.P, $$0, $$1);
   }

   @Override
   protected xe j() {
      return xe.c("container.crafter");
   }

   @Override
   protected cqz a(int $$0, cnw $$1) {
      return new crp($$0, $$1, this, this.k);
   }

   public void a(int $$0, boolean $$1) {
      if (this.e($$0)) {
         this.k.a($$0, $$1 ? 0 : 1);
         this.e();
      }
   }

   public boolean c(int $$0) {
      return $$0 >= 0 && $$0 < 9 ? this.k.a($$0) == 1 : false;
   }

   @Override
   public boolean b(int $$0, cvs $$1) {
      if (this.k.a($$0) == 1) {
         return false;
      } else {
         cvs $$2 = this.n.get($$0);
         int $$3 = $$2.K();
         if ($$3 >= $$2.k()) {
            return false;
         } else {
            return $$2.f() ? true : !this.a($$3, $$2, $$0);
         }
      }
   }

   private boolean a(int $$0, cvs $$1, int $$2) {
      for (int $$3 = $$2 + 1; $$3 < 9; $$3++) {
         if (!this.c($$3)) {
            cvs $$4 = this.a($$3);
            if ($$4.f() || $$4.K() < $$0 && cvs.c($$4, $$1)) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected void a(ug $$0, jq.a $$1) {
      super.a($$0, $$1);
      this.r = $$0.h("crafting_ticks_remaining");
      this.n = jx.a(this.b(), cvs.k);
      if (!this.b_($$0)) {
         brm.b($$0, this.n, $$1);
      }

      int[] $$2 = $$0.n("disabled_slots");

      for (int $$3 = 0; $$3 < 9; $$3++) {
         this.k.a($$3, 0);
      }

      for (int $$4 : $$2) {
         if (this.e($$4)) {
            this.k.a($$4, 1);
         }
      }

      this.k.a(9, $$0.h("triggered"));
   }

   @Override
   protected void b(ug $$0, jq.a $$1) {
      super.b($$0, $$1);
      $$0.a("crafting_ticks_remaining", this.r);
      if (!this.c_($$0)) {
         brm.a($$0, this.n, $$1);
      }

      this.c($$0);
      this.d($$0);
   }

   @Override
   public int b() {
      return 9;
   }

   @Override
   public boolean c() {
      for (cvs $$0 : this.n) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cvs a(int $$0) {
      return this.n.get($$0);
   }

   @Override
   public void a(int $$0, cvs $$1) {
      if (this.c($$0)) {
         this.a($$0, true);
      }

      super.a($$0, $$1);
   }

   @Override
   public boolean a(cnx $$0) {
      return brl.a(this, $$0);
   }

   @Override
   public jx<cvs> f() {
      return this.n;
   }

   @Override
   protected void a(jx<cvs> $$0) {
      this.n = $$0;
   }

   @Override
   public int aA_() {
      return 3;
   }

   @Override
   public int g() {
      return 3;
   }

   @Override
   public void fillStackedContents(coc $$0) {
      for (cvs $$1 : this.n) {
         $$0.a($$1);
      }
   }

   private void c(ug $$0) {
      IntList $$1 = new IntArrayList();

      for (int $$2 = 0; $$2 < 9; $$2++) {
         if (this.c($$2)) {
            $$1.add($$2);
         }
      }

      $$0.b("disabled_slots", $$1);
   }

   private void d(ug $$0) {
      $$0.a("triggered", this.k.a(9));
   }

   public void a(boolean $$0) {
      this.k.a(9, $$0 ? 1 : 0);
   }

   @VisibleForTesting
   public boolean k() {
      return this.k.a(9) == 1;
   }

   public static void a(dej $$0, jf $$1, dus $$2, dsj $$3) {
      int $$4 = $$3.r - 1;
      if ($$4 >= 0) {
         $$3.r = $$4;
         if ($$4 == 0) {
            $$0.a($$1, $$2.b(djf.b, Boolean.valueOf(false)), 3);
         }
      }
   }

   public void d(int $$0) {
      this.r = $$0;
   }

   public int t() {
      int $$0 = 0;

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cvs $$2 = this.a($$1);
         if (!$$2.f() || this.c($$1)) {
            $$0++;
         }
      }

      return $$0;
   }

   private boolean e(int $$0) {
      return $$0 > -1 && $$0 < 9 && this.n.get($$0).f();
   }
}
