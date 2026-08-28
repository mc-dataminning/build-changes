import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class dyr extends dzl implements cwi {
   public static final int d = 3;
   public static final int e = 3;
   public static final int f = 9;
   public static final int g = 1;
   public static final int h = 0;
   public static final int i = 9;
   public static final int j = 10;
   private static final int q = 0;
   private static final int r = 0;
   private jo<czy> s = jo.a(9, czy.k);
   private int t = 0;
   protected final cwc k = new cwc() {
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

   public dyr(iv $$0, ebe $$1) {
      super(dye.Q, $$0, $$1);
   }

   @Override
   protected xa j() {
      return xa.c("container.crafter");
   }

   @Override
   protected cvq a(int $$0, crw $$1) {
      return new cwg($$0, $$1, this, this.k);
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
   public boolean b(int $$0, czy $$1) {
      if (this.k.a($$0) == 1) {
         return false;
      } else {
         czy $$2 = this.s.get($$0);
         int $$3 = $$2.M();
         if ($$3 >= $$2.k()) {
            return false;
         } else {
            return $$2.f() ? true : !this.a($$3, $$2, $$0);
         }
      }
   }

   private boolean a(int $$0, czy $$1, int $$2) {
      for (int $$3 = $$2 + 1; $$3 < 9; $$3++) {
         if (!this.c($$3)) {
            czy $$4 = this.a($$3);
            if ($$4.f() || $$4.M() < $$0 && czy.c($$4, $$1)) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.t = $$0.b("crafting_ticks_remaining", 0);
      this.s = jo.a(this.b(), czy.k);
      if (!this.b_($$0)) {
         bul.b($$0, this.s, $$1);
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
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      $$0.a("crafting_ticks_remaining", this.t);
      if (!this.c_($$0)) {
         bul.a($$0, this.s, $$1);
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
      for (czy $$0 : this.s) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public czy a(int $$0) {
      return this.s.get($$0);
   }

   @Override
   public void a(int $$0, czy $$1) {
      if (this.c($$0)) {
         this.a($$0, true);
      }

      super.a($$0, $$1);
   }

   @Override
   public boolean a(crx $$0) {
      return buk.a(this, $$0);
   }

   @Override
   public jo<czy> f() {
      return this.s;
   }

   @Override
   protected void a(jo<czy> $$0) {
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
   public void fillStackedContents(csd $$0) {
      for (czy $$1 : this.s) {
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

      $$0.a("disabled_slots", $$1.toIntArray());
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

   public static void a(djx $$0, iv $$1, ebe $$2, dyr $$3) {
      int $$4 = $$3.t - 1;
      if ($$4 >= 0) {
         $$3.t = $$4;
         if ($$4 == 0) {
            $$0.a($$1, $$2.b(dow.b, Boolean.valueOf(false)), 3);
         }
      }
   }

   public void d(int $$0) {
      this.t = $$0;
   }

   public int s() {
      int $$0 = 0;

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         czy $$2 = this.a($$1);
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
