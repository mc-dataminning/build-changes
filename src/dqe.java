import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class dqe extends dqw implements cpz {
   public static final int d = 3;
   public static final int e = 3;
   public static final int f = 9;
   public static final int g = 1;
   public static final int h = 0;
   public static final int i = 9;
   public static final int j = 10;
   private js<cud> q = js.a(9, cud.l);
   private int r = 0;
   protected final cpt k = new cpt() {
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

   public dqe(ja $$0, dsl $$1) {
      super(dps.P, $$0, $$1);
   }

   @Override
   protected wu k() {
      return wu.c("container.crafter");
   }

   @Override
   protected cpi a(int $$0, cmk $$1) {
      return new cpx($$0, $$1, this, this.k);
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
   public boolean b(int $$0, cud $$1) {
      if (this.k.a($$0) == 1) {
         return false;
      } else {
         cud $$2 = this.q.get($$0);
         int $$3 = $$2.H();
         if ($$3 >= $$2.j()) {
            return false;
         } else {
            return $$2.e() ? true : !this.a($$3, $$2, $$0);
         }
      }
   }

   private boolean a(int $$0, cud $$1, int $$2) {
      for (int $$3 = $$2 + 1; $$3 < 9; $$3++) {
         if (!this.c($$3)) {
            cud $$4 = this.a($$3);
            if ($$4.e() || $$4.H() < $$0 && cud.c($$4, $$1)) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      this.r = $$0.h("crafting_ticks_remaining");
      this.q = js.a(this.b(), cud.l);
      if (!this.a_($$0)) {
         bqb.b($$0, this.q, $$1);
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
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      $$0.a("crafting_ticks_remaining", this.r);
      if (!this.b_($$0)) {
         bqb.a($$0, this.q, $$1);
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
      for (cud $$0 : this.q) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cud a(int $$0) {
      return this.q.get($$0);
   }

   @Override
   public void a(int $$0, cud $$1) {
      if (this.c($$0)) {
         this.a($$0, true);
      }

      super.a($$0, $$1);
   }

   @Override
   public boolean a(cml $$0) {
      return bqa.a(this, $$0);
   }

   @Override
   public js<cud> j() {
      return this.q;
   }

   @Override
   protected void a(js<cud> $$0) {
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
   public void a(cmp $$0) {
      for (cud $$1 : this.q) {
         $$0.a($$1);
      }
   }

   private void c(tx $$0) {
      IntList $$1 = new IntArrayList();

      for (int $$2 = 0; $$2 < 9; $$2++) {
         if (this.c($$2)) {
            $$1.add($$2);
         }
      }

      $$0.b("disabled_slots", $$1);
   }

   private void d(tx $$0) {
      $$0.a("triggered", this.k.a(9));
   }

   public void a(boolean $$0) {
      this.k.a(9, $$0 ? 1 : 0);
   }

   @VisibleForTesting
   public boolean l() {
      return this.k.a(9) == 1;
   }

   public static void a(dcg $$0, ja $$1, dsl $$2, dqe $$3) {
      int $$4 = $$3.r - 1;
      if ($$4 >= 0) {
         $$3.r = $$4;
         if ($$4 == 0) {
            $$0.a($$1, $$2.a(dhb.b, Boolean.valueOf(false)), 3);
         }
      }
   }

   public void d(int $$0) {
      this.r = $$0;
   }

   public int u() {
      int $$0 = 0;

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cud $$2 = this.a($$1);
         if (!$$2.e() || this.c($$1)) {
            $$0++;
         }
      }

      return $$0;
   }

   private boolean e(int $$0) {
      return $$0 > -1 && $$0 < 9 && this.q.get($$0).e();
   }
}
