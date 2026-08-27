import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class doa extends dor implements cou {
   public static final int d = 3;
   public static final int e = 3;
   public static final int f = 9;
   public static final int g = 1;
   public static final int h = 0;
   public static final int i = 9;
   public static final int j = 10;
   private jf<csz> q = jf.a(9, csz.i);
   private int r = 0;
   protected final coo k = new coo() {
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

   public doa(in $$0, dqh $$1) {
      super(dno.P, $$0, $$1);
   }

   @Override
   protected wu k() {
      return wu.c("container.crafter");
   }

   @Override
   protected cod a(int $$0, clg $$1) {
      return new cos($$0, $$1, this, this.k);
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
   public boolean b(int $$0, csz $$1) {
      if (this.k.a($$0) == 1) {
         return false;
      } else {
         csz $$2 = this.q.get($$0);
         int $$3 = $$2.G();
         if ($$3 >= $$2.i()) {
            return false;
         } else {
            return $$2.d() ? true : !this.a($$3, $$2, $$0);
         }
      }
   }

   private boolean a(int $$0, csz $$1, int $$2) {
      for (int $$3 = $$2 + 1; $$3 < 9; $$3++) {
         if (!this.c($$3)) {
            csz $$4 = this.a($$3);
            if ($$4.d() || $$4.G() < $$0 && csz.c($$4, $$1)) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void a(ua $$0, iy.a $$1) {
      super.a($$0, $$1);
      this.r = $$0.h("crafting_ticks_remaining");
      this.q = jf.a(this.b(), csz.i);
      if (!this.a_($$0)) {
         bpg.b($$0, this.q, $$1);
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
   protected void b(ua $$0, iy.a $$1) {
      super.b($$0, $$1);
      $$0.a("crafting_ticks_remaining", this.r);
      if (!this.b_($$0)) {
         bpg.a($$0, this.q, $$1);
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
      for (csz $$0 : this.q) {
         if (!$$0.d()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public csz a(int $$0) {
      return this.q.get($$0);
   }

   @Override
   public void a(int $$0, csz $$1) {
      if (this.c($$0)) {
         this.a($$0, true);
      }

      super.a($$0, $$1);
   }

   @Override
   public boolean a(clh $$0) {
      return bpf.a(this, $$0);
   }

   @Override
   public jf<csz> j() {
      return this.q;
   }

   @Override
   protected void a(jf<csz> $$0) {
      this.q = $$0;
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
   public void a(cll $$0) {
      for (csz $$1 : this.q) {
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

      $$0.b("disabled_slots", $$1);
   }

   private void d(ua $$0) {
      $$0.a("triggered", this.k.a(9));
   }

   public void a(boolean $$0) {
      this.k.a(9, $$0 ? 1 : 0);
   }

   @VisibleForTesting
   public boolean l() {
      return this.k.a(9) == 1;
   }

   public static void a(dad $$0, in $$1, dqh $$2, doa $$3) {
      int $$4 = $$3.r - 1;
      if ($$4 >= 0) {
         $$3.r = $$4;
         if ($$4 == 0) {
            $$0.a($$1, $$2.a(dex.b, Boolean.valueOf(false)), 3);
         }
      }
   }

   public void d(int $$0) {
      this.r = $$0;
   }

   public int t() {
      int $$0 = 0;

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         csz $$2 = this.a($$1);
         if (!$$2.d() || this.c($$1)) {
            $$0++;
         }
      }

      return $$0;
   }

   private boolean e(int $$0) {
      return $$0 > -1 && $$0 < 9 && this.q.get($$0).d();
   }
}
