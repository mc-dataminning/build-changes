import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface ehf extends BiPredicate<dju, iu> {
   Codec<ehf> b = mf.M.q().dispatch(ehf::a, ehg::codec);
   ehf c = a(dmc.a);
   ehf d = a(dmc.a, dmc.J);

   ehg<?> a();

   static ehf a(List<ehf> $$0) {
      return new ehd($$0);
   }

   static ehf a(ehf... $$0) {
      return a(List.of($$0));
   }

   static ehf a(ehf $$0, ehf $$1) {
      return a(List.of($$0, $$1));
   }

   static ehf b(List<ehf> $$0) {
      return new ehe($$0);
   }

   static ehf b(ehf... $$0) {
      return b(List.of($$0));
   }

   static ehf b(ehf $$0, ehf $$1) {
      return b(List.of($$0, $$1));
   }

   static ehf a(jz $$0, List<dma> $$1) {
      return new ehl($$0, ji.a(dma::p, $$1));
   }

   static ehf c(List<dma> $$0) {
      return a(jz.i, $$0);
   }

   static ehf a(jz $$0, dma... $$1) {
      return a($$0, List.of($$1));
   }

   static ehf a(dma... $$0) {
      return a(jz.i, $$0);
   }

   static ehf a(jz $$0, axr<dma> $$1) {
      return new ehk($$0, $$1);
   }

   static ehf a(axr<dma> $$0) {
      return a(jz.i, $$0);
   }

   static ehf b(jz $$0, List<ewf> $$1) {
      return new ehm($$0, ji.a(ewf::k, $$1));
   }

   static ehf a(jz $$0, ewf... $$1) {
      return b($$0, List.of($$1));
   }

   static ehf a(ewf... $$0) {
      return a(jz.i, $$0);
   }

   static ehf a(ehf $$0) {
      return new ehn($$0);
   }

   static ehf a(jz $$0) {
      return new eho($$0);
   }

   static ehf b() {
      return a(jz.i);
   }

   static ehf a(dzz $$0, jz $$1) {
      return new eht($$1, $$0);
   }

   static ehf a(jz $$0, ja $$1) {
      return new ehi($$0, $$1);
   }

   static ehf a(ja $$0) {
      return a(jz.i, $$0);
   }

   static ehf b(jz $$0) {
      return new ehp($$0);
   }

   static ehf c() {
      return b(jz.i);
   }

   static ehf d() {
      return c(jz.i);
   }

   static ehf c(jz $$0) {
      return a($$0, ewh.a);
   }

   static ehf d(jz $$0) {
      return new ehj($$0);
   }

   static ehf e() {
      return ehr.a;
   }

   static ehf e(jz $$0) {
      return new ehs($$0);
   }

   static ehf f() {
      return e(jz.i);
   }
}
