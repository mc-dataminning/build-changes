import javax.annotation.Nullable;

public class cfi implements bgh {
   private final cog c;
   private final ho<ciw> d = ho.a(3, ciw.b);
   @Nullable
   private coh e;
   private int f;
   private int g;

   public cfi(cog $$0) {
      this.c = $$0;
   }

   @Override
   public int b() {
      return this.d.size();
   }

   @Override
   public boolean ab_() {
      for (ciw $$0 : this.d) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ciw a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public ciw a(int $$0, int $$1) {
      ciw $$2 = this.d.get($$0);
      if ($$0 == 2 && !$$2.b()) {
         return bgi.a(this.d, $$0, $$2.L());
      } else {
         ciw $$3 = bgi.a(this.d, $$0, $$1);
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
   public ciw b(int $$0) {
      return bgi.a(this.d, $$0);
   }

   @Override
   public void a(int $$0, ciw $$1) {
      this.d.set($$0, $$1);
      if (!$$1.b() && $$1.L() > this.ac_()) {
         $$1.f(this.ac_());
      }

      if (this.d($$0)) {
         this.f();
      }
   }

   @Override
   public boolean a(cbl $$0) {
      return this.c.fZ() == $$0;
   }

   @Override
   public void e() {
      this.f();
   }

   public void f() {
      this.e = null;
      ciw $$0;
      ciw $$1;
      if (this.d.get(0).b()) {
         $$0 = this.d.get(1);
         $$1 = ciw.b;
      } else {
         $$0 = this.d.get(0);
         $$1 = this.d.get(1);
      }

      if ($$0.b()) {
         this.a(2, ciw.b);
         this.g = 0;
      } else {
         coi $$4 = this.c.gb();
         if (!$$4.isEmpty()) {
            coh $$5 = $$4.a($$0, $$1, this.f);
            if ($$5 == null || $$5.p()) {
               this.e = $$5;
               $$5 = $$4.a($$1, $$0, this.f);
            }

            if ($$5 != null && !$$5.p()) {
               this.e = $$5;
               this.a(2, $$5.f());
               this.g = $$5.o();
            } else {
               this.a(2, ciw.b);
               this.g = 0;
            }
         }

         this.c.l(this.a(2));
      }
   }

   @Nullable
   public coh g() {
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
