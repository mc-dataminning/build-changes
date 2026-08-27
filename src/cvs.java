import java.util.Optional;

public class cvs extends csy implements css {
   protected static final eib a = csq.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double b = 0.4;
   private final csq c;
   private final aet<dne<?, ?>> d;

   protected cvs(dfd.d $$0, aet<dne<?, ?>> $$1, csq $$2) {
      super($$0);
      this.d = $$1;
      this.c = $$2;
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return a;
   }

   @Override
   protected boolean d(dfe $$0, cow $$1, gw $$2) {
      return $$0.a(apo.aK) || $$0.a(csr.fl) || $$0.a(csr.dY) || super.d($$0, $$1, $$2);
   }

   private Optional<? extends hg<dne<?, ?>>> a(cpt $$0) {
      return $$0.B_().d(je.as).b(this.d);
   }

   @Override
   public boolean a(cpt $$0, gw $$1, dfe $$2) {
      dfe $$3 = $$0.a_($$1.d());
      return $$3.a(this.c);
   }

   @Override
   public boolean a(cpq $$0, arx $$1, gw $$2, dfe $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(akn $$0, arx $$1, gw $$2, dfe $$3) {
      this.a($$0).ifPresent($$3x -> ((dne)$$3x.a()).a($$0, $$0.k().g(), $$1, $$2));
   }
}
