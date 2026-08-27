import javax.annotation.Nullable;

public class cln implements blp {
   private final cuo c;
   private final is<cpd> d = is.a(3, cpd.h);
   @Nullable
   private cup e;
   private int f;
   private int g;

   public cln(cuo $$0) {
      this.c = $$0;
   }

   @Override
   public int b() {
      return this.d.size();
   }

   @Override
   public boolean aj_() {
      for (cpd $$0 : this.d) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cpd a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public cpd a(int $$0, int $$1) {
      cpd $$2 = this.d.get($$0);
      if ($$0 == 2 && !$$2.b()) {
         return blq.a(this.d, $$0, $$2.M());
      } else {
         cpd $$3 = blq.a(this.d, $$0, $$1);
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
   public cpd b(int $$0) {
      return blq.a(this.d, $$0);
   }

   @Override
   public void a(int $$0, cpd $$1) {
      this.d.set($$0, $$1);
      if (!$$1.b() && $$1.M() > this.al_()) {
         $$1.f(this.al_());
      }

      if (this.d($$0)) {
         this.f();
      }
   }

   @Override
   public boolean a(chl $$0) {
      return this.c.gg() == $$0;
   }

   @Override
   public void e() {
      this.f();
   }

   public void f() {
      this.e = null;
      cpd $$0;
      cpd $$1;
      if (this.d.get(0).b()) {
         $$0 = this.d.get(1);
         $$1 = cpd.h;
      } else {
         $$0 = this.d.get(0);
         $$1 = this.d.get(1);
      }

      if ($$0.b()) {
         this.a(2, cpd.h);
         this.g = 0;
      } else {
         cuq $$4 = this.c.gi();
         if (!$$4.isEmpty()) {
            cup $$5 = $$4.a($$0, $$1, this.f);
            if ($$5 == null || $$5.q()) {
               this.e = $$5;
               $$5 = $$4.a($$1, $$0, this.f);
            }

            if ($$5 != null && !$$5.q()) {
               this.e = $$5;
               this.a(2, $$5.f());
               this.g = $$5.p();
            } else {
               this.a(2, cpd.h);
               this.g = 0;
            }
         }

         this.c.l(this.a(2));
      }
   }

   @Nullable
   public cup g() {
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
