import javax.annotation.Nullable;

public class clp extends clr {
   private final gw b;
   protected boolean a = true;

   public clp(cbw $$0, bgz $$1, cjh $$2, ehl $$3) {
      this($$0.dL(), $$0, $$1, $$2, $$3);
   }

   public clp(clr $$0) {
      this($$0.q(), $$0.o(), $$0.p(), $$0.n(), $$0.j());
   }

   protected clp(cpx $$0, @Nullable cbw $$1, bgz $$2, cjh $$3, ehl $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.b = $$4.a().a($$4.b());
      this.a = $$0.a_($$4.a()).a(this);
   }

   public static clp a(clp $$0, gw $$1, hc $$2) {
      return new clp(
         $$0.q(),
         $$0.o(),
         $$0.p(),
         $$0.n(),
         new ehl(
            new ehp((double)$$1.u() + 0.5 + (double)$$2.j() * 0.5, (double)$$1.v() + 0.5 + (double)$$2.k() * 0.5, (double)$$1.w() + 0.5 + (double)$$2.l() * 0.5),
            $$2,
            $$1,
            false
         )
      );
   }

   @Override
   public gw a() {
      return this.a ? super.a() : this.b;
   }

   public boolean b() {
      return this.a || this.q().a_(this.a()).a(this);
   }

   public boolean c() {
      return this.a;
   }

   public hc d() {
      return hc.a(this.o())[0];
   }

   public hc e() {
      return hc.a(this.o(), hc.a.b);
   }

   public hc[] f() {
      hc[] $$0 = hc.a(this.o());
      if (this.a) {
         return $$0;
      } else {
         hc $$1 = this.k();
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
