import javax.annotation.Nullable;

public abstract class bsb extends btl {
   private static final ajp<Boolean> ca = ajt.a(bsb.class, ajr.k);
   public static final int b = -24000;
   private static final int cb = 40;
   protected int c;
   protected int d;
   protected int e;

   protected bsb(bsn<? extends bsb> $$0, dcg $$1) {
      super($$0, $$1);
   }

   @Override
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      if ($$3 == null) {
         $$3 = new bsb.a(true);
      }

      bsb.a $$4 = (bsb.a)$$3;
      if ($$4.c() && $$4.a() > 0 && $$0.E_().i() <= $$4.d()) {
         this.c_(-24000);
      }

      $$4.b();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public abstract bsb a(aqm var1, bsb var2);

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(ca, false);
   }

   public boolean X_() {
      return false;
   }

   public int g() {
      if (this.dR().B) {
         return this.ao.a(ca) ? -1 : 1;
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
         this.ao.a(ca, $$0 < 0);
         this.k();
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Age", this.g());
      $$0.a("ForcedAge", this.d);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.c_($$0.h("Age"));
      this.d = $$0.h("ForcedAge");
   }

   @Override
   public void a(ajp<?> $$0) {
      if (ca.equals($$0)) {
         this.i_();
      }

      super.a($$0);
   }

   @Override
   public void m_() {
      super.m_();
      if (this.dR().B) {
         if (this.e > 0) {
            if (this.e % 4 == 0) {
               this.dR().a(lj.O, this.d(1.0), this.dz() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            }

            this.e--;
         }
      } else if (this.bF()) {
         int $$0 = this.g();
         if ($$0 < 0) {
            this.c_(++$$0);
         } else if ($$0 > 0) {
            this.c_(--$$0);
         }
      }
   }

   protected void k() {
      if (!this.o_() && this.bT() && this.de() instanceof coi $$0 && !$$0.b((bsh)this)) {
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

   public static class a implements btv {
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
