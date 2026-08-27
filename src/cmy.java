import javax.annotation.Nullable;

public class cmy implements bmw {
   private final cvy c;
   private final iu<cqm> d = iu.a(3, cqm.h);
   @Nullable
   private cvz e;
   private int f;
   private int g;

   public cmy(cvy $$0) {
      this.c = $$0;
   }

   @Override
   public int b() {
      return this.d.size();
   }

   @Override
   public boolean ai_() {
      for (cqm $$0 : this.d) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cqm a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public cqm a(int $$0, int $$1) {
      cqm $$2 = this.d.get($$0);
      if ($$0 == 2 && !$$2.b()) {
         return bmx.a(this.d, $$0, $$2.M());
      } else {
         cqm $$3 = bmx.a(this.d, $$0, $$1);
         if (!$$3.b() && this.d($$0)) {
            this.f();
         }

         return $$3;
      }
   }

   private boolean d(int $$0) {
      return $$0 == 0 || $$0 == 1;
   }

   @Override
   public cqm b(int $$0) {
      return bmx.a(this.d, $$0);
   }

   @Override
   public void a(int $$0, cqm $$1) {
      this.d.set($$0, $$1);
      if (!$$1.b() && $$1.M() > this.ak_()) {
         $$1.f(this.ak_());
      }

      if (this.d($$0)) {
         this.f();
      }
   }

   @Override
   public boolean a(ciu $$0) {
      return this.c.gn() == $$0;
   }

   @Override
   public void e() {
      this.f();
   }

   public void f() {
      this.e = null;
      cqm $$0;
      cqm $$1;
      if (this.d.get(0).b()) {
         $$0 = this.d.get(1);
         $$1 = cqm.h;
      } else {
         $$0 = this.d.get(0);
         $$1 = this.d.get(1);
      }

      if ($$0.b()) {
         this.a(2, cqm.h);
         this.g = 0;
      } else {
         cwa $$4 = this.c.gp();
         if (!$$4.isEmpty()) {
            cvz $$5 = $$4.a($$0, $$1, this.f);
            if ($$5 == null || $$5.q()) {
               this.e = $$5;
               $$5 = $$4.a($$1, $$0, this.f);
            }

            if ($$5 != null && !$$5.q()) {
               this.e = $$5;
               this.a(2, $$5.f());
               this.g = $$5.p();
            } else {
               this.a(2, cqm.h);
               this.g = 0;
            }
         }

         this.c.n(this.a(2));
      }
   }

   @Nullable
   public cvz g() {
      return this.e;
   }

   public void c(int $$0) {
      this.f = $$0;
      this.f();
   }

   @Override
   public void a() {
      this.d.clear();
   }

   public int h() {
      return this.g;
   }
}
