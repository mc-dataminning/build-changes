import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface dyz extends BiPredicate<dcr, iz> {
   Codec<dyz> b = lp.O.q().dispatch(dyz::a, dza::codec);
   dyz c = a(dez.a);
   dyz d = a(dez.a, dez.G);

   dza<?> a();

   static dyz a(List<dyz> $$0) {
      return new dyx($$0);
   }

   static dyz a(dyz... $$0) {
      return a(List.of($$0));
   }

   static dyz a(dyz $$0, dyz $$1) {
      return a(List.of($$0, $$1));
   }

   static dyz b(List<dyz> $$0) {
      return new dyy($$0);
   }

   static dyz b(dyz... $$0) {
      return b(List.of($$0));
   }

   static dyz b(dyz $$0, dyz $$1) {
      return b(List.of($$0, $$1));
   }

   static dyz a(kd $$0, List<dex> $$1) {
      return new dzf($$0, jm.a(dex::s, $$1));
   }

   static dyz c(List<dex> $$0) {
      return a(kd.g, $$0);
   }

   static dyz a(kd $$0, dex... $$1) {
      return a($$0, List.of($$1));
   }

   static dyz a(dex... $$0) {
      return a(kd.g, $$0);
   }

   static dyz a(kd $$0, axe<dex> $$1) {
      return new dze($$0, $$1);
   }

   static dyz a(axe<dex> $$0) {
      return a(kd.g, $$0);
   }

   static dyz b(kd $$0, List<ens> $$1) {
      return new dzg($$0, jm.a(ens::k, $$1));
   }

   static dyz a(kd $$0, ens... $$1) {
      return b($$0, List.of($$1));
   }

   static dyz a(ens... $$0) {
      return a(kd.g, $$0);
   }

   static dyz a(dyz $$0) {
      return new dzh($$0);
   }

   static dyz a(kd $$0) {
      return new dzi($$0);
   }

   static dyz b() {
      return a(kd.g);
   }

   static dyz a(dsa $$0, kd $$1) {
      return new dzm($$1, $$0);
   }

   static dyz a(kd $$0, je $$1) {
      return new dzc($$0, $$1);
   }

   static dyz a(je $$0) {
      return a(kd.g, $$0);
   }

   static dyz b(kd $$0) {
      return new dzj($$0);
   }

   static dyz c() {
      return b(kd.g);
   }

   static dyz d() {
      return c(kd.g);
   }

   static dyz c(kd $$0) {
      return a($$0, enu.a);
   }

   static dyz d(kd $$0) {
      return new dzd($$0);
   }

   static dyz e() {
      return dzl.a;
   }
}
