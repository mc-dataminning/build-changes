import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface dzd extends BiPredicate<dcv, iz> {
   Codec<dzd> b = lp.O.q().dispatch(dzd::a, dze::codec);
   dzd c = a(dfd.a);
   dzd d = a(dfd.a, dfd.G);

   dze<?> a();

   static dzd a(List<dzd> $$0) {
      return new dzb($$0);
   }

   static dzd a(dzd... $$0) {
      return a(List.of($$0));
   }

   static dzd a(dzd $$0, dzd $$1) {
      return a(List.of($$0, $$1));
   }

   static dzd b(List<dzd> $$0) {
      return new dzc($$0);
   }

   static dzd b(dzd... $$0) {
      return b(List.of($$0));
   }

   static dzd b(dzd $$0, dzd $$1) {
      return b(List.of($$0, $$1));
   }

   static dzd a(kd $$0, List<dfb> $$1) {
      return new dzj($$0, jm.a(dfb::s, $$1));
   }

   static dzd c(List<dfb> $$0) {
      return a(kd.g, $$0);
   }

   static dzd a(kd $$0, dfb... $$1) {
      return a($$0, List.of($$1));
   }

   static dzd a(dfb... $$0) {
      return a(kd.g, $$0);
   }

   static dzd a(kd $$0, axf<dfb> $$1) {
      return new dzi($$0, $$1);
   }

   static dzd a(axf<dfb> $$0) {
      return a(kd.g, $$0);
   }

   static dzd b(kd $$0, List<enw> $$1) {
      return new dzk($$0, jm.a(enw::k, $$1));
   }

   static dzd a(kd $$0, enw... $$1) {
      return b($$0, List.of($$1));
   }

   static dzd a(enw... $$0) {
      return a(kd.g, $$0);
   }

   static dzd a(dzd $$0) {
      return new dzl($$0);
   }

   static dzd a(kd $$0) {
      return new dzm($$0);
   }

   static dzd b() {
      return a(kd.g);
   }

   static dzd a(dse $$0, kd $$1) {
      return new dzq($$1, $$0);
   }

   static dzd a(kd $$0, je $$1) {
      return new dzg($$0, $$1);
   }

   static dzd a(je $$0) {
      return a(kd.g, $$0);
   }

   static dzd b(kd $$0) {
      return new dzn($$0);
   }

   static dzd c() {
      return b(kd.g);
   }

   static dzd d() {
      return c(kd.g);
   }

   static dzd c(kd $$0) {
      return a($$0, eny.a);
   }

   static dzd d(kd $$0) {
      return new dzh($$0);
   }

   static dzd e() {
      return dzp.a;
   }
}
