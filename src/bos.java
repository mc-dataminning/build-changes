import javax.annotation.Nullable;

public abstract class bos extends bpx {
   private static final aim<Boolean> bX = aiq.a(bos.class, aio.k);
   public static final int b = -24000;
   private static final int bY = 40;
   protected int c;
   protected int d;
   protected int e;

   protected bos(bpd<? extends bos> $$0, cxb $$1) {
      super($$0, $$1);
   }

   @Override
   public bqh a(cxq $$0, bnb $$1, bpt $$2, @Nullable bqh $$3) {
      if ($$3 == null) {
         $$3 = new bos.a(true);
      }

      bos.a $$4 = (bos.a)$$3;
      if ($$4.c() && $$4.a() > 0 && $$0.E_().i() <= $$4.d()) {
         this.c_(-24000);
      }

      $$4.b();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public abstract bos a(apf var1, bos var2);

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(bX, false);
   }

   public boolean W_() {
      return false;
   }

   public int g() {
      if (this.dM().B) {
         return this.an.a(bX) ? -1 : 1;
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
         this.an.a(bX, $$0 < 0);
         this.k();
      }
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("Age", this.g());
      $$0.a("ForcedAge", this.d);
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.c_($$0.h("Age"));
      this.d = $$0.h("ForcedAge");
   }

   @Override
   public void a(aim<?> $$0) {
      if (bX.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   @Override
   public void m_() {
      super.m_();
      if (this.dM().B) {
         if (this.e > 0) {
            if (this.e % 4 == 0) {
               this.dM().a(kc.N, this.d(1.0), this.du() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            }

            this.e--;
         }
      } else if (this.bA()) {
         int $$0 = this.g();
         if ($$0 < 0) {
            this.c_(++$$0);
         } else if ($$0 > 0) {
            this.c_(--$$0);
         }
      }
   }

   protected void k() {
      if (!this.o_() && this.bO() && this.cZ() instanceof ckr $$0 && !$$0.b((box)this)) {
         this.ac();
      }
   }

   @Override
   public boolean o_() {
      return this.g() < 0;
   }

   @Override
   public void a(boolean $$0) {
      this.c_($$0 ? -24000 : 0);
   }

   public static int d_(int $$0) {
      return (int)((float)($$0 / 20) * 0.1F);
   }

   public static class a implements bqh {
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
