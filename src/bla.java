import javax.annotation.Nullable;

public abstract class bla extends bme {
   private static final afz<Boolean> bT = agc.a(bla.class, agb.k);
   public static final int b = -24000;
   private static final int bU = 40;
   protected int c;
   protected int d;
   protected int e;

   protected bla(blj<? extends bla> $$0, csy $$1) {
      super($$0, $$1);
   }

   @Override
   public bmo a(ctn $$0, bjj $$1, blz $$2, @Nullable bmo $$3, @Nullable sj $$4) {
      if ($$3 == null) {
         $$3 = new bla.a(true);
      }

      bla.a $$5 = (bla.a)$$3;
      if ($$5.c() && $$5.a() > 0 && $$0.F_().i() <= $$5.d()) {
         this.c_(-24000);
      }

      $$5.b();
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   public abstract bla a(amp var1, bla var2);

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bT, false);
   }

   public boolean Y_() {
      return false;
   }

   public int h() {
      if (this.dM().B) {
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
   public void b(sj $$0) {
      super.b($$0);
      $$0.a("Age", this.h());
      $$0.a("ForcedAge", this.d);
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.c_($$0.h("Age"));
      this.d = $$0.h("ForcedAge");
   }

   @Override
   public void a(afz<?> $$0) {
      if (bT.equals($$0)) {
         this.k_();
      }

      super.a($$0);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.dM().B) {
         if (this.e > 0) {
            if (this.e % 4 == 0) {
               this.dM().a(jv.M, this.d(1.0), this.du() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
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
      if (!this.o_() && this.bO() && this.cZ() instanceof cgl $$0 && !$$0.a((blf)this)) {
         this.ac();
      }
   }

   @Override
   public boolean o_() {
      return this.h() < 0;
   }

   @Override
   public void a(boolean $$0) {
      this.c_($$0 ? -24000 : 0);
   }

   public static int d_(int $$0) {
      return (int)((float)($$0 / 20) * 0.1F);
   }

   public static class a implements bmo {
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
