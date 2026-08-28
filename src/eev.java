import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface eev extends BiPredicate<dhy, ji> {
   Codec<eev> b = mb.M.q().dispatch(eev::a, eew::codec);
   eev c = a(dkg.a);
   eev d = a(dkg.a, dkg.J);

   eew<?> a();

   static eev a(List<eev> $$0) {
      return new eet($$0);
   }

   static eev a(eev... $$0) {
      return a(List.of($$0));
   }

   static eev a(eev $$0, eev $$1) {
      return a(List.of($$0, $$1));
   }

   static eev b(List<eev> $$0) {
      return new eeu($$0);
   }

   static eev b(eev... $$0) {
      return b(List.of($$0));
   }

   static eev b(eev $$0, eev $$1) {
      return b(List.of($$0, $$1));
   }

   static eev a(km $$0, List<dke> $$1) {
      return new efb($$0, jv.a(dke::p, $$1));
   }

   static eev c(List<dke> $$0) {
      return a(km.h, $$0);
   }

   static eev a(km $$0, dke... $$1) {
      return a($$0, List.of($$1));
   }

   static eev a(dke... $$0) {
      return a(km.h, $$0);
   }

   static eev a(km $$0, axf<dke> $$1) {
      return new efa($$0, $$1);
   }

   static eev a(axf<dke> $$0) {
      return a(km.h, $$0);
   }

   static eev b(km $$0, List<etv> $$1) {
      return new efc($$0, jv.a(etv::k, $$1));
   }

   static eev a(km $$0, etv... $$1) {
      return b($$0, List.of($$1));
   }

   static eev a(etv... $$0) {
      return a(km.h, $$0);
   }

   static eev a(eev $$0) {
      return new efd($$0);
   }

   static eev a(km $$0) {
      return new efe($$0);
   }

   static eev b() {
      return a(km.h);
   }

   static eev a(dxq $$0, km $$1) {
      return new efj($$1, $$0);
   }

   static eev a(km $$0, jn $$1) {
      return new eey($$0, $$1);
   }

   static eev a(jn $$0) {
      return a(km.h, $$0);
   }

   static eev b(km $$0) {
      return new eff($$0);
   }

   static eev c() {
      return b(km.h);
   }

   static eev d() {
      return c(km.h);
   }

   static eev c(km $$0) {
      return a($$0, etx.a);
   }

   static eev d(km $$0) {
      return new eez($$0);
   }

   static eev e() {
      return efh.a;
   }

   static eev e(km $$0) {
      return new efi($$0);
   }

   static eev f() {
      return e(km.h);
   }
}
