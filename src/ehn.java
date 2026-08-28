import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface ehn extends BiPredicate<djz, iu> {
   Codec<ehn> b = mf.M.q().dispatch(ehn::a, eho::codec);
   ehn c = a(dmh.a);
   ehn d = a(dmh.a, dmh.J);

   eho<?> a();

   static ehn a(List<ehn> $$0) {
      return new ehl($$0);
   }

   static ehn a(ehn... $$0) {
      return a(List.of($$0));
   }

   static ehn a(ehn $$0, ehn $$1) {
      return a(List.of($$0, $$1));
   }

   static ehn b(List<ehn> $$0) {
      return new ehm($$0);
   }

   static ehn b(ehn... $$0) {
      return b(List.of($$0));
   }

   static ehn b(ehn $$0, ehn $$1) {
      return b(List.of($$0, $$1));
   }

   static ehn a(jz $$0, List<dmf> $$1) {
      return new eht($$0, ji.a(dmf::p, $$1));
   }

   static ehn c(List<dmf> $$0) {
      return a(jz.i, $$0);
   }

   static ehn a(jz $$0, dmf... $$1) {
      return a($$0, List.of($$1));
   }

   static ehn a(dmf... $$0) {
      return a(jz.i, $$0);
   }

   static ehn a(jz $$0, axr<dmf> $$1) {
      return new ehs($$0, $$1);
   }

   static ehn a(axr<dmf> $$0) {
      return a(jz.i, $$0);
   }

   static ehn b(jz $$0, List<ewn> $$1) {
      return new ehu($$0, ji.a(ewn::k, $$1));
   }

   static ehn a(jz $$0, ewn... $$1) {
      return b($$0, List.of($$1));
   }

   static ehn a(ewn... $$0) {
      return a(jz.i, $$0);
   }

   static ehn a(ehn $$0) {
      return new ehv($$0);
   }

   static ehn a(jz $$0) {
      return new ehw($$0);
   }

   static ehn b() {
      return a(jz.i);
   }

   static ehn a(eah $$0, jz $$1) {
      return new eib($$1, $$0);
   }

   static ehn a(jz $$0, ja $$1) {
      return new ehq($$0, $$1);
   }

   static ehn a(ja $$0) {
      return a(jz.i, $$0);
   }

   static ehn b(jz $$0) {
      return new ehx($$0);
   }

   static ehn c() {
      return b(jz.i);
   }

   static ehn d() {
      return c(jz.i);
   }

   static ehn c(jz $$0) {
      return a($$0, ewp.a);
   }

   static ehn d(jz $$0) {
      return new ehr($$0);
   }

   static ehn e() {
      return ehz.a;
   }

   static ehn e(jz $$0) {
      return new eia($$0);
   }

   static ehn f() {
      return e(jz.i);
   }
}
