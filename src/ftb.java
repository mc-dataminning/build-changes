import java.util.Map;
import java.util.Optional;

public interface ftb {
   Map<Optional<akp<ejb>>, ftb> a = Map.of(Optional.of(ejc.b), ($$0, $$1) -> {
      dux $$2 = $$1.e().a();
      ka $$3 = $$1.a();
      jn<ddu> $$4 = $$3.b(lu.aF);
      jn<ejs> $$5 = $$3.b(lu.aT);
      jn<eiq> $$6 = $$3.b(lu.aQ);
      return new fmy($$0, $$1x -> $$0.m().a(a($$1x)), $$2 instanceof dyq ? ((dyq)$$2).h() : ehp.a($$4, $$5, $$6));
   }, Optional.of(ejc.e), ($$0, $$1) -> new fmx($$0, $$1, $$1x -> $$0.m().a(a($$1x))));

   fnx createEditScreen(fsw var1, fte var2);

   private static fte.a a(ehp $$0) {
      return ($$1, $$2) -> {
         dux $$3 = new dyq($$0);
         return $$2.a($$1, $$3);
      };
   }

   private static fte.a a(jm<ddu> $$0) {
      return ($$1, $$2) -> {
         jz<dza> $$3 = $$1.d(lu.aO);
         jm<dza> $$4 = $$3.g(dza.c);
         ddy $$5 = new def($$0);
         dux $$6 = new dyy($$5, $$4);
         return $$2.a($$1, $$6);
      };
   }
}
