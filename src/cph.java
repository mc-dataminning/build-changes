import javax.annotation.Nullable;

public class cph extends cpj {
   private final hx b;
   protected boolean a = true;

   public cph(cfi $$0, bka $$1, cmy $$2, elp $$3) {
      this($$0.dM(), $$0, $$1, $$2, $$3);
   }

   public cph(cpj $$0) {
      this($$0.q(), $$0.o(), $$0.p(), $$0.n(), $$0.j());
   }

   protected cph(ctp $$0, @Nullable cfi $$1, bka $$2, cmy $$3, elp $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.b = $$4.a().a($$4.b());
      this.a = $$0.a_($$4.a()).a(this);
   }

   public static cph a(cph $$0, hx $$1, ic $$2) {
      return new cph(
         $$0.q(),
         $$0.o(),
         $$0.p(),
         $$0.n(),
         new elp(
            new elt((double)$$1.u() + 0.5 + (double)$$2.j() * 0.5, (double)$$1.v() + 0.5 + (double)$$2.k() * 0.5, (double)$$1.w() + 0.5 + (double)$$2.l() * 0.5),
            $$2,
            $$1,
            false
         )
      );
   }

   @Override
   public hx a() {
      return this.a ? super.a() : this.b;
   }

   public boolean b() {
      return this.a || this.q().a_(this.a()).a(this);
   }

   public boolean c() {
      return this.a;
   }

   public ic d() {
      return ic.a(this.o())[0];
   }

   public ic e() {
      return ic.a(this.o(), ic.a.b);
   }

   public ic[] f() {
      ic[] $$0 = ic.a(this.o());
      if (this.a) {
         return $$0;
      } else {
         ic $$1 = this.k();
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
