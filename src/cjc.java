import javax.annotation.Nullable;

public class cjc implements bjo {
   private final csf c;
   private final iq<cmr> d = iq.a(3, cmr.f);
   @Nullable
   private csg e;
   private int f;
   private int g;

   public cjc(csf $$0) {
      this.c = $$0;
   }

   @Override
   public int b() {
      return this.d.size();
   }

   @Override
   public boolean ai_() {
      for (cmr $$0 : this.d) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cmr a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public cmr a(int $$0, int $$1) {
      cmr $$2 = this.d.get($$0);
      if ($$0 == 2 && !$$2.b()) {
         return bjp.a(this.d, $$0, $$2.L());
      } else {
         cmr $$3 = bjp.a(this.d, $$0, $$1);
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
   public cmr b(int $$0) {
      return bjp.a(this.d, $$0);
   }

   @Override
   public void a(int $$0, cmr $$1) {
      this.d.set($$0, $$1);
      if (!$$1.b() && $$1.L() > this.ak_()) {
         $$1.f(this.ak_());
      }

      if (this.d($$0)) {
         this.f();
      }
   }

   @Override
   public boolean a(cfb $$0) {
      return this.c.ge() == $$0;
   }

   @Override
   public void e() {
      this.f();
   }

   public void f() {
      this.e = null;
      cmr $$0;
      cmr $$1;
      if (this.d.get(0).b()) {
         $$0 = this.d.get(1);
         $$1 = cmr.f;
      } else {
         $$0 = this.d.get(0);
         $$1 = this.d.get(1);
      }

      if ($$0.b()) {
         this.a(2, cmr.f);
         this.g = 0;
      } else {
         csh $$4 = this.c.gg();
         if (!$$4.isEmpty()) {
            csg $$5 = $$4.a($$0, $$1, this.f);
            if ($$5 == null || $$5.p()) {
               this.e = $$5;
               $$5 = $$4.a($$1, $$0, this.f);
            }

            if ($$5 != null && !$$5.p()) {
               this.e = $$5;
               this.a(2, $$5.f());
               this.g = $$5.o();
            } else {
               this.a(2, cmr.f);
               this.g = 0;
            }
         }

         this.c.l(this.a(2));
      }
   }

   @Nullable
   public csg g() {
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
