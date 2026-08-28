import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface ebv extends BiPredicate<dfg, jf> {
   Codec<ebv> b = lv.M.q().dispatch(ebv::a, ebw::codec);
   ebv c = a(dho.a);
   ebv d = a(dho.a, dho.G);

   ebw<?> a();

   static ebv a(List<ebv> $$0) {
      return new ebt($$0);
   }

   static ebv a(ebv... $$0) {
      return a(List.of($$0));
   }

   static ebv a(ebv $$0, ebv $$1) {
      return a(List.of($$0, $$1));
   }

   static ebv b(List<ebv> $$0) {
      return new ebu($$0);
   }

   static ebv b(ebv... $$0) {
      return b(List.of($$0));
   }

   static ebv b(ebv $$0, ebv $$1) {
      return b(List.of($$0, $$1));
   }

   static ebv a(kj $$0, List<dhm> $$1) {
      return new ecb($$0, js.a(dhm::r, $$1));
   }

   static ebv c(List<dhm> $$0) {
      return a(kj.g, $$0);
   }

   static ebv a(kj $$0, dhm... $$1) {
      return a($$0, List.of($$1));
   }

   static ebv a(dhm... $$0) {
      return a(kj.g, $$0);
   }

   static ebv a(kj $$0, axl<dhm> $$1) {
      return new eca($$0, $$1);
   }

   static ebv a(axl<dhm> $$0) {
      return a(kj.g, $$0);
   }

   static ebv b(kj $$0, List<eqs> $$1) {
      return new ecc($$0, js.a(eqs::k, $$1));
   }

   static ebv a(kj $$0, eqs... $$1) {
      return b($$0, List.of($$1));
   }

   static ebv a(eqs... $$0) {
      return a(kj.g, $$0);
   }

   static ebv a(ebv $$0) {
      return new ecd($$0);
   }

   static ebv a(kj $$0) {
      return new ece($$0);
   }

   static ebv b() {
      return a(kj.g);
   }

   static ebv a(dus $$0, kj $$1) {
      return new ecj($$1, $$0);
   }

   static ebv a(kj $$0, jk $$1) {
      return new eby($$0, $$1);
   }

   static ebv a(jk $$0) {
      return a(kj.g, $$0);
   }

   static ebv b(kj $$0) {
      return new ecf($$0);
   }

   static ebv c() {
      return b(kj.g);
   }

   static ebv d() {
      return c(kj.g);
   }

   static ebv c(kj $$0) {
      return a($$0, equ.a);
   }

   static ebv d(kj $$0) {
      return new ebz($$0);
   }

   static ebv e() {
      return ech.a;
   }

   static ebv e(kj $$0) {
      return new eci($$0);
   }

   static ebv f() {
      return e(kj.g);
   }
}
