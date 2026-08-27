import java.util.Optional;

public class cvo extends csu implements cso {
   protected static final ehx a = csm.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double b = 0.4;
   private final csm c;
   private final aeq<dna<?, ?>> d;

   protected cvo(dez.d $$0, aeq<dna<?, ?>> $$1, csm $$2) {
      super($$0);
      this.d = $$1;
      this.c = $$2;
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return a;
   }

   @Override
   protected boolean d(dfa $$0, cos $$1, gu $$2) {
      return $$0.a(apl.aK) || $$0.a(csn.fl) || $$0.a(csn.dY) || super.d($$0, $$1, $$2);
   }

   private Optional<? extends he<dna<?, ?>>> a(cpp $$0) {
      return $$0.B_().d(jc.as).b(this.d);
   }

   @Override
   public boolean a(cpp $$0, gu $$1, dfa $$2) {
      dfa $$3 = $$0.a_($$1.d());
      return $$3.a(this.c);
   }

   @Override
   public boolean a(cpm $$0, aru $$1, gu $$2, dfa $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dfa $$3) {
      this.a($$0).ifPresent($$3x -> ((dna)$$3x.a()).a($$0, $$0.k().g(), $$1, $$2));
   }
}
