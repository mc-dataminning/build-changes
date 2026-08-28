import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface dza extends BiPredicate<dcs, iz> {
   Codec<dza> b = lp.O.q().dispatch(dza::a, dzb::codec);
   dza c = a(dfa.a);
   dza d = a(dfa.a, dfa.G);

   dzb<?> a();

   static dza a(List<dza> $$0) {
      return new dyy($$0);
   }

   static dza a(dza... $$0) {
      return a(List.of($$0));
   }

   static dza a(dza $$0, dza $$1) {
      return a(List.of($$0, $$1));
   }

   static dza b(List<dza> $$0) {
      return new dyz($$0);
   }

   static dza b(dza... $$0) {
      return b(List.of($$0));
   }

   static dza b(dza $$0, dza $$1) {
      return b(List.of($$0, $$1));
   }

   static dza a(kd $$0, List<dey> $$1) {
      return new dzg($$0, jm.a(dey::s, $$1));
   }

   static dza c(List<dey> $$0) {
      return a(kd.g, $$0);
   }

   static dza a(kd $$0, dey... $$1) {
      return a($$0, List.of($$1));
   }

   static dza a(dey... $$0) {
      return a(kd.g, $$0);
   }

   static dza a(kd $$0, axe<dey> $$1) {
      return new dzf($$0, $$1);
   }

   static dza a(axe<dey> $$0) {
      return a(kd.g, $$0);
   }

   static dza b(kd $$0, List<ent> $$1) {
      return new dzh($$0, jm.a(ent::k, $$1));
   }

   static dza a(kd $$0, ent... $$1) {
      return b($$0, List.of($$1));
   }

   static dza a(ent... $$0) {
      return a(kd.g, $$0);
   }

   static dza a(dza $$0) {
      return new dzi($$0);
   }

   static dza a(kd $$0) {
      return new dzj($$0);
   }

   static dza b() {
      return a(kd.g);
   }

   static dza a(dsb $$0, kd $$1) {
      return new dzn($$1, $$0);
   }

   static dza a(kd $$0, je $$1) {
      return new dzd($$0, $$1);
   }

   static dza a(je $$0) {
      return a(kd.g, $$0);
   }

   static dza b(kd $$0) {
      return new dzk($$0);
   }

   static dza c() {
      return b(kd.g);
   }

   static dza d() {
      return c(kd.g);
   }

   static dza c(kd $$0) {
      return a($$0, env.a);
   }

   static dza d(kd $$0) {
      return new dze($$0);
   }

   static dza e() {
      return dzm.a;
   }
}
