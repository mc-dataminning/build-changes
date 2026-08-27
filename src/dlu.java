import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface dlu extends BiPredicate<cqk, gw> {
   Codec<dlu> b = jd.P.q().dispatch(dlu::a, dlv::codec);
   dlu c = a(csr.a);
   dlu d = a(csr.a, csr.G);

   dlv<?> a();

   static dlu a(List<dlu> $$0) {
      return new dls($$0);
   }

   static dlu a(dlu... $$0) {
      return a(List.of($$0));
   }

   static dlu a(dlu $$0, dlu $$1) {
      return a(List.of($$0, $$1));
   }

   static dlu b(List<dlu> $$0) {
      return new dlt($$0);
   }

   static dlu b(dlu... $$0) {
      return b(List.of($$0));
   }

   static dlu b(dlu $$0, dlu $$1) {
      return b(List.of($$0, $$1));
   }

   static dlu a(ib $$0, List<csq> $$1) {
      return new dma($$0, hk.a(csq::q, $$1));
   }

   static dlu c(List<csq> $$0) {
      return a(ib.g, $$0);
   }

   static dlu a(ib $$0, csq... $$1) {
      return a($$0, List.of($$1));
   }

   static dlu a(csq... $$0) {
      return a(ib.g, $$0);
   }

   static dlu a(ib $$0, aqd<csq> $$1) {
      return new dlz($$0, $$1);
   }

   static dlu a(aqd<csq> $$0) {
      return a(ib.g, $$0);
   }

   static dlu b(ib $$0, List<eag> $$1) {
      return new dmb($$0, hk.a(eag::k, $$1));
   }

   static dlu a(ib $$0, eag... $$1) {
      return b($$0, List.of($$1));
   }

   static dlu a(eag... $$0) {
      return a(ib.g, $$0);
   }

   static dlu a(dlu $$0) {
      return new dmc($$0);
   }

   static dlu a(ib $$0) {
      return new dmd($$0);
   }

   static dlu b() {
      return a(ib.g);
   }

   static dlu a(dfe $$0, ib $$1) {
      return new dmh($$1, $$0);
   }

   static dlu a(ib $$0, hc $$1) {
      return new dlx($$0, $$1);
   }

   static dlu a(hc $$0) {
      return a(ib.g, $$0);
   }

   static dlu b(ib $$0) {
      return new dme($$0);
   }

   static dlu c() {
      return b(ib.g);
   }

   static dlu d() {
      return c(ib.g);
   }

   static dlu c(ib $$0) {
      return a($$0, eai.a);
   }

   static dlu d(ib $$0) {
      return new dly($$0);
   }

   static dlu e() {
      return dmg.a;
   }
}
