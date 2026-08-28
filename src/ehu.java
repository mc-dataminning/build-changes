import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface ehu extends BiPredicate<dkg, iv> {
   Codec<ehu> b = mg.M.q().dispatch(ehu::a, ehv::codec);
   ehu c = a(dmo.a);
   ehu d = a(dmo.a, dmo.J);

   ehv<?> a();

   static ehu a(List<ehu> $$0) {
      return new ehs($$0);
   }

   static ehu a(ehu... $$0) {
      return a(List.of($$0));
   }

   static ehu a(ehu $$0, ehu $$1) {
      return a(List.of($$0, $$1));
   }

   static ehu b(List<ehu> $$0) {
      return new eht($$0);
   }

   static ehu b(ehu... $$0) {
      return b(List.of($$0));
   }

   static ehu b(ehu $$0, ehu $$1) {
      return b(List.of($$0, $$1));
   }

   static ehu a(ka $$0, List<dmm> $$1) {
      return new eia($$0, jj.a(dmm::p, $$1));
   }

   static ehu c(List<dmm> $$0) {
      return a(ka.i, $$0);
   }

   static ehu a(ka $$0, dmm... $$1) {
      return a($$0, List.of($$1));
   }

   static ehu a(dmm... $$0) {
      return a(ka.i, $$0);
   }

   static ehu a(ka $$0, axr<dmm> $$1) {
      return new ehz($$0, $$1);
   }

   static ehu a(axr<dmm> $$0) {
      return a(ka.i, $$0);
   }

   static ehu b(ka $$0, List<ewu> $$1) {
      return new eib($$0, jj.a(ewu::k, $$1));
   }

   static ehu a(ka $$0, ewu... $$1) {
      return b($$0, List.of($$1));
   }

   static ehu a(ewu... $$0) {
      return a(ka.i, $$0);
   }

   static ehu a(ehu $$0) {
      return new eic($$0);
   }

   static ehu a(ka $$0) {
      return new eid($$0);
   }

   static ehu b() {
      return a(ka.i);
   }

   static ehu a(eao $$0, ka $$1) {
      return new eii($$1, $$0);
   }

   static ehu a(ka $$0, jb $$1) {
      return new ehx($$0, $$1);
   }

   static ehu a(jb $$0) {
      return a(ka.i, $$0);
   }

   static ehu b(ka $$0) {
      return new eie($$0);
   }

   static ehu c() {
      return b(ka.i);
   }

   static ehu d() {
      return c(ka.i);
   }

   static ehu c(ka $$0) {
      return a($$0, eww.a);
   }

   static ehu d(ka $$0) {
      return new ehy($$0);
   }

   static ehu e() {
      return eig.a;
   }

   static ehu e(ka $$0) {
      return new eih($$0);
   }

   static ehu f() {
      return e(ka.i);
   }
}
