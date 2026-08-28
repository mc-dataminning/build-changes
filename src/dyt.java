import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class dyt extends dzn implements cwk {
   public static final int d = 3;
   public static final int e = 3;
   public static final int f = 9;
   public static final int g = 1;
   public static final int h = 0;
   public static final int i = 9;
   public static final int j = 10;
   private static final int q = 0;
   private static final int r = 0;
   private jp<daa> s = jp.a(9, daa.k);
   private int t = 0;
   protected final cwe k = new cwe() {
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

   public dyt(iw $$0, ebg $$1) {
      super(dyg.Q, $$0, $$1);
   }

   @Override
   protected xc j() {
      return xc.c("container.crafter");
   }

   @Override
   protected cvs a(int $$0, cry $$1) {
      return new cwi($$0, $$1, this, this.k);
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
   public boolean b(int $$0, daa $$1) {
      if (this.k.a($$0) == 1) {
         return false;
      } else {
         daa $$2 = this.s.get($$0);
         int $$3 = $$2.M();
         if ($$3 >= $$2.k()) {
            return false;
         } else {
            return $$2.f() ? true : !this.a($$3, $$2, $$0);
         }
      }
   }

   private boolean a(int $$0, daa $$1, int $$2) {
      for (int $$3 = $$2 + 1; $$3 < 9; $$3++) {
         if (!this.c($$3)) {
            daa $$4 = this.a($$3);
            if ($$4.f() || $$4.M() < $$0 && daa.c($$4, $$1)) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      this.t = $$0.b("crafting_ticks_remaining", 0);
      this.s = jp.a(this.b(), daa.k);
      if (!this.b_($$0)) {
         bun.b($$0, this.s, $$1);
      }

      for (int $$2 = 0; $$2 < 9; $$2++) {
         this.k.a($$2, 0);
      }

      $$0.k("disabled_slots").ifPresent($$0x -> {
         for (int $$1x : $$0x) {
            if (this.e($$1x)) {
               this.k.a($$1x, 1);
            }
         }
      });
      this.k.a(9, $$0.b("triggered", 0));
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      $$0.a("crafting_ticks_remaining", this.t);
      if (!this.c_($$0)) {
         bun.a($$0, this.s, $$1);
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
      for (daa $$0 : this.s) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public daa a(int $$0) {
      return this.s.get($$0);
   }

   @Override
   public void a(int $$0, daa $$1) {
      if (this.c($$0)) {
         this.a($$0, true);
      }

      super.a($$0, $$1);
   }

   @Override
   public boolean a(crz $$0) {
      return bum.a(this, $$0);
   }

   @Override
   public jp<daa> f() {
      return this.s;
   }

   @Override
   protected void a(jp<daa> $$0) {
      this.s = $$0;
   }

   @Override
   public int az_() {
      return 3;
   }

   @Override
   public int g() {
      return 3;
   }

   @Override
   public void fillStackedContents(csf $$0) {
      for (daa $$1 : this.s) {
         $$0.a($$1);
      }
   }

   private void c(ua $$0) {
      IntList $$1 = new IntArrayList();

      for (int $$2 = 0; $$2 < 9; $$2++) {
         if (this.c($$2)) {
            $$1.add($$2);
         }
      }

      $$0.a("disabled_slots", $$1.toIntArray());
   }

   private void d(ua $$0) {
      $$0.a("triggered", this.k.a(9));
   }

   public void a(boolean $$0) {
      this.k.a(9, $$0 ? 1 : 0);
   }

   @VisibleForTesting
   public boolean k() {
      return this.k.a(9) == 1;
   }

   public static void a(djz $$0, iw $$1, ebg $$2, dyt $$3) {
      int $$4 = $$3.t - 1;
      if ($$4 >= 0) {
         $$3.t = $$4;
         if ($$4 == 0) {
            $$0.a($$1, $$2.b(doy.b, Boolean.valueOf(false)), 3);
         }
      }
   }

   public void d(int $$0) {
      this.t = $$0;
   }

   public int s() {
      int $$0 = 0;

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         daa $$2 = this.a($$1);
         if (!$$2.f() || this.c($$1)) {
            $$0++;
         }
      }

      return $$0;
   }

   private boolean e(int $$0) {
      return $$0 > -1 && $$0 < 9 && this.s.get($$0).f();
   }
}
