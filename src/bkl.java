import javax.annotation.Nullable;

public abstract class bkl extends blp {
   private static final afo<Boolean> bT = afr.a(bkl.class, afq.k);
   public static final int b = -24000;
   private static final int bU = 40;
   protected int c;
   protected int d;
   protected int e;

   protected bkl(bku<? extends bkl> $$0, csa $$1) {
      super($$0, $$1);
   }

   @Override
   public blz a(csp $$0, biv $$1, blk $$2, @Nullable blz $$3, @Nullable rz $$4) {
      if ($$3 == null) {
         $$3 = new bkl.a(true);
      }

      bkl.a $$5 = (bkl.a)$$3;
      if ($$5.c() && $$5.a() > 0 && $$0.E_().i() <= $$5.d()) {
         this.c_(-24000);
      }

      $$5.b();
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   public abstract bkl a(ame var1, bkl var2);

   @Override
   protected void b_() {
      super.b_();
      this.an.a(bT, false);
   }

   public boolean X_() {
      return false;
   }

   public int h() {
      if (this.dN().B) {
         return this.an.b(bT) ? -1 : 1;
      } else {
         return this.c;
      }
   }

   public void a(int $$0, boolean $$1) {
      int $$2 = this.h();
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

      if (this.h() == 0) {
         this.c_(this.d);
      }
   }

   public void b_(int $$0) {
      this.a($$0, false);
   }

   public void c_(int $$0) {
      int $$1 = this.h();
      this.c = $$0;
      if ($$1 < 0 && $$0 >= 0 || $$1 >= 0 && $$0 < 0) {
         this.an.b(bT, $$0 < 0);
         this.m();
      }
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("Age", this.h());
      $$0.a("ForcedAge", this.d);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.c_($$0.h("Age"));
      this.d = $$0.h("ForcedAge");
   }

   @Override
   public void a(afo<?> $$0) {
      if (bT.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   @Override
   public void c_() {
      super.c_();
      if (this.dN().B) {
         if (this.e > 0) {
            if (this.e % 4 == 0) {
               this.dN().a(js.K, this.d(1.0), this.dv() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            }

            this.e--;
         }
      } else if (this.bx()) {
         int $$0 = this.h();
         if ($$0 < 0) {
            this.c_(++$$0);
         } else if ($$0 > 0) {
            this.c_(--$$0);
         }
      }
   }

   protected void m() {
      if (!this.n_() && this.bO() && this.da() instanceof cfn $$0 && !$$0.a((bkq)this)) {
         this.ac();
      }
   }

   @Override
   public boolean n_() {
      return this.h() < 0;
   }

   @Override
   public void a(boolean $$0) {
      this.c_($$0 ? -24000 : 0);
   }

   public static int d_(int $$0) {
      return (int)((float)($$0 / 20) * 0.1F);
   }

   public static class a implements blz {
      private int a;
      private final boolean b;
      private final float c;

      private a(boolean $$0, float $$1) {
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
