import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface eim extends BiPredicate<dky, iw> {
   Codec<eim> b = mh.M.q().dispatch(eim::a, ein::codec);
   eim c = a(dng.a);
   eim d = a(dng.a, dng.J);

   ein<?> a();

   static eim a(List<eim> $$0) {
      return new eik($$0);
   }

   static eim a(eim... $$0) {
      return a(List.of($$0));
   }

   static eim a(eim $$0, eim $$1) {
      return a(List.of($$0, $$1));
   }

   static eim b(List<eim> $$0) {
      return new eil($$0);
   }

   static eim b(eim... $$0) {
      return b(List.of($$0));
   }

   static eim b(eim $$0, eim $$1) {
      return b(List.of($$0, $$1));
   }

   static eim a(kb $$0, List<dne> $$1) {
      return new eis($$0, jk.a(dne::p, $$1));
   }

   static eim c(List<dne> $$0) {
      return a(kb.i, $$0);
   }

   static eim a(kb $$0, dne... $$1) {
      return a($$0, List.of($$1));
   }

   static eim a(dne... $$0) {
      return a(kb.i, $$0);
   }

   static eim a(kb $$0, axv<dne> $$1) {
      return new eir($$0, $$1);
   }

   static eim a(axv<dne> $$0) {
      return a(kb.i, $$0);
   }

   static eim b(kb $$0, List<exp> $$1) {
      return new eit($$0, jk.a(exp::k, $$1));
   }

   static eim a(kb $$0, exp... $$1) {
      return b($$0, List.of($$1));
   }

   static eim a(exp... $$0) {
      return a(kb.i, $$0);
   }

   static eim a(eim $$0) {
      return new eiu($$0);
   }

   static eim a(kb $$0) {
      return new eiv($$0);
   }

   static eim b() {
      return a(kb.i);
   }

   static eim a(ebg $$0, kb $$1) {
      return new eja($$1, $$0);
   }

   static eim a(kb $$0, jc $$1) {
      return new eip($$0, $$1);
   }

   static eim a(jc $$0) {
      return a(kb.i, $$0);
   }

   static eim b(kb $$0) {
      return new eiw($$0);
   }

   static eim c() {
      return b(kb.i);
   }

   static eim d() {
      return c(kb.i);
   }

   static eim c(kb $$0) {
      return a($$0, exr.a);
   }

   static eim d(kb $$0) {
      return new eiq($$0);
   }

   static eim e() {
      return eiy.a;
   }

   static eim e(kb $$0) {
      return new eiz($$0);
   }

   static eim f() {
      return e(kb.i);
   }
}
