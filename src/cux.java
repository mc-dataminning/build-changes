import javax.annotation.Nullable;

public class cux implements btj {
   private final dgm b;
   private final kb<cxy> c = kb.a(3, cxy.k);
   @Nullable
   private dgn d;
   private int e;
   private int f;

   public cux(dgm $$0) {
      this.b = $$0;
   }

   @Override
   public int b() {
      return this.c.size();
   }

   @Override
   public boolean c() {
      for (cxy $$0 : this.c) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cxy a(int $$0) {
      return this.c.get($$0);
   }

   @Override
   public cxy a(int $$0, int $$1) {
      cxy $$2 = this.c.get($$0);
      if ($$0 == 2 && !$$2.f()) {
         return btk.a(this.c, $$0, $$2.M());
      } else {
         cxy $$3 = btk.a(this.c, $$0, $$1);
         if (!$$3.f() && this.d($$0)) {
            this.f();
         }

         return $$3;
      }
   }

   private boolean d(int $$0) {
      return $$0 == 0 || $$0 == 1;
   }

   @Override
   public cxy b(int $$0) {
      return btk.a(this.c, $$0);
   }

   @Override
   public void a(int $$0, cxy $$1) {
      this.c.set($$0, $$1);
      $$1.f(this.e_($$1));
      if (this.d($$0)) {
         this.f();
      }
   }

   @Override
   public boolean a(cqi $$0) {
      return this.b.x() == $$0;
   }

   @Override
   public void e() {
      this.f();
   }

   public void f() {
      this.d = null;
      cxy $$0;
      cxy $$1;
      if (this.c.get(0).f()) {
         $$0 = this.c.get(1);
         $$1 = cxy.k;
      } else {
         $$0 = this.c.get(0);
         $$1 = this.c.get(1);
      }

      if ($$0.f()) {
         this.a(2, cxy.k);
         this.f = 0;
      } else {
         dgo $$4 = this.b.gr();
         if (!$$4.isEmpty()) {
            dgn $$5 = $$4.a($$0, $$1, this.e);
            if ($$5 == null || $$5.r()) {
               this.d = $$5;
               $$5 = $$4.a($$1, $$0, this.e);
            }

            if ($$5 != null && !$$5.r()) {
               this.d = $$5;
               this.a(2, $$5.h());
               this.f = $$5.q();
            } else {
               this.a(2, cxy.k);
               this.f = 0;
            }
         }

         this.b.j(this.a(2));
      }
   }

   @Nullable
   public dgn g() {
      return this.d;
   }

   public void c(int $$0) {
      this.e = $$0;
      this.f();
   }

   @Override
   public void a() {
      this.c.clear();
   }

   public int h() {
      return this.f;
   }
}
