import java.util.Map;
import java.util.Optional;

public interface frw {
   Map<Optional<ald<ehy>>, frw> a = Map.of(Optional.of(ehz.b), ($$0, $$1) -> {
      dty $$2 = $$1.d().a();
      jw $$3 = $$1.a();
      jj<dcw> $$4 = $$3.b(lq.az);
      jj<eip> $$5 = $$3.b(lq.aL);
      jj<ehn> $$6 = $$3.b(lq.aI);
      return new flx($$0, $$1x -> $$0.m().a(a($$1x)), $$2 instanceof dxo ? ((dxo)$$2).h() : egm.a($$4, $$5, $$6));
   }, Optional.of(ehz.e), ($$0, $$1) -> new flw($$0, $$1, $$1x -> $$0.m().a(a($$1x))));

   fnc createEditScreen(frr var1, frz var2);

   private static frz.a a(egm $$0) {
      return ($$1, $$2) -> {
         dty $$3 = new dxo($$0);
         return $$2.a($$1, $$3);
      };
   }

   private static frz.a a(ji<dcw> $$0) {
      return ($$1, $$2) -> {
         jv<dxy> $$3 = $$1.d(lq.aG);
         ji<dxy> $$4 = $$3.g(dxy.c);
         dda $$5 = new ddh($$0);
         dty $$6 = new dxw($$5, $$4);
         return $$2.a($$1, $$6);
      };
   }
}
