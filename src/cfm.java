import javax.annotation.Nullable;

public class cfm implements bgm {
   private final com c;
   private final hp<cja> d = hp.a(3, cja.b);
   @Nullable
   private coo e;
   private int f;
   private int g;

   public cfm(com $$0) {
      this.c = $$0;
   }

   @Override
   public int b() {
      return this.d.size();
   }

   @Override
   public boolean aa_() {
      for (cja $$0 : this.d) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cja a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public cja a(int $$0, int $$1) {
      cja $$2 = this.d.get($$0);
      if ($$0 == 2 && !$$2.b()) {
         return bgn.a(this.d, $$0, $$2.L());
      } else {
         cja $$3 = bgn.a(this.d, $$0, $$1);
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
   public cja b(int $$0) {
      return bgn.a(this.d, $$0);
   }

   @Override
   public void a(int $$0, cja $$1) {
      this.d.set($$0, $$1);
      if (!$$1.b() && $$1.L() > this.ab_()) {
         $$1.f(this.ab_());
      }

      if (this.d($$0)) {
         this.f();
      }
   }

   @Override
   public boolean a(cbp $$0) {
      return this.c.ga() == $$0;
   }

   @Override
   public void e() {
      this.f();
   }

   public void f() {
      this.e = null;
      cja $$0;
      cja $$1;
      if (this.d.get(0).b()) {
         $$0 = this.d.get(1);
         $$1 = cja.b;
      } else {
         $$0 = this.d.get(0);
         $$1 = this.d.get(1);
      }

      if ($$0.b()) {
         this.a(2, cja.b);
         this.g = 0;
      } else {
         cop $$4 = this.c.gc();
         if (!$$4.isEmpty()) {
            coo $$5 = $$4.a($$0, $$1, this.f);
            if ($$5 == null || $$5.p()) {
               this.e = $$5;
               $$5 = $$4.a($$1, $$0, this.f);
            }

            if ($$5 != null && !$$5.p()) {
               this.e = $$5;
               this.a(2, $$5.f());
               this.g = $$5.o();
            } else {
               this.a(2, cja.b);
               this.g = 0;
            }
         }

         this.c.l(this.a(2));
      }
   }

   @Nullable
   public coo g() {
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
