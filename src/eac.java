import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface eac extends BiPredicate<ddq, jd> {
   Codec<eac> b = lt.M.r().dispatch(eac::a, ead::codec);
   eac c = a(dfy.a);
   eac d = a(dfy.a, dfy.G);

   ead<?> a();

   static eac a(List<eac> $$0) {
      return new eaa($$0);
   }

   static eac a(eac... $$0) {
      return a(List.of($$0));
   }

   static eac a(eac $$0, eac $$1) {
      return a(List.of($$0, $$1));
   }

   static eac b(List<eac> $$0) {
      return new eab($$0);
   }

   static eac b(eac... $$0) {
      return b(List.of($$0));
   }

   static eac b(eac $$0, eac $$1) {
      return b(List.of($$0, $$1));
   }

   static eac a(kh $$0, List<dfw> $$1) {
      return new eai($$0, jq.a(dfw::s, $$1));
   }

   static eac c(List<dfw> $$0) {
      return a(kh.g, $$0);
   }

   static eac a(kh $$0, dfw... $$1) {
      return a($$0, List.of($$1));
   }

   static eac a(dfw... $$0) {
      return a(kh.g, $$0);
   }

   static eac a(kh $$0, awt<dfw> $$1) {
      return new eah($$0, $$1);
   }

   static eac a(awt<dfw> $$0) {
      return a(kh.g, $$0);
   }

   static eac b(kh $$0, List<eox> $$1) {
      return new eaj($$0, jq.a(eox::k, $$1));
   }

   static eac a(kh $$0, eox... $$1) {
      return b($$0, List.of($$1));
   }

   static eac a(eox... $$0) {
      return a(kh.g, $$0);
   }

   static eac a(eac $$0) {
      return new eak($$0);
   }

   static eac a(kh $$0) {
      return new eal($$0);
   }

   static eac b() {
      return a(kh.g);
   }

   static eac a(dta $$0, kh $$1) {
      return new eaq($$1, $$0);
   }

   static eac a(kh $$0, ji $$1) {
      return new eaf($$0, $$1);
   }

   static eac a(ji $$0) {
      return a(kh.g, $$0);
   }

   static eac b(kh $$0) {
      return new eam($$0);
   }

   static eac c() {
      return b(kh.g);
   }

   static eac d() {
      return c(kh.g);
   }

   static eac c(kh $$0) {
      return a($$0, eoz.a);
   }

   static eac d(kh $$0) {
      return new eag($$0);
   }

   static eac e() {
      return eao.a;
   }

   static eac e(kh $$0) {
      return new eap($$0);
   }

   static eac f() {
      return e(kh.g);
   }
}
