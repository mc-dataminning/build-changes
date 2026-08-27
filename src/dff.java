import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class dff extends dfv implements cgu {
   public static final int c = 3;
   public static final int d = 3;
   public static final int e = 9;
   public static final int f = 1;
   public static final int g = 0;
   public static final int h = 9;
   public static final int i = 10;
   private il<clb> r = il.a(9, clb.b);
   private int s = 0;
   protected final cgo j = new cgo() {
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

   public dff(ht $$0, dgw $$1) {
      super(det.P, $$0, $$1);
   }

   @Override
   protected ur g() {
      return ur.c("container.crafter");
   }

   @Override
   protected cge a(int $$0, cdl $$1) {
      return new cgs($$0, $$1, this, this.j);
   }

   public void a(int $$0, boolean $$1) {
      if (this.e($$0)) {
         this.j.a($$0, $$1 ? 0 : 1);
         this.e();
      }
   }

   public boolean c(int $$0) {
      return $$0 >= 0 && $$0 < 9 ? this.j.a($$0) == 1 : false;
   }

   @Override
   public boolean b(int $$0, clb $$1) {
      if (this.j.a($$0) == 1) {
         return false;
      } else {
         clb $$2 = this.r.get($$0);
         int $$3 = $$2.L();
         if ($$3 >= $$2.g()) {
            return false;
         } else {
            return $$2.b() ? true : !this.a($$3, $$2, $$0);
         }
      }
   }

   private boolean a(int $$0, clb $$1, int $$2) {
      for (int $$3 = $$2 + 1; $$3 < 9; $$3++) {
         if (!this.c($$3)) {
            clb $$4 = this.a($$3);
            if ($$4.b() || $$4.L() < $$0 && clb.c($$4, $$1)) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.s = $$0.h("crafting_ticks_remaining");
      this.r = il.a(this.b(), clb.b);
      if (!this.d($$0)) {
         bik.b($$0, this.r);
      }

      int[] $$1 = $$0.n("disabled_slots");

      for (int $$2 = 0; $$2 < 9; $$2++) {
         this.j.a($$2, 0);
      }

      for (int $$3 : $$1) {
         if (this.e($$3)) {
            this.j.a($$3, 1);
         }
      }

      this.j.a(9, $$0.h("triggered"));
   }

   @Override
   protected void b(rz $$0) {
      super.b($$0);
      $$0.a("crafting_ticks_remaining", this.s);
      if (!this.e($$0)) {
         bik.a($$0, this.r);
      }

      this.f($$0);
      this.g($$0);
   }

   @Override
   public int b() {
      return 9;
   }

   @Override
   public boolean ai_() {
      for (clb $$0 : this.r) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public clb a(int $$0) {
      return this.r.get($$0);
   }

   @Override
   public void a(int $$0, clb $$1) {
      if (this.c($$0)) {
         this.a($$0, true);
      }

      super.a($$0, $$1);
   }

   @Override
   public boolean a(cdm $$0) {
      return this.o != null && this.o.c_(this.p) == this
         ? !($$0.i((double)this.p.u() + 0.5, (double)this.p.v() + 0.5, (double)this.p.w() + 0.5) > 64.0)
         : false;
   }

   @Override
   public il<clb> f() {
      return this.r;
   }

   @Override
   protected void a(il<clb> $$0) {
      this.r = $$0;
   }

   @Override
   public int ax_() {
      return 3;
   }

   @Override
   public int ay_() {
      return 3;
   }

   @Override
   public void a(cdq $$0) {
      for (clb $$1 : this.r) {
         $$0.a($$1);
      }
   }

   private void f(rz $$0) {
      IntList $$1 = new IntArrayList();

      for (int $$2 = 0; $$2 < 9; $$2++) {
         if (this.c($$2)) {
            $$1.add($$2);
         }
      }

      $$0.b("disabled_slots", $$1);
   }

   private void g(rz $$0) {
      $$0.a("triggered", this.j.a(9));
   }

   public void a(boolean $$0) {
      this.j.a(9, $$0 ? 1 : 0);
   }

   @VisibleForTesting
   public boolean i() {
      return this.j.a(9) == 1;
   }

   public static void a(crs $$0, ht $$1, dgw $$2, dff $$3) {
      int $$4 = $$3.s - 1;
      if ($$4 >= 0) {
         $$3.s = $$4;
         if ($$4 == 0) {
            $$0.a($$1, $$2.a(cwl.b, Boolean.valueOf(false)), 3);
         }
      }
   }

   public void d(int $$0) {
      this.s = $$0;
   }

   public int j() {
      int $$0 = 0;

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         clb $$2 = this.a($$1);
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
