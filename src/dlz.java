import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface dlz extends BiPredicate<cqp, gw> {
   Codec<dlz> b = jd.P.q().dispatch(dlz::a, dma::codec);
   dlz c = a(csw.a);
   dlz d = a(csw.a, csw.G);

   dma<?> a();

   static dlz a(List<dlz> $$0) {
      return new dlx($$0);
   }

   static dlz a(dlz... $$0) {
      return a(List.of($$0));
   }

   static dlz a(dlz $$0, dlz $$1) {
      return a(List.of($$0, $$1));
   }

   static dlz b(List<dlz> $$0) {
      return new dly($$0);
   }

   static dlz b(dlz... $$0) {
      return b(List.of($$0));
   }

   static dlz b(dlz $$0, dlz $$1) {
      return b(List.of($$0, $$1));
   }

   static dlz a(ib $$0, List<csv> $$1) {
      return new dmf($$0, hk.a(csv::q, $$1));
   }

   static dlz c(List<csv> $$0) {
      return a(ib.g, $$0);
   }

   static dlz a(ib $$0, csv... $$1) {
      return a($$0, List.of($$1));
   }

   static dlz a(csv... $$0) {
      return a(ib.g, $$0);
   }

   static dlz a(ib $$0, aqi<csv> $$1) {
      return new dme($$0, $$1);
   }

   static dlz a(aqi<csv> $$0) {
      return a(ib.g, $$0);
   }

   static dlz b(ib $$0, List<eal> $$1) {
      return new dmg($$0, hk.a(eal::k, $$1));
   }

   static dlz a(ib $$0, eal... $$1) {
      return b($$0, List.of($$1));
   }

   static dlz a(eal... $$0) {
      return a(ib.g, $$0);
   }

   static dlz a(dlz $$0) {
      return new dmh($$0);
   }

   static dlz a(ib $$0) {
      return new dmi($$0);
   }

   static dlz b() {
      return a(ib.g);
   }

   static dlz a(dfj $$0, ib $$1) {
      return new dmm($$1, $$0);
   }

   static dlz a(ib $$0, hc $$1) {
      return new dmc($$0, $$1);
   }

   static dlz a(hc $$0) {
      return a(ib.g, $$0);
   }

   static dlz b(ib $$0) {
      return new dmj($$0);
   }

   static dlz c() {
      return b(ib.g);
   }

   static dlz d() {
      return c(ib.g);
   }

   static dlz c(ib $$0) {
      return a($$0, ean.a);
   }

   static dlz d(ib $$0) {
      return new dmd($$0);
   }

   static dlz e() {
      return dml.a;
   }
}
