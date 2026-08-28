import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface eiw extends BiPredicate<dli, iw> {
   Codec<eiw> b = mh.M.q().dispatch(eiw::a, eix::codec);
   eiw c = a(dnq.a);
   eiw d = a(dnq.a, dnq.J);

   eix<?> a();

   static eiw a(List<eiw> $$0) {
      return new eiu($$0);
   }

   static eiw a(eiw... $$0) {
      return a(List.of($$0));
   }

   static eiw a(eiw $$0, eiw $$1) {
      return a(List.of($$0, $$1));
   }

   static eiw b(List<eiw> $$0) {
      return new eiv($$0);
   }

   static eiw b(eiw... $$0) {
      return b(List.of($$0));
   }

   static eiw b(eiw $$0, eiw $$1) {
      return b(List.of($$0, $$1));
   }

   static eiw a(kb $$0, List<dno> $$1) {
      return new ejc($$0, jk.a(dno::p, $$1));
   }

   static eiw c(List<dno> $$0) {
      return a(kb.i, $$0);
   }

   static eiw a(kb $$0, dno... $$1) {
      return a($$0, List.of($$1));
   }

   static eiw a(dno... $$0) {
      return a(kb.i, $$0);
   }

   static eiw a(kb $$0, ayc<dno> $$1) {
      return new ejb($$0, $$1);
   }

   static eiw a(ayc<dno> $$0) {
      return a(kb.i, $$0);
   }

   static eiw b(kb $$0, List<exz> $$1) {
      return new ejd($$0, jk.a(exz::k, $$1));
   }

   static eiw a(kb $$0, exz... $$1) {
      return b($$0, List.of($$1));
   }

   static eiw a(exz... $$0) {
      return a(kb.i, $$0);
   }

   static eiw a(eiw $$0) {
      return new eje($$0);
   }

   static eiw a(kb $$0) {
      return new ejf($$0);
   }

   static eiw b() {
      return a(kb.i);
   }

   static eiw a(ebq $$0, kb $$1) {
      return new ejk($$1, $$0);
   }

   static eiw a(kb $$0, jc $$1) {
      return new eiz($$0, $$1);
   }

   static eiw a(jc $$0) {
      return a(kb.i, $$0);
   }

   static eiw b(kb $$0) {
      return new ejg($$0);
   }

   static eiw c() {
      return b(kb.i);
   }

   static eiw d() {
      return c(kb.i);
   }

   static eiw c(kb $$0) {
      return a($$0, eyb.a);
   }

   static eiw d(kb $$0) {
      return new eja($$0);
   }

   static eiw e() {
      return eji.a;
   }

   static eiw e(kb $$0) {
      return new ejj($$0);
   }

   static eiw f() {
      return e(kb.i);
   }
}
