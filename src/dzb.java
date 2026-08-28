import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface dzb extends BiPredicate<dct, iz> {
   Codec<dzb> b = lp.O.q().dispatch(dzb::a, dzc::codec);
   dzb c = a(dfb.a);
   dzb d = a(dfb.a, dfb.G);

   dzc<?> a();

   static dzb a(List<dzb> $$0) {
      return new dyz($$0);
   }

   static dzb a(dzb... $$0) {
      return a(List.of($$0));
   }

   static dzb a(dzb $$0, dzb $$1) {
      return a(List.of($$0, $$1));
   }

   static dzb b(List<dzb> $$0) {
      return new dza($$0);
   }

   static dzb b(dzb... $$0) {
      return b(List.of($$0));
   }

   static dzb b(dzb $$0, dzb $$1) {
      return b(List.of($$0, $$1));
   }

   static dzb a(kd $$0, List<dez> $$1) {
      return new dzh($$0, jm.a(dez::s, $$1));
   }

   static dzb c(List<dez> $$0) {
      return a(kd.g, $$0);
   }

   static dzb a(kd $$0, dez... $$1) {
      return a($$0, List.of($$1));
   }

   static dzb a(dez... $$0) {
      return a(kd.g, $$0);
   }

   static dzb a(kd $$0, axf<dez> $$1) {
      return new dzg($$0, $$1);
   }

   static dzb a(axf<dez> $$0) {
      return a(kd.g, $$0);
   }

   static dzb b(kd $$0, List<enu> $$1) {
      return new dzi($$0, jm.a(enu::k, $$1));
   }

   static dzb a(kd $$0, enu... $$1) {
      return b($$0, List.of($$1));
   }

   static dzb a(enu... $$0) {
      return a(kd.g, $$0);
   }

   static dzb a(dzb $$0) {
      return new dzj($$0);
   }

   static dzb a(kd $$0) {
      return new dzk($$0);
   }

   static dzb b() {
      return a(kd.g);
   }

   static dzb a(dsc $$0, kd $$1) {
      return new dzo($$1, $$0);
   }

   static dzb a(kd $$0, je $$1) {
      return new dze($$0, $$1);
   }

   static dzb a(je $$0) {
      return a(kd.g, $$0);
   }

   static dzb b(kd $$0) {
      return new dzl($$0);
   }

   static dzb c() {
      return b(kd.g);
   }

   static dzb d() {
      return c(kd.g);
   }

   static dzb c(kd $$0) {
      return a($$0, enw.a);
   }

   static dzb d(kd $$0) {
      return new dzf($$0);
   }

   static dzb e() {
      return dzn.a;
   }
}
