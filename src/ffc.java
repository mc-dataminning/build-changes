import java.util.Map;
import java.util.Optional;

public interface ffc {
   Map<Optional<agf<dwk>>, ffc> a = Map.of(Optional.of(dwl.b), ($$0, $$1) -> {
      dit $$2 = $$1.d().a();
      ip $$3 = $$1.a();
      ic<csq> $$4 = $$3.b(jz.ar);
      ic<dxb> $$5 = $$3.b(jz.aD);
      ic<dvz> $$6 = $$3.b(jz.aA);
      return new ezd($$0, $$1x -> $$0.l().a(a($$1x)), $$2 instanceof dma ? ((dma)$$2).g() : duy.a($$4, $$5, $$6));
   }, Optional.of(dwl.e), ($$0, $$1) -> new ezc($$0, $$1, $$1x -> $$0.l().a(a($$1x))));

   fah createEditScreen(fex var1, fff var2);

   private static fff.a a(duy $$0) {
      return ($$1, $$2) -> {
         dit $$3 = new dma($$0);
         return $$2.a($$1, $$3);
      };
   }

   private static fff.a a(ib<csq> $$0) {
      return ($$1, $$2) -> {
         io<dmk> $$3 = $$1.d(jz.ay);
         ib<dmk> $$4 = $$3.f(dmk.c);
         csu $$5 = new ctb($$0);
         dit $$6 = new dmi($$5, $$4);
         return $$2.a($$1, $$6);
      };
   }
}
