import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface ehz extends BiPredicate<dkl, iv> {
   Codec<ehz> b = mg.M.q().dispatch(ehz::a, eia::codec);
   ehz c = a(dmt.a);
   ehz d = a(dmt.a, dmt.J);

   eia<?> a();

   static ehz a(List<ehz> $$0) {
      return new ehx($$0);
   }

   static ehz a(ehz... $$0) {
      return a(List.of($$0));
   }

   static ehz a(ehz $$0, ehz $$1) {
      return a(List.of($$0, $$1));
   }

   static ehz b(List<ehz> $$0) {
      return new ehy($$0);
   }

   static ehz b(ehz... $$0) {
      return b(List.of($$0));
   }

   static ehz b(ehz $$0, ehz $$1) {
      return b(List.of($$0, $$1));
   }

   static ehz a(ka $$0, List<dmr> $$1) {
      return new eif($$0, jj.a(dmr::p, $$1));
   }

   static ehz c(List<dmr> $$0) {
      return a(ka.i, $$0);
   }

   static ehz a(ka $$0, dmr... $$1) {
      return a($$0, List.of($$1));
   }

   static ehz a(dmr... $$0) {
      return a(ka.i, $$0);
   }

   static ehz a(ka $$0, axr<dmr> $$1) {
      return new eie($$0, $$1);
   }

   static ehz a(axr<dmr> $$0) {
      return a(ka.i, $$0);
   }

   static ehz b(ka $$0, List<ewz> $$1) {
      return new eig($$0, jj.a(ewz::k, $$1));
   }

   static ehz a(ka $$0, ewz... $$1) {
      return b($$0, List.of($$1));
   }

   static ehz a(ewz... $$0) {
      return a(ka.i, $$0);
   }

   static ehz a(ehz $$0) {
      return new eih($$0);
   }

   static ehz a(ka $$0) {
      return new eii($$0);
   }

   static ehz b() {
      return a(ka.i);
   }

   static ehz a(eat $$0, ka $$1) {
      return new ein($$1, $$0);
   }

   static ehz a(ka $$0, jb $$1) {
      return new eic($$0, $$1);
   }

   static ehz a(jb $$0) {
      return a(ka.i, $$0);
   }

   static ehz b(ka $$0) {
      return new eij($$0);
   }

   static ehz c() {
      return b(ka.i);
   }

   static ehz d() {
      return c(ka.i);
   }

   static ehz c(ka $$0) {
      return a($$0, exb.a);
   }

   static ehz d(ka $$0) {
      return new eid($$0);
   }

   static ehz e() {
      return eil.a;
   }

   static ehz e(ka $$0) {
      return new eim($$0);
   }

   static ehz f() {
      return e(ka.i);
   }
}
