import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class dgr extends dhh implements cia {
   public static final int e = 3;
   public static final int f = 3;
   public static final int g = 9;
   public static final int h = 1;
   public static final int i = 0;
   public static final int j = 9;
   public static final int k = 10;
   private io<cmh> r = io.a(9, cmh.f);
   private int s = 0;
   protected final chu l = new chu() {
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

   public dgr(hv $$0, dip $$1) {
      super(dgf.P, $$0, $$1);
   }

   @Override
   protected vb l() {
      return vb.c("container.crafter");
   }

   @Override
   protected chk a(int $$0, ceq $$1) {
      return new chy($$0, $$1, this, this.l);
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
   public boolean b(int $$0, cmh $$1) {
      if (this.l.a($$0) == 1) {
         return false;
      } else {
         cmh $$2 = this.r.get($$0);
         int $$3 = $$2.L();
         if ($$3 >= $$2.g()) {
            return false;
         } else {
            return $$2.b() ? true : !this.a($$3, $$2, $$0);
         }
      }
   }

   private boolean a(int $$0, cmh $$1, int $$2) {
      for (int $$3 = $$2 + 1; $$3 < 9; $$3++) {
         if (!this.c($$3)) {
            cmh $$4 = this.a($$3);
            if ($$4.b() || $$4.L() < $$0 && cmh.c($$4, $$1)) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.s = $$0.h("crafting_ticks_remaining");
      this.r = io.a(this.b(), cmh.f);
      if (!this.c_($$0)) {
         bjf.b($$0, this.r);
      }

      int[] $$1 = $$0.n("disabled_slots");

      for (int $$2 = 0; $$2 < 9; $$2++) {
         this.l.a($$2, 0);
      }

      for (int $$3 : $$1) {
         if (this.e($$3)) {
            this.l.a($$3, 1);
         }
      }

      this.l.a(9, $$0.h("triggered"));
   }

   @Override
   protected void b(sj $$0) {
      super.b($$0);
      $$0.a("crafting_ticks_remaining", this.s);
      if (!this.d_($$0)) {
         bjf.a($$0, this.r);
      }

      this.d($$0);
      this.e($$0);
   }

   @Override
   public int b() {
      return 9;
   }

   @Override
   public boolean ai_() {
      for (cmh $$0 : this.r) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cmh a(int $$0) {
      return this.r.get($$0);
   }

   @Override
   public void a(int $$0, cmh $$1) {
      if (this.c($$0)) {
         this.a($$0, true);
      }

      super.a($$0, $$1);
   }

   @Override
   public boolean a(cer $$0) {
      return this.o != null && this.o.c_(this.p) == this
         ? !($$0.i((double)this.p.u() + 0.5, (double)this.p.v() + 0.5, (double)this.p.w() + 0.5) > 64.0)
         : false;
   }

   @Override
   public io<cmh> k() {
      return this.r;
   }

   @Override
   protected void a(io<cmh> $$0) {
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
   public void a(cev $$0) {
      for (cmh $$1 : this.r) {
         $$0.a($$1);
      }
   }

   private void d(sj $$0) {
      IntList $$1 = new IntArrayList();

      for (int $$2 = 0; $$2 < 9; $$2++) {
         if (this.c($$2)) {
            $$1.add($$2);
         }
      }

      $$0.b("disabled_slots", $$1);
   }

   private void e(sj $$0) {
      $$0.a("triggered", this.l.a(9));
   }

   public void a(boolean $$0) {
      this.l.a(9, $$0 ? 1 : 0);
   }

   @VisibleForTesting
   public boolean m() {
      return this.l.a(9) == 1;
   }

   public static void a(csy $$0, hv $$1, dip $$2, dgr $$3) {
      int $$4 = $$3.s - 1;
      if ($$4 >= 0) {
         $$3.s = $$4;
         if ($$4 == 0) {
            $$0.a($$1, $$2.a(cxs.b, Boolean.valueOf(false)), 3);
         }
      }
   }

   public void d(int $$0) {
      this.s = $$0;
   }

   public int w() {
      int $$0 = 0;

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cmh $$2 = this.a($$1);
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
