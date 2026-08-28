import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface dzn extends BiPredicate<ddc, ja> {
   Codec<dzn> b = lq.M.r().dispatch(dzn::a, dzo::codec);
   dzn c = a(dfk.a);
   dzn d = a(dfk.a, dfk.G);

   dzo<?> a();

   static dzn a(List<dzn> $$0) {
      return new dzl($$0);
   }

   static dzn a(dzn... $$0) {
      return a(List.of($$0));
   }

   static dzn a(dzn $$0, dzn $$1) {
      return a(List.of($$0, $$1));
   }

   static dzn b(List<dzn> $$0) {
      return new dzm($$0);
   }

   static dzn b(dzn... $$0) {
      return b(List.of($$0));
   }

   static dzn b(dzn $$0, dzn $$1) {
      return b(List.of($$0, $$1));
   }

   static dzn a(ke $$0, List<dfi> $$1) {
      return new dzt($$0, jn.a(dfi::s, $$1));
   }

   static dzn c(List<dfi> $$0) {
      return a(ke.g, $$0);
   }

   static dzn a(ke $$0, dfi... $$1) {
      return a($$0, List.of($$1));
   }

   static dzn a(dfi... $$0) {
      return a(ke.g, $$0);
   }

   static dzn a(ke $$0, awm<dfi> $$1) {
      return new dzs($$0, $$1);
   }

   static dzn a(awm<dfi> $$0) {
      return a(ke.g, $$0);
   }

   static dzn b(ke $$0, List<eoi> $$1) {
      return new dzu($$0, jn.a(eoi::k, $$1));
   }

   static dzn a(ke $$0, eoi... $$1) {
      return b($$0, List.of($$1));
   }

   static dzn a(eoi... $$0) {
      return a(ke.g, $$0);
   }

   static dzn a(dzn $$0) {
      return new dzv($$0);
   }

   static dzn a(ke $$0) {
      return new dzw($$0);
   }

   static dzn b() {
      return a(ke.g);
   }

   static dzn a(dsl $$0, ke $$1) {
      return new eab($$1, $$0);
   }

   static dzn a(ke $$0, jf $$1) {
      return new dzq($$0, $$1);
   }

   static dzn a(jf $$0) {
      return a(ke.g, $$0);
   }

   static dzn b(ke $$0) {
      return new dzx($$0);
   }

   static dzn c() {
      return b(ke.g);
   }

   static dzn d() {
      return c(ke.g);
   }

   static dzn c(ke $$0) {
      return a($$0, eok.a);
   }

   static dzn d(ke $$0) {
      return new dzr($$0);
   }

   static dzn e() {
      return dzz.a;
   }

   static dzn e(ke $$0) {
      return new eaa($$0);
   }

   static dzn f() {
      return e(ke.g);
   }
}
