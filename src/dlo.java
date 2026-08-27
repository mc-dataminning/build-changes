import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface dlo extends BiPredicate<cqe, gv> {
   Codec<dlo> b = jc.P.q().dispatch(dlo::a, dlp::codec);
   dlo c = a(csl.a);
   dlo d = a(csl.a, csl.G);

   dlp<?> a();

   static dlo a(List<dlo> $$0) {
      return new dlm($$0);
   }

   static dlo a(dlo... $$0) {
      return a(List.of($$0));
   }

   static dlo a(dlo $$0, dlo $$1) {
      return a(List.of($$0, $$1));
   }

   static dlo b(List<dlo> $$0) {
      return new dln($$0);
   }

   static dlo b(dlo... $$0) {
      return b(List.of($$0));
   }

   static dlo b(dlo $$0, dlo $$1) {
      return b(List.of($$0, $$1));
   }

   static dlo a(ia $$0, List<csk> $$1) {
      return new dlu($$0, hj.a(csk::q, $$1));
   }

   static dlo c(List<csk> $$0) {
      return a(ia.g, $$0);
   }

   static dlo a(ia $$0, csk... $$1) {
      return a($$0, List.of($$1));
   }

   static dlo a(csk... $$0) {
      return a(ia.g, $$0);
   }

   static dlo a(ia $$0, apy<csk> $$1) {
      return new dlt($$0, $$1);
   }

   static dlo a(apy<csk> $$0) {
      return a(ia.g, $$0);
   }

   static dlo b(ia $$0, List<eaa> $$1) {
      return new dlv($$0, hj.a(eaa::k, $$1));
   }

   static dlo a(ia $$0, eaa... $$1) {
      return b($$0, List.of($$1));
   }

   static dlo a(eaa... $$0) {
      return a(ia.g, $$0);
   }

   static dlo a(dlo $$0) {
      return new dlw($$0);
   }

   static dlo a(ia $$0) {
      return new dlx($$0);
   }

   static dlo b() {
      return a(ia.g);
   }

   static dlo a(dey $$0, ia $$1) {
      return new dmb($$1, $$0);
   }

   static dlo a(ia $$0, hb $$1) {
      return new dlr($$0, $$1);
   }

   static dlo a(hb $$0) {
      return a(ia.g, $$0);
   }

   static dlo b(ia $$0) {
      return new dly($$0);
   }

   static dlo c() {
      return b(ia.g);
   }

   static dlo d() {
      return c(ia.g);
   }

   static dlo c(ia $$0) {
      return a($$0, eac.a);
   }

   static dlo d(ia $$0) {
      return new dls($$0);
   }

   static dlo e() {
      return dma.a;
   }
}
