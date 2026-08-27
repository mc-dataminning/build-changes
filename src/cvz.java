import java.util.Optional;

public class cvz extends ctf implements csz {
   protected static final eii a = csx.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double b = 0.4;
   private final csx c;
   private final aex<dnl<?, ?>> d;

   protected cvz(dfk.d $$0, aex<dnl<?, ?>> $$1, csx $$2) {
      super($$0);
      this.d = $$1;
      this.c = $$2;
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return a;
   }

   @Override
   protected boolean d(dfl $$0, cpd $$1, gw $$2) {
      return $$0.a(apu.aK) || $$0.a(csy.fl) || $$0.a(csy.dY) || super.d($$0, $$1, $$2);
   }

   private Optional<? extends hg<dnl<?, ?>>> a(cqa $$0) {
      return $$0.G_().d(je.as).b(this.d);
   }

   @Override
   public boolean a(cqa $$0, gw $$1, dfl $$2) {
      dfl $$3 = $$0.a_($$1.d());
      return $$3.a(this.c);
   }

   @Override
   public boolean a(cpx $$0, ase $$1, gw $$2, dfl $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(aks $$0, ase $$1, gw $$2, dfl $$3) {
      this.a($$0).ifPresent($$3x -> ((dnl)$$3x.a()).a($$0, $$0.k().g(), $$1, $$2));
   }
}
