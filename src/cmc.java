import javax.annotation.Nullable;

public class cmc implements bme {
   private final cvb c;
   private final iu<cpq> d = iu.a(3, cpq.h);
   @Nullable
   private cvc e;
   private int f;
   private int g;

   public cmc(cvb $$0) {
      this.c = $$0;
   }

   @Override
   public int b() {
      return this.d.size();
   }

   @Override
   public boolean aj_() {
      for (cpq $$0 : this.d) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cpq a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public cpq a(int $$0, int $$1) {
      cpq $$2 = this.d.get($$0);
      if ($$0 == 2 && !$$2.b()) {
         return bmf.a(this.d, $$0, $$2.M());
      } else {
         cpq $$3 = bmf.a(this.d, $$0, $$1);
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
   public cpq b(int $$0) {
      return bmf.a(this.d, $$0);
   }

   @Override
   public void a(int $$0, cpq $$1) {
      this.d.set($$0, $$1);
      if (!$$1.b() && $$1.M() > this.al_()) {
         $$1.f(this.al_());
      }

      if (this.d($$0)) {
         this.f();
      }
   }

   @Override
   public boolean a(cia $$0) {
      return this.c.gl() == $$0;
   }

   @Override
   public void e() {
      this.f();
   }

   public void f() {
      this.e = null;
      cpq $$0;
      cpq $$1;
      if (this.d.get(0).b()) {
         $$0 = this.d.get(1);
         $$1 = cpq.h;
      } else {
         $$0 = this.d.get(0);
         $$1 = this.d.get(1);
      }

      if ($$0.b()) {
         this.a(2, cpq.h);
         this.g = 0;
      } else {
         cvd $$4 = this.c.gn();
         if (!$$4.isEmpty()) {
            cvc $$5 = $$4.a($$0, $$1, this.f);
            if ($$5 == null || $$5.q()) {
               this.e = $$5;
               $$5 = $$4.a($$1, $$0, this.f);
            }

            if ($$5 != null && !$$5.q()) {
               this.e = $$5;
               this.a(2, $$5.f());
               this.g = $$5.p();
            } else {
               this.a(2, cpq.h);
               this.g = 0;
            }
         }

         this.c.n(this.a(2));
      }
   }

   @Nullable
   public cvc g() {
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
