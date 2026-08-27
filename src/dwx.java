import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface dwx extends BiPredicate<dap, im> {
   Codec<dwx> b = lc.O.q().dispatch(dwx::a, dwy::codec);
   dwx c = a(dcx.a);
   dwx d = a(dcx.a, dcx.G);

   dwy<?> a();

   static dwx a(List<dwx> $$0) {
      return new dwv($$0);
   }

   static dwx a(dwx... $$0) {
      return a(List.of($$0));
   }

   static dwx a(dwx $$0, dwx $$1) {
      return a(List.of($$0, $$1));
   }

   static dwx b(List<dwx> $$0) {
      return new dww($$0);
   }

   static dwx b(dwx... $$0) {
      return b(List.of($$0));
   }

   static dwx b(dwx $$0, dwx $$1) {
      return b(List.of($$0, $$1));
   }

   static dwx a(jq $$0, List<dcv> $$1) {
      return new dxd($$0, iz.a(dcv::r, $$1));
   }

   static dwx c(List<dcv> $$0) {
      return a(jq.g, $$0);
   }

   static dwx a(jq $$0, dcv... $$1) {
      return a($$0, List.of($$1));
   }

   static dwx a(dcv... $$0) {
      return a(jq.g, $$0);
   }

   static dwx a(jq $$0, awd<dcv> $$1) {
      return new dxc($$0, $$1);
   }

   static dwx a(awd<dcv> $$0) {
      return a(jq.g, $$0);
   }

   static dwx b(jq $$0, List<elq> $$1) {
      return new dxe($$0, iz.a(elq::k, $$1));
   }

   static dwx a(jq $$0, elq... $$1) {
      return b($$0, List.of($$1));
   }

   static dwx a(elq... $$0) {
      return a(jq.g, $$0);
   }

   static dwx a(dwx $$0) {
      return new dxf($$0);
   }

   static dwx a(jq $$0) {
      return new dxg($$0);
   }

   static dwx b() {
      return a(jq.g);
   }

   static dwx a(dpy $$0, jq $$1) {
      return new dxk($$1, $$0);
   }

   static dwx a(jq $$0, ir $$1) {
      return new dxa($$0, $$1);
   }

   static dwx a(ir $$0) {
      return a(jq.g, $$0);
   }

   static dwx b(jq $$0) {
      return new dxh($$0);
   }

   static dwx c() {
      return b(jq.g);
   }

   static dwx d() {
      return c(jq.g);
   }

   static dwx c(jq $$0) {
      return a($$0, els.a);
   }

   static dwx d(jq $$0) {
      return new dxb($$0);
   }

   static dwx e() {
      return dxj.a;
   }
}
