import javax.annotation.Nullable;

public class cum implements btc {
   private final dge b;
   private final jz<cxp> c = jz.a(3, cxp.j);
   @Nullable
   private dgf d;
   private int e;
   private int f;

   public cum(dge $$0) {
      this.b = $$0;
   }

   @Override
   public int b() {
      return this.c.size();
   }

   @Override
   public boolean c() {
      for (cxp $$0 : this.c) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cxp a(int $$0) {
      return this.c.get($$0);
   }

   @Override
   public cxp a(int $$0, int $$1) {
      cxp $$2 = this.c.get($$0);
      if ($$0 == 2 && !$$2.f()) {
         return btd.a(this.c, $$0, $$2.L());
      } else {
         cxp $$3 = btd.a(this.c, $$0, $$1);
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
   public cxp b(int $$0) {
      return btd.a(this.c, $$0);
   }

   @Override
   public void a(int $$0, cxp $$1) {
      this.c.set($$0, $$1);
      $$1.f(this.e_($$1));
      if (this.d($$0)) {
         this.f();
      }
   }

   @Override
   public boolean a(cpx $$0) {
      return this.b.go() == $$0;
   }

   @Override
   public void e() {
      this.f();
   }

   public void f() {
      this.d = null;
      cxp $$0;
      cxp $$1;
      if (this.c.get(0).f()) {
         $$0 = this.c.get(1);
         $$1 = cxp.j;
      } else {
         $$0 = this.c.get(0);
         $$1 = this.c.get(1);
      }

      if ($$0.f()) {
         this.a(2, cxp.j);
         this.f = 0;
      } else {
         dgg $$4 = this.b.gq();
         if (!$$4.isEmpty()) {
            dgf $$5 = $$4.a($$0, $$1, this.e);
            if ($$5 == null || $$5.r()) {
               this.d = $$5;
               $$5 = $$4.a($$1, $$0, this.e);
            }

            if ($$5 != null && !$$5.r()) {
               this.d = $$5;
               this.a(2, $$5.h());
               this.f = $$5.q();
            } else {
               this.a(2, cxp.j);
               this.f = 0;
            }
         }

         this.b.i(this.a(2));
      }
   }

   @Nullable
   public dgf g() {
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
