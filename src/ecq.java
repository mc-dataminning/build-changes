import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface ecq extends BiPredicate<dgd, jh> {
   Codec<ecq> b = lz.M.q().dispatch(ecq::a, ecr::codec);
   ecq c = a(dil.a);
   ecq d = a(dil.a, dil.G);

   ecr<?> a();

   static ecq a(List<ecq> $$0) {
      return new eco($$0);
   }

   static ecq a(ecq... $$0) {
      return a(List.of($$0));
   }

   static ecq a(ecq $$0, ecq $$1) {
      return a(List.of($$0, $$1));
   }

   static ecq b(List<ecq> $$0) {
      return new ecp($$0);
   }

   static ecq b(ecq... $$0) {
      return b(List.of($$0));
   }

   static ecq b(ecq $$0, ecq $$1) {
      return b(List.of($$0, $$1));
   }

   static ecq a(kl $$0, List<dij> $$1) {
      return new ecw($$0, ju.a(dij::p, $$1));
   }

   static ecq c(List<dij> $$0) {
      return a(kl.g, $$0);
   }

   static ecq a(kl $$0, dij... $$1) {
      return a($$0, List.of($$1));
   }

   static ecq a(dij... $$0) {
      return a(kl.g, $$0);
   }

   static ecq a(kl $$0, axt<dij> $$1) {
      return new ecv($$0, $$1);
   }

   static ecq a(axt<dij> $$0) {
      return a(kl.g, $$0);
   }

   static ecq b(kl $$0, List<ern> $$1) {
      return new ecx($$0, ju.a(ern::k, $$1));
   }

   static ecq a(kl $$0, ern... $$1) {
      return b($$0, List.of($$1));
   }

   static ecq a(ern... $$0) {
      return a(kl.g, $$0);
   }

   static ecq a(ecq $$0) {
      return new ecy($$0);
   }

   static ecq a(kl $$0) {
      return new ecz($$0);
   }

   static ecq b() {
      return a(kl.g);
   }

   static ecq a(dvo $$0, kl $$1) {
      return new ede($$1, $$0);
   }

   static ecq a(kl $$0, jm $$1) {
      return new ect($$0, $$1);
   }

   static ecq a(jm $$0) {
      return a(kl.g, $$0);
   }

   static ecq b(kl $$0) {
      return new eda($$0);
   }

   static ecq c() {
      return b(kl.g);
   }

   static ecq d() {
      return c(kl.g);
   }

   static ecq c(kl $$0) {
      return a($$0, erp.a);
   }

   static ecq d(kl $$0) {
      return new ecu($$0);
   }

   static ecq e() {
      return edc.a;
   }

   static ecq e(kl $$0) {
      return new edd($$0);
   }

   static ecq f() {
      return e(kl.g);
   }
}
