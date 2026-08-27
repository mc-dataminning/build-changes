import java.util.Optional;

public class cvx extends ctd implements csx {
   protected static final eig a = csv.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double b = 0.4;
   private final csv c;
   private final aew<dnj<?, ?>> d;

   protected cvx(dfi.d $$0, aew<dnj<?, ?>> $$1, csv $$2) {
      super($$0);
      this.d = $$1;
      this.c = $$2;
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return a;
   }

   @Override
   protected boolean d(dfj $$0, cpb $$1, gw $$2) {
      return $$0.a(apt.aK) || $$0.a(csw.fl) || $$0.a(csw.dY) || super.d($$0, $$1, $$2);
   }

   private Optional<? extends hg<dnj<?, ?>>> a(cpy $$0) {
      return $$0.G_().d(je.as).b(this.d);
   }

   @Override
   public boolean a(cpy $$0, gw $$1, dfj $$2) {
      dfj $$3 = $$0.a_($$1.d());
      return $$3.a(this.c);
   }

   @Override
   public boolean a(cpv $$0, asc $$1, gw $$2, dfj $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(akr $$0, asc $$1, gw $$2, dfj $$3) {
      this.a($$0).ifPresent($$3x -> ((dnj)$$3x.a()).a($$0, $$0.k().g(), $$1, $$2));
   }
}
