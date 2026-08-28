import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface eaf extends BiPredicate<dds, jd> {
   Codec<eaf> b = lt.M.r().dispatch(eaf::a, eag::codec);
   eaf c = a(dga.a);
   eaf d = a(dga.a, dga.G);

   eag<?> a();

   static eaf a(List<eaf> $$0) {
      return new ead($$0);
   }

   static eaf a(eaf... $$0) {
      return a(List.of($$0));
   }

   static eaf a(eaf $$0, eaf $$1) {
      return a(List.of($$0, $$1));
   }

   static eaf b(List<eaf> $$0) {
      return new eae($$0);
   }

   static eaf b(eaf... $$0) {
      return b(List.of($$0));
   }

   static eaf b(eaf $$0, eaf $$1) {
      return b(List.of($$0, $$1));
   }

   static eaf a(kh $$0, List<dfy> $$1) {
      return new eal($$0, jq.a(dfy::s, $$1));
   }

   static eaf c(List<dfy> $$0) {
      return a(kh.g, $$0);
   }

   static eaf a(kh $$0, dfy... $$1) {
      return a($$0, List.of($$1));
   }

   static eaf a(dfy... $$0) {
      return a(kh.g, $$0);
   }

   static eaf a(kh $$0, awu<dfy> $$1) {
      return new eak($$0, $$1);
   }

   static eaf a(awu<dfy> $$0) {
      return a(kh.g, $$0);
   }

   static eaf b(kh $$0, List<epd> $$1) {
      return new eam($$0, jq.a(epd::k, $$1));
   }

   static eaf a(kh $$0, epd... $$1) {
      return b($$0, List.of($$1));
   }

   static eaf a(epd... $$0) {
      return a(kh.g, $$0);
   }

   static eaf a(eaf $$0) {
      return new ean($$0);
   }

   static eaf a(kh $$0) {
      return new eao($$0);
   }

   static eaf b() {
      return a(kh.g);
   }

   static eaf a(dtc $$0, kh $$1) {
      return new eat($$1, $$0);
   }

   static eaf a(kh $$0, ji $$1) {
      return new eai($$0, $$1);
   }

   static eaf a(ji $$0) {
      return a(kh.g, $$0);
   }

   static eaf b(kh $$0) {
      return new eap($$0);
   }

   static eaf c() {
      return b(kh.g);
   }

   static eaf d() {
      return c(kh.g);
   }

   static eaf c(kh $$0) {
      return a($$0, epf.a);
   }

   static eaf d(kh $$0) {
      return new eaj($$0);
   }

   static eaf e() {
      return ear.a;
   }

   static eaf e(kh $$0) {
      return new eas($$0);
   }

   static eaf f() {
      return e(kh.g);
   }
}
