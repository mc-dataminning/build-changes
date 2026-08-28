import javax.annotation.Nullable;

public class cxa implements buk {
   private final dis b;
   private final jo<czy> c = jo.a(3, czy.k);
   @Nullable
   private dit d;
   private int e;
   private int f;

   public cxa(dis $$0) {
      this.b = $$0;
   }

   @Override
   public int b() {
      return this.c.size();
   }

   @Override
   public boolean c() {
      for (czy $$0 : this.c) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public czy a(int $$0) {
      return this.c.get($$0);
   }

   @Override
   public czy a(int $$0, int $$1) {
      czy $$2 = this.c.get($$0);
      if ($$0 == 2 && !$$2.f()) {
         return bul.a(this.c, $$0, $$2.M());
      } else {
         czy $$3 = bul.a(this.c, $$0, $$1);
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
   public czy b(int $$0) {
      return bul.a(this.c, $$0);
   }

   @Override
   public void a(int $$0, czy $$1) {
      this.c.set($$0, $$1);
      $$1.f(this.f_($$1));
      if (this.d($$0)) {
         this.f();
      }
   }

   @Override
   public boolean a(crx $$0) {
      return this.b.x() == $$0;
   }

   @Override
   public void e() {
      this.f();
   }

   public void f() {
      this.d = null;
      czy $$0;
      czy $$1;
      if (this.c.get(0).f()) {
         $$0 = this.c.get(1);
         $$1 = czy.k;
      } else {
         $$0 = this.c.get(0);
         $$1 = this.c.get(1);
      }

      if ($$0.f()) {
         this.a(2, czy.k);
         this.f = 0;
      } else {
         diu $$4 = this.b.gv();
         if (!$$4.isEmpty()) {
            dit $$5 = $$4.a($$0, $$1, this.e);
            if ($$5 == null || $$5.r()) {
               this.d = $$5;
               $$5 = $$4.a($$1, $$0, this.e);
            }

            if ($$5 != null && !$$5.r()) {
               this.d = $$5;
               this.a(2, $$5.h());
               this.f = $$5.q();
            } else {
               this.a(2, czy.k);
               this.f = 0;
            }
         }

         this.b.i(this.a(2));
      }
   }

   @Nullable
   public dit g() {
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
