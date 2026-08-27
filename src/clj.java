import javax.annotation.Nullable;

public class clj implements bln {
   private final cuk c;
   private final is<coz> d = is.a(3, coz.h);
   @Nullable
   private cul e;
   private int f;
   private int g;

   public clj(cuk $$0) {
      this.c = $$0;
   }

   @Override
   public int b() {
      return this.d.size();
   }

   @Override
   public boolean aj_() {
      for (coz $$0 : this.d) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public coz a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public coz a(int $$0, int $$1) {
      coz $$2 = this.d.get($$0);
      if ($$0 == 2 && !$$2.b()) {
         return blo.a(this.d, $$0, $$2.M());
      } else {
         coz $$3 = blo.a(this.d, $$0, $$1);
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
   public coz b(int $$0) {
      return blo.a(this.d, $$0);
   }

   @Override
   public void a(int $$0, coz $$1) {
      this.d.set($$0, $$1);
      if (!$$1.b() && $$1.M() > this.al_()) {
         $$1.f(this.al_());
      }

      if (this.d($$0)) {
         this.f();
      }
   }

   @Override
   public boolean a(chh $$0) {
      return this.c.gg() == $$0;
   }

   @Override
   public void e() {
      this.f();
   }

   public void f() {
      this.e = null;
      coz $$0;
      coz $$1;
      if (this.d.get(0).b()) {
         $$0 = this.d.get(1);
         $$1 = coz.h;
      } else {
         $$0 = this.d.get(0);
         $$1 = this.d.get(1);
      }

      if ($$0.b()) {
         this.a(2, coz.h);
         this.g = 0;
      } else {
         cum $$4 = this.c.gi();
         if (!$$4.isEmpty()) {
            cul $$5 = $$4.a($$0, $$1, this.f);
            if ($$5 == null || $$5.q()) {
               this.e = $$5;
               $$5 = $$4.a($$1, $$0, this.f);
            }

            if ($$5 != null && !$$5.q()) {
               this.e = $$5;
               this.a(2, $$5.f());
               this.g = $$5.p();
            } else {
               this.a(2, coz.h);
               this.g = 0;
            }
         }

         this.c.l(this.a(2));
      }
   }

   @Nullable
   public cul g() {
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
