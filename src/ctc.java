import javax.annotation.Nullable;

public class ctc implements bsa {
   private final deb b;
   private final jz<cwf> c = jz.a(3, cwf.k);
   @Nullable
   private dec d;
   private int e;
   private int f;

   public ctc(deb $$0) {
      this.b = $$0;
   }

   @Override
   public int b() {
      return this.c.size();
   }

   @Override
   public boolean c() {
      for (cwf $$0 : this.c) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cwf a(int $$0) {
      return this.c.get($$0);
   }

   @Override
   public cwf a(int $$0, int $$1) {
      cwf $$2 = this.c.get($$0);
      if ($$0 == 2 && !$$2.f()) {
         return bsb.a(this.c, $$0, $$2.L());
      } else {
         cwf $$3 = bsb.a(this.c, $$0, $$1);
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
   public cwf b(int $$0) {
      return bsb.a(this.c, $$0);
   }

   @Override
   public void a(int $$0, cwf $$1) {
      this.c.set($$0, $$1);
      $$1.f(this.e_($$1));
      if (this.d($$0)) {
         this.f();
      }
   }

   @Override
   public boolean a(cor $$0) {
      return this.b.gv() == $$0;
   }

   @Override
   public void e() {
      this.f();
   }

   public void f() {
      this.d = null;
      cwf $$0;
      cwf $$1;
      if (this.c.get(0).f()) {
         $$0 = this.c.get(1);
         $$1 = cwf.k;
      } else {
         $$0 = this.c.get(0);
         $$1 = this.c.get(1);
      }

      if ($$0.f()) {
         this.a(2, cwf.k);
         this.f = 0;
      } else {
         ded $$4 = this.b.gx();
         if (!$$4.isEmpty()) {
            dec $$5 = $$4.a($$0, $$1, this.e);
            if ($$5 == null || $$5.r()) {
               this.d = $$5;
               $$5 = $$4.a($$1, $$0, this.e);
            }

            if ($$5 != null && !$$5.r()) {
               this.d = $$5;
               this.a(2, $$5.h());
               this.f = $$5.q();
            } else {
               this.a(2, cwf.k);
               this.f = 0;
            }
         }

         this.b.k(this.a(2));
      }
   }

   @Nullable
   public dec g() {
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
