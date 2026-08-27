import javax.annotation.Nullable;

public class chz implements biu {
   private final crc c;
   private final ip<clo> d = ip.a(3, clo.b);
   @Nullable
   private crd e;
   private int f;
   private int g;

   public chz(crc $$0) {
      this.c = $$0;
   }

   @Override
   public int b() {
      return this.d.size();
   }

   @Override
   public boolean aj_() {
      for (clo $$0 : this.d) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public clo a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public clo a(int $$0, int $$1) {
      clo $$2 = this.d.get($$0);
      if ($$0 == 2 && !$$2.b()) {
         return biv.a(this.d, $$0, $$2.L());
      } else {
         clo $$3 = biv.a(this.d, $$0, $$1);
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
   public clo b(int $$0) {
      return biv.a(this.d, $$0);
   }

   @Override
   public void a(int $$0, clo $$1) {
      this.d.set($$0, $$1);
      if (!$$1.b() && $$1.L() > this.al_()) {
         $$1.f(this.al_());
      }

      if (this.d($$0)) {
         this.f();
      }
   }

   @Override
   public boolean a(cdz $$0) {
      return this.c.gf() == $$0;
   }

   @Override
   public void e() {
      this.f();
   }

   public void f() {
      this.e = null;
      clo $$0;
      clo $$1;
      if (this.d.get(0).b()) {
         $$0 = this.d.get(1);
         $$1 = clo.b;
      } else {
         $$0 = this.d.get(0);
         $$1 = this.d.get(1);
      }

      if ($$0.b()) {
         this.a(2, clo.b);
         this.g = 0;
      } else {
         cre $$4 = this.c.gh();
         if (!$$4.isEmpty()) {
            crd $$5 = $$4.a($$0, $$1, this.f);
            if ($$5 == null || $$5.p()) {
               this.e = $$5;
               $$5 = $$4.a($$1, $$0, this.f);
            }

            if ($$5 != null && !$$5.p()) {
               this.e = $$5;
               this.a(2, $$5.f());
               this.g = $$5.o();
            } else {
               this.a(2, clo.b);
               this.g = 0;
            }
         }

         this.c.l(this.a(2));
      }
   }

   @Nullable
   public crd g() {
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
