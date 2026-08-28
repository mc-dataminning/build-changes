import javax.annotation.Nullable;

public class csg implements bri {
   private final ddc b;
   private final jw<cvp> c = jw.a(3, cvp.k);
   @Nullable
   private ddd d;
   private int e;
   private int f;

   public csg(ddc $$0) {
      this.b = $$0;
   }

   @Override
   public int b() {
      return this.c.size();
   }

   @Override
   public boolean c() {
      for (cvp $$0 : this.c) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cvp a(int $$0) {
      return this.c.get($$0);
   }

   @Override
   public cvp a(int $$0, int $$1) {
      cvp $$2 = this.c.get($$0);
      if ($$0 == 2 && !$$2.f()) {
         return brj.a(this.c, $$0, $$2.J());
      } else {
         cvp $$3 = brj.a(this.c, $$0, $$1);
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
   public cvp b(int $$0) {
      return brj.a(this.c, $$0);
   }

   @Override
   public void a(int $$0, cvp $$1) {
      this.c.set($$0, $$1);
      $$1.f(this.f_($$1));
      if (this.d($$0)) {
         this.f();
      }
   }

   @Override
   public boolean a(cnu $$0) {
      return this.b.gp() == $$0;
   }

   @Override
   public void e() {
      this.f();
   }

   public void f() {
      this.d = null;
      cvp $$0;
      cvp $$1;
      if (this.c.get(0).f()) {
         $$0 = this.c.get(1);
         $$1 = cvp.k;
      } else {
         $$0 = this.c.get(0);
         $$1 = this.c.get(1);
      }

      if ($$0.f()) {
         this.a(2, cvp.k);
         this.f = 0;
      } else {
         dde $$4 = this.b.gr();
         if (!$$4.isEmpty()) {
            ddd $$5 = $$4.a($$0, $$1, this.e);
            if ($$5 == null || $$5.r()) {
               this.d = $$5;
               $$5 = $$4.a($$1, $$0, this.e);
            }

            if ($$5 != null && !$$5.r()) {
               this.d = $$5;
               this.a(2, $$5.h());
               this.f = $$5.q();
            } else {
               this.a(2, cvp.k);
               this.f = 0;
            }
         }

         this.b.m(this.a(2));
      }
   }

   @Nullable
   public ddd g() {
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
