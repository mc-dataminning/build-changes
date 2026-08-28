import javax.annotation.Nullable;

public class csa implements brd {
   private final dco b;
   private final jw<cvl> c = jw.a(3, cvl.k);
   @Nullable
   private dcp d;
   private int e;
   private int f;

   public csa(dco $$0) {
      this.b = $$0;
   }

   @Override
   public int b() {
      return this.c.size();
   }

   @Override
   public boolean c() {
      for (cvl $$0 : this.c) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cvl a(int $$0) {
      return this.c.get($$0);
   }

   @Override
   public cvl a(int $$0, int $$1) {
      cvl $$2 = this.c.get($$0);
      if ($$0 == 2 && !$$2.f()) {
         return bre.a(this.c, $$0, $$2.J());
      } else {
         cvl $$3 = bre.a(this.c, $$0, $$1);
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
   public cvl b(int $$0) {
      return bre.a(this.c, $$0);
   }

   @Override
   public void a(int $$0, cvl $$1) {
      this.c.set($$0, $$1);
      $$1.f(this.f_($$1));
      if (this.d($$0)) {
         this.f();
      }
   }

   @Override
   public boolean a(cnp $$0) {
      return this.b.go() == $$0;
   }

   @Override
   public void e() {
      this.f();
   }

   public void f() {
      this.d = null;
      cvl $$0;
      cvl $$1;
      if (this.c.get(0).f()) {
         $$0 = this.c.get(1);
         $$1 = cvl.k;
      } else {
         $$0 = this.c.get(0);
         $$1 = this.c.get(1);
      }

      if ($$0.f()) {
         this.a(2, cvl.k);
         this.f = 0;
      } else {
         dcq $$4 = this.b.gq();
         if (!$$4.isEmpty()) {
            dcp $$5 = $$4.a($$0, $$1, this.e);
            if ($$5 == null || $$5.r()) {
               this.d = $$5;
               $$5 = $$4.a($$1, $$0, this.e);
            }

            if ($$5 != null && !$$5.r()) {
               this.d = $$5;
               this.a(2, $$5.h());
               this.f = $$5.q();
            } else {
               this.a(2, cvl.k);
               this.f = 0;
            }
         }

         this.b.o(this.a(2));
      }
   }

   @Nullable
   public dcp g() {
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
