import java.util.Map;
import java.util.Optional;

public interface ffp {
   Map<Optional<agh<dww>>, ffp> a = Map.of(Optional.of(dwx.b), ($$0, $$1) -> {
      djf $$2 = $$1.d().a();
      ip $$3 = $$1.a();
      ic<csy> $$4 = $$3.b(jz.ar);
      ic<dxn> $$5 = $$3.b(jz.aD);
      ic<dwl> $$6 = $$3.b(jz.aA);
      return new ezq($$0, $$1x -> $$0.l().a(a($$1x)), $$2 instanceof dmm ? ((dmm)$$2).g() : dvk.a($$4, $$5, $$6));
   }, Optional.of(dwx.e), ($$0, $$1) -> new ezp($$0, $$1, $$1x -> $$0.l().a(a($$1x))));

   fau createEditScreen(ffk var1, ffs var2);

   private static ffs.a a(dvk $$0) {
      return ($$1, $$2) -> {
         djf $$3 = new dmm($$0);
         return $$2.a($$1, $$3);
      };
   }

   private static ffs.a a(ib<csy> $$0) {
      return ($$1, $$2) -> {
         io<dmw> $$3 = $$1.d(jz.ay);
         ib<dmw> $$4 = $$3.f(dmw.c);
         ctc $$5 = new ctj($$0);
         djf $$6 = new dmu($$5, $$4);
         return $$2.a($$1, $$6);
      };
   }
}
