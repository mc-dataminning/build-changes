import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface edy extends BiPredicate<dhf, ji> {
   Codec<edy> b = mb.M.q().dispatch(edy::a, edz::codec);
   edy c = a(djn.a);
   edy d = a(djn.a, djn.J);

   edz<?> a();

   static edy a(List<edy> $$0) {
      return new edw($$0);
   }

   static edy a(edy... $$0) {
      return a(List.of($$0));
   }

   static edy a(edy $$0, edy $$1) {
      return a(List.of($$0, $$1));
   }

   static edy b(List<edy> $$0) {
      return new edx($$0);
   }

   static edy b(edy... $$0) {
      return b(List.of($$0));
   }

   static edy b(edy $$0, edy $$1) {
      return b(List.of($$0, $$1));
   }

   static edy a(km $$0, List<djl> $$1) {
      return new eee($$0, jv.a(djl::p, $$1));
   }

   static edy c(List<djl> $$0) {
      return a(km.h, $$0);
   }

   static edy a(km $$0, djl... $$1) {
      return a($$0, List.of($$1));
   }

   static edy a(djl... $$0) {
      return a(km.h, $$0);
   }

   static edy a(km $$0, axf<djl> $$1) {
      return new eed($$0, $$1);
   }

   static edy a(axf<djl> $$0) {
      return a(km.h, $$0);
   }

   static edy b(km $$0, List<esx> $$1) {
      return new eef($$0, jv.a(esx::k, $$1));
   }

   static edy a(km $$0, esx... $$1) {
      return b($$0, List.of($$1));
   }

   static edy a(esx... $$0) {
      return a(km.h, $$0);
   }

   static edy a(edy $$0) {
      return new eeg($$0);
   }

   static edy a(km $$0) {
      return new eeh($$0);
   }

   static edy b() {
      return a(km.h);
   }

   static edy a(dww $$0, km $$1) {
      return new eem($$1, $$0);
   }

   static edy a(km $$0, jn $$1) {
      return new eeb($$0, $$1);
   }

   static edy a(jn $$0) {
      return a(km.h, $$0);
   }

   static edy b(km $$0) {
      return new eei($$0);
   }

   static edy c() {
      return b(km.h);
   }

   static edy d() {
      return c(km.h);
   }

   static edy c(km $$0) {
      return a($$0, esz.a);
   }

   static edy d(km $$0) {
      return new eec($$0);
   }

   static edy e() {
      return eek.a;
   }

   static edy e(km $$0) {
      return new eel($$0);
   }

   static edy f() {
      return e(km.h);
   }
}
