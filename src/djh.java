import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class djh extends djx implements ckr {
   public static final int e = 3;
   public static final int f = 3;
   public static final int g = 9;
   public static final int h = 1;
   public static final int i = 0;
   public static final int j = 9;
   public static final int k = 10;
   private is<coz> r = is.a(9, coz.h);
   private int s = 0;
   protected final ckl l = new ckl() {
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

   public djh(hz $$0, dlf $$1) {
      super(div.P, $$0, $$1);
   }

   @Override
   protected vq l() {
      return vq.c("container.crafter");
   }

   @Override
   protected ckb a(int $$0, chg $$1) {
      return new ckp($$0, $$1, this, this.l);
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
   public boolean b(int $$0, coz $$1) {
      if (this.l.a($$0) == 1) {
         return false;
      } else {
         coz $$2 = this.r.get($$0);
         int $$3 = $$2.M();
         if ($$3 >= $$2.g()) {
            return false;
         } else {
            return $$2.b() ? true : !this.a($$3, $$2, $$0);
         }
      }
   }

   private boolean a(int $$0, coz $$1, int $$2) {
      for (int $$3 = $$2 + 1; $$3 < 9; $$3++) {
         if (!this.c($$3)) {
            coz $$4 = this.a($$3);
            if ($$4.b() || $$4.M() < $$0 && coz.c($$4, $$1)) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.s = $$0.h("crafting_ticks_remaining");
      this.r = is.a(this.b(), coz.h);
      if (!this.c_($$0)) {
         blo.b($$0, this.r);
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
   protected void b(sw $$0) {
      super.b($$0);
      $$0.a("crafting_ticks_remaining", this.s);
      if (!this.d_($$0)) {
         blo.a($$0, this.r);
      }

      this.d($$0);
      this.e($$0);
   }

   @Override
   public int b() {
      return 9;
   }

   @Override
   public boolean aj_() {
      for (coz $$0 : this.r) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public coz a(int $$0) {
      return this.r.get($$0);
   }

   @Override
   public void a(int $$0, coz $$1) {
      if (this.c($$0)) {
         this.a($$0, true);
      }

      super.a($$0, $$1);
   }

   @Override
   public boolean a(chh $$0) {
      return bln.a(this, $$0);
   }

   @Override
   public is<coz> k() {
      return this.r;
   }

   @Override
   protected void a(is<coz> $$0) {
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
   public void a(chl $$0) {
      for (coz $$1 : this.r) {
         $$0.a($$1);
      }
   }

   private void d(sw $$0) {
      IntList $$1 = new IntArrayList();

      for (int $$2 = 0; $$2 < 9; $$2++) {
         if (this.c($$2)) {
            $$1.add($$2);
         }
      }

      $$0.b("disabled_slots", $$1);
   }

   private void e(sw $$0) {
      $$0.a("triggered", this.l.a(9));
   }

   public void a(boolean $$0) {
      this.l.a(9, $$0 ? 1 : 0);
   }

   @VisibleForTesting
   public boolean m() {
      return this.l.a(9) == 1;
   }

   public static void a(cvn $$0, hz $$1, dlf $$2, djh $$3) {
      int $$4 = $$3.s - 1;
      if ($$4 >= 0) {
         $$3.s = $$4;
         if ($$4 == 0) {
            $$0.a($$1, $$2.a(dah.b, Boolean.valueOf(false)), 3);
         }
      }
   }

   public void d(int $$0) {
      this.s = $$0;
   }

   public int w() {
      int $$0 = 0;

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         coz $$2 = this.a($$1);
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
