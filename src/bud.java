import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public abstract class bud extends bvq {
   private static final ajy<Boolean> bY = akc.a(bud.class, aka.k);
   public static final int a = -24000;
   private static final int bZ = 40;
   protected int b;
   protected int c;
   protected int d;

   protected bud(but<? extends bud> $$0, dgj $$1) {
      super($$0, $$1);
   }

   @Override
   public bwb a(dha $$0, bsj $$1, bus $$2, @Nullable bwb $$3) {
      if ($$3 == null) {
         $$3 = new bud.a(true);
      }

      bud.a $$4 = (bud.a)$$3;
      if ($$4.c() && $$4.a() > 0 && $$0.H_().i() <= $$4.d()) {
         this.c_(-24000);
      }

      $$4.b();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public abstract bud a(ard var1, bud var2);

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   public boolean X_() {
      return false;
   }

   public int Y_() {
      if (this.dV().C) {
         return this.al.a(bY) ? -1 : 1;
      } else {
         return this.b;
      }
   }

   public void a(int $$0, boolean $$1) {
      int $$2 = this.Y_();
      $$2 += $$0 * 20;
      if ($$2 > 0) {
         $$2 = 0;
      }

      int $$4 = $$2 - $$2;
      this.c_($$2);
      if ($$1) {
         this.c += $$4;
         if (this.d == 0) {
            this.d = 40;
         }
      }

      if (this.Y_() == 0) {
         this.c_(this.c);
      }
   }

   public void b_(int $$0) {
      this.a($$0, false);
   }

   public void c_(int $$0) {
      int $$1 = this.Y_();
      this.b = $$0;
      if ($$1 < 0 && $$0 >= 0 || $$1 >= 0 && $$0 < 0) {
         this.al.a(bY, $$0 < 0);
         this.i();
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Age", this.Y_());
      $$0.a("ForcedAge", this.c);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.c_($$0.h("Age"));
      this.c = $$0.h("ForcedAge");
   }

   @Override
   public void a(ajy<?> $$0) {
      if (bY.equals($$0)) {
         this.m_();
      }

      super.a($$0);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.dV().C) {
         if (this.d > 0) {
            if (this.d % 4 == 0) {
               this.dV().a(lt.P, this.d(1.0), this.dD() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            }

            this.d--;
         }
      } else if (this.bL()) {
         int $$0 = this.Y_();
         if ($$0 < 0) {
            this.c_(++$$0);
         } else if ($$0 > 0) {
            this.c_(--$$0);
         }
      }
   }

   protected void i() {
      if (!this.e_() && this.bZ() && this.dk() instanceof cqv $$0 && !$$0.b((bum)this)) {
         this.ae();
      }
   }

   @Override
   public boolean e_() {
      return this.Y_() < 0;
   }

   @Override
   public void a(boolean $$0) {
      this.c_($$0 ? -24000 : 0);
   }

   public static int d_(int $$0) {
      return (int)((float)($$0 / 20) * 0.1F);
   }

   @VisibleForTesting
   public int l() {
      return this.c;
   }

   @VisibleForTesting
   public int m() {
      return this.d;
   }

   public static class a implements bwb {
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
