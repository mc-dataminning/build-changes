import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface efs extends BiPredicate<dio, jj> {
   Codec<efs> b = md.M.q().dispatch(efs::a, eft::codec);
   efs c = a(dkw.a);
   efs d = a(dkw.a, dkw.J);

   eft<?> a();

   static efs a(List<efs> $$0) {
      return new efq($$0);
   }

   static efs a(efs... $$0) {
      return a(List.of($$0));
   }

   static efs a(efs $$0, efs $$1) {
      return a(List.of($$0, $$1));
   }

   static efs b(List<efs> $$0) {
      return new efr($$0);
   }

   static efs b(efs... $$0) {
      return b(List.of($$0));
   }

   static efs b(efs $$0, efs $$1) {
      return b(List.of($$0, $$1));
   }

   static efs a(kn $$0, List<dku> $$1) {
      return new efy($$0, jw.a(dku::p, $$1));
   }

   static efs c(List<dku> $$0) {
      return a(kn.i, $$0);
   }

   static efs a(kn $$0, dku... $$1) {
      return a($$0, List.of($$1));
   }

   static efs a(dku... $$0) {
      return a(kn.i, $$0);
   }

   static efs a(kn $$0, axp<dku> $$1) {
      return new efx($$0, $$1);
   }

   static efs a(axp<dku> $$0) {
      return a(kn.i, $$0);
   }

   static efs b(kn $$0, List<eus> $$1) {
      return new efz($$0, jw.a(eus::k, $$1));
   }

   static efs a(kn $$0, eus... $$1) {
      return b($$0, List.of($$1));
   }

   static efs a(eus... $$0) {
      return a(kn.i, $$0);
   }

   static efs a(efs $$0) {
      return new ega($$0);
   }

   static efs a(kn $$0) {
      return new egb($$0);
   }

   static efs b() {
      return a(kn.i);
   }

   static efs a(dym $$0, kn $$1) {
      return new egg($$1, $$0);
   }

   static efs a(kn $$0, jo $$1) {
      return new efv($$0, $$1);
   }

   static efs a(jo $$0) {
      return a(kn.i, $$0);
   }

   static efs b(kn $$0) {
      return new egc($$0);
   }

   static efs c() {
      return b(kn.i);
   }

   static efs d() {
      return c(kn.i);
   }

   static efs c(kn $$0) {
      return a($$0, euu.a);
   }

   static efs d(kn $$0) {
      return new efw($$0);
   }

   static efs e() {
      return ege.a;
   }

   static efs e(kn $$0) {
      return new egf($$0);
   }

   static efs f() {
      return e(kn.i);
   }
}
