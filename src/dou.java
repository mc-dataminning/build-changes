import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class dou extends dpl implements cpj {
   public static final int d = 3;
   public static final int e = 3;
   public static final int f = 9;
   public static final int g = 1;
   public static final int h = 0;
   public static final int i = 9;
   public static final int j = 10;
   private jg<cto> q = jg.a(9, cto.i);
   private int r = 0;
   protected final cpd k = new cpd() {
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

   public dou(io $$0, drb $$1) {
      super(doi.P, $$0, $$1);
   }

   @Override
   protected wx k() {
      return wx.c("container.crafter");
   }

   @Override
   protected cot a(int $$0, clv $$1) {
      return new cph($$0, $$1, this, this.k);
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
   public boolean b(int $$0, cto $$1) {
      if (this.k.a($$0) == 1) {
         return false;
      } else {
         cto $$2 = this.q.get($$0);
         int $$3 = $$2.I();
         if ($$3 >= $$2.j()) {
            return false;
         } else {
            return $$2.e() ? true : !this.a($$3, $$2, $$0);
         }
      }
   }

   private boolean a(int $$0, cto $$1, int $$2) {
      for (int $$3 = $$2 + 1; $$3 < 9; $$3++) {
         if (!this.c($$3)) {
            cto $$4 = this.a($$3);
            if ($$4.e() || $$4.I() < $$0 && cto.c($$4, $$1)) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected void a(ud $$0, iz.a $$1) {
      super.a($$0, $$1);
      this.r = $$0.h("crafting_ticks_remaining");
      this.q = jg.a(this.b(), cto.i);
      if (!this.a_($$0)) {
         bpo.b($$0, this.q, $$1);
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
   protected void b(ud $$0, iz.a $$1) {
      super.b($$0, $$1);
      $$0.a("crafting_ticks_remaining", this.r);
      if (!this.b_($$0)) {
         bpo.a($$0, this.q, $$1);
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
      for (cto $$0 : this.q) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cto a(int $$0) {
      return this.q.get($$0);
   }

   @Override
   public void a(int $$0, cto $$1) {
      if (this.c($$0)) {
         this.a($$0, true);
      }

      super.a($$0, $$1);
   }

   @Override
   public boolean a(clw $$0) {
      return bpn.a(this, $$0);
   }

   @Override
   public jg<cto> j() {
      return this.q;
   }

   @Override
   protected void a(jg<cto> $$0) {
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
   public void a(cma $$0) {
      for (cto $$1 : this.q) {
         $$0.a($$1);
      }
   }

   private void c(ud $$0) {
      IntList $$1 = new IntArrayList();

      for (int $$2 = 0; $$2 < 9; $$2++) {
         if (this.c($$2)) {
            $$1.add($$2);
         }
      }

      $$0.b("disabled_slots", $$1);
   }

   private void d(ud $$0) {
      $$0.a("triggered", this.k.a(9));
   }

   public void a(boolean $$0) {
      this.k.a(9, $$0 ? 1 : 0);
   }

   @VisibleForTesting
   public boolean l() {
      return this.k.a(9) == 1;
   }

   public static void a(dax $$0, io $$1, drb $$2, dou $$3) {
      int $$4 = $$3.r - 1;
      if ($$4 >= 0) {
         $$3.r = $$4;
         if ($$4 == 0) {
            $$0.a($$1, $$2.a(dfr.b, Boolean.valueOf(false)), 3);
         }
      }
   }

   public void d(int $$0) {
      this.r = $$0;
   }

   public int u() {
      int $$0 = 0;

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cto $$2 = this.a($$1);
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
