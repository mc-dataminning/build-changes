import javax.annotation.Nullable;

public class chm implements bij {
   private final cqp c;
   private final il<clb> d = il.a(3, clb.b);
   @Nullable
   private cqq e;
   private int f;
   private int g;

   public chm(cqp $$0) {
      this.c = $$0;
   }

   @Override
   public int b() {
      return this.d.size();
   }

   @Override
   public boolean ai_() {
      for (clb $$0 : this.d) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public clb a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public clb a(int $$0, int $$1) {
      clb $$2 = this.d.get($$0);
      if ($$0 == 2 && !$$2.b()) {
         return bik.a(this.d, $$0, $$2.L());
      } else {
         clb $$3 = bik.a(this.d, $$0, $$1);
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
   public clb b(int $$0) {
      return bik.a(this.d, $$0);
   }

   @Override
   public void a(int $$0, clb $$1) {
      this.d.set($$0, $$1);
      if (!$$1.b() && $$1.L() > this.aj_()) {
         $$1.f(this.aj_());
      }

      if (this.d($$0)) {
         this.f();
      }
   }

   @Override
   public boolean a(cdm $$0) {
      return this.c.ge() == $$0;
   }

   @Override
   public void e() {
      this.f();
   }

   public void f() {
      this.e = null;
      clb $$0;
      clb $$1;
      if (this.d.get(0).b()) {
         $$0 = this.d.get(1);
         $$1 = clb.b;
      } else {
         $$0 = this.d.get(0);
         $$1 = this.d.get(1);
      }

      if ($$0.b()) {
         this.a(2, clb.b);
         this.g = 0;
      } else {
         cqr $$4 = this.c.gg();
         if (!$$4.isEmpty()) {
            cqq $$5 = $$4.a($$0, $$1, this.f);
            if ($$5 == null || $$5.p()) {
               this.e = $$5;
               $$5 = $$4.a($$1, $$0, this.f);
            }

            if ($$5 != null && !$$5.p()) {
               this.e = $$5;
               this.a(2, $$5.f());
               this.g = $$5.o();
            } else {
               this.a(2, clb.b);
               this.g = 0;
            }
         }

         this.c.l(this.a(2));
      }
   }

   @Nullable
   public cqq g() {
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
