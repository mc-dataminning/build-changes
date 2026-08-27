import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface dod extends BiPredicate<csz, hx> {
   Codec<dod> b = kc.P.q().dispatch(dod::a, doe::codec);
   dod c = a(cvh.a);
   dod d = a(cvh.a, cvh.G);

   doe<?> a();

   static dod a(List<dod> $$0) {
      return new dob($$0);
   }

   static dod a(dod... $$0) {
      return a(List.of($$0));
   }

   static dod a(dod $$0, dod $$1) {
      return a(List.of($$0, $$1));
   }

   static dod b(List<dod> $$0) {
      return new doc($$0);
   }

   static dod b(dod... $$0) {
      return b(List.of($$0));
   }

   static dod b(dod $$0, dod $$1) {
      return b(List.of($$0, $$1));
   }

   static dod a(ja $$0, List<cvf> $$1) {
      return new doj($$0, ik.a(cvf::r, $$1));
   }

   static dod c(List<cvf> $$0) {
      return a(ja.g, $$0);
   }

   static dod a(ja $$0, cvf... $$1) {
      return a($$0, List.of($$1));
   }

   static dod a(cvf... $$0) {
      return a(ja.g, $$0);
   }

   static dod a(ja $$0, arz<cvf> $$1) {
      return new doi($$0, $$1);
   }

   static dod a(arz<cvf> $$0) {
      return a(ja.g, $$0);
   }

   static dod b(ja $$0, List<ecw> $$1) {
      return new dok($$0, ik.a(ecw::k, $$1));
   }

   static dod a(ja $$0, ecw... $$1) {
      return b($$0, List.of($$1));
   }

   static dod a(ecw... $$0) {
      return a(ja.g, $$0);
   }

   static dod a(dod $$0) {
      return new dol($$0);
   }

   static dod a(ja $$0) {
      return new dom($$0);
   }

   static dod b() {
      return a(ja.g);
   }

   static dod a(dhn $$0, ja $$1) {
      return new doq($$1, $$0);
   }

   static dod a(ja $$0, ib $$1) {
      return new dog($$0, $$1);
   }

   static dod a(ib $$0) {
      return a(ja.g, $$0);
   }

   static dod b(ja $$0) {
      return new don($$0);
   }

   static dod c() {
      return b(ja.g);
   }

   static dod d() {
      return c(ja.g);
   }

   static dod c(ja $$0) {
      return a($$0, ecy.a);
   }

   static dod d(ja $$0) {
      return new doh($$0);
   }

   static dod e() {
      return dop.a;
   }
}
