import java.util.Optional;

public class cvn extends cst implements csn {
   protected static final ehw a = csl.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double b = 0.4;
   private final csl c;
   private final aeq<dmz<?, ?>> d;

   protected cvn(dey.d $$0, aeq<dmz<?, ?>> $$1, csl $$2) {
      super($$0);
      this.d = $$1;
      this.c = $$2;
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return a;
   }

   @Override
   protected boolean d(dez $$0, cor $$1, gu $$2) {
      return $$0.a(apl.aK) || $$0.a(csm.fl) || $$0.a(csm.dY) || super.d($$0, $$1, $$2);
   }

   private Optional<? extends he<dmz<?, ?>>> a(cpo $$0) {
      return $$0.B_().d(jc.as).b(this.d);
   }

   @Override
   public boolean a(cpo $$0, gu $$1, dez $$2) {
      dez $$3 = $$0.a_($$1.d());
      return $$3.a(this.c);
   }

   @Override
   public boolean a(cpl $$0, aru $$1, gu $$2, dez $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dez $$3) {
      this.a($$0).ifPresent($$3x -> ((dmz)$$3x.a()).a($$0, $$0.k().g(), $$1, $$2));
   }
}
