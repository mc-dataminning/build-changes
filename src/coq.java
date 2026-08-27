import javax.annotation.Nullable;

public class coq implements boj {
   private final cyr c;
   private final je<csd> d = je.a(3, csd.i);
   @Nullable
   private cys e;
   private int f;
   private int g;

   public coq(cyr $$0) {
      this.c = $$0;
   }

   @Override
   public int b() {
      return this.d.size();
   }

   @Override
   public boolean c() {
      for (csd $$0 : this.d) {
         if (!$$0.d()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public csd a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public csd a(int $$0, int $$1) {
      csd $$2 = this.d.get($$0);
      if ($$0 == 2 && !$$2.d()) {
         return bok.a(this.d, $$0, $$2.G());
      } else {
         csd $$3 = bok.a(this.d, $$0, $$1);
         if (!$$3.d() && this.d($$0)) {
            this.f();
         }

         return $$3;
      }
   }

   private boolean d(int $$0) {
      return $$0 == 0 || $$0 == 1;
   }

   @Override
   public csd b(int $$0) {
      return bok.a(this.d, $$0);
   }

   @Override
   public void a(int $$0, csd $$1) {
      this.d.set($$0, $$1);
      if (!$$1.d() && $$1.G() > this.ah_()) {
         $$1.e(this.ah_());
      }

      if (this.d($$0)) {
         this.f();
      }
   }

   @Override
   public boolean a(ckl $$0) {
      return this.c.gp() == $$0;
   }

   @Override
   public void e() {
      this.f();
   }

   public void f() {
      this.e = null;
      csd $$0;
      csd $$1;
      if (this.d.get(0).d()) {
         $$0 = this.d.get(1);
         $$1 = csd.i;
      } else {
         $$0 = this.d.get(0);
         $$1 = this.d.get(1);
      }

      if ($$0.d()) {
         this.a(2, csd.i);
         this.g = 0;
      } else {
         cyt $$4 = this.c.gr();
         if (!$$4.isEmpty()) {
            cys $$5 = $$4.a($$0, $$1, this.f);
            if ($$5 == null || $$5.r()) {
               this.e = $$5;
               $$5 = $$4.a($$1, $$0, this.f);
            }

            if ($$5 != null && !$$5.r()) {
               this.e = $$5;
               this.a(2, $$5.h());
               this.g = $$5.q();
            } else {
               this.a(2, csd.i);
               this.g = 0;
            }
         }

         this.c.n(this.a(2));
      }
   }

   @Nullable
   public cys g() {
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
