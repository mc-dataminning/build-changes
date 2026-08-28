import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface dzg extends BiPredicate<dcz, ja> {
   Codec<dzg> b = lq.M.r().dispatch(dzg::a, dzh::codec);
   dzg c = a(dfh.a);
   dzg d = a(dfh.a, dfh.G);

   dzh<?> a();

   static dzg a(List<dzg> $$0) {
      return new dze($$0);
   }

   static dzg a(dzg... $$0) {
      return a(List.of($$0));
   }

   static dzg a(dzg $$0, dzg $$1) {
      return a(List.of($$0, $$1));
   }

   static dzg b(List<dzg> $$0) {
      return new dzf($$0);
   }

   static dzg b(dzg... $$0) {
      return b(List.of($$0));
   }

   static dzg b(dzg $$0, dzg $$1) {
      return b(List.of($$0, $$1));
   }

   static dzg a(ke $$0, List<dff> $$1) {
      return new dzm($$0, jn.a(dff::s, $$1));
   }

   static dzg c(List<dff> $$0) {
      return a(ke.g, $$0);
   }

   static dzg a(ke $$0, dff... $$1) {
      return a($$0, List.of($$1));
   }

   static dzg a(dff... $$0) {
      return a(ke.g, $$0);
   }

   static dzg a(ke $$0, awk<dff> $$1) {
      return new dzl($$0, $$1);
   }

   static dzg a(awk<dff> $$0) {
      return a(ke.g, $$0);
   }

   static dzg b(ke $$0, List<eoa> $$1) {
      return new dzn($$0, jn.a(eoa::k, $$1));
   }

   static dzg a(ke $$0, eoa... $$1) {
      return b($$0, List.of($$1));
   }

   static dzg a(eoa... $$0) {
      return a(ke.g, $$0);
   }

   static dzg a(dzg $$0) {
      return new dzo($$0);
   }

   static dzg a(ke $$0) {
      return new dzp($$0);
   }

   static dzg b() {
      return a(ke.g);
   }

   static dzg a(dsh $$0, ke $$1) {
      return new dzu($$1, $$0);
   }

   static dzg a(ke $$0, jf $$1) {
      return new dzj($$0, $$1);
   }

   static dzg a(jf $$0) {
      return a(ke.g, $$0);
   }

   static dzg b(ke $$0) {
      return new dzq($$0);
   }

   static dzg c() {
      return b(ke.g);
   }

   static dzg d() {
      return c(ke.g);
   }

   static dzg c(ke $$0) {
      return a($$0, eoc.a);
   }

   static dzg d(ke $$0) {
      return new dzk($$0);
   }

   static dzg e() {
      return dzs.a;
   }

   static dzg e(ke $$0) {
      return new dzt($$0);
   }

   static dzg f() {
      return e(ke.g);
   }
}
