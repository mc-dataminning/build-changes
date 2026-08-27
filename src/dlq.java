import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface dlq extends BiPredicate<cqg, gu> {
   Codec<dlq> b = jb.P.q().dispatch(dlq::a, dlr::codec);
   dlq c = a(csn.a);
   dlq d = a(csn.a, csn.G);

   dlr<?> a();

   static dlq a(List<dlq> $$0) {
      return new dlo($$0);
   }

   static dlq a(dlq... $$0) {
      return a(List.of($$0));
   }

   static dlq a(dlq $$0, dlq $$1) {
      return a(List.of($$0, $$1));
   }

   static dlq b(List<dlq> $$0) {
      return new dlp($$0);
   }

   static dlq b(dlq... $$0) {
      return b(List.of($$0));
   }

   static dlq b(dlq $$0, dlq $$1) {
      return b(List.of($$0, $$1));
   }

   static dlq a(hz $$0, List<csm> $$1) {
      return new dlw($$0, hi.a(csm::q, $$1));
   }

   static dlq c(List<csm> $$0) {
      return a(hz.g, $$0);
   }

   static dlq a(hz $$0, csm... $$1) {
      return a($$0, List.of($$1));
   }

   static dlq a(csm... $$0) {
      return a(hz.g, $$0);
   }

   static dlq a(hz $$0, aqa<csm> $$1) {
      return new dlv($$0, $$1);
   }

   static dlq a(aqa<csm> $$0) {
      return a(hz.g, $$0);
   }

   static dlq b(hz $$0, List<eac> $$1) {
      return new dlx($$0, hi.a(eac::k, $$1));
   }

   static dlq a(hz $$0, eac... $$1) {
      return b($$0, List.of($$1));
   }

   static dlq a(eac... $$0) {
      return a(hz.g, $$0);
   }

   static dlq a(dlq $$0) {
      return new dly($$0);
   }

   static dlq a(hz $$0) {
      return new dlz($$0);
   }

   static dlq b() {
      return a(hz.g);
   }

   static dlq a(dfa $$0, hz $$1) {
      return new dmd($$1, $$0);
   }

   static dlq a(hz $$0, ha $$1) {
      return new dlt($$0, $$1);
   }

   static dlq a(ha $$0) {
      return a(hz.g, $$0);
   }

   static dlq b(hz $$0) {
      return new dma($$0);
   }

   static dlq c() {
      return b(hz.g);
   }

   static dlq d() {
      return c(hz.g);
   }

   static dlq c(hz $$0) {
      return a($$0, eae.a);
   }

   static dlq d(hz $$0) {
      return new dlu($$0);
   }

   static dlq e() {
      return dmc.a;
   }
}
