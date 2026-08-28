import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface ebr extends BiPredicate<dfd, je> {
   Codec<ebr> b = lu.M.q().dispatch(ebr::a, ebs::codec);
   ebr c = a(dhl.a);
   ebr d = a(dhl.a, dhl.G);

   ebs<?> a();

   static ebr a(List<ebr> $$0) {
      return new ebp($$0);
   }

   static ebr a(ebr... $$0) {
      return a(List.of($$0));
   }

   static ebr a(ebr $$0, ebr $$1) {
      return a(List.of($$0, $$1));
   }

   static ebr b(List<ebr> $$0) {
      return new ebq($$0);
   }

   static ebr b(ebr... $$0) {
      return b(List.of($$0));
   }

   static ebr b(ebr $$0, ebr $$1) {
      return b(List.of($$0, $$1));
   }

   static ebr a(ki $$0, List<dhj> $$1) {
      return new ebx($$0, jr.a(dhj::s, $$1));
   }

   static ebr c(List<dhj> $$0) {
      return a(ki.g, $$0);
   }

   static ebr a(ki $$0, dhj... $$1) {
      return a($$0, List.of($$1));
   }

   static ebr a(dhj... $$0) {
      return a(ki.g, $$0);
   }

   static ebr a(ki $$0, axj<dhj> $$1) {
      return new ebw($$0, $$1);
   }

   static ebr a(axj<dhj> $$0) {
      return a(ki.g, $$0);
   }

   static ebr b(ki $$0, List<eqo> $$1) {
      return new eby($$0, jr.a(eqo::k, $$1));
   }

   static ebr a(ki $$0, eqo... $$1) {
      return b($$0, List.of($$1));
   }

   static ebr a(eqo... $$0) {
      return a(ki.g, $$0);
   }

   static ebr a(ebr $$0) {
      return new ebz($$0);
   }

   static ebr a(ki $$0) {
      return new eca($$0);
   }

   static ebr b() {
      return a(ki.g);
   }

   static ebr a(duo $$0, ki $$1) {
      return new ecf($$1, $$0);
   }

   static ebr a(ki $$0, jj $$1) {
      return new ebu($$0, $$1);
   }

   static ebr a(jj $$0) {
      return a(ki.g, $$0);
   }

   static ebr b(ki $$0) {
      return new ecb($$0);
   }

   static ebr c() {
      return b(ki.g);
   }

   static ebr d() {
      return c(ki.g);
   }

   static ebr c(ki $$0) {
      return a($$0, eqq.a);
   }

   static ebr d(ki $$0) {
      return new ebv($$0);
   }

   static ebr e() {
      return ecd.a;
   }

   static ebr e(ki $$0) {
      return new ece($$0);
   }

   static ebr f() {
      return e(ki.g);
   }
}
