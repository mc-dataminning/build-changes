import java.util.Map;
import java.util.Optional;

public interface fcy {
   Map<Optional<aey<dur>>, fcy> a = Map.of(Optional.of(dus.b), ($$0, $$1) -> {
      dha $$2 = $$1.d().a();
      hr $$3 = $$1.a();
      hf<cqz> $$4 = $$3.b(jc.aq);
      hf<dvi> $$5 = $$3.b(jc.aC);
      hf<dug> $$6 = $$3.b(jc.az);
      return new exb($$0, $$1x -> $$0.l().a(a($$1x)), $$2 instanceof dkh ? ((dkh)$$2).g() : dtf.a($$4, $$5, $$6));
   }, Optional.of(dus.e), ($$0, $$1) -> new exa($$0, $$1, $$1x -> $$0.l().a(a($$1x))));

   eye createEditScreen(fct var1, fdb var2);

   private static fdb.a a(dtf $$0) {
      return ($$1, $$2) -> {
         dha $$3 = new dkh($$0);
         return $$2.a($$1, $$3);
      };
   }

   private static fdb.a a(he<cqz> $$0) {
      return ($$1, $$2) -> {
         hq<dkr> $$3 = $$1.d(jc.ax);
         he<dkr> $$4 = $$3.f(dkr.c);
         crd $$5 = new crk($$0);
         dha $$6 = new dkp($$5, $$4);
         return $$2.a($$1, $$6);
      };
   }
}
