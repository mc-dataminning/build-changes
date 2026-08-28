import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface eew extends BiPredicate<dif, jh> {
   Codec<eew> b = ma.M.q().dispatch(eew::a, eex::codec);
   eew c = a(dkn.a);
   eew d = a(dkn.a, dkn.J);

   eex<?> a();

   static eew a(List<eew> $$0) {
      return new eeu($$0);
   }

   static eew a(eew... $$0) {
      return a(List.of($$0));
   }

   static eew a(eew $$0, eew $$1) {
      return a(List.of($$0, $$1));
   }

   static eew b(List<eew> $$0) {
      return new eev($$0);
   }

   static eew b(eew... $$0) {
      return b(List.of($$0));
   }

   static eew b(eew $$0, eew $$1) {
      return b(List.of($$0, $$1));
   }

   static eew a(kl $$0, List<dkl> $$1) {
      return new efc($$0, ju.a(dkl::p, $$1));
   }

   static eew c(List<dkl> $$0) {
      return a(kl.h, $$0);
   }

   static eew a(kl $$0, dkl... $$1) {
      return a($$0, List.of($$1));
   }

   static eew a(dkl... $$0) {
      return a(kl.h, $$0);
   }

   static eew a(kl $$0, ayk<dkl> $$1) {
      return new efb($$0, $$1);
   }

   static eew a(ayk<dkl> $$0) {
      return a(kl.h, $$0);
   }

   static eew b(kl $$0, List<etv> $$1) {
      return new efd($$0, ju.a(etv::k, $$1));
   }

   static eew a(kl $$0, etv... $$1) {
      return b($$0, List.of($$1));
   }

   static eew a(etv... $$0) {
      return a(kl.h, $$0);
   }

   static eew a(eew $$0) {
      return new efe($$0);
   }

   static eew a(kl $$0) {
      return new eff($$0);
   }

   static eew b() {
      return a(kl.h);
   }

   static eew a(dxu $$0, kl $$1) {
      return new efk($$1, $$0);
   }

   static eew a(kl $$0, jm $$1) {
      return new eez($$0, $$1);
   }

   static eew a(jm $$0) {
      return a(kl.h, $$0);
   }

   static eew b(kl $$0) {
      return new efg($$0);
   }

   static eew c() {
      return b(kl.h);
   }

   static eew d() {
      return c(kl.h);
   }

   static eew c(kl $$0) {
      return a($$0, etx.a);
   }

   static eew d(kl $$0) {
      return new efa($$0);
   }

   static eew e() {
      return efi.a;
   }

   static eew e(kl $$0) {
      return new efj($$0);
   }

   static eew f() {
      return e(kl.h);
   }
}
