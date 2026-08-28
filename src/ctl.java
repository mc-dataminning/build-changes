import javax.annotation.Nullable;

public class ctl implements bsc {
   private final dfd b;
   private final ka<cwo> c = ka.a(3, cwo.j);
   @Nullable
   private dfe d;
   private int e;
   private int f;

   public ctl(dfd $$0) {
      this.b = $$0;
   }

   @Override
   public int b() {
      return this.c.size();
   }

   @Override
   public boolean c() {
      for (cwo $$0 : this.c) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cwo a(int $$0) {
      return this.c.get($$0);
   }

   @Override
   public cwo a(int $$0, int $$1) {
      cwo $$2 = this.c.get($$0);
      if ($$0 == 2 && !$$2.f()) {
         return bsd.a(this.c, $$0, $$2.M());
      } else {
         cwo $$3 = bsd.a(this.c, $$0, $$1);
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
   public cwo b(int $$0) {
      return bsd.a(this.c, $$0);
   }

   @Override
   public void a(int $$0, cwo $$1) {
      this.c.set($$0, $$1);
      $$1.f(this.e_($$1));
      if (this.d($$0)) {
         this.f();
      }
   }

   @Override
   public boolean a(cow $$0) {
      return this.b.gs() == $$0;
   }

   @Override
   public void e() {
      this.f();
   }

   public void f() {
      this.d = null;
      cwo $$0;
      cwo $$1;
      if (this.c.get(0).f()) {
         $$0 = this.c.get(1);
         $$1 = cwo.j;
      } else {
         $$0 = this.c.get(0);
         $$1 = this.c.get(1);
      }

      if ($$0.f()) {
         this.a(2, cwo.j);
         this.f = 0;
      } else {
         dff $$4 = this.b.gu();
         if (!$$4.isEmpty()) {
            dfe $$5 = $$4.a($$0, $$1, this.e);
            if ($$5 == null || $$5.r()) {
               this.d = $$5;
               $$5 = $$4.a($$1, $$0, this.e);
            }

            if ($$5 != null && !$$5.r()) {
               this.d = $$5;
               this.a(2, $$5.h());
               this.f = $$5.q();
            } else {
               this.a(2, cwo.j);
               this.f = 0;
            }
         }

         this.b.i(this.a(2));
      }
   }

   @Nullable
   public dfe g() {
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
