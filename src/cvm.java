import java.util.Optional;

public class cvm extends css implements csm {
   protected static final ehy a = csk.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double b = 0.4;
   private final csk c;
   private final aeo<dmy<?, ?>> d;

   protected cvm(dex.d $$0, aeo<dmy<?, ?>> $$1, csk $$2) {
      super($$0);
      this.d = $$1;
      this.c = $$2;
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return a;
   }

   @Override
   protected boolean d(dey $$0, coq $$1, gv $$2) {
      return $$0.a(apj.aK) || $$0.a(csl.fl) || $$0.a(csl.dY) || super.d($$0, $$1, $$2);
   }

   private Optional<? extends hf<dmy<?, ?>>> a(cpn $$0) {
      return $$0.B_().d(jd.as).b(this.d);
   }

   @Override
   public boolean a(cpn $$0, gv $$1, dey $$2) {
      dey $$3 = $$0.a_($$1.d());
      return $$3.a(this.c);
   }

   @Override
   public boolean a(cpk $$0, art $$1, gv $$2, dey $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(aki $$0, art $$1, gv $$2, dey $$3) {
      this.a($$0).ifPresent($$3x -> ((dmy)$$3x.a()).a($$0, $$0.k().g(), $$1, $$2));
   }
}
