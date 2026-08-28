import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface ecx extends BiPredicate<dgk, jh> {
   Codec<ecx> b = lz.M.q().dispatch(ecx::a, ecy::codec);
   ecx c = a(dis.a);
   ecx d = a(dis.a, dis.G);

   ecy<?> a();

   static ecx a(List<ecx> $$0) {
      return new ecv($$0);
   }

   static ecx a(ecx... $$0) {
      return a(List.of($$0));
   }

   static ecx a(ecx $$0, ecx $$1) {
      return a(List.of($$0, $$1));
   }

   static ecx b(List<ecx> $$0) {
      return new ecw($$0);
   }

   static ecx b(ecx... $$0) {
      return b(List.of($$0));
   }

   static ecx b(ecx $$0, ecx $$1) {
      return b(List.of($$0, $$1));
   }

   static ecx a(kl $$0, List<diq> $$1) {
      return new edd($$0, ju.a(diq::p, $$1));
   }

   static ecx c(List<diq> $$0) {
      return a(kl.g, $$0);
   }

   static ecx a(kl $$0, diq... $$1) {
      return a($$0, List.of($$1));
   }

   static ecx a(diq... $$0) {
      return a(kl.g, $$0);
   }

   static ecx a(kl $$0, axs<diq> $$1) {
      return new edc($$0, $$1);
   }

   static ecx a(axs<diq> $$0) {
      return a(kl.g, $$0);
   }

   static ecx b(kl $$0, List<eru> $$1) {
      return new ede($$0, ju.a(eru::k, $$1));
   }

   static ecx a(kl $$0, eru... $$1) {
      return b($$0, List.of($$1));
   }

   static ecx a(eru... $$0) {
      return a(kl.g, $$0);
   }

   static ecx a(ecx $$0) {
      return new edf($$0);
   }

   static ecx a(kl $$0) {
      return new edg($$0);
   }

   static ecx b() {
      return a(kl.g);
   }

   static ecx a(dvv $$0, kl $$1) {
      return new edl($$1, $$0);
   }

   static ecx a(kl $$0, jm $$1) {
      return new eda($$0, $$1);
   }

   static ecx a(jm $$0) {
      return a(kl.g, $$0);
   }

   static ecx b(kl $$0) {
      return new edh($$0);
   }

   static ecx c() {
      return b(kl.g);
   }

   static ecx d() {
      return c(kl.g);
   }

   static ecx c(kl $$0) {
      return a($$0, erw.a);
   }

   static ecx d(kl $$0) {
      return new edb($$0);
   }

   static ecx e() {
      return edj.a;
   }

   static ecx e(kl $$0) {
      return new edk($$0);
   }

   static ecx f() {
      return e(kl.g);
   }
}
