import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface egu extends BiPredicate<djo, iu> {
   Codec<egu> b = mf.M.q().dispatch(egu::a, egv::codec);
   egu c = a(dlw.a);
   egu d = a(dlw.a, dlw.J);

   egv<?> a();

   static egu a(List<egu> $$0) {
      return new egs($$0);
   }

   static egu a(egu... $$0) {
      return a(List.of($$0));
   }

   static egu a(egu $$0, egu $$1) {
      return a(List.of($$0, $$1));
   }

   static egu b(List<egu> $$0) {
      return new egt($$0);
   }

   static egu b(egu... $$0) {
      return b(List.of($$0));
   }

   static egu b(egu $$0, egu $$1) {
      return b(List.of($$0, $$1));
   }

   static egu a(jz $$0, List<dlu> $$1) {
      return new eha($$0, ji.a(dlu::p, $$1));
   }

   static egu c(List<dlu> $$0) {
      return a(jz.i, $$0);
   }

   static egu a(jz $$0, dlu... $$1) {
      return a($$0, List.of($$1));
   }

   static egu a(dlu... $$0) {
      return a(jz.i, $$0);
   }

   static egu a(jz $$0, axp<dlu> $$1) {
      return new egz($$0, $$1);
   }

   static egu a(axp<dlu> $$0) {
      return a(jz.i, $$0);
   }

   static egu b(jz $$0, List<evu> $$1) {
      return new ehb($$0, ji.a(evu::k, $$1));
   }

   static egu a(jz $$0, evu... $$1) {
      return b($$0, List.of($$1));
   }

   static egu a(evu... $$0) {
      return a(jz.i, $$0);
   }

   static egu a(egu $$0) {
      return new ehc($$0);
   }

   static egu a(jz $$0) {
      return new ehd($$0);
   }

   static egu b() {
      return a(jz.i);
   }

   static egu a(dzo $$0, jz $$1) {
      return new ehi($$1, $$0);
   }

   static egu a(jz $$0, ja $$1) {
      return new egx($$0, $$1);
   }

   static egu a(ja $$0) {
      return a(jz.i, $$0);
   }

   static egu b(jz $$0) {
      return new ehe($$0);
   }

   static egu c() {
      return b(jz.i);
   }

   static egu d() {
      return c(jz.i);
   }

   static egu c(jz $$0) {
      return a($$0, evw.a);
   }

   static egu d(jz $$0) {
      return new egy($$0);
   }

   static egu e() {
      return ehg.a;
   }

   static egu e(jz $$0) {
      return new ehh($$0);
   }

   static egu f() {
      return e(jz.i);
   }
}
