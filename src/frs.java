import java.util.Map;
import java.util.Optional;

public interface frs {
   Map<Optional<ala<ehu>>, frs> a = Map.of(Optional.of(ehv.b), ($$0, $$1) -> {
      dtu $$2 = $$1.d().a();
      jw $$3 = $$1.a();
      jj<dcs> $$4 = $$3.b(lq.az);
      jj<eil> $$5 = $$3.b(lq.aL);
      jj<ehj> $$6 = $$3.b(lq.aI);
      return new flt($$0, $$1x -> $$0.m().a(a($$1x)), $$2 instanceof dxk ? ((dxk)$$2).g() : egi.a($$4, $$5, $$6));
   }, Optional.of(ehv.e), ($$0, $$1) -> new fls($$0, $$1, $$1x -> $$0.m().a(a($$1x))));

   fmy createEditScreen(frn var1, frv var2);

   private static frv.a a(egi $$0) {
      return ($$1, $$2) -> {
         dtu $$3 = new dxk($$0);
         return $$2.a($$1, $$3);
      };
   }

   private static frv.a a(ji<dcs> $$0) {
      return ($$1, $$2) -> {
         jv<dxu> $$3 = $$1.d(lq.aG);
         ji<dxu> $$4 = $$3.g(dxu.c);
         dcw $$5 = new ddd($$0);
         dtu $$6 = new dxs($$5, $$4);
         return $$2.a($$1, $$6);
      };
   }
}
