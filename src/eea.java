import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface eea extends BiPredicate<dhh, ji> {
   Codec<eea> b = mb.M.q().dispatch(eea::a, eeb::codec);
   eea c = a(djp.a);
   eea d = a(djp.a, djp.J);

   eeb<?> a();

   static eea a(List<eea> $$0) {
      return new edy($$0);
   }

   static eea a(eea... $$0) {
      return a(List.of($$0));
   }

   static eea a(eea $$0, eea $$1) {
      return a(List.of($$0, $$1));
   }

   static eea b(List<eea> $$0) {
      return new edz($$0);
   }

   static eea b(eea... $$0) {
      return b(List.of($$0));
   }

   static eea b(eea $$0, eea $$1) {
      return b(List.of($$0, $$1));
   }

   static eea a(km $$0, List<djn> $$1) {
      return new eeg($$0, jv.a(djn::p, $$1));
   }

   static eea c(List<djn> $$0) {
      return a(km.h, $$0);
   }

   static eea a(km $$0, djn... $$1) {
      return a($$0, List.of($$1));
   }

   static eea a(djn... $$0) {
      return a(km.h, $$0);
   }

   static eea a(km $$0, axf<djn> $$1) {
      return new eef($$0, $$1);
   }

   static eea a(axf<djn> $$0) {
      return a(km.h, $$0);
   }

   static eea b(km $$0, List<esz> $$1) {
      return new eeh($$0, jv.a(esz::k, $$1));
   }

   static eea a(km $$0, esz... $$1) {
      return b($$0, List.of($$1));
   }

   static eea a(esz... $$0) {
      return a(km.h, $$0);
   }

   static eea a(eea $$0) {
      return new eei($$0);
   }

   static eea a(km $$0) {
      return new eej($$0);
   }

   static eea b() {
      return a(km.h);
   }

   static eea a(dwy $$0, km $$1) {
      return new eeo($$1, $$0);
   }

   static eea a(km $$0, jn $$1) {
      return new eed($$0, $$1);
   }

   static eea a(jn $$0) {
      return a(km.h, $$0);
   }

   static eea b(km $$0) {
      return new eek($$0);
   }

   static eea c() {
      return b(km.h);
   }

   static eea d() {
      return c(km.h);
   }

   static eea c(km $$0) {
      return a($$0, etb.a);
   }

   static eea d(km $$0) {
      return new eee($$0);
   }

   static eea e() {
      return eem.a;
   }

   static eea e(km $$0) {
      return new een($$0);
   }

   static eea f() {
      return e(km.h);
   }
}
