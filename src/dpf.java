import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface dpf extends BiPredicate<ctt, hv> {
   Codec<dpf> b = kb.O.q().dispatch(dpf::a, dpg::codec);
   dpf c = a(cwb.a);
   dpf d = a(cwb.a, cwb.G);

   dpg<?> a();

   static dpf a(List<dpf> $$0) {
      return new dpd($$0);
   }

   static dpf a(dpf... $$0) {
      return a(List.of($$0));
   }

   static dpf a(dpf $$0, dpf $$1) {
      return a(List.of($$0, $$1));
   }

   static dpf b(List<dpf> $$0) {
      return new dpe($$0);
   }

   static dpf b(dpf... $$0) {
      return b(List.of($$0));
   }

   static dpf b(dpf $$0, dpf $$1) {
      return b(List.of($$0, $$1));
   }

   static dpf a(iz $$0, List<cvz> $$1) {
      return new dpl($$0, ij.a(cvz::r, $$1));
   }

   static dpf c(List<cvz> $$0) {
      return a(iz.g, $$0);
   }

   static dpf a(iz $$0, cvz... $$1) {
      return a($$0, List.of($$1));
   }

   static dpf a(cvz... $$0) {
      return a(iz.g, $$0);
   }

   static dpf a(iz $$0, asg<cvz> $$1) {
      return new dpk($$0, $$1);
   }

   static dpf a(asg<cvz> $$0) {
      return a(iz.g, $$0);
   }

   static dpf b(iz $$0, List<edy> $$1) {
      return new dpm($$0, ij.a(edy::k, $$1));
   }

   static dpf a(iz $$0, edy... $$1) {
      return b($$0, List.of($$1));
   }

   static dpf a(edy... $$0) {
      return a(iz.g, $$0);
   }

   static dpf a(dpf $$0) {
      return new dpn($$0);
   }

   static dpf a(iz $$0) {
      return new dpo($$0);
   }

   static dpf b() {
      return a(iz.g);
   }

   static dpf a(dip $$0, iz $$1) {
      return new dps($$1, $$0);
   }

   static dpf a(iz $$0, ia $$1) {
      return new dpi($$0, $$1);
   }

   static dpf a(ia $$0) {
      return a(iz.g, $$0);
   }

   static dpf b(iz $$0) {
      return new dpp($$0);
   }

   static dpf c() {
      return b(iz.g);
   }

   static dpf d() {
      return c(iz.g);
   }

   static dpf c(iz $$0) {
      return a($$0, eea.a);
   }

   static dpf d(iz $$0) {
      return new dpj($$0);
   }

   static dpf e() {
      return dpr.a;
   }
}
