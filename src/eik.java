import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface eik extends BiPredicate<dkw, iv> {
   Codec<eik> b = mg.M.q().dispatch(eik::a, eil::codec);
   eik c = a(dne.a);
   eik d = a(dne.a, dne.J);

   eil<?> a();

   static eik a(List<eik> $$0) {
      return new eii($$0);
   }

   static eik a(eik... $$0) {
      return a(List.of($$0));
   }

   static eik a(eik $$0, eik $$1) {
      return a(List.of($$0, $$1));
   }

   static eik b(List<eik> $$0) {
      return new eij($$0);
   }

   static eik b(eik... $$0) {
      return b(List.of($$0));
   }

   static eik b(eik $$0, eik $$1) {
      return b(List.of($$0, $$1));
   }

   static eik a(ka $$0, List<dnc> $$1) {
      return new eiq($$0, jj.a(dnc::p, $$1));
   }

   static eik c(List<dnc> $$0) {
      return a(ka.i, $$0);
   }

   static eik a(ka $$0, dnc... $$1) {
      return a($$0, List.of($$1));
   }

   static eik a(dnc... $$0) {
      return a(ka.i, $$0);
   }

   static eik a(ka $$0, axt<dnc> $$1) {
      return new eip($$0, $$1);
   }

   static eik a(axt<dnc> $$0) {
      return a(ka.i, $$0);
   }

   static eik b(ka $$0, List<exn> $$1) {
      return new eir($$0, jj.a(exn::k, $$1));
   }

   static eik a(ka $$0, exn... $$1) {
      return b($$0, List.of($$1));
   }

   static eik a(exn... $$0) {
      return a(ka.i, $$0);
   }

   static eik a(eik $$0) {
      return new eis($$0);
   }

   static eik a(ka $$0) {
      return new eit($$0);
   }

   static eik b() {
      return a(ka.i);
   }

   static eik a(ebe $$0, ka $$1) {
      return new eiy($$1, $$0);
   }

   static eik a(ka $$0, jb $$1) {
      return new ein($$0, $$1);
   }

   static eik a(jb $$0) {
      return a(ka.i, $$0);
   }

   static eik b(ka $$0) {
      return new eiu($$0);
   }

   static eik c() {
      return b(ka.i);
   }

   static eik d() {
      return c(ka.i);
   }

   static eik c(ka $$0) {
      return a($$0, exp.a);
   }

   static eik d(ka $$0) {
      return new eio($$0);
   }

   static eik e() {
      return eiw.a;
   }

   static eik e(ka $$0) {
      return new eix($$0);
   }

   static eik f() {
      return e(ka.i);
   }
}
