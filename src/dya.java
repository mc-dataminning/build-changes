import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface dya extends BiPredicate<dbs, io> {
   Codec<dya> b = le.O.q().dispatch(dya::a, dyb::codec);
   dya c = a(dea.a);
   dya d = a(dea.a, dea.G);

   dyb<?> a();

   static dya a(List<dya> $$0) {
      return new dxy($$0);
   }

   static dya a(dya... $$0) {
      return a(List.of($$0));
   }

   static dya a(dya $$0, dya $$1) {
      return a(List.of($$0, $$1));
   }

   static dya b(List<dya> $$0) {
      return new dxz($$0);
   }

   static dya b(dya... $$0) {
      return b(List.of($$0));
   }

   static dya b(dya $$0, dya $$1) {
      return b(List.of($$0, $$1));
   }

   static dya a(js $$0, List<ddy> $$1) {
      return new dyg($$0, jb.a(ddy::r, $$1));
   }

   static dya c(List<ddy> $$0) {
      return a(js.g, $$0);
   }

   static dya a(js $$0, ddy... $$1) {
      return a($$0, List.of($$1));
   }

   static dya a(ddy... $$0) {
      return a(js.g, $$0);
   }

   static dya a(js $$0, awl<ddy> $$1) {
      return new dyf($$0, $$1);
   }

   static dya a(awl<ddy> $$0) {
      return a(js.g, $$0);
   }

   static dya b(js $$0, List<emt> $$1) {
      return new dyh($$0, jb.a(emt::k, $$1));
   }

   static dya a(js $$0, emt... $$1) {
      return b($$0, List.of($$1));
   }

   static dya a(emt... $$0) {
      return a(js.g, $$0);
   }

   static dya a(dya $$0) {
      return new dyi($$0);
   }

   static dya a(js $$0) {
      return new dyj($$0);
   }

   static dya b() {
      return a(js.g);
   }

   static dya a(drb $$0, js $$1) {
      return new dyn($$1, $$0);
   }

   static dya a(js $$0, it $$1) {
      return new dyd($$0, $$1);
   }

   static dya a(it $$0) {
      return a(js.g, $$0);
   }

   static dya b(js $$0) {
      return new dyk($$0);
   }

   static dya c() {
      return b(js.g);
   }

   static dya d() {
      return c(js.g);
   }

   static dya c(js $$0) {
      return a($$0, emv.a);
   }

   static dya d(js $$0) {
      return new dye($$0);
   }

   static dya e() {
      return dym.a;
   }
}
