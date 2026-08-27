import javax.annotation.Nullable;

public class cft implements bgt {
   private final cou c;
   private final hp<cjh> d = hp.a(3, cjh.b);
   @Nullable
   private cov e;
   private int f;
   private int g;

   public cft(cou $$0) {
      this.c = $$0;
   }

   @Override
   public int b() {
      return this.d.size();
   }

   @Override
   public boolean af_() {
      for (cjh $$0 : this.d) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cjh a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public cjh a(int $$0, int $$1) {
      cjh $$2 = this.d.get($$0);
      if ($$0 == 2 && !$$2.b()) {
         return bgu.a(this.d, $$0, $$2.L());
      } else {
         cjh $$3 = bgu.a(this.d, $$0, $$1);
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
   public cjh b(int $$0) {
      return bgu.a(this.d, $$0);
   }

   @Override
   public void a(int $$0, cjh $$1) {
      this.d.set($$0, $$1);
      if (!$$1.b() && $$1.L() > this.ag_()) {
         $$1.f(this.ag_());
      }

      if (this.d($$0)) {
         this.f();
      }
   }

   @Override
   public boolean a(cbw $$0) {
      return this.c.gd() == $$0;
   }

   @Override
   public void e() {
      this.f();
   }

   public void f() {
      this.e = null;
      cjh $$0;
      cjh $$1;
      if (this.d.get(0).b()) {
         $$0 = this.d.get(1);
         $$1 = cjh.b;
      } else {
         $$0 = this.d.get(0);
         $$1 = this.d.get(1);
      }

      if ($$0.b()) {
         this.a(2, cjh.b);
         this.g = 0;
      } else {
         cow $$4 = this.c.gf();
         if (!$$4.isEmpty()) {
            cov $$5 = $$4.a($$0, $$1, this.f);
            if ($$5 == null || $$5.p()) {
               this.e = $$5;
               $$5 = $$4.a($$1, $$0, this.f);
            }

            if ($$5 != null && !$$5.p()) {
               this.e = $$5;
               this.a(2, $$5.f());
               this.g = $$5.o();
            } else {
               this.a(2, cjh.b);
               this.g = 0;
            }
         }

         this.c.l(this.a(2));
      }
   }

   @Nullable
   public cov g() {
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
