import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface eeq extends BiPredicate<dhx, jh> {
   Codec<eeq> b = ma.M.q().dispatch(eeq::a, eer::codec);
   eeq c = a(dkf.a);
   eeq d = a(dkf.a, dkf.J);

   eer<?> a();

   static eeq a(List<eeq> $$0) {
      return new eeo($$0);
   }

   static eeq a(eeq... $$0) {
      return a(List.of($$0));
   }

   static eeq a(eeq $$0, eeq $$1) {
      return a(List.of($$0, $$1));
   }

   static eeq b(List<eeq> $$0) {
      return new eep($$0);
   }

   static eeq b(eeq... $$0) {
      return b(List.of($$0));
   }

   static eeq b(eeq $$0, eeq $$1) {
      return b(List.of($$0, $$1));
   }

   static eeq a(kl $$0, List<dkd> $$1) {
      return new eew($$0, ju.a(dkd::p, $$1));
   }

   static eeq c(List<dkd> $$0) {
      return a(kl.h, $$0);
   }

   static eeq a(kl $$0, dkd... $$1) {
      return a($$0, List.of($$1));
   }

   static eeq a(dkd... $$0) {
      return a(kl.h, $$0);
   }

   static eeq a(kl $$0, aya<dkd> $$1) {
      return new eev($$0, $$1);
   }

   static eeq a(aya<dkd> $$0) {
      return a(kl.h, $$0);
   }

   static eeq b(kl $$0, List<etp> $$1) {
      return new eex($$0, ju.a(etp::k, $$1));
   }

   static eeq a(kl $$0, etp... $$1) {
      return b($$0, List.of($$1));
   }

   static eeq a(etp... $$0) {
      return a(kl.h, $$0);
   }

   static eeq a(eeq $$0) {
      return new eey($$0);
   }

   static eeq a(kl $$0) {
      return new eez($$0);
   }

   static eeq b() {
      return a(kl.h);
   }

   static eeq a(dxo $$0, kl $$1) {
      return new efe($$1, $$0);
   }

   static eeq a(kl $$0, jm $$1) {
      return new eet($$0, $$1);
   }

   static eeq a(jm $$0) {
      return a(kl.h, $$0);
   }

   static eeq b(kl $$0) {
      return new efa($$0);
   }

   static eeq c() {
      return b(kl.h);
   }

   static eeq d() {
      return c(kl.h);
   }

   static eeq c(kl $$0) {
      return a($$0, etr.a);
   }

   static eeq d(kl $$0) {
      return new eeu($$0);
   }

   static eeq e() {
      return efc.a;
   }

   static eeq e(kl $$0) {
      return new efd($$0);
   }

   static eeq f() {
      return e(kl.h);
   }
}
