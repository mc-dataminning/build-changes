import java.util.Map;
import java.util.Optional;

public interface flc {
   Map<Optional<ajb<ebv>>, flc> a = Map.of(Optional.of(ebw.b), ($$0, $$1) -> {
      dob $$2 = $$1.d().a();
      iy $$3 = $$1.a();
      im<cxd> $$4 = $$3.b(ki.au);
      im<ecm> $$5 = $$3.b(ki.aG);
      im<ebk> $$6 = $$3.b(ki.aD);
      return new ffd($$0, $$1x -> $$0.o().a(a($$1x)), $$2 instanceof drl ? ((drl)$$2).g() : eaj.a($$4, $$5, $$6));
   }, Optional.of(ebw.e), ($$0, $$1) -> new ffc($$0, $$1, $$1x -> $$0.o().a(a($$1x))));

   fgh createEditScreen(fkx var1, flf var2);

   private static flf.a a(eaj $$0) {
      return ($$1, $$2) -> {
         dob $$3 = new drl($$0);
         return $$2.a($$1, $$3);
      };
   }

   private static flf.a a(il<cxd> $$0) {
      return ($$1, $$2) -> {
         ix<drv> $$3 = $$1.d(ki.aB);
         il<drv> $$4 = $$3.f(drv.c);
         cxh $$5 = new cxo($$0);
         dob $$6 = new drt($$5, $$4);
         return $$2.a($$1, $$6);
      };
   }
}
