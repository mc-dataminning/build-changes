import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class drs extends dsl implements cri {
   public static final int d = 3;
   public static final int e = 3;
   public static final int f = 9;
   public static final int g = 1;
   public static final int h = 0;
   public static final int i = 9;
   public static final int j = 10;
   private jw<cvl> n = jw.a(9, cvl.k);
   private int r = 0;
   protected final crc k = new crc() {
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

   public drs(je $$0, dua $$1) {
      super(drg.P, $$0, $$1);
   }

   @Override
   protected xd j() {
      return xd.c("container.crafter");
   }

   @Override
   protected cqq a(int $$0, cno $$1) {
      return new crg($$0, $$1, this, this.k);
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
   public boolean b(int $$0, cvl $$1) {
      if (this.k.a($$0) == 1) {
         return false;
      } else {
         cvl $$2 = this.n.get($$0);
         int $$3 = $$2.J();
         if ($$3 >= $$2.k()) {
            return false;
         } else {
            return $$2.f() ? true : !this.a($$3, $$2, $$0);
         }
      }
   }

   private boolean a(int $$0, cvl $$1, int $$2) {
      for (int $$3 = $$2 + 1; $$3 < 9; $$3++) {
         if (!this.c($$3)) {
            cvl $$4 = this.a($$3);
            if ($$4.f() || $$4.J() < $$0 && cvl.c($$4, $$1)) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      this.r = $$0.h("crafting_ticks_remaining");
      this.n = jw.a(this.b(), cvl.k);
      if (!this.b_($$0)) {
         bre.b($$0, this.n, $$1);
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
   protected void b(uf $$0, jp.a $$1) {
      super.b($$0, $$1);
      $$0.a("crafting_ticks_remaining", this.r);
      if (!this.c_($$0)) {
         bre.a($$0, this.n, $$1);
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
      for (cvl $$0 : this.n) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cvl a(int $$0) {
      return this.n.get($$0);
   }

   @Override
   public void a(int $$0, cvl $$1) {
      if (this.c($$0)) {
         this.a($$0, true);
      }

      super.a($$0, $$1);
   }

   @Override
   public boolean a(cnp $$0) {
      return brd.a(this, $$0);
   }

   @Override
   public jw<cvl> f() {
      return this.n;
   }

   @Override
   protected void a(jw<cvl> $$0) {
      this.n = $$0;
   }

   @Override
   public int aB_() {
      return 3;
   }

   @Override
   public int g() {
      return 3;
   }

   @Override
   public void fillStackedContents(cnu $$0) {
      for (cvl $$1 : this.n) {
         $$0.a($$1);
      }
   }

   private void c(uf $$0) {
      IntList $$1 = new IntArrayList();

      for (int $$2 = 0; $$2 < 9; $$2++) {
         if (this.c($$2)) {
            $$1.add($$2);
         }
      }

      $$0.b("disabled_slots", $$1);
   }

   private void d(uf $$0) {
      $$0.a("triggered", this.k.a(9));
   }

   public void a(boolean $$0) {
      this.k.a(9, $$0 ? 1 : 0);
   }

   @VisibleForTesting
   public boolean k() {
      return this.k.a(9) == 1;
   }

   public static void a(dds $$0, je $$1, dua $$2, drs $$3) {
      int $$4 = $$3.r - 1;
      if ($$4 >= 0) {
         $$3.r = $$4;
         if ($$4 == 0) {
            $$0.a($$1, $$2.b(dio.b, Boolean.valueOf(false)), 3);
         }
      }
   }

   public void d(int $$0) {
      this.r = $$0;
   }

   public int t() {
      int $$0 = 0;

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cvl $$2 = this.a($$1);
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
