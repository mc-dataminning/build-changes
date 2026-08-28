import javax.annotation.Nullable;

public abstract class bsl extends btw {
   private static final ajw<Boolean> cc = aka.a(bsl.class, ajy.k);
   public static final int b = -24000;
   private static final int cd = 40;
   protected int c;
   protected int d;
   protected int e;

   protected bsl(bsx<? extends bsl> $$0, dcw $$1) {
      super($$0, $$1);
   }

   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      if ($$3 == null) {
         $$3 = new bsl.a(true);
      }

      bsl.a $$4 = (bsl.a)$$3;
      if ($$4.c() && $$4.a() > 0 && $$0.E_().i() <= $$4.d()) {
         this.c_(-24000);
      }

      $$4.b();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public abstract bsl a(aqu var1, bsl var2);

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
   }

   public boolean ab_() {
      return false;
   }

   public int g() {
      if (this.dO().B) {
         return this.ao.a(cc) ? -1 : 1;
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
         this.ao.a(cc, $$0 < 0);
         this.k();
      }
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("Age", this.g());
      $$0.a("ForcedAge", this.d);
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.c_($$0.h("Age"));
      this.d = $$0.h("ForcedAge");
   }

   @Override
   public void a(ajw<?> $$0) {
      if (cc.equals($$0)) {
         this.i_();
      }

      super.a($$0);
   }

   @Override
   public void m_() {
      super.m_();
      if (this.dO().B) {
         if (this.e > 0) {
            if (this.e % 4 == 0) {
               this.dO().a(lm.O, this.d(1.0), this.dw() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            }

            this.e--;
         }
      } else if (this.bE()) {
         int $$0 = this.g();
         if ($$0 < 0) {
            this.c_(++$$0);
         } else if ($$0 > 0) {
            this.c_(--$$0);
         }
      }
   }

   protected void k() {
      if (!this.o_() && this.bS() && this.dc() instanceof cov $$0 && !$$0.c(this)) {
         this.ad();
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

   public static class a implements buh {
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
