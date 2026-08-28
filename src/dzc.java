import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface dzc extends BiPredicate<dcu, iz> {
   Codec<dzc> b = lp.O.q().dispatch(dzc::a, dzd::codec);
   dzc c = a(dfc.a);
   dzc d = a(dfc.a, dfc.G);

   dzd<?> a();

   static dzc a(List<dzc> $$0) {
      return new dza($$0);
   }

   static dzc a(dzc... $$0) {
      return a(List.of($$0));
   }

   static dzc a(dzc $$0, dzc $$1) {
      return a(List.of($$0, $$1));
   }

   static dzc b(List<dzc> $$0) {
      return new dzb($$0);
   }

   static dzc b(dzc... $$0) {
      return b(List.of($$0));
   }

   static dzc b(dzc $$0, dzc $$1) {
      return b(List.of($$0, $$1));
   }

   static dzc a(kd $$0, List<dfa> $$1) {
      return new dzi($$0, jm.a(dfa::s, $$1));
   }

   static dzc c(List<dfa> $$0) {
      return a(kd.g, $$0);
   }

   static dzc a(kd $$0, dfa... $$1) {
      return a($$0, List.of($$1));
   }

   static dzc a(dfa... $$0) {
      return a(kd.g, $$0);
   }

   static dzc a(kd $$0, axf<dfa> $$1) {
      return new dzh($$0, $$1);
   }

   static dzc a(axf<dfa> $$0) {
      return a(kd.g, $$0);
   }

   static dzc b(kd $$0, List<env> $$1) {
      return new dzj($$0, jm.a(env::k, $$1));
   }

   static dzc a(kd $$0, env... $$1) {
      return b($$0, List.of($$1));
   }

   static dzc a(env... $$0) {
      return a(kd.g, $$0);
   }

   static dzc a(dzc $$0) {
      return new dzk($$0);
   }

   static dzc a(kd $$0) {
      return new dzl($$0);
   }

   static dzc b() {
      return a(kd.g);
   }

   static dzc a(dsd $$0, kd $$1) {
      return new dzp($$1, $$0);
   }

   static dzc a(kd $$0, je $$1) {
      return new dzf($$0, $$1);
   }

   static dzc a(je $$0) {
      return a(kd.g, $$0);
   }

   static dzc b(kd $$0) {
      return new dzm($$0);
   }

   static dzc c() {
      return b(kd.g);
   }

   static dzc d() {
      return c(kd.g);
   }

   static dzc c(kd $$0) {
      return a($$0, enx.a);
   }

   static dzc d(kd $$0) {
      return new dzg($$0);
   }

   static dzc e() {
      return dzo.a;
   }
}
