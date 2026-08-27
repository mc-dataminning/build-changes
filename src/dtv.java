import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface dtv extends BiPredicate<cxw, ib> {
   Codec<dtv> b = ki.O.q().dispatch(dtv::a, dtw::codec);
   dtv c = a(dae.a);
   dtv d = a(dae.a, dae.G);

   dtw<?> a();

   static dtv a(List<dtv> $$0) {
      return new dtt($$0);
   }

   static dtv a(dtv... $$0) {
      return a(List.of($$0));
   }

   static dtv a(dtv $$0, dtv $$1) {
      return a(List.of($$0, $$1));
   }

   static dtv b(List<dtv> $$0) {
      return new dtu($$0);
   }

   static dtv b(dtv... $$0) {
      return b(List.of($$0));
   }

   static dtv b(dtv $$0, dtv $$1) {
      return b(List.of($$0, $$1));
   }

   static dtv a(jg $$0, List<dac> $$1) {
      return new dub($$0, ip.a(dac::r, $$1));
   }

   static dtv c(List<dac> $$0) {
      return a(jg.g, $$0);
   }

   static dtv a(jg $$0, dac... $$1) {
      return a($$0, List.of($$1));
   }

   static dtv a(dac... $$0) {
      return a(jg.g, $$0);
   }

   static dtv a(jg $$0, avd<dac> $$1) {
      return new dua($$0, $$1);
   }

   static dtv a(avd<dac> $$0) {
      return a(jg.g, $$0);
   }

   static dtv b(jg $$0, List<eio> $$1) {
      return new duc($$0, ip.a(eio::k, $$1));
   }

   static dtv a(jg $$0, eio... $$1) {
      return b($$0, List.of($$1));
   }

   static dtv a(eio... $$0) {
      return a(jg.g, $$0);
   }

   static dtv a(dtv $$0) {
      return new dud($$0);
   }

   static dtv a(jg $$0) {
      return new due($$0);
   }

   static dtv b() {
      return a(jg.g);
   }

   static dtv a(dnb $$0, jg $$1) {
      return new dui($$1, $$0);
   }

   static dtv a(jg $$0, ih $$1) {
      return new dty($$0, $$1);
   }

   static dtv a(ih $$0) {
      return a(jg.g, $$0);
   }

   static dtv b(jg $$0) {
      return new duf($$0);
   }

   static dtv c() {
      return b(jg.g);
   }

   static dtv d() {
      return c(jg.g);
   }

   static dtv c(jg $$0) {
      return a($$0, eiq.a);
   }

   static dtv d(jg $$0) {
      return new dtz($$0);
   }

   static dtv e() {
      return duh.a;
   }
}
