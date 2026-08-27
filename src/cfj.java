import javax.annotation.Nullable;

public class cfj implements bgj {
   private final coh c;
   private final hn<cix> d = hn.a(3, cix.b);
   @Nullable
   private coi e;
   private int f;
   private int g;

   public cfj(coh $$0) {
      this.c = $$0;
   }

   @Override
   public int b() {
      return this.d.size();
   }

   @Override
   public boolean aa_() {
      for (cix $$0 : this.d) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cix a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public cix a(int $$0, int $$1) {
      cix $$2 = this.d.get($$0);
      if ($$0 == 2 && !$$2.b()) {
         return bgk.a(this.d, $$0, $$2.L());
      } else {
         cix $$3 = bgk.a(this.d, $$0, $$1);
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
   public cix b(int $$0) {
      return bgk.a(this.d, $$0);
   }

   @Override
   public void a(int $$0, cix $$1) {
      this.d.set($$0, $$1);
      if (!$$1.b() && $$1.L() > this.ab_()) {
         $$1.f(this.ab_());
      }

      if (this.d($$0)) {
         this.f();
      }
   }

   @Override
   public boolean a(cbm $$0) {
      return this.c.ga() == $$0;
   }

   @Override
   public void e() {
      this.f();
   }

   public void f() {
      this.e = null;
      cix $$0;
      cix $$1;
      if (this.d.get(0).b()) {
         $$0 = this.d.get(1);
         $$1 = cix.b;
      } else {
         $$0 = this.d.get(0);
         $$1 = this.d.get(1);
      }

      if ($$0.b()) {
         this.a(2, cix.b);
         this.g = 0;
      } else {
         coj $$4 = this.c.gc();
         if (!$$4.isEmpty()) {
            coi $$5 = $$4.a($$0, $$1, this.f);
            if ($$5 == null || $$5.p()) {
               this.e = $$5;
               $$5 = $$4.a($$1, $$0, this.f);
            }

            if ($$5 != null && !$$5.p()) {
               this.e = $$5;
               this.a(2, $$5.f());
               this.g = $$5.o();
            } else {
               this.a(2, cix.b);
               this.g = 0;
            }
         }

         this.c.l(this.a(2));
      }
   }

   @Nullable
   public coi g() {
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
