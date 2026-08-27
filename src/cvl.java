import javax.annotation.Nullable;

public class cvl extends cvn {
   private final im b;
   protected boolean a = true;

   public cvl(ckl $$0, bop $$1, csd $$2, etb $$3) {
      this($$0.dN(), $$0, $$1, $$2, $$3);
   }

   public cvl(cvn $$0) {
      this($$0.q(), $$0.o(), $$0.p(), $$0.n(), $$0.j());
   }

   protected cvl(czu $$0, @Nullable ckl $$1, bop $$2, csd $$3, etb $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.b = $$4.a().a($$4.b());
      this.a = $$0.a_($$4.a()).a(this);
   }

   public static cvl a(cvl $$0, im $$1, ir $$2) {
      return new cvl(
         $$0.q(),
         $$0.o(),
         $$0.p(),
         $$0.n(),
         new etb(
            new etf((double)$$1.u() + 0.5 + (double)$$2.j() * 0.5, (double)$$1.v() + 0.5 + (double)$$2.k() * 0.5, (double)$$1.w() + 0.5 + (double)$$2.l() * 0.5),
            $$2,
            $$1,
            false
         )
      );
   }

   @Override
   public im a() {
      return this.a ? super.a() : this.b;
   }

   public boolean b() {
      return this.a || this.q().a_(this.a()).a(this);
   }

   public boolean c() {
      return this.a;
   }

   public ir d() {
      return ir.a(this.o())[0];
   }

   public ir e() {
      return ir.a(this.o(), ir.a.b);
   }

   public ir[] f() {
      ir[] $$0 = ir.a(this.o());
      if (this.a) {
         return $$0;
      } else {
         ir $$1 = this.k();
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
