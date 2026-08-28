import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface dzm extends BiPredicate<ddb, ja> {
   Codec<dzm> b = lq.M.r().dispatch(dzm::a, dzn::codec);
   dzm c = a(dfj.a);
   dzm d = a(dfj.a, dfj.G);

   dzn<?> a();

   static dzm a(List<dzm> $$0) {
      return new dzk($$0);
   }

   static dzm a(dzm... $$0) {
      return a(List.of($$0));
   }

   static dzm a(dzm $$0, dzm $$1) {
      return a(List.of($$0, $$1));
   }

   static dzm b(List<dzm> $$0) {
      return new dzl($$0);
   }

   static dzm b(dzm... $$0) {
      return b(List.of($$0));
   }

   static dzm b(dzm $$0, dzm $$1) {
      return b(List.of($$0, $$1));
   }

   static dzm a(ke $$0, List<dfh> $$1) {
      return new dzs($$0, jn.a(dfh::s, $$1));
   }

   static dzm c(List<dfh> $$0) {
      return a(ke.g, $$0);
   }

   static dzm a(ke $$0, dfh... $$1) {
      return a($$0, List.of($$1));
   }

   static dzm a(dfh... $$0) {
      return a(ke.g, $$0);
   }

   static dzm a(ke $$0, awm<dfh> $$1) {
      return new dzr($$0, $$1);
   }

   static dzm a(awm<dfh> $$0) {
      return a(ke.g, $$0);
   }

   static dzm b(ke $$0, List<eog> $$1) {
      return new dzt($$0, jn.a(eog::k, $$1));
   }

   static dzm a(ke $$0, eog... $$1) {
      return b($$0, List.of($$1));
   }

   static dzm a(eog... $$0) {
      return a(ke.g, $$0);
   }

   static dzm a(dzm $$0) {
      return new dzu($$0);
   }

   static dzm a(ke $$0) {
      return new dzv($$0);
   }

   static dzm b() {
      return a(ke.g);
   }

   static dzm a(dsk $$0, ke $$1) {
      return new eaa($$1, $$0);
   }

   static dzm a(ke $$0, jf $$1) {
      return new dzp($$0, $$1);
   }

   static dzm a(jf $$0) {
      return a(ke.g, $$0);
   }

   static dzm b(ke $$0) {
      return new dzw($$0);
   }

   static dzm c() {
      return b(ke.g);
   }

   static dzm d() {
      return c(ke.g);
   }

   static dzm c(ke $$0) {
      return a($$0, eoi.a);
   }

   static dzm d(ke $$0) {
      return new dzq($$0);
   }

   static dzm e() {
      return dzy.a;
   }

   static dzm e(ke $$0) {
      return new dzz($$0);
   }

   static dzm f() {
      return e(ke.g);
   }
}
