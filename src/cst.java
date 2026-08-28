import javax.annotation.Nullable;

public class cst implements brr {
   private final ddr b;
   private final jy<cvx> c = jy.a(3, cvx.k);
   @Nullable
   private dds d;
   private int e;
   private int f;

   public cst(ddr $$0) {
      this.b = $$0;
   }

   @Override
   public int b() {
      return this.c.size();
   }

   @Override
   public boolean c() {
      for (cvx $$0 : this.c) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cvx a(int $$0) {
      return this.c.get($$0);
   }

   @Override
   public cvx a(int $$0, int $$1) {
      cvx $$2 = this.c.get($$0);
      if ($$0 == 2 && !$$2.f()) {
         return brs.a(this.c, $$0, $$2.L());
      } else {
         cvx $$3 = brs.a(this.c, $$0, $$1);
         if (!$$3.f() && this.d($$0)) {
            this.f();
         }

         return $$3;
      }
   }

   private boolean d(int $$0) {
      return $$0 == 0 || $$0 == 1;
   }

   @Override
   public cvx b(int $$0) {
      return brs.a(this.c, $$0);
   }

   @Override
   public void a(int $$0, cvx $$1) {
      this.c.set($$0, $$1);
      $$1.f(this.e_($$1));
      if (this.d($$0)) {
         this.f();
      }
   }

   @Override
   public boolean a(coh $$0) {
      return this.b.gv() == $$0;
   }

   @Override
   public void e() {
      this.f();
   }

   public void f() {
      this.d = null;
      cvx $$0;
      cvx $$1;
      if (this.c.get(0).f()) {
         $$0 = this.c.get(1);
         $$1 = cvx.k;
      } else {
         $$0 = this.c.get(0);
         $$1 = this.c.get(1);
      }

      if ($$0.f()) {
         this.a(2, cvx.k);
         this.f = 0;
      } else {
         ddt $$4 = this.b.gx();
         if (!$$4.isEmpty()) {
            dds $$5 = $$4.a($$0, $$1, this.e);
            if ($$5 == null || $$5.r()) {
               this.d = $$5;
               $$5 = $$4.a($$1, $$0, this.e);
            }

            if ($$5 != null && !$$5.r()) {
               this.d = $$5;
               this.a(2, $$5.h());
               this.f = $$5.q();
            } else {
               this.a(2, cvx.k);
               this.f = 0;
            }
         }

         this.b.k(this.a(2));
      }
   }

   @Nullable
   public dds g() {
      return this.d;
   }

   public void c(int $$0) {
      this.e = $$0;
      this.f();
   }

   @Override
   public void a() {
      this.c.clear();
   }

   public int h() {
      return this.f;
   }
}
