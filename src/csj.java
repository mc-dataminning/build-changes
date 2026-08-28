import javax.annotation.Nullable;

public class csj implements brl {
   private final ddf b;
   private final jx<cvs> c = jx.a(3, cvs.k);
   @Nullable
   private ddg d;
   private int e;
   private int f;

   public csj(ddf $$0) {
      this.b = $$0;
   }

   @Override
   public int b() {
      return this.c.size();
   }

   @Override
   public boolean c() {
      for (cvs $$0 : this.c) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cvs a(int $$0) {
      return this.c.get($$0);
   }

   @Override
   public cvs a(int $$0, int $$1) {
      cvs $$2 = this.c.get($$0);
      if ($$0 == 2 && !$$2.f()) {
         return brm.a(this.c, $$0, $$2.K());
      } else {
         cvs $$3 = brm.a(this.c, $$0, $$1);
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
   public cvs b(int $$0) {
      return brm.a(this.c, $$0);
   }

   @Override
   public void a(int $$0, cvs $$1) {
      this.c.set($$0, $$1);
      $$1.f(this.f_($$1));
      if (this.d($$0)) {
         this.f();
      }
   }

   @Override
   public boolean a(cnx $$0) {
      return this.b.go() == $$0;
   }

   @Override
   public void e() {
      this.f();
   }

   public void f() {
      this.d = null;
      cvs $$0;
      cvs $$1;
      if (this.c.get(0).f()) {
         $$0 = this.c.get(1);
         $$1 = cvs.k;
      } else {
         $$0 = this.c.get(0);
         $$1 = this.c.get(1);
      }

      if ($$0.f()) {
         this.a(2, cvs.k);
         this.f = 0;
      } else {
         ddh $$4 = this.b.gq();
         if (!$$4.isEmpty()) {
            ddg $$5 = $$4.a($$0, $$1, this.e);
            if ($$5 == null || $$5.r()) {
               this.d = $$5;
               $$5 = $$4.a($$1, $$0, this.e);
            }

            if ($$5 != null && !$$5.r()) {
               this.d = $$5;
               this.a(2, $$5.h());
               this.f = $$5.q();
            } else {
               this.a(2, cvs.k);
               this.f = 0;
            }
         }

         this.b.m(this.a(2));
      }
   }

   @Nullable
   public ddg g() {
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
