import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public abstract class bvi extends bwz {
   private static final akg<Boolean> bE = akk.a(bvi.class, aki.k);
   public static final int a = -24000;
   private static final int bF = 40;
   protected int b;
   protected int c;
   protected int d;

   protected bvi(bwb<? extends bvi> $$0, dhp $$1) {
      super($$0, $$1);
   }

   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      if ($$3 == null) {
         $$3 = new bvi.a(true);
      }

      bvi.a $$4 = (bvi.a)$$3;
      if ($$4.c() && $$4.a() > 0 && $$0.C_().i() <= $$4.d()) {
         this.c_(-24000);
      }

      $$4.b();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public abstract bvi a(arn var1, bvi var2);

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bE, false);
   }

   public boolean S_() {
      return false;
   }

   public int g() {
      if (this.dV().C) {
         return this.al.a(bE) ? -1 : 1;
      } else {
         return this.b;
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
         this.c += $$4;
         if (this.d == 0) {
            this.d = 40;
         }
      }

      if (this.g() == 0) {
         this.c_(this.c);
      }
   }

   public void b_(int $$0) {
      this.a($$0, false);
   }

   public void c_(int $$0) {
      int $$1 = this.g();
      this.b = $$0;
      if ($$1 < 0 && $$0 >= 0 || $$1 >= 0 && $$0 < 0) {
         this.al.a(bE, $$0 < 0);
         this.j();
      }
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("Age", this.g());
      $$0.a("ForcedAge", this.c);
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.c_($$0.h("Age"));
      this.c = $$0.h("ForcedAge");
   }

   @Override
   public void a(akg<?> $$0) {
      if (bE.equals($$0)) {
         this.i_();
      }

      super.a($$0);
   }

   @Override
   public void k_() {
      super.k_();
      if (this.dV().C) {
         if (this.d > 0) {
            if (this.d % 4 == 0) {
               this.dV().a(lv.Q, this.d(1.0), this.dD() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            }

            this.d--;
         }
      } else if (this.bK()) {
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
      if (!this.n_() && this.bZ() && this.dk() instanceof csf $$0 && !$$0.b((bvs)this)) {
         this.bP();
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
   public int Y_() {
      return this.c;
   }

   @VisibleForTesting
   public int Z_() {
      return this.d;
   }

   public static class a implements bxj {
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
