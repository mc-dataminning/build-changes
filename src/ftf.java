import java.util.Map;
import java.util.Optional;

public interface ftf {
   Map<Optional<akq<eje>>, ftf> a = Map.of(Optional.of(ejf.b), ($$0, $$1) -> {
      duz $$2 = $$1.e().a();
      ka $$3 = $$1.a();
      jn<ddw> $$4 = $$3.b(lu.aF);
      jn<ejv> $$5 = $$3.b(lu.aT);
      jn<eit> $$6 = $$3.b(lu.aQ);
      return new fnc($$0, $$1x -> $$0.m().a(a($$1x)), $$2 instanceof dyt ? ((dyt)$$2).h() : ehs.a($$4, $$5, $$6));
   }, Optional.of(ejf.e), ($$0, $$1) -> new fnb($$0, $$1, $$1x -> $$0.m().a(a($$1x))));

   fob createEditScreen(fta var1, fti var2);

   private static fti.a a(ehs $$0) {
      return ($$1, $$2) -> {
         duz $$3 = new dyt($$0);
         return $$2.a($$1, $$3);
      };
   }

   private static fti.a a(jm<ddw> $$0) {
      return ($$1, $$2) -> {
         jz<dzd> $$3 = $$1.d(lu.aO);
         jm<dzd> $$4 = $$3.g(dzd.c);
         dea $$5 = new deh($$0);
         duz $$6 = new dzb($$5, $$4);
         return $$2.a($$1, $$6);
      };
   }
}
