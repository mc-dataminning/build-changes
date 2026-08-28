import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface ebd extends BiPredicate<dep, je> {
   Codec<ebd> b = lu.M.q().dispatch(ebd::a, ebe::codec);
   ebd c = a(dgx.a);
   ebd d = a(dgx.a, dgx.G);

   ebe<?> a();

   static ebd a(List<ebd> $$0) {
      return new ebb($$0);
   }

   static ebd a(ebd... $$0) {
      return a(List.of($$0));
   }

   static ebd a(ebd $$0, ebd $$1) {
      return a(List.of($$0, $$1));
   }

   static ebd b(List<ebd> $$0) {
      return new ebc($$0);
   }

   static ebd b(ebd... $$0) {
      return b(List.of($$0));
   }

   static ebd b(ebd $$0, ebd $$1) {
      return b(List.of($$0, $$1));
   }

   static ebd a(ki $$0, List<dgv> $$1) {
      return new ebj($$0, jr.a(dgv::s, $$1));
   }

   static ebd c(List<dgv> $$0) {
      return a(ki.g, $$0);
   }

   static ebd a(ki $$0, dgv... $$1) {
      return a($$0, List.of($$1));
   }

   static ebd a(dgv... $$0) {
      return a(ki.g, $$0);
   }

   static ebd a(ki $$0, axi<dgv> $$1) {
      return new ebi($$0, $$1);
   }

   static ebd a(axi<dgv> $$0) {
      return a(ki.g, $$0);
   }

   static ebd b(ki $$0, List<eqa> $$1) {
      return new ebk($$0, jr.a(eqa::k, $$1));
   }

   static ebd a(ki $$0, eqa... $$1) {
      return b($$0, List.of($$1));
   }

   static ebd a(eqa... $$0) {
      return a(ki.g, $$0);
   }

   static ebd a(ebd $$0) {
      return new ebl($$0);
   }

   static ebd a(ki $$0) {
      return new ebm($$0);
   }

   static ebd b() {
      return a(ki.g);
   }

   static ebd a(dua $$0, ki $$1) {
      return new ebr($$1, $$0);
   }

   static ebd a(ki $$0, jj $$1) {
      return new ebg($$0, $$1);
   }

   static ebd a(jj $$0) {
      return a(ki.g, $$0);
   }

   static ebd b(ki $$0) {
      return new ebn($$0);
   }

   static ebd c() {
      return b(ki.g);
   }

   static ebd d() {
      return c(ki.g);
   }

   static ebd c(ki $$0) {
      return a($$0, eqc.a);
   }

   static ebd d(ki $$0) {
      return new ebh($$0);
   }

   static ebd e() {
      return ebp.a;
   }

   static ebd e(ki $$0) {
      return new ebq($$0);
   }

   static ebd f() {
      return e(ki.g);
   }
}
