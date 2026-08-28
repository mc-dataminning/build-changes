import java.util.Map;
import java.util.Optional;

public interface fsn {
   Map<Optional<akj<eim>>, fsn> a = Map.of(Optional.of(ein.b), ($$0, $$1) -> {
      dui $$2 = $$1.e().a();
      jx $$3 = $$1.a();
      jk<ddg> $$4 = $$3.b(lr.aE);
      jk<ejd> $$5 = $$3.b(lr.aS);
      jk<eib> $$6 = $$3.b(lr.aP);
      return new fmm($$0, $$1x -> $$0.m().a(a($$1x)), $$2 instanceof dyb ? ((dyb)$$2).h() : eha.a($$4, $$5, $$6));
   }, Optional.of(ein.e), ($$0, $$1) -> new fml($$0, $$1, $$1x -> $$0.m().a(a($$1x))));

   fnl createEditScreen(fsi var1, fsq var2);

   private static fsq.a a(eha $$0) {
      return ($$1, $$2) -> {
         dui $$3 = new dyb($$0);
         return $$2.a($$1, $$3);
      };
   }

   private static fsq.a a(jj<ddg> $$0) {
      return ($$1, $$2) -> {
         jw<dyl> $$3 = $$1.d(lr.aN);
         jj<dyl> $$4 = $$3.g(dyl.c);
         ddk $$5 = new ddr($$0);
         dui $$6 = new dyj($$5, $$4);
         return $$2.a($$1, $$6);
      };
   }
}
