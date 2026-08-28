import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public abstract class btq extends bvd {
   private static final akk<Boolean> bY = ako.a(btq.class, akm.k);
   public static final int b = -24000;
   private static final int bZ = 40;
   protected int c;
   protected int d;
   protected int e;

   protected btq(bug<? extends btq> $$0, dev $$1) {
      super($$0, $$1);
   }

   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      if ($$3 == null) {
         $$3 = new btq.a(true);
      }

      btq.a $$4 = (btq.a)$$3;
      if ($$4.c() && $$4.a() > 0 && $$0.E_().i() <= $$4.d()) {
         this.c_(-24000);
      }

      $$4.b();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public abstract btq a(arm var1, btq var2);

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   public boolean ac_() {
      return false;
   }

   public int g() {
      if (this.dX().C) {
         return this.am.a(bY) ? -1 : 1;
      } else {
         return this.c;
      }
   }

   public void a(int $$0, boolean $$1) {
      int $$2 = this.g();
      $$2 += $$0 * 20;
      if ($$2 > 0) {
         $$2 = 0;
      }

      int $$4 = $$2 - $$2;
      this.c_($$2);
      if ($$1) {
         this.d += $$4;
         if (this.e == 0) {
            this.e = 40;
         }
      }

      if (this.g() == 0) {
         this.c_(this.d);
      }
   }

   public void b_(int $$0) {
      this.a($$0, false);
   }

   public void c_(int $$0) {
      int $$1 = this.g();
      this.c = $$0;
      if ($$1 < 0 && $$0 >= 0 || $$1 >= 0 && $$0 < 0) {
         this.am.a(bY, $$0 < 0);
         this.k();
      }
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("Age", this.g());
      $$0.a("ForcedAge", this.d);
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.c_($$0.h("Age"));
      this.d = $$0.h("ForcedAge");
   }

   @Override
   public void a(akk<?> $$0) {
      if (bY.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   @Override
   public void n_() {
      super.n_();
      if (this.dX().C) {
         if (this.e > 0) {
            if (this.e % 4 == 0) {
               this.dX().a(lq.O, this.d(1.0), this.dF() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            }

            this.e--;
         }
      } else if (this.bM()) {
         int $$0 = this.g();
         if ($$0 < 0) {
            this.c_(++$$0);
         } else if ($$0 > 0) {
            this.c_(--$$0);
         }
      }
   }

   protected void k() {
      if (!this.p_() && this.ca() && this.dl() instanceof cqh $$0 && !$$0.c(this)) {
         this.af();
      }
   }

   @Override
   public boolean p_() {
      return this.g() < 0;
   }

   @Override
   public void a(boolean $$0) {
      this.c_($$0 ? -24000 : 0);
   }

   public static int d_(int $$0) {
      return (int)((float)($$0 / 20) * 0.1F);
   }

   @VisibleForTesting
   public int o() {
      return this.d;
   }

   @VisibleForTesting
   public int p() {
      return this.e;
   }

   public static class a implements bvo {
      private int a;
      private final boolean b;
      private final float c;

      public a(boolean $$0, float $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public a(boolean $$0) {
         this($$0, 0.05F);
      }

      public a(float $$0) {
         this(true, $$0);
      }

      public int a() {
         return this.a;
      }

      public void b() {
         this.a++;
      }

      public boolean c() {
         return this.b;
      }

      public float d() {
         return this.c;
      }
   }
}
