import javax.annotation.Nullable;

public class cis implements bje {
   private final crv c;
   private final io<cmh> d = io.a(3, cmh.f);
   @Nullable
   private crw e;
   private int f;
   private int g;

   public cis(crv $$0) {
      this.c = $$0;
   }

   @Override
   public int b() {
      return this.d.size();
   }

   @Override
   public boolean ai_() {
      for (cmh $$0 : this.d) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cmh a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public cmh a(int $$0, int $$1) {
      cmh $$2 = this.d.get($$0);
      if ($$0 == 2 && !$$2.b()) {
         return bjf.a(this.d, $$0, $$2.L());
      } else {
         cmh $$3 = bjf.a(this.d, $$0, $$1);
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
   public cmh b(int $$0) {
      return bjf.a(this.d, $$0);
   }

   @Override
   public void a(int $$0, cmh $$1) {
      this.d.set($$0, $$1);
      if (!$$1.b() && $$1.L() > this.ak_()) {
         $$1.f(this.ak_());
      }

      if (this.d($$0)) {
         this.f();
      }
   }

   @Override
   public boolean a(cer $$0) {
      return this.c.ge() == $$0;
   }

   @Override
   public void e() {
      this.f();
   }

   public void f() {
      this.e = null;
      cmh $$0;
      cmh $$1;
      if (this.d.get(0).b()) {
         $$0 = this.d.get(1);
         $$1 = cmh.f;
      } else {
         $$0 = this.d.get(0);
         $$1 = this.d.get(1);
      }

      if ($$0.b()) {
         this.a(2, cmh.f);
         this.g = 0;
      } else {
         crx $$4 = this.c.gg();
         if (!$$4.isEmpty()) {
            crw $$5 = $$4.a($$0, $$1, this.f);
            if ($$5 == null || $$5.p()) {
               this.e = $$5;
               $$5 = $$4.a($$1, $$0, this.f);
            }

            if ($$5 != null && !$$5.p()) {
               this.e = $$5;
               this.a(2, $$5.f());
               this.g = $$5.o();
            } else {
               this.a(2, cmh.f);
               this.g = 0;
            }
         }

         this.c.l(this.a(2));
      }
   }

   @Nullable
   public crw g() {
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
