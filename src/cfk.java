import javax.annotation.Nullable;

public class cfk implements bgj {
   private final coi c;
   private final hn<ciy> d = hn.a(3, ciy.b);
   @Nullable
   private coj e;
   private int f;
   private int g;

   public cfk(coi $$0) {
      this.c = $$0;
   }

   @Override
   public int b() {
      return this.d.size();
   }

   @Override
   public boolean ab_() {
      for (ciy $$0 : this.d) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ciy a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public ciy a(int $$0, int $$1) {
      ciy $$2 = this.d.get($$0);
      if ($$0 == 2 && !$$2.b()) {
         return bgk.a(this.d, $$0, $$2.L());
      } else {
         ciy $$3 = bgk.a(this.d, $$0, $$1);
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
   public ciy b(int $$0) {
      return bgk.a(this.d, $$0);
   }

   @Override
   public void a(int $$0, ciy $$1) {
      this.d.set($$0, $$1);
      if (!$$1.b() && $$1.L() > this.ac_()) {
         $$1.f(this.ac_());
      }

      if (this.d($$0)) {
         this.f();
      }
   }

   @Override
   public boolean a(cbn $$0) {
      return this.c.fZ() == $$0;
   }

   @Override
   public void e() {
      this.f();
   }

   public void f() {
      this.e = null;
      ciy $$0;
      ciy $$1;
      if (this.d.get(0).b()) {
         $$0 = this.d.get(1);
         $$1 = ciy.b;
      } else {
         $$0 = this.d.get(0);
         $$1 = this.d.get(1);
      }

      if ($$0.b()) {
         this.a(2, ciy.b);
         this.g = 0;
      } else {
         cok $$4 = this.c.gb();
         if (!$$4.isEmpty()) {
            coj $$5 = $$4.a($$0, $$1, this.f);
            if ($$5 == null || $$5.p()) {
               this.e = $$5;
               $$5 = $$4.a($$1, $$0, this.f);
            }

            if ($$5 != null && !$$5.p()) {
               this.e = $$5;
               this.a(2, $$5.f());
               this.g = $$5.o();
            } else {
               this.a(2, ciy.b);
               this.g = 0;
            }
         }

         this.c.l(this.a(2));
      }
   }

   @Nullable
   public coj g() {
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
