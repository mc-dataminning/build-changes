import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface dyw extends BiPredicate<dco, iz> {
   Codec<dyw> b = lp.O.q().dispatch(dyw::a, dyx::codec);
   dyw c = a(dew.a);
   dyw d = a(dew.a, dew.G);

   dyx<?> a();

   static dyw a(List<dyw> $$0) {
      return new dyu($$0);
   }

   static dyw a(dyw... $$0) {
      return a(List.of($$0));
   }

   static dyw a(dyw $$0, dyw $$1) {
      return a(List.of($$0, $$1));
   }

   static dyw b(List<dyw> $$0) {
      return new dyv($$0);
   }

   static dyw b(dyw... $$0) {
      return b(List.of($$0));
   }

   static dyw b(dyw $$0, dyw $$1) {
      return b(List.of($$0, $$1));
   }

   static dyw a(kd $$0, List<deu> $$1) {
      return new dzc($$0, jm.a(deu::q, $$1));
   }

   static dyw c(List<deu> $$0) {
      return a(kd.g, $$0);
   }

   static dyw a(kd $$0, deu... $$1) {
      return a($$0, List.of($$1));
   }

   static dyw a(deu... $$0) {
      return a(kd.g, $$0);
   }

   static dyw a(kd $$0, axb<deu> $$1) {
      return new dzb($$0, $$1);
   }

   static dyw a(axb<deu> $$0) {
      return a(kd.g, $$0);
   }

   static dyw b(kd $$0, List<enp> $$1) {
      return new dzd($$0, jm.a(enp::k, $$1));
   }

   static dyw a(kd $$0, enp... $$1) {
      return b($$0, List.of($$1));
   }

   static dyw a(enp... $$0) {
      return a(kd.g, $$0);
   }

   static dyw a(dyw $$0) {
      return new dze($$0);
   }

   static dyw a(kd $$0) {
      return new dzf($$0);
   }

   static dyw b() {
      return a(kd.g);
   }

   static dyw a(drx $$0, kd $$1) {
      return new dzj($$1, $$0);
   }

   static dyw a(kd $$0, je $$1) {
      return new dyz($$0, $$1);
   }

   static dyw a(je $$0) {
      return a(kd.g, $$0);
   }

   static dyw b(kd $$0) {
      return new dzg($$0);
   }

   static dyw c() {
      return b(kd.g);
   }

   static dyw d() {
      return c(kd.g);
   }

   static dyw c(kd $$0) {
      return a($$0, enr.a);
   }

   static dyw d(kd $$0) {
      return new dza($$0);
   }

   static dyw e() {
      return dzi.a;
   }
}
