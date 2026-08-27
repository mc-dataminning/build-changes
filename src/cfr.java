import javax.annotation.Nullable;

public class cfr implements bgr {
   private final cos c;
   private final hn<cjf> d = hn.a(3, cjf.b);
   @Nullable
   private cot e;
   private int f;
   private int g;

   public cfr(cos $$0) {
      this.c = $$0;
   }

   @Override
   public int b() {
      return this.d.size();
   }

   @Override
   public boolean af_() {
      for (cjf $$0 : this.d) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cjf a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public cjf a(int $$0, int $$1) {
      cjf $$2 = this.d.get($$0);
      if ($$0 == 2 && !$$2.b()) {
         return bgs.a(this.d, $$0, $$2.L());
      } else {
         cjf $$3 = bgs.a(this.d, $$0, $$1);
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
   public cjf b(int $$0) {
      return bgs.a(this.d, $$0);
   }

   @Override
   public void a(int $$0, cjf $$1) {
      this.d.set($$0, $$1);
      if (!$$1.b() && $$1.L() > this.ag_()) {
         $$1.f(this.ag_());
      }

      if (this.d($$0)) {
         this.f();
      }
   }

   @Override
   public boolean a(cbu $$0) {
      return this.c.gd() == $$0;
   }

   @Override
   public void e() {
      this.f();
   }

   public void f() {
      this.e = null;
      cjf $$0;
      cjf $$1;
      if (this.d.get(0).b()) {
         $$0 = this.d.get(1);
         $$1 = cjf.b;
      } else {
         $$0 = this.d.get(0);
         $$1 = this.d.get(1);
      }

      if ($$0.b()) {
         this.a(2, cjf.b);
         this.g = 0;
      } else {
         cou $$4 = this.c.gf();
         if (!$$4.isEmpty()) {
            cot $$5 = $$4.a($$0, $$1, this.f);
            if ($$5 == null || $$5.p()) {
               this.e = $$5;
               $$5 = $$4.a($$1, $$0, this.f);
            }

            if ($$5 != null && !$$5.p()) {
               this.e = $$5;
               this.a(2, $$5.f());
               this.g = $$5.o();
            } else {
               this.a(2, cjf.b);
               this.g = 0;
            }
         }

         this.c.l(this.a(2));
      }
   }

   @Nullable
   public cot g() {
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
