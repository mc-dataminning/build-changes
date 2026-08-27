import javax.annotation.Nullable;

public class cjj implements bju {
   private final csm c;
   private final iq<cmy> d = iq.a(3, cmy.f);
   @Nullable
   private csn e;
   private int f;
   private int g;

   public cjj(csm $$0) {
      this.c = $$0;
   }

   @Override
   public int b() {
      return this.d.size();
   }

   @Override
   public boolean ai_() {
      for (cmy $$0 : this.d) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cmy a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public cmy a(int $$0, int $$1) {
      cmy $$2 = this.d.get($$0);
      if ($$0 == 2 && !$$2.b()) {
         return bjv.a(this.d, $$0, $$2.L());
      } else {
         cmy $$3 = bjv.a(this.d, $$0, $$1);
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
   public cmy b(int $$0) {
      return bjv.a(this.d, $$0);
   }

   @Override
   public void a(int $$0, cmy $$1) {
      this.d.set($$0, $$1);
      if (!$$1.b() && $$1.L() > this.ak_()) {
         $$1.f(this.ak_());
      }

      if (this.d($$0)) {
         this.f();
      }
   }

   @Override
   public boolean a(cfi $$0) {
      return this.c.ge() == $$0;
   }

   @Override
   public void e() {
      this.f();
   }

   public void f() {
      this.e = null;
      cmy $$0;
      cmy $$1;
      if (this.d.get(0).b()) {
         $$0 = this.d.get(1);
         $$1 = cmy.f;
      } else {
         $$0 = this.d.get(0);
         $$1 = this.d.get(1);
      }

      if ($$0.b()) {
         this.a(2, cmy.f);
         this.g = 0;
      } else {
         cso $$4 = this.c.gg();
         if (!$$4.isEmpty()) {
            csn $$5 = $$4.a($$0, $$1, this.f);
            if ($$5 == null || $$5.p()) {
               this.e = $$5;
               $$5 = $$4.a($$1, $$0, this.f);
            }

            if ($$5 != null && !$$5.p()) {
               this.e = $$5;
               this.a(2, $$5.f());
               this.g = $$5.o();
            } else {
               this.a(2, cmy.f);
               this.g = 0;
            }
         }

         this.c.l(this.a(2));
      }
   }

   @Nullable
   public csn g() {
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
