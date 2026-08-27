import javax.annotation.Nullable;

public class crk extends crm {
   private final hz b;
   protected boolean a = true;

   public crk(chl $$0, blv $$1, cpd $$2, env $$3) {
      this($$0.dM(), $$0, $$1, $$2, $$3);
   }

   public crk(crm $$0) {
      this($$0.q(), $$0.o(), $$0.p(), $$0.n(), $$0.j());
   }

   protected crk(cvr $$0, @Nullable chl $$1, blv $$2, cpd $$3, env $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.b = $$4.a().a($$4.b());
      this.a = $$0.a_($$4.a()).a(this);
   }

   public static crk a(crk $$0, hz $$1, ie $$2) {
      return new crk(
         $$0.q(),
         $$0.o(),
         $$0.p(),
         $$0.n(),
         new env(
            new enz((double)$$1.u() + 0.5 + (double)$$2.j() * 0.5, (double)$$1.v() + 0.5 + (double)$$2.k() * 0.5, (double)$$1.w() + 0.5 + (double)$$2.l() * 0.5),
            $$2,
            $$1,
            false
         )
      );
   }

   @Override
   public hz a() {
      return this.a ? super.a() : this.b;
   }

   public boolean b() {
      return this.a || this.q().a_(this.a()).a(this);
   }

   public boolean c() {
      return this.a;
   }

   public ie d() {
      return ie.a(this.o())[0];
   }

   public ie e() {
      return ie.a(this.o(), ie.a.b);
   }

   public ie[] f() {
      ie[] $$0 = ie.a(this.o());
      if (this.a) {
         return $$0;
      } else {
         ie $$1 = this.k();
         int $$2 = 0;

         while ($$2 < $$0.length && $$0[$$2] != $$1.g()) {
            $$2++;
         }

         if ($$2 > 0) {
            System.arraycopy($$0, 0, $$0, 1, $$2);
            $$0[0] = $$1.g();
         }

         return $$0;
      }
   }
}
