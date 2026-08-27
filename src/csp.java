import java.util.Optional;

public class csp extends cpv implements cpp {
   protected static final efb a = cpn.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double b = 0.4;
   private final cpn c;
   private final acp<dkb<?, ?>> d;

   protected csp(dca.d $$0, acp<dkb<?, ?>> $$1, cpn $$2) {
      super($$0);
      this.d = $$1;
      this.c = $$2;
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return a;
   }

   @Override
   protected boolean d(dcb $$0, cls $$1, gu $$2) {
      return $$0.a(amw.aJ) || $$0.a(cpo.fl) || $$0.a(cpo.dY) || super.d($$0, $$1, $$2);
   }

   private Optional<? extends he<dkb<?, ?>>> a(cmp $$0) {
      return $$0.B_().d(jc.as).b(this.d);
   }

   @Override
   public boolean a(cmp $$0, gu $$1, dcb $$2, boolean $$3) {
      dcb $$4 = $$0.a_($$1.d());
      return $$4.a(this.c);
   }

   @Override
   public boolean a(cmm $$0, apf $$1, gu $$2, dcb $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(aif $$0, apf $$1, gu $$2, dcb $$3) {
      this.a($$0).ifPresent($$3x -> ((dkb)$$3x.a()).a($$0, $$0.k().g(), $$1, $$2));
   }
}
