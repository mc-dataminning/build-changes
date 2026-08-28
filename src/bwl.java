import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public abstract class bwl extends bye {
   private static final akn<Boolean> bI = akr.a(bwl.class, akp.k);
   public static final int a = -24000;
   private static final int bJ = 40;
   protected static final int b = 0;
   protected static final int c = 0;
   protected int d = 0;
   protected int e = 0;
   protected int f;

   protected bwl(bxe<? extends bwl> $$0, djz $$1) {
      super($$0, $$1);
   }

   @Override
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      if ($$3 == null) {
         $$3 = new bwl.a(true);
      }

      bwl.a $$4 = (bwl.a)$$3;
      if ($$4.c() && $$4.a() > 0 && $$0.G_().i() <= $$4.d()) {
         this.c_(-24000);
      }

      $$4.b();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public abstract bwl a(aru var1, bwl var2);

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(bI, false);
   }

   public boolean X_() {
      return false;
   }

   public int g() {
      if (this.dV().C) {
         return this.al.a(bI) ? -1 : 1;
      } else {
         return this.d;
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
         this.e += $$4;
         if (this.f == 0) {
            this.f = 40;
         }
      }

      if (this.g() == 0) {
         this.c_(this.e);
      }
   }

   public void b_(int $$0) {
      this.a($$0, false);
   }

   public void c_(int $$0) {
      int $$1 = this.g();
      this.d = $$0;
      if ($$1 < 0 && $$0 >= 0 || $$1 >= 0 && $$0 < 0) {
         this.al.a(bI, $$0 < 0);
         this.j();
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Age", this.g());
      $$0.a("ForcedAge", this.e);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.c_($$0.b("Age", 0));
      this.e = $$0.b("ForcedAge", 0);
   }

   @Override
   public void a(akn<?> $$0) {
      if (bI.equals($$0)) {
         this.i_();
      }

      super.a($$0);
   }

   @Override
   public void k_() {
      super.k_();
      if (this.dV().C) {
         if (this.f > 0) {
            if (this.f % 4 == 0) {
               this.dV().a(lz.Q, this.d(1.0), this.dD() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            }

            this.f--;
         }
      } else if (this.bJ()) {
         int $$0 = this.g();
         if ($$0 < 0) {
            this.c_(++$$0);
         } else if ($$0 > 0) {
            this.c_(--$$0);
         }
      }
   }

   @Override
   protected void j() {
      if (!this.n_() && this.bY() && this.dk() instanceof cuk $$0 && !$$0.b((bwv)this)) {
         this.bO();
      }
   }

   @Override
   public boolean n_() {
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
   public int ab_() {
      return this.e;
   }

   @VisibleForTesting
   public int ac_() {
      return this.f;
   }

   public static class a implements byo {
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
