import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public abstract class bva extends bwn {
   private static final alc<Boolean> bZ = alg.a(bva.class, ale.k);
   public static final int a = -24000;
   private static final int ca = 40;
   protected int b;
   protected int c;
   protected int d;

   protected bva(bvq<? extends bva> $$0, dhh $$1) {
      super($$0, $$1);
   }

   @Override
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
      if ($$3 == null) {
         $$3 = new bva.a(true);
      }

      bva.a $$4 = (bva.a)$$3;
      if ($$4.c() && $$4.a() > 0 && $$0.H_().i() <= $$4.d()) {
         this.c_(-24000);
      }

      $$4.b();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public abstract bva a(ash var1, bva var2);

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(bZ, false);
   }

   public boolean Y_() {
      return false;
   }

   public int Z_() {
      if (this.dV().C) {
         return this.al.a(bZ) ? -1 : 1;
      } else {
         return this.b;
      }
   }

   public void a(int $$0, boolean $$1) {
      int $$2 = this.Z_();
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

      if (this.Z_() == 0) {
         this.c_(this.c);
      }
   }

   public void b_(int $$0) {
      this.a($$0, false);
   }

   public void c_(int $$0) {
      int $$1 = this.Z_();
      this.b = $$0;
      if ($$1 < 0 && $$0 >= 0 || $$1 >= 0 && $$0 < 0) {
         this.al.a(bZ, $$0 < 0);
         this.i();
      }
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("Age", this.Z_());
      $$0.a("ForcedAge", this.c);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.c_($$0.h("Age"));
      this.c = $$0.h("ForcedAge");
   }

   @Override
   public void a(alc<?> $$0) {
      if (bZ.equals($$0)) {
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
               this.dV().a(ls.O, this.d(1.0), this.dD() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            }

            this.d--;
         }
      } else if (this.bL()) {
         int $$0 = this.Z_();
         if ($$0 < 0) {
            this.c_(++$$0);
         } else if ($$0 > 0) {
            this.c_(--$$0);
         }
      }
   }

   protected void i() {
      if (!this.e_() && this.bZ() && this.dk() instanceof crt $$0 && !$$0.b((bvj)this)) {
         this.ae();
      }
   }

   @Override
   public boolean e_() {
      return this.Z_() < 0;
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

   public static class a implements bwy {
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
