import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class dfw extends dgm implements chh {
   public static final int e = 3;
   public static final int f = 3;
   public static final int g = 9;
   public static final int h = 1;
   public static final int i = 0;
   public static final int j = 9;
   public static final int k = 10;
   private ip<clo> r = ip.a(9, clo.b);
   private int s = 0;
   protected final chb l = new chb() {
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

   public dfw(hx $$0, dhn $$1) {
      super(dfk.P, $$0, $$1);
   }

   @Override
   protected uv l() {
      return uv.c("container.crafter");
   }

   @Override
   protected cgr a(int $$0, cdy $$1) {
      return new chf($$0, $$1, this, this.l);
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
   public boolean b(int $$0, clo $$1) {
      if (this.l.a($$0) == 1) {
         return false;
      } else {
         clo $$2 = this.r.get($$0);
         int $$3 = $$2.L();
         if ($$3 >= $$2.g()) {
            return false;
         } else {
            return $$2.b() ? true : !this.a($$3, $$2, $$0);
         }
      }
   }

   private boolean a(int $$0, clo $$1, int $$2) {
      for (int $$3 = $$2 + 1; $$3 < 9; $$3++) {
         if (!this.c($$3)) {
            clo $$4 = this.a($$3);
            if ($$4.b() || $$4.L() < $$0 && clo.c($$4, $$1)) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.s = $$0.h("crafting_ticks_remaining");
      this.r = ip.a(this.b(), clo.b);
      if (!this.c_($$0)) {
         biv.b($$0, this.r);
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
   protected void b(sd $$0) {
      super.b($$0);
      $$0.a("crafting_ticks_remaining", this.s);
      if (!this.d_($$0)) {
         biv.a($$0, this.r);
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
      for (clo $$0 : this.r) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public clo a(int $$0) {
      return this.r.get($$0);
   }

   @Override
   public void a(int $$0, clo $$1) {
      if (this.c($$0)) {
         this.a($$0, true);
      }

      super.a($$0, $$1);
   }

   @Override
   public boolean a(cdz $$0) {
      return this.o != null && this.o.c_(this.p) == this
         ? !($$0.i((double)this.p.u() + 0.5, (double)this.p.v() + 0.5, (double)this.p.w() + 0.5) > 64.0)
         : false;
   }

   @Override
   public ip<clo> k() {
      return this.r;
   }

   @Override
   protected void a(ip<clo> $$0) {
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
   public void a(ced $$0) {
      for (clo $$1 : this.r) {
         $$0.a($$1);
      }
   }

   private void d(sd $$0) {
      IntList $$1 = new IntArrayList();

      for (int $$2 = 0; $$2 < 9; $$2++) {
         if (this.c($$2)) {
            $$1.add($$2);
         }
      }

      $$0.b("disabled_slots", $$1);
   }

   private void e(sd $$0) {
      $$0.a("triggered", this.l.a(9));
   }

   public void a(boolean $$0) {
      this.l.a(9, $$0 ? 1 : 0);
   }

   @VisibleForTesting
   public boolean m() {
      return this.l.a(9) == 1;
   }

   public static void a(csf $$0, hx $$1, dhn $$2, dfw $$3) {
      int $$4 = $$3.s - 1;
      if ($$4 >= 0) {
         $$3.s = $$4;
         if ($$4 == 0) {
            $$0.a($$1, $$2.a(cwy.b, Boolean.valueOf(false)), 3);
         }
      }
   }

   public void d(int $$0) {
      this.s = $$0;
   }

   public int w() {
      int $$0 = 0;

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         clo $$2 = this.a($$1);
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
