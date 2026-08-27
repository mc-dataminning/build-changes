import javax.annotation.Nullable;

public abstract class boa extends bpf {
   private static final aii<Boolean> bV = ail.a(boa.class, aik.k);
   public static final int b = -24000;
   private static final int bW = 40;
   protected int c;
   protected int d;
   protected int e;

   protected boa(bol<? extends boa> $$0, cwe $$1) {
      super($$0, $$1);
   }

   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      if ($$3 == null) {
         $$3 = new boa.a(true);
      }

      boa.a $$4 = (boa.a)$$3;
      if ($$4.c() && $$4.a() > 0 && $$0.F_().i() <= $$4.d()) {
         this.c_(-24000);
      }

      $$4.b();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public abstract boa a(apa var1, boa var2);

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bV, false);
   }

   public boolean Y_() {
      return false;
   }

   public int h() {
      if (this.dJ().B) {
         return this.am.b(bV) ? -1 : 1;
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
         this.am.b(bV, $$0 < 0);
         this.m();
      }
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("Age", this.h());
      $$0.a("ForcedAge", this.d);
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.c_($$0.h("Age"));
      this.d = $$0.h("ForcedAge");
   }

   @Override
   public void a(aii<?> $$0) {
      if (bV.equals($$0)) {
         this.k_();
      }

      super.a($$0);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.dJ().B) {
         if (this.e > 0) {
            if (this.e % 4 == 0) {
               this.dJ().a(kb.M, this.d(1.0), this.dr() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
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
      if (!this.o_() && this.bL() && this.cW() instanceof cjv $$0 && !$$0.a((bof)this)) {
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

   public static class a implements bpp {
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
