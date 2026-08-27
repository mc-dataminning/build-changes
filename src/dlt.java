import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface dlt extends BiPredicate<cqv, gw> {
   Codec<dlt> b = jb.P.q().dispatch(dlt::a, dlu::codec);
   dlt c = a(cte.a);
   dlt d = a(cte.a, cte.G);

   dlu<?> a();

   static dlt a(List<dlt> $$0) {
      return new dlr($$0);
   }

   static dlt a(dlt... $$0) {
      return a(List.of($$0));
   }

   static dlt a(dlt $$0, dlt $$1) {
      return a(List.of($$0, $$1));
   }

   static dlt b(List<dlt> $$0) {
      return new dls($$0);
   }

   static dlt b(dlt... $$0) {
      return b(List.of($$0));
   }

   static dlt b(dlt $$0, dlt $$1) {
      return b(List.of($$0, $$1));
   }

   static dlt a(hy $$0, List<ctc> $$1) {
      return new dlz($$0, hi.a(ctc::r, $$1));
   }

   static dlt c(List<ctc> $$0) {
      return a(hy.g, $$0);
   }

   static dlt a(hy $$0, ctc... $$1) {
      return a($$0, List.of($$1));
   }

   static dlt a(ctc... $$0) {
      return a(hy.g, $$0);
   }

   static dlt a(hy $$0, aqk<ctc> $$1) {
      return new dly($$0, $$1);
   }

   static dlt a(aqk<ctc> $$0) {
      return a(hy.g, $$0);
   }

   static dlt b(hy $$0, List<eaf> $$1) {
      return new dma($$0, hi.a(eaf::k, $$1));
   }

   static dlt a(hy $$0, eaf... $$1) {
      return b($$0, List.of($$1));
   }

   static dlt a(eaf... $$0) {
      return a(hy.g, $$0);
   }

   static dlt a(dlt $$0) {
      return new dmb($$0);
   }

   static dlt a(hy $$0) {
      return new dmc($$0);
   }

   static dlt b() {
      return a(hy.g);
   }

   static dlt a(dfd $$0, hy $$1) {
      return new dmg($$1, $$0);
   }

   static dlt a(hy $$0, ha $$1) {
      return new dlw($$0, $$1);
   }

   static dlt a(ha $$0) {
      return a(hy.g, $$0);
   }

   static dlt b(hy $$0) {
      return new dmd($$0);
   }

   static dlt c() {
      return b(hy.g);
   }

   static dlt d() {
      return c(hy.g);
   }

   static dlt c(hy $$0) {
      return a($$0, eah.a);
   }

   static dlt d(hy $$0) {
      return new dlx($$0);
   }

   static dlt e() {
      return dmf.a;
   }
}
