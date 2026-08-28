import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface eep extends BiPredicate<dhy, jh> {
   Codec<eep> b = ma.M.q().dispatch(eep::a, eeq::codec);
   eep c = a(dkg.a);
   eep d = a(dkg.a, dkg.J);

   eeq<?> a();

   static eep a(List<eep> $$0) {
      return new een($$0);
   }

   static eep a(eep... $$0) {
      return a(List.of($$0));
   }

   static eep a(eep $$0, eep $$1) {
      return a(List.of($$0, $$1));
   }

   static eep b(List<eep> $$0) {
      return new eeo($$0);
   }

   static eep b(eep... $$0) {
      return b(List.of($$0));
   }

   static eep b(eep $$0, eep $$1) {
      return b(List.of($$0, $$1));
   }

   static eep a(kl $$0, List<dke> $$1) {
      return new eev($$0, ju.a(dke::p, $$1));
   }

   static eep c(List<dke> $$0) {
      return a(kl.g, $$0);
   }

   static eep a(kl $$0, dke... $$1) {
      return a($$0, List.of($$1));
   }

   static eep a(dke... $$0) {
      return a(kl.g, $$0);
   }

   static eep a(kl $$0, ayk<dke> $$1) {
      return new eeu($$0, $$1);
   }

   static eep a(ayk<dke> $$0) {
      return a(kl.g, $$0);
   }

   static eep b(kl $$0, List<eto> $$1) {
      return new eew($$0, ju.a(eto::k, $$1));
   }

   static eep a(kl $$0, eto... $$1) {
      return b($$0, List.of($$1));
   }

   static eep a(eto... $$0) {
      return a(kl.g, $$0);
   }

   static eep a(eep $$0) {
      return new eex($$0);
   }

   static eep a(kl $$0) {
      return new eey($$0);
   }

   static eep b() {
      return a(kl.g);
   }

   static eep a(dxn $$0, kl $$1) {
      return new efd($$1, $$0);
   }

   static eep a(kl $$0, jm $$1) {
      return new ees($$0, $$1);
   }

   static eep a(jm $$0) {
      return a(kl.g, $$0);
   }

   static eep b(kl $$0) {
      return new eez($$0);
   }

   static eep c() {
      return b(kl.g);
   }

   static eep d() {
      return c(kl.g);
   }

   static eep c(kl $$0) {
      return a($$0, etq.a);
   }

   static eep d(kl $$0) {
      return new eet($$0);
   }

   static eep e() {
      return efb.a;
   }

   static eep e(kl $$0) {
      return new efc($$0);
   }

   static eep f() {
      return e(kl.g);
   }
}
