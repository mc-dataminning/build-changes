import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface edx extends BiPredicate<dhe, ji> {
   Codec<edx> b = mb.M.q().dispatch(edx::a, edy::codec);
   edx c = a(djm.a);
   edx d = a(djm.a, djm.J);

   edy<?> a();

   static edx a(List<edx> $$0) {
      return new edv($$0);
   }

   static edx a(edx... $$0) {
      return a(List.of($$0));
   }

   static edx a(edx $$0, edx $$1) {
      return a(List.of($$0, $$1));
   }

   static edx b(List<edx> $$0) {
      return new edw($$0);
   }

   static edx b(edx... $$0) {
      return b(List.of($$0));
   }

   static edx b(edx $$0, edx $$1) {
      return b(List.of($$0, $$1));
   }

   static edx a(km $$0, List<djk> $$1) {
      return new eed($$0, jv.a(djk::p, $$1));
   }

   static edx c(List<djk> $$0) {
      return a(km.h, $$0);
   }

   static edx a(km $$0, djk... $$1) {
      return a($$0, List.of($$1));
   }

   static edx a(djk... $$0) {
      return a(km.h, $$0);
   }

   static edx a(km $$0, axe<djk> $$1) {
      return new eec($$0, $$1);
   }

   static edx a(axe<djk> $$0) {
      return a(km.h, $$0);
   }

   static edx b(km $$0, List<esw> $$1) {
      return new eee($$0, jv.a(esw::k, $$1));
   }

   static edx a(km $$0, esw... $$1) {
      return b($$0, List.of($$1));
   }

   static edx a(esw... $$0) {
      return a(km.h, $$0);
   }

   static edx a(edx $$0) {
      return new eef($$0);
   }

   static edx a(km $$0) {
      return new eeg($$0);
   }

   static edx b() {
      return a(km.h);
   }

   static edx a(dwv $$0, km $$1) {
      return new eel($$1, $$0);
   }

   static edx a(km $$0, jn $$1) {
      return new eea($$0, $$1);
   }

   static edx a(jn $$0) {
      return a(km.h, $$0);
   }

   static edx b(km $$0) {
      return new eeh($$0);
   }

   static edx c() {
      return b(km.h);
   }

   static edx d() {
      return c(km.h);
   }

   static edx c(km $$0) {
      return a($$0, esy.a);
   }

   static edx d(km $$0) {
      return new eeb($$0);
   }

   static edx e() {
      return eej.a;
   }

   static edx e(km $$0) {
      return new eek($$0);
   }

   static edx f() {
      return e(km.h);
   }
}
