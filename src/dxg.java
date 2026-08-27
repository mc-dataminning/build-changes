import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface dxg extends BiPredicate<day, in> {
   Codec<dxg> b = ld.O.q().dispatch(dxg::a, dxh::codec);
   dxg c = a(ddg.a);
   dxg d = a(ddg.a, ddg.G);

   dxh<?> a();

   static dxg a(List<dxg> $$0) {
      return new dxe($$0);
   }

   static dxg a(dxg... $$0) {
      return a(List.of($$0));
   }

   static dxg a(dxg $$0, dxg $$1) {
      return a(List.of($$0, $$1));
   }

   static dxg b(List<dxg> $$0) {
      return new dxf($$0);
   }

   static dxg b(dxg... $$0) {
      return b(List.of($$0));
   }

   static dxg b(dxg $$0, dxg $$1) {
      return b(List.of($$0, $$1));
   }

   static dxg a(jr $$0, List<dde> $$1) {
      return new dxm($$0, ja.a(dde::r, $$1));
   }

   static dxg c(List<dde> $$0) {
      return a(jr.g, $$0);
   }

   static dxg a(jr $$0, dde... $$1) {
      return a($$0, List.of($$1));
   }

   static dxg a(dde... $$0) {
      return a(jr.g, $$0);
   }

   static dxg a(jr $$0, awg<dde> $$1) {
      return new dxl($$0, $$1);
   }

   static dxg a(awg<dde> $$0) {
      return a(jr.g, $$0);
   }

   static dxg b(jr $$0, List<elz> $$1) {
      return new dxn($$0, ja.a(elz::k, $$1));
   }

   static dxg a(jr $$0, elz... $$1) {
      return b($$0, List.of($$1));
   }

   static dxg a(elz... $$0) {
      return a(jr.g, $$0);
   }

   static dxg a(dxg $$0) {
      return new dxo($$0);
   }

   static dxg a(jr $$0) {
      return new dxp($$0);
   }

   static dxg b() {
      return a(jr.g);
   }

   static dxg a(dqh $$0, jr $$1) {
      return new dxt($$1, $$0);
   }

   static dxg a(jr $$0, is $$1) {
      return new dxj($$0, $$1);
   }

   static dxg a(is $$0) {
      return a(jr.g, $$0);
   }

   static dxg b(jr $$0) {
      return new dxq($$0);
   }

   static dxg c() {
      return b(jr.g);
   }

   static dxg d() {
      return c(jr.g);
   }

   static dxg c(jr $$0) {
      return a($$0, emb.a);
   }

   static dxg d(jr $$0) {
      return new dxk($$0);
   }

   static dxg e() {
      return dxs.a;
   }
}
