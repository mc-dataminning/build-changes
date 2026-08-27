import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface eab extends BiPredicate<dcv, ir> {
   Codec<eab> b = lh.O.q().dispatch(eab::a, eac::codec);
   eab c = a(dfe.a);
   eab d = a(dfe.a, dfe.al);

   eac<?> a();

   static eab a(List<eab> $$0) {
      return new dzz($$0);
   }

   static eab a(eab... $$0) {
      return a(List.of($$0));
   }

   static eab a(eab $$0, eab $$1) {
      return a(List.of($$0, $$1));
   }

   static eab b(List<eab> $$0) {
      return new eaa($$0);
   }

   static eab b(eab... $$0) {
      return b(List.of($$0));
   }

   static eab b(eab $$0, eab $$1) {
      return b(List.of($$0, $$1));
   }

   static eab a(jv $$0, List<dfc> $$1) {
      return new eah($$0, je.a(dfc::r, $$1));
   }

   static eab c(List<dfc> $$0) {
      return a(jv.g, $$0);
   }

   static eab a(jv $$0, dfc... $$1) {
      return a($$0, List.of($$1));
   }

   static eab a(dfc... $$0) {
      return a(jv.g, $$0);
   }

   static eab a(jv $$0, awt<dfc> $$1) {
      return new eag($$0, $$1);
   }

   static eab a(awt<dfc> $$0) {
      return a(jv.g, $$0);
   }

   static eab b(jv $$0, List<epd> $$1) {
      return new eai($$0, je.a(epd::k, $$1));
   }

   static eab a(jv $$0, epd... $$1) {
      return b($$0, List.of($$1));
   }

   static eab a(epd... $$0) {
      return a(jv.g, $$0);
   }

   static eab a(eab $$0) {
      return new eaj($$0);
   }

   static eab a(jv $$0) {
      return new eak($$0);
   }

   static eab b() {
      return a(jv.g);
   }

   static eab a(dtc $$0, jv $$1) {
      return new eao($$1, $$0);
   }

   static eab a(jv $$0, iw $$1) {
      return new eae($$0, $$1);
   }

   static eab a(iw $$0) {
      return a(jv.g, $$0);
   }

   static eab b(jv $$0) {
      return new eal($$0);
   }

   static eab c() {
      return b(jv.g);
   }

   static eab d() {
      return c(jv.g);
   }

   static eab c(jv $$0) {
      return a($$0, epf.a);
   }

   static eab d(jv $$0) {
      return new eaf($$0);
   }

   static eab e() {
      return ean.a;
   }
}
