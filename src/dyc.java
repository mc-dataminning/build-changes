import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface dyc extends BiPredicate<dbu, io> {
   Codec<dyc> b = le.O.q().dispatch(dyc::a, dyd::codec);
   dyc c = a(dec.a);
   dyc d = a(dec.a, dec.G);

   dyd<?> a();

   static dyc a(List<dyc> $$0) {
      return new dya($$0);
   }

   static dyc a(dyc... $$0) {
      return a(List.of($$0));
   }

   static dyc a(dyc $$0, dyc $$1) {
      return a(List.of($$0, $$1));
   }

   static dyc b(List<dyc> $$0) {
      return new dyb($$0);
   }

   static dyc b(dyc... $$0) {
      return b(List.of($$0));
   }

   static dyc b(dyc $$0, dyc $$1) {
      return b(List.of($$0, $$1));
   }

   static dyc a(js $$0, List<dea> $$1) {
      return new dyi($$0, jb.a(dea::q, $$1));
   }

   static dyc c(List<dea> $$0) {
      return a(js.g, $$0);
   }

   static dyc a(js $$0, dea... $$1) {
      return a($$0, List.of($$1));
   }

   static dyc a(dea... $$0) {
      return a(js.g, $$0);
   }

   static dyc a(js $$0, awm<dea> $$1) {
      return new dyh($$0, $$1);
   }

   static dyc a(awm<dea> $$0) {
      return a(js.g, $$0);
   }

   static dyc b(js $$0, List<emv> $$1) {
      return new dyj($$0, jb.a(emv::k, $$1));
   }

   static dyc a(js $$0, emv... $$1) {
      return b($$0, List.of($$1));
   }

   static dyc a(emv... $$0) {
      return a(js.g, $$0);
   }

   static dyc a(dyc $$0) {
      return new dyk($$0);
   }

   static dyc a(js $$0) {
      return new dyl($$0);
   }

   static dyc b() {
      return a(js.g);
   }

   static dyc a(drd $$0, js $$1) {
      return new dyp($$1, $$0);
   }

   static dyc a(js $$0, it $$1) {
      return new dyf($$0, $$1);
   }

   static dyc a(it $$0) {
      return a(js.g, $$0);
   }

   static dyc b(js $$0) {
      return new dym($$0);
   }

   static dyc c() {
      return b(js.g);
   }

   static dyc d() {
      return c(js.g);
   }

   static dyc c(js $$0) {
      return a($$0, emx.a);
   }

   static dyc d(js $$0) {
      return new dyg($$0);
   }

   static dyc e() {
      return dyo.a;
   }
}
