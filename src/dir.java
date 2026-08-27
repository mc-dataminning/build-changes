import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface dir extends BiPredicate<cng, gu> {
   Codec<dir> b = jb.P.q().dispatch(dir::a, dis::codec);
   dir c = a(cpo.a);
   dir d = a(cpo.a, cpo.G);

   dis<?> a();

   static dir a(List<dir> $$0) {
      return new dip($$0);
   }

   static dir a(dir... $$0) {
      return a(List.of($$0));
   }

   static dir a(dir $$0, dir $$1) {
      return a(List.of($$0, $$1));
   }

   static dir b(List<dir> $$0) {
      return new diq($$0);
   }

   static dir b(dir... $$0) {
      return b(List.of($$0));
   }

   static dir b(dir $$0, dir $$1) {
      return b(List.of($$0, $$1));
   }

   static dir a(hz $$0, List<cpn> $$1) {
      return new dix($$0, hi.a(cpn::q, $$1));
   }

   static dir c(List<cpn> $$0) {
      return a(hz.g, $$0);
   }

   static dir a(hz $$0, cpn... $$1) {
      return a($$0, List.of($$1));
   }

   static dir a(cpn... $$0) {
      return a(hz.g, $$0);
   }

   static dir a(hz $$0, anl<cpn> $$1) {
      return new diw($$0, $$1);
   }

   static dir a(anl<cpn> $$0) {
      return a(hz.g, $$0);
   }

   static dir b(hz $$0, List<dxd> $$1) {
      return new diy($$0, hi.a(dxd::k, $$1));
   }

   static dir a(hz $$0, dxd... $$1) {
      return b($$0, List.of($$1));
   }

   static dir a(dxd... $$0) {
      return a(hz.g, $$0);
   }

   static dir a(dir $$0) {
      return new diz($$0);
   }

   static dir a(hz $$0) {
      return new dja($$0);
   }

   static dir b() {
      return a(hz.g);
   }

   static dir a(dcb $$0, hz $$1) {
      return new dje($$1, $$0);
   }

   static dir a(hz $$0, ha $$1) {
      return new diu($$0, $$1);
   }

   static dir a(ha $$0) {
      return a(hz.g, $$0);
   }

   static dir b(hz $$0) {
      return new djb($$0);
   }

   static dir c() {
      return b(hz.g);
   }

   static dir d() {
      return c(hz.g);
   }

   static dir c(hz $$0) {
      return a($$0, dxf.a);
   }

   static dir d(hz $$0) {
      return new div($$0);
   }

   static dir e() {
      return djd.a;
   }
}
