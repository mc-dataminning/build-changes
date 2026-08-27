import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface dmb extends BiPredicate<cqr, gw> {
   Codec<dmb> b = jd.P.q().dispatch(dmb::a, dmc::codec);
   dmb c = a(csy.a);
   dmb d = a(csy.a, csy.G);

   dmc<?> a();

   static dmb a(List<dmb> $$0) {
      return new dlz($$0);
   }

   static dmb a(dmb... $$0) {
      return a(List.of($$0));
   }

   static dmb a(dmb $$0, dmb $$1) {
      return a(List.of($$0, $$1));
   }

   static dmb b(List<dmb> $$0) {
      return new dma($$0);
   }

   static dmb b(dmb... $$0) {
      return b(List.of($$0));
   }

   static dmb b(dmb $$0, dmb $$1) {
      return b(List.of($$0, $$1));
   }

   static dmb a(ib $$0, List<csx> $$1) {
      return new dmh($$0, hk.a(csx::q, $$1));
   }

   static dmb c(List<csx> $$0) {
      return a(ib.g, $$0);
   }

   static dmb a(ib $$0, csx... $$1) {
      return a($$0, List.of($$1));
   }

   static dmb a(csx... $$0) {
      return a(ib.g, $$0);
   }

   static dmb a(ib $$0, aqj<csx> $$1) {
      return new dmg($$0, $$1);
   }

   static dmb a(aqj<csx> $$0) {
      return a(ib.g, $$0);
   }

   static dmb b(ib $$0, List<ean> $$1) {
      return new dmi($$0, hk.a(ean::k, $$1));
   }

   static dmb a(ib $$0, ean... $$1) {
      return b($$0, List.of($$1));
   }

   static dmb a(ean... $$0) {
      return a(ib.g, $$0);
   }

   static dmb a(dmb $$0) {
      return new dmj($$0);
   }

   static dmb a(ib $$0) {
      return new dmk($$0);
   }

   static dmb b() {
      return a(ib.g);
   }

   static dmb a(dfl $$0, ib $$1) {
      return new dmo($$1, $$0);
   }

   static dmb a(ib $$0, hc $$1) {
      return new dme($$0, $$1);
   }

   static dmb a(hc $$0) {
      return a(ib.g, $$0);
   }

   static dmb b(ib $$0) {
      return new dml($$0);
   }

   static dmb c() {
      return b(ib.g);
   }

   static dmb d() {
      return c(ib.g);
   }

   static dmb c(ib $$0) {
      return a($$0, eap.a);
   }

   static dmb d(ib $$0) {
      return new dmf($$0);
   }

   static dmb e() {
      return dmn.a;
   }
}
