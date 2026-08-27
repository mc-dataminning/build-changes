import java.util.Map;
import java.util.Optional;

public interface fpo {
   Map<Optional<ake<efv>>, fpo> a = Map.of(Optional.of(efw.b), ($$0, $$1) -> {
      drv $$2 = $$1.d().a();
      jj $$3 = $$1.a();
      iw<dat> $$4 = $$3.b(ld.ay);
      iw<egm> $$5 = $$3.b(ld.aK);
      iw<efk> $$6 = $$3.b(ld.aH);
      return new fjo($$0, $$1x -> $$0.m().a(a($$1x)), $$2 instanceof dvl ? ((dvl)$$2).g() : eej.a($$4, $$5, $$6));
   }, Optional.of(efw.e), ($$0, $$1) -> new fjn($$0, $$1, $$1x -> $$0.m().a(a($$1x))));

   fkt createEditScreen(fpj var1, fpr var2);

   private static fpr.a a(eej $$0) {
      return ($$1, $$2) -> {
         drv $$3 = new dvl($$0);
         return $$2.a($$1, $$3);
      };
   }

   private static fpr.a a(iv<dat> $$0) {
      return ($$1, $$2) -> {
         ji<dvv> $$3 = $$1.d(ld.aF);
         iv<dvv> $$4 = $$3.g(dvv.c);
         dax $$5 = new dbe($$0);
         drv $$6 = new dvt($$5, $$4);
         return $$2.a($$1, $$6);
      };
   }
}
