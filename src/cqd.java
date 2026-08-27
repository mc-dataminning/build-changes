import javax.annotation.Nullable;

public class cqd implements bpp {
   private final czw b;
   private final jg<ctq> c = jg.a(3, ctq.i);
   @Nullable
   private czx d;
   private int e;
   private int f;

   public cqd(czw $$0) {
      this.b = $$0;
   }

   @Override
   public int b() {
      return this.c.size();
   }

   @Override
   public boolean c() {
      for (ctq $$0 : this.c) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ctq a(int $$0) {
      return this.c.get($$0);
   }

   @Override
   public ctq a(int $$0, int $$1) {
      ctq $$2 = this.c.get($$0);
      if ($$0 == 2 && !$$2.e()) {
         return bpq.a(this.c, $$0, $$2.I());
      } else {
         ctq $$3 = bpq.a(this.c, $$0, $$1);
         if (!$$3.e() && this.d($$0)) {
            this.f();
         }

         return $$3;
      }
   }

   private boolean d(int $$0) {
      return $$0 == 0 || $$0 == 1;
   }

   @Override
   public ctq b(int $$0) {
      return bpq.a(this.c, $$0);
   }

   @Override
   public void a(int $$0, ctq $$1) {
      this.c.set($$0, $$1);
      $$1.f(this.e_($$1));
      if (this.d($$0)) {
         this.f();
      }
   }

   @Override
   public boolean a(cly $$0) {
      return this.b.gp() == $$0;
   }

   @Override
   public void e() {
      this.f();
   }

   public void f() {
      this.d = null;
      ctq $$0;
      ctq $$1;
      if (this.c.get(0).e()) {
         $$0 = this.c.get(1);
         $$1 = ctq.i;
      } else {
         $$0 = this.c.get(0);
         $$1 = this.c.get(1);
      }

      if ($$0.e()) {
         this.a(2, ctq.i);
         this.f = 0;
      } else {
         czy $$4 = this.b.gr();
         if (!$$4.isEmpty()) {
            czx $$5 = $$4.a($$0, $$1, this.e);
            if ($$5 == null || $$5.r()) {
               this.d = $$5;
               $$5 = $$4.a($$1, $$0, this.e);
            }

            if ($$5 != null && !$$5.r()) {
               this.d = $$5;
               this.a(2, $$5.h());
               this.f = $$5.q();
            } else {
               this.a(2, ctq.i);
               this.f = 0;
            }
         }

         this.b.n(this.a(2));
      }
   }

   @Nullable
   public czx g() {
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
