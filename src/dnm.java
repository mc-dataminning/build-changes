import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface dnm extends BiPredicate<csm, ht> {
   Codec<dnm> b = jy.P.q().dispatch(dnm::a, dnn::codec);
   dnm c = a(cuv.a);
   dnm d = a(cuv.a, cuv.G);

   dnn<?> a();

   static dnm a(List<dnm> $$0) {
      return new dnk($$0);
   }

   static dnm a(dnm... $$0) {
      return a(List.of($$0));
   }

   static dnm a(dnm $$0, dnm $$1) {
      return a(List.of($$0, $$1));
   }

   static dnm b(List<dnm> $$0) {
      return new dnl($$0);
   }

   static dnm b(dnm... $$0) {
      return b(List.of($$0));
   }

   static dnm b(dnm $$0, dnm $$1) {
      return b(List.of($$0, $$1));
   }

   static dnm a(iw $$0, List<cut> $$1) {
      return new dns($$0, ig.a(cut::r, $$1));
   }

   static dnm c(List<cut> $$0) {
      return a(iw.g, $$0);
   }

   static dnm a(iw $$0, cut... $$1) {
      return a($$0, List.of($$1));
   }

   static dnm a(cut... $$0) {
      return a(iw.g, $$0);
   }

   static dnm a(iw $$0, arr<cut> $$1) {
      return new dnr($$0, $$1);
   }

   static dnm a(arr<cut> $$0) {
      return a(iw.g, $$0);
   }

   static dnm b(iw $$0, List<ecf> $$1) {
      return new dnt($$0, ig.a(ecf::k, $$1));
   }

   static dnm a(iw $$0, ecf... $$1) {
      return b($$0, List.of($$1));
   }

   static dnm a(ecf... $$0) {
      return a(iw.g, $$0);
   }

   static dnm a(dnm $$0) {
      return new dnu($$0);
   }

   static dnm a(iw $$0) {
      return new dnv($$0);
   }

   static dnm b() {
      return a(iw.g);
   }

   static dnm a(dgw $$0, iw $$1) {
      return new dnz($$1, $$0);
   }

   static dnm a(iw $$0, hx $$1) {
      return new dnp($$0, $$1);
   }

   static dnm a(hx $$0) {
      return a(iw.g, $$0);
   }

   static dnm b(iw $$0) {
      return new dnw($$0);
   }

   static dnm c() {
      return b(iw.g);
   }

   static dnm d() {
      return c(iw.g);
   }

   static dnm c(iw $$0) {
      return a($$0, ech.a);
   }

   static dnm d(iw $$0) {
      return new dnq($$0);
   }

   static dnm e() {
      return dny.a;
   }
}
