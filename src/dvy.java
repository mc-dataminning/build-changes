import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface dvy extends BiPredicate<czs, ib> {
   Codec<dvy> b = kr.O.q().dispatch(dvy::a, dvz::codec);
   dvy c = a(dca.a);
   dvy d = a(dca.a, dca.G);

   dvz<?> a();

   static dvy a(List<dvy> $$0) {
      return new dvw($$0);
   }

   static dvy a(dvy... $$0) {
      return a(List.of($$0));
   }

   static dvy a(dvy $$0, dvy $$1) {
      return a(List.of($$0, $$1));
   }

   static dvy b(List<dvy> $$0) {
      return new dvx($$0);
   }

   static dvy b(dvy... $$0) {
      return b(List.of($$0));
   }

   static dvy b(dvy $$0, dvy $$1) {
      return b(List.of($$0, $$1));
   }

   static dvy a(jg $$0, List<dby> $$1) {
      return new dwe($$0, ip.a(dby::r, $$1));
   }

   static dvy c(List<dby> $$0) {
      return a(jg.g, $$0);
   }

   static dvy a(jg $$0, dby... $$1) {
      return a($$0, List.of($$1));
   }

   static dvy a(dby... $$0) {
      return a(jg.g, $$0);
   }

   static dvy a(jg $$0, avr<dby> $$1) {
      return new dwd($$0, $$1);
   }

   static dvy a(avr<dby> $$0) {
      return a(jg.g, $$0);
   }

   static dvy b(jg $$0, List<ekr> $$1) {
      return new dwf($$0, ip.a(ekr::k, $$1));
   }

   static dvy a(jg $$0, ekr... $$1) {
      return b($$0, List.of($$1));
   }

   static dvy a(ekr... $$0) {
      return a(jg.g, $$0);
   }

   static dvy a(dvy $$0) {
      return new dwg($$0);
   }

   static dvy a(jg $$0) {
      return new dwh($$0);
   }

   static dvy b() {
      return a(jg.g);
   }

   static dvy a(doz $$0, jg $$1) {
      return new dwl($$1, $$0);
   }

   static dvy a(jg $$0, ih $$1) {
      return new dwb($$0, $$1);
   }

   static dvy a(ih $$0) {
      return a(jg.g, $$0);
   }

   static dvy b(jg $$0) {
      return new dwi($$0);
   }

   static dvy c() {
      return b(jg.g);
   }

   static dvy d() {
      return c(jg.g);
   }

   static dvy c(jg $$0) {
      return a($$0, ekt.a);
   }

   static dvy d(jg $$0) {
      return new dwc($$0);
   }

   static dvy e() {
      return dwk.a;
   }
}
