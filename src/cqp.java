import javax.annotation.Nullable;

public class cqp implements bpt {
   private final dax b;
   private final jj<cuh> c = jj.a(3, cuh.i);
   @Nullable
   private day d;
   private int e;
   private int f;

   public cqp(dax $$0) {
      this.b = $$0;
   }

   @Override
   public int b() {
      return this.c.size();
   }

   @Override
   public boolean c() {
      for (cuh $$0 : this.c) {
         if (!$$0.d()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cuh a(int $$0) {
      return this.c.get($$0);
   }

   @Override
   public cuh a(int $$0, int $$1) {
      cuh $$2 = this.c.get($$0);
      if ($$0 == 2 && !$$2.d()) {
         return bpu.a(this.c, $$0, $$2.G());
      } else {
         cuh $$3 = bpu.a(this.c, $$0, $$1);
         if (!$$3.d() && this.d($$0)) {
            this.f();
         }

         return $$3;
      }
   }

   private boolean d(int $$0) {
      return $$0 == 0 || $$0 == 1;
   }

   @Override
   public cuh b(int $$0) {
      return bpu.a(this.c, $$0);
   }

   @Override
   public void a(int $$0, cuh $$1) {
      this.c.set($$0, $$1);
      $$1.f(this.a($$1));
      if (this.d($$0)) {
         this.f();
      }
   }

   @Override
   public boolean a(cly $$0) {
      return this.b.gy() == $$0;
   }

   @Override
   public void e() {
      this.f();
   }

   public void f() {
      this.d = null;
      cuh $$0;
      cuh $$1;
      if (this.c.get(0).d()) {
         $$0 = this.c.get(1);
         $$1 = cuh.i;
      } else {
         $$0 = this.c.get(0);
         $$1 = this.c.get(1);
      }

      if ($$0.d()) {
         this.a(2, cuh.i);
         this.f = 0;
      } else {
         daz $$4 = this.b.gA();
         if (!$$4.isEmpty()) {
            day $$5 = $$4.a($$0, $$1, this.e);
            if ($$5 == null || $$5.r()) {
               this.d = $$5;
               $$5 = $$4.a($$1, $$0, this.e);
            }

            if ($$5 != null && !$$5.r()) {
               this.d = $$5;
               this.a(2, $$5.h());
               this.f = $$5.q();
            } else {
               this.a(2, cuh.i);
               this.f = 0;
            }
         }

         this.b.n(this.a(2));
      }
   }

   @Nullable
   public day g() {
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
