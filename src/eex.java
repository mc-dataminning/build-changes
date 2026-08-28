import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface eex extends BiPredicate<dig, jh> {
   Codec<eex> b = ma.M.q().dispatch(eex::a, eey::codec);
   eex c = a(dko.a);
   eex d = a(dko.a, dko.J);

   eey<?> a();

   static eex a(List<eex> $$0) {
      return new eev($$0);
   }

   static eex a(eex... $$0) {
      return a(List.of($$0));
   }

   static eex a(eex $$0, eex $$1) {
      return a(List.of($$0, $$1));
   }

   static eex b(List<eex> $$0) {
      return new eew($$0);
   }

   static eex b(eex... $$0) {
      return b(List.of($$0));
   }

   static eex b(eex $$0, eex $$1) {
      return b(List.of($$0, $$1));
   }

   static eex a(kl $$0, List<dkm> $$1) {
      return new efd($$0, ju.a(dkm::p, $$1));
   }

   static eex c(List<dkm> $$0) {
      return a(kl.h, $$0);
   }

   static eex a(kl $$0, dkm... $$1) {
      return a($$0, List.of($$1));
   }

   static eex a(dkm... $$0) {
      return a(kl.h, $$0);
   }

   static eex a(kl $$0, ayk<dkm> $$1) {
      return new efc($$0, $$1);
   }

   static eex a(ayk<dkm> $$0) {
      return a(kl.h, $$0);
   }

   static eex b(kl $$0, List<etw> $$1) {
      return new efe($$0, ju.a(etw::k, $$1));
   }

   static eex a(kl $$0, etw... $$1) {
      return b($$0, List.of($$1));
   }

   static eex a(etw... $$0) {
      return a(kl.h, $$0);
   }

   static eex a(eex $$0) {
      return new eff($$0);
   }

   static eex a(kl $$0) {
      return new efg($$0);
   }

   static eex b() {
      return a(kl.h);
   }

   static eex a(dxv $$0, kl $$1) {
      return new efl($$1, $$0);
   }

   static eex a(kl $$0, jm $$1) {
      return new efa($$0, $$1);
   }

   static eex a(jm $$0) {
      return a(kl.h, $$0);
   }

   static eex b(kl $$0) {
      return new efh($$0);
   }

   static eex c() {
      return b(kl.h);
   }

   static eex d() {
      return c(kl.h);
   }

   static eex c(kl $$0) {
      return a($$0, ety.a);
   }

   static eex d(kl $$0) {
      return new efb($$0);
   }

   static eex e() {
      return efj.a;
   }

   static eex e(kl $$0) {
      return new efk($$0);
   }

   static eex f() {
      return e(kl.h);
   }
}
