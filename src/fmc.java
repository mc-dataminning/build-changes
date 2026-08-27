import java.util.Map;
import java.util.Optional;

public interface fmc {
   Map<Optional<ajg<ect>>, fmc> a = Map.of(Optional.of(ecu.b), ($$0, $$1) -> {
      doy $$2 = $$1.d().a();
      iz $$3 = $$1.a();
      im<cya> $$4 = $$3.b(kj.au);
      im<edk> $$5 = $$3.b(kj.aG);
      im<eci> $$6 = $$3.b(kj.aD);
      return new fgc($$0, $$1x -> $$0.o().a(a($$1x)), $$2 instanceof dsj ? ((dsj)$$2).g() : ebh.a($$4, $$5, $$6));
   }, Optional.of(ecu.e), ($$0, $$1) -> new fgb($$0, $$1, $$1x -> $$0.o().a(a($$1x))));

   fhh createEditScreen(flx var1, fmf var2);

   private static fmf.a a(ebh $$0) {
      return ($$1, $$2) -> {
         doy $$3 = new dsj($$0);
         return $$2.a($$1, $$3);
      };
   }

   private static fmf.a a(il<cya> $$0) {
      return ($$1, $$2) -> {
         iy<dst> $$3 = $$1.d(kj.aB);
         il<dst> $$4 = $$3.g(dst.c);
         cye $$5 = new cyl($$0);
         doy $$6 = new dsr($$5, $$4);
         return $$2.a($$1, $$6);
      };
   }
}
