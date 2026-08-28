import javax.annotation.Nullable;

public class cud implements bst {
   private final dfv b;
   private final jz<cxg> c = jz.a(3, cxg.j);
   @Nullable
   private dfw d;
   private int e;
   private int f;

   public cud(dfv $$0) {
      this.b = $$0;
   }

   @Override
   public int b() {
      return this.c.size();
   }

   @Override
   public boolean c() {
      for (cxg $$0 : this.c) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cxg a(int $$0) {
      return this.c.get($$0);
   }

   @Override
   public cxg a(int $$0, int $$1) {
      cxg $$2 = this.c.get($$0);
      if ($$0 == 2 && !$$2.f()) {
         return bsu.a(this.c, $$0, $$2.M());
      } else {
         cxg $$3 = bsu.a(this.c, $$0, $$1);
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
   public cxg b(int $$0) {
      return bsu.a(this.c, $$0);
   }

   @Override
   public void a(int $$0, cxg $$1) {
      this.c.set($$0, $$1);
      $$1.f(this.e_($$1));
      if (this.d($$0)) {
         this.f();
      }
   }

   @Override
   public boolean a(cpo $$0) {
      return this.b.go() == $$0;
   }

   @Override
   public void e() {
      this.f();
   }

   public void f() {
      this.d = null;
      cxg $$0;
      cxg $$1;
      if (this.c.get(0).f()) {
         $$0 = this.c.get(1);
         $$1 = cxg.j;
      } else {
         $$0 = this.c.get(0);
         $$1 = this.c.get(1);
      }

      if ($$0.f()) {
         this.a(2, cxg.j);
         this.f = 0;
      } else {
         dfx $$4 = this.b.gq();
         if (!$$4.isEmpty()) {
            dfw $$5 = $$4.a($$0, $$1, this.e);
            if ($$5 == null || $$5.r()) {
               this.d = $$5;
               $$5 = $$4.a($$1, $$0, this.e);
            }

            if ($$5 != null && !$$5.r()) {
               this.d = $$5;
               this.a(2, $$5.h());
               this.f = $$5.q();
            } else {
               this.a(2, cxg.j);
               this.f = 0;
            }
         }

         this.b.i(this.a(2));
      }
   }

   @Nullable
   public dfw g() {
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
