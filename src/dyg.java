import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class dyg extends dza implements cvx {
   public static final int d = 3;
   public static final int e = 3;
   public static final int f = 9;
   public static final int g = 1;
   public static final int h = 0;
   public static final int i = 9;
   public static final int j = 10;
   private jo<czn> q = jo.a(9, czn.k);
   private int r = 0;
   protected final cvr k = new cvr() {
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

   public dyg(iv $$0, eat $$1) {
      super(dxt.Q, $$0, $$1);
   }

   @Override
   protected wy j() {
      return wy.c("container.crafter");
   }

   @Override
   protected cvf a(int $$0, crl $$1) {
      return new cvv($$0, $$1, this, this.k);
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
   public boolean b(int $$0, czn $$1) {
      if (this.k.a($$0) == 1) {
         return false;
      } else {
         czn $$2 = this.q.get($$0);
         int $$3 = $$2.M();
         if ($$3 >= $$2.k()) {
            return false;
         } else {
            return $$2.f() ? true : !this.a($$3, $$2, $$0);
         }
      }
   }

   private boolean a(int $$0, czn $$1, int $$2) {
      for (int $$3 = $$2 + 1; $$3 < 9; $$3++) {
         if (!this.c($$3)) {
            czn $$4 = this.a($$3);
            if ($$4.f() || $$4.M() < $$0 && czn.c($$4, $$1)) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.r = $$0.f("crafting_ticks_remaining");
      this.q = jo.a(this.b(), czn.k);
      if (!this.b_($$0)) {
         bua.b($$0, this.q, $$1);
      }

      int[] $$2 = $$0.l("disabled_slots");

      for (int $$3 = 0; $$3 < 9; $$3++) {
         this.k.a($$3, 0);
      }

      for (int $$4 : $$2) {
         if (this.e($$4)) {
            this.k.a($$4, 1);
         }
      }

      this.k.a(9, $$0.f("triggered"));
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      $$0.a("crafting_ticks_remaining", this.r);
      if (!this.c_($$0)) {
         bua.a($$0, this.q, $$1);
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
      for (czn $$0 : this.q) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public czn a(int $$0) {
      return this.q.get($$0);
   }

   @Override
   public void a(int $$0, czn $$1) {
      if (this.c($$0)) {
         this.a($$0, true);
      }

      super.a($$0, $$1);
   }

   @Override
   public boolean a(crm $$0) {
      return btz.a(this, $$0);
   }

   @Override
   public jo<czn> f() {
      return this.q;
   }

   @Override
   protected void a(jo<czn> $$0) {
      this.q = $$0;
   }

   @Override
   public int av_() {
      return 3;
   }

   @Override
   public int g() {
      return 3;
   }

   @Override
   public void fillStackedContents(crs $$0) {
      for (czn $$1 : this.q) {
         $$0.a($$1);
      }
   }

   private void c(tz $$0) {
      IntList $$1 = new IntArrayList();

      for (int $$2 = 0; $$2 < 9; $$2++) {
         if (this.c($$2)) {
            $$1.add($$2);
         }
      }

      $$0.b("disabled_slots", $$1);
   }

   private void d(tz $$0) {
      $$0.a("triggered", this.k.a(9));
   }

   public void a(boolean $$0) {
      this.k.a(9, $$0 ? 1 : 0);
   }

   @VisibleForTesting
   public boolean k() {
      return this.k.a(9) == 1;
   }

   public static void a(djm $$0, iv $$1, eat $$2, dyg $$3) {
      int $$4 = $$3.r - 1;
      if ($$4 >= 0) {
         $$3.r = $$4;
         if ($$4 == 0) {
            $$0.a($$1, $$2.b(dol.b, Boolean.valueOf(false)), 3);
         }
      }
   }

   public void d(int $$0) {
      this.r = $$0;
   }

   public int s() {
      int $$0 = 0;

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         czn $$2 = this.a($$1);
         if (!$$2.f() || this.c($$1)) {
            $$0++;
         }
      }

      return $$0;
   }

   private boolean e(int $$0) {
      return $$0 > -1 && $$0 < 9 && this.q.get($$0).f();
   }
}
