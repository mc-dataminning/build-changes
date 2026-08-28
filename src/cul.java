import javax.annotation.Nullable;

public class cul implements btb {
   private final dgd b;
   private final jz<cxo> c = jz.a(3, cxo.k);
   @Nullable
   private dge d;
   private int e;
   private int f;

   public cul(dgd $$0) {
      this.b = $$0;
   }

   @Override
   public int b() {
      return this.c.size();
   }

   @Override
   public boolean c() {
      for (cxo $$0 : this.c) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cxo a(int $$0) {
      return this.c.get($$0);
   }

   @Override
   public cxo a(int $$0, int $$1) {
      cxo $$2 = this.c.get($$0);
      if ($$0 == 2 && !$$2.f()) {
         return btc.a(this.c, $$0, $$2.L());
      } else {
         cxo $$3 = btc.a(this.c, $$0, $$1);
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
   public cxo b(int $$0) {
      return btc.a(this.c, $$0);
   }

   @Override
   public void a(int $$0, cxo $$1) {
      this.c.set($$0, $$1);
      $$1.f(this.e_($$1));
      if (this.d($$0)) {
         this.f();
      }
   }

   @Override
   public boolean a(cpw $$0) {
      return this.b.gm() == $$0;
   }

   @Override
   public void e() {
      this.f();
   }

   public void f() {
      this.d = null;
      cxo $$0;
      cxo $$1;
      if (this.c.get(0).f()) {
         $$0 = this.c.get(1);
         $$1 = cxo.k;
      } else {
         $$0 = this.c.get(0);
         $$1 = this.c.get(1);
      }

      if ($$0.f()) {
         this.a(2, cxo.k);
         this.f = 0;
      } else {
         dgf $$4 = this.b.go();
         if (!$$4.isEmpty()) {
            dge $$5 = $$4.a($$0, $$1, this.e);
            if ($$5 == null || $$5.r()) {
               this.d = $$5;
               $$5 = $$4.a($$1, $$0, this.e);
            }

            if ($$5 != null && !$$5.r()) {
               this.d = $$5;
               this.a(2, $$5.h());
               this.f = $$5.q();
            } else {
               this.a(2, cxo.k);
               this.f = 0;
            }
         }

         this.b.i(this.a(2));
      }
   }

   @Nullable
   public dge g() {
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
