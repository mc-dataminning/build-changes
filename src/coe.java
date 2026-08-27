import javax.annotation.Nullable;

public class coe implements bny {
   private final cyd c;
   private final iw<crs> d = iw.a(3, crs.i);
   @Nullable
   private cye e;
   private int f;
   private int g;

   public coe(cyd $$0) {
      this.c = $$0;
   }

   @Override
   public int b() {
      return this.d.size();
   }

   @Override
   public boolean c() {
      for (crs $$0 : this.d) {
         if (!$$0.d()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public crs a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public crs a(int $$0, int $$1) {
      crs $$2 = this.d.get($$0);
      if ($$0 == 2 && !$$2.d()) {
         return bnz.a(this.d, $$0, $$2.G());
      } else {
         crs $$3 = bnz.a(this.d, $$0, $$1);
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
   public crs b(int $$0) {
      return bnz.a(this.d, $$0);
   }

   @Override
   public void a(int $$0, crs $$1) {
      this.d.set($$0, $$1);
      if (!$$1.d() && $$1.G() > this.ah_()) {
         $$1.e(this.ah_());
      }

      if (this.d($$0)) {
         this.f();
      }
   }

   @Override
   public boolean a(cka $$0) {
      return this.c.gn() == $$0;
   }

   @Override
   public void e() {
      this.f();
   }

   public void f() {
      this.e = null;
      crs $$0;
      crs $$1;
      if (this.d.get(0).d()) {
         $$0 = this.d.get(1);
         $$1 = crs.i;
      } else {
         $$0 = this.d.get(0);
         $$1 = this.d.get(1);
      }

      if ($$0.d()) {
         this.a(2, crs.i);
         this.g = 0;
      } else {
         cyf $$4 = this.c.gp();
         if (!$$4.isEmpty()) {
            cye $$5 = $$4.a($$0, $$1, this.f);
            if ($$5 == null || $$5.r()) {
               this.e = $$5;
               $$5 = $$4.a($$1, $$0, this.f);
            }

            if ($$5 != null && !$$5.r()) {
               this.e = $$5;
               this.a(2, $$5.h());
               this.g = $$5.q();
            } else {
               this.a(2, crs.i);
               this.g = 0;
            }
         }

         this.c.n(this.a(2));
      }
   }

   @Nullable
   public cye g() {
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
