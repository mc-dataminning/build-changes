import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface edz extends BiPredicate<dhg, ji> {
   Codec<edz> b = mb.M.q().dispatch(edz::a, eea::codec);
   edz c = a(djo.a);
   edz d = a(djo.a, djo.J);

   eea<?> a();

   static edz a(List<edz> $$0) {
      return new edx($$0);
   }

   static edz a(edz... $$0) {
      return a(List.of($$0));
   }

   static edz a(edz $$0, edz $$1) {
      return a(List.of($$0, $$1));
   }

   static edz b(List<edz> $$0) {
      return new edy($$0);
   }

   static edz b(edz... $$0) {
      return b(List.of($$0));
   }

   static edz b(edz $$0, edz $$1) {
      return b(List.of($$0, $$1));
   }

   static edz a(km $$0, List<djm> $$1) {
      return new eef($$0, jv.a(djm::p, $$1));
   }

   static edz c(List<djm> $$0) {
      return a(km.h, $$0);
   }

   static edz a(km $$0, djm... $$1) {
      return a($$0, List.of($$1));
   }

   static edz a(djm... $$0) {
      return a(km.h, $$0);
   }

   static edz a(km $$0, axf<djm> $$1) {
      return new eee($$0, $$1);
   }

   static edz a(axf<djm> $$0) {
      return a(km.h, $$0);
   }

   static edz b(km $$0, List<esy> $$1) {
      return new eeg($$0, jv.a(esy::k, $$1));
   }

   static edz a(km $$0, esy... $$1) {
      return b($$0, List.of($$1));
   }

   static edz a(esy... $$0) {
      return a(km.h, $$0);
   }

   static edz a(edz $$0) {
      return new eeh($$0);
   }

   static edz a(km $$0) {
      return new eei($$0);
   }

   static edz b() {
      return a(km.h);
   }

   static edz a(dwx $$0, km $$1) {
      return new een($$1, $$0);
   }

   static edz a(km $$0, jn $$1) {
      return new eec($$0, $$1);
   }

   static edz a(jn $$0) {
      return a(km.h, $$0);
   }

   static edz b(km $$0) {
      return new eej($$0);
   }

   static edz c() {
      return b(km.h);
   }

   static edz d() {
      return c(km.h);
   }

   static edz c(km $$0) {
      return a($$0, eta.a);
   }

   static edz d(km $$0) {
      return new eed($$0);
   }

   static edz e() {
      return eel.a;
   }

   static edz e(km $$0) {
      return new eem($$0);
   }

   static edz f() {
      return e(km.h);
   }
}
