import javax.annotation.Nullable;

public class cfx implements bgx {
   private final coy c;
   private final hn<cjl> d = hn.a(3, cjl.b);
   @Nullable
   private coz e;
   private int f;
   private int g;

   public cfx(coy $$0) {
      this.c = $$0;
   }

   @Override
   public int b() {
      return this.d.size();
   }

   @Override
   public boolean af_() {
      for (cjl $$0 : this.d) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cjl a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public cjl a(int $$0, int $$1) {
      cjl $$2 = this.d.get($$0);
      if ($$0 == 2 && !$$2.b()) {
         return bgy.a(this.d, $$0, $$2.L());
      } else {
         cjl $$3 = bgy.a(this.d, $$0, $$1);
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
   public cjl b(int $$0) {
      return bgy.a(this.d, $$0);
   }

   @Override
   public void a(int $$0, cjl $$1) {
      this.d.set($$0, $$1);
      if (!$$1.b() && $$1.L() > this.ag_()) {
         $$1.f(this.ag_());
      }

      if (this.d($$0)) {
         this.f();
      }
   }

   @Override
   public boolean a(cca $$0) {
      return this.c.ge() == $$0;
   }

   @Override
   public void e() {
      this.f();
   }

   public void f() {
      this.e = null;
      cjl $$0;
      cjl $$1;
      if (this.d.get(0).b()) {
         $$0 = this.d.get(1);
         $$1 = cjl.b;
      } else {
         $$0 = this.d.get(0);
         $$1 = this.d.get(1);
      }

      if ($$0.b()) {
         this.a(2, cjl.b);
         this.g = 0;
      } else {
         cpa $$4 = this.c.gg();
         if (!$$4.isEmpty()) {
            coz $$5 = $$4.a($$0, $$1, this.f);
            if ($$5 == null || $$5.p()) {
               this.e = $$5;
               $$5 = $$4.a($$1, $$0, this.f);
            }

            if ($$5 != null && !$$5.p()) {
               this.e = $$5;
               this.a(2, $$5.f());
               this.g = $$5.o();
            } else {
               this.a(2, cjl.b);
               this.g = 0;
            }
         }

         this.c.l(this.a(2));
      }
   }

   @Nullable
   public coz g() {
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
