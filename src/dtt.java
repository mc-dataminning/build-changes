import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface dtt extends BiPredicate<cxu, ib> {
   Codec<dtt> b = ki.O.q().dispatch(dtt::a, dtu::codec);
   dtt c = a(dac.a);
   dtt d = a(dac.a, dac.G);

   dtu<?> a();

   static dtt a(List<dtt> $$0) {
      return new dtr($$0);
   }

   static dtt a(dtt... $$0) {
      return a(List.of($$0));
   }

   static dtt a(dtt $$0, dtt $$1) {
      return a(List.of($$0, $$1));
   }

   static dtt b(List<dtt> $$0) {
      return new dts($$0);
   }

   static dtt b(dtt... $$0) {
      return b(List.of($$0));
   }

   static dtt b(dtt $$0, dtt $$1) {
      return b(List.of($$0, $$1));
   }

   static dtt a(jg $$0, List<daa> $$1) {
      return new dtz($$0, ip.a(daa::r, $$1));
   }

   static dtt c(List<daa> $$0) {
      return a(jg.g, $$0);
   }

   static dtt a(jg $$0, daa... $$1) {
      return a($$0, List.of($$1));
   }

   static dtt a(daa... $$0) {
      return a(jg.g, $$0);
   }

   static dtt a(jg $$0, avd<daa> $$1) {
      return new dty($$0, $$1);
   }

   static dtt a(avd<daa> $$0) {
      return a(jg.g, $$0);
   }

   static dtt b(jg $$0, List<eim> $$1) {
      return new dua($$0, ip.a(eim::k, $$1));
   }

   static dtt a(jg $$0, eim... $$1) {
      return b($$0, List.of($$1));
   }

   static dtt a(eim... $$0) {
      return a(jg.g, $$0);
   }

   static dtt a(dtt $$0) {
      return new dub($$0);
   }

   static dtt a(jg $$0) {
      return new duc($$0);
   }

   static dtt b() {
      return a(jg.g);
   }

   static dtt a(dmz $$0, jg $$1) {
      return new dug($$1, $$0);
   }

   static dtt a(jg $$0, ih $$1) {
      return new dtw($$0, $$1);
   }

   static dtt a(ih $$0) {
      return a(jg.g, $$0);
   }

   static dtt b(jg $$0) {
      return new dud($$0);
   }

   static dtt c() {
      return b(jg.g);
   }

   static dtt d() {
      return c(jg.g);
   }

   static dtt c(jg $$0) {
      return a($$0, eio.a);
   }

   static dtt d(jg $$0) {
      return new dtx($$0);
   }

   static dtt e() {
      return duf.a;
   }
}
