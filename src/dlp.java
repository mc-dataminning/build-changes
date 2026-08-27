import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface dlp extends BiPredicate<cqf, gu> {
   Codec<dlp> b = jb.P.q().dispatch(dlp::a, dlq::codec);
   dlp c = a(csm.a);
   dlp d = a(csm.a, csm.G);

   dlq<?> a();

   static dlp a(List<dlp> $$0) {
      return new dln($$0);
   }

   static dlp a(dlp... $$0) {
      return a(List.of($$0));
   }

   static dlp a(dlp $$0, dlp $$1) {
      return a(List.of($$0, $$1));
   }

   static dlp b(List<dlp> $$0) {
      return new dlo($$0);
   }

   static dlp b(dlp... $$0) {
      return b(List.of($$0));
   }

   static dlp b(dlp $$0, dlp $$1) {
      return b(List.of($$0, $$1));
   }

   static dlp a(hz $$0, List<csl> $$1) {
      return new dlv($$0, hi.a(csl::q, $$1));
   }

   static dlp c(List<csl> $$0) {
      return a(hz.g, $$0);
   }

   static dlp a(hz $$0, csl... $$1) {
      return a($$0, List.of($$1));
   }

   static dlp a(csl... $$0) {
      return a(hz.g, $$0);
   }

   static dlp a(hz $$0, aqa<csl> $$1) {
      return new dlu($$0, $$1);
   }

   static dlp a(aqa<csl> $$0) {
      return a(hz.g, $$0);
   }

   static dlp b(hz $$0, List<eab> $$1) {
      return new dlw($$0, hi.a(eab::k, $$1));
   }

   static dlp a(hz $$0, eab... $$1) {
      return b($$0, List.of($$1));
   }

   static dlp a(eab... $$0) {
      return a(hz.g, $$0);
   }

   static dlp a(dlp $$0) {
      return new dlx($$0);
   }

   static dlp a(hz $$0) {
      return new dly($$0);
   }

   static dlp b() {
      return a(hz.g);
   }

   static dlp a(dez $$0, hz $$1) {
      return new dmc($$1, $$0);
   }

   static dlp a(hz $$0, ha $$1) {
      return new dls($$0, $$1);
   }

   static dlp a(ha $$0) {
      return a(hz.g, $$0);
   }

   static dlp b(hz $$0) {
      return new dlz($$0);
   }

   static dlp c() {
      return b(hz.g);
   }

   static dlp d() {
      return c(hz.g);
   }

   static dlp c(hz $$0) {
      return a($$0, ead.a);
   }

   static dlp d(hz $$0) {
      return new dlt($$0);
   }

   static dlp e() {
      return dmb.a;
   }
}
