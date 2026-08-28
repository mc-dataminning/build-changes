import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface ecm extends BiPredicate<dfy, jh> {
   Codec<ecm> b = ly.M.q().dispatch(ecm::a, ecn::codec);
   ecm c = a(dig.a);
   ecm d = a(dig.a, dig.G);

   ecn<?> a();

   static ecm a(List<ecm> $$0) {
      return new eck($$0);
   }

   static ecm a(ecm... $$0) {
      return a(List.of($$0));
   }

   static ecm a(ecm $$0, ecm $$1) {
      return a(List.of($$0, $$1));
   }

   static ecm b(List<ecm> $$0) {
      return new ecl($$0);
   }

   static ecm b(ecm... $$0) {
      return b(List.of($$0));
   }

   static ecm b(ecm $$0, ecm $$1) {
      return b(List.of($$0, $$1));
   }

   static ecm a(kl $$0, List<die> $$1) {
      return new ecs($$0, ju.a(die::p, $$1));
   }

   static ecm c(List<die> $$0) {
      return a(kl.g, $$0);
   }

   static ecm a(kl $$0, die... $$1) {
      return a($$0, List.of($$1));
   }

   static ecm a(die... $$0) {
      return a(kl.g, $$0);
   }

   static ecm a(kl $$0, axq<die> $$1) {
      return new ecr($$0, $$1);
   }

   static ecm a(axq<die> $$0) {
      return a(kl.g, $$0);
   }

   static ecm b(kl $$0, List<erj> $$1) {
      return new ect($$0, ju.a(erj::k, $$1));
   }

   static ecm a(kl $$0, erj... $$1) {
      return b($$0, List.of($$1));
   }

   static ecm a(erj... $$0) {
      return a(kl.g, $$0);
   }

   static ecm a(ecm $$0) {
      return new ecu($$0);
   }

   static ecm a(kl $$0) {
      return new ecv($$0);
   }

   static ecm b() {
      return a(kl.g);
   }

   static ecm a(dvj $$0, kl $$1) {
      return new eda($$1, $$0);
   }

   static ecm a(kl $$0, jm $$1) {
      return new ecp($$0, $$1);
   }

   static ecm a(jm $$0) {
      return a(kl.g, $$0);
   }

   static ecm b(kl $$0) {
      return new ecw($$0);
   }

   static ecm c() {
      return b(kl.g);
   }

   static ecm d() {
      return c(kl.g);
   }

   static ecm c(kl $$0) {
      return a($$0, erl.a);
   }

   static ecm d(kl $$0) {
      return new ecq($$0);
   }

   static ecm e() {
      return ecy.a;
   }

   static ecm e(kl $$0) {
      return new ecz($$0);
   }

   static ecm f() {
      return e(kl.g);
   }
}
