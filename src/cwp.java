import javax.annotation.Nullable;

public class cwp implements btz {
   private final dih b;
   private final jo<czn> c = jo.a(3, czn.k);
   @Nullable
   private dii d;
   private int e;
   private int f;

   public cwp(dih $$0) {
      this.b = $$0;
   }

   @Override
   public int b() {
      return this.c.size();
   }

   @Override
   public boolean c() {
      for (czn $$0 : this.c) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public czn a(int $$0) {
      return this.c.get($$0);
   }

   @Override
   public czn a(int $$0, int $$1) {
      czn $$2 = this.c.get($$0);
      if ($$0 == 2 && !$$2.f()) {
         return bua.a(this.c, $$0, $$2.M());
      } else {
         czn $$3 = bua.a(this.c, $$0, $$1);
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
   public czn b(int $$0) {
      return bua.a(this.c, $$0);
   }

   @Override
   public void a(int $$0, czn $$1) {
      this.c.set($$0, $$1);
      $$1.f(this.f_($$1));
      if (this.d($$0)) {
         this.f();
      }
   }

   @Override
   public boolean a(crm $$0) {
      return this.b.x() == $$0;
   }

   @Override
   public void e() {
      this.f();
   }

   public void f() {
      this.d = null;
      czn $$0;
      czn $$1;
      if (this.c.get(0).f()) {
         $$0 = this.c.get(1);
         $$1 = czn.k;
      } else {
         $$0 = this.c.get(0);
         $$1 = this.c.get(1);
      }

      if ($$0.f()) {
         this.a(2, czn.k);
         this.f = 0;
      } else {
         dij $$4 = this.b.gu();
         if (!$$4.isEmpty()) {
            dii $$5 = $$4.a($$0, $$1, this.e);
            if ($$5 == null || $$5.r()) {
               this.d = $$5;
               $$5 = $$4.a($$1, $$0, this.e);
            }

            if ($$5 != null && !$$5.r()) {
               this.d = $$5;
               this.a(2, $$5.h());
               this.f = $$5.q();
            } else {
               this.a(2, czn.k);
               this.f = 0;
            }
         }

         this.b.i(this.a(2));
      }
   }

   @Nullable
   public dii g() {
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
