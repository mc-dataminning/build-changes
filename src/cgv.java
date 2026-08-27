import javax.annotation.Nullable;

public class cgv implements bhu {
   private final cpw c;
   private final il<ckj> d = il.a(3, ckj.b);
   @Nullable
   private cpx e;
   private int f;
   private int g;

   public cgv(cpw $$0) {
      this.c = $$0;
   }

   @Override
   public int b() {
      return this.d.size();
   }

   @Override
   public boolean ai_() {
      for (ckj $$0 : this.d) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ckj a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public ckj a(int $$0, int $$1) {
      ckj $$2 = this.d.get($$0);
      if ($$0 == 2 && !$$2.b()) {
         return bhv.a(this.d, $$0, $$2.L());
      } else {
         ckj $$3 = bhv.a(this.d, $$0, $$1);
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
   public ckj b(int $$0) {
      return bhv.a(this.d, $$0);
   }

   @Override
   public void a(int $$0, ckj $$1) {
      this.d.set($$0, $$1);
      if (!$$1.b() && $$1.L() > this.aj_()) {
         $$1.f(this.aj_());
      }

      if (this.d($$0)) {
         this.f();
      }
   }

   @Override
   public boolean a(ccx $$0) {
      return this.c.ge() == $$0;
   }

   @Override
   public void e() {
      this.f();
   }

   public void f() {
      this.e = null;
      ckj $$0;
      ckj $$1;
      if (this.d.get(0).b()) {
         $$0 = this.d.get(1);
         $$1 = ckj.b;
      } else {
         $$0 = this.d.get(0);
         $$1 = this.d.get(1);
      }

      if ($$0.b()) {
         this.a(2, ckj.b);
         this.g = 0;
      } else {
         cpy $$4 = this.c.gg();
         if (!$$4.isEmpty()) {
            cpx $$5 = $$4.a($$0, $$1, this.f);
            if ($$5 == null || $$5.p()) {
               this.e = $$5;
               $$5 = $$4.a($$1, $$0, this.f);
            }

            if ($$5 != null && !$$5.p()) {
               this.e = $$5;
               this.a(2, $$5.f());
               this.g = $$5.o();
            } else {
               this.a(2, ckj.b);
               this.g = 0;
            }
         }

         this.c.l(this.a(2));
      }
   }

   @Nullable
   public cpx g() {
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
