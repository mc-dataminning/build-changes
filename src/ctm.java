import javax.annotation.Nullable;

public class ctm implements bsc {
   private final dfe b;
   private final ka<cwp> c = ka.a(3, cwp.j);
   @Nullable
   private dff d;
   private int e;
   private int f;

   public ctm(dfe $$0) {
      this.b = $$0;
   }

   @Override
   public int b() {
      return this.c.size();
   }

   @Override
   public boolean c() {
      for (cwp $$0 : this.c) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cwp a(int $$0) {
      return this.c.get($$0);
   }

   @Override
   public cwp a(int $$0, int $$1) {
      cwp $$2 = this.c.get($$0);
      if ($$0 == 2 && !$$2.f()) {
         return bsd.a(this.c, $$0, $$2.M());
      } else {
         cwp $$3 = bsd.a(this.c, $$0, $$1);
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
   public cwp b(int $$0) {
      return bsd.a(this.c, $$0);
   }

   @Override
   public void a(int $$0, cwp $$1) {
      this.c.set($$0, $$1);
      $$1.f(this.e_($$1));
      if (this.d($$0)) {
         this.f();
      }
   }

   @Override
   public boolean a(cox $$0) {
      return this.b.gp() == $$0;
   }

   @Override
   public void e() {
      this.f();
   }

   public void f() {
      this.d = null;
      cwp $$0;
      cwp $$1;
      if (this.c.get(0).f()) {
         $$0 = this.c.get(1);
         $$1 = cwp.j;
      } else {
         $$0 = this.c.get(0);
         $$1 = this.c.get(1);
      }

      if ($$0.f()) {
         this.a(2, cwp.j);
         this.f = 0;
      } else {
         dfg $$4 = this.b.gr();
         if (!$$4.isEmpty()) {
            dff $$5 = $$4.a($$0, $$1, this.e);
            if ($$5 == null || $$5.r()) {
               this.d = $$5;
               $$5 = $$4.a($$1, $$0, this.e);
            }

            if ($$5 != null && !$$5.r()) {
               this.d = $$5;
               this.a(2, $$5.h());
               this.f = $$5.q();
            } else {
               this.a(2, cwp.j);
               this.f = 0;
            }
         }

         this.b.i(this.a(2));
      }
   }

   @Nullable
   public dff g() {
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
