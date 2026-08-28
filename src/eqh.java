import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface eqh {
   eqg<cxm> a = new eqg<cxm>() {
      @Override
      public kl<cxm> a() {
         return km.aa;
      }

      public Stream<cuq> a(cxm $$0) {
         return $$0.b();
      }

      public cxm c() {
         return cxm.a;
      }

      public cxm a(cxm $$0, Stream<cuq> $$1) {
         return cxm.a($$1.toList());
      }
   };
   eqg<cxd> b = new eqg<cxd>() {
      @Override
      public kl<cxd> a() {
         return km.F;
      }

      public cxd c() {
         return cxd.a;
      }

      public Stream<cuq> a(cxd $$0) {
         return $$0.a();
      }

      public cxd a(cxd $$0, Stream<cuq> $$1) {
         cxd.a $$2 = new cxd.a($$0).a();
         $$1.forEach($$2::a);
         return $$2.d();
      }
   };
   eqg<cxe> c = new eqg<cxe>() {
      @Override
      public kl<cxe> a() {
         return km.E;
      }

      public cxe c() {
         return cxe.a;
      }

      public Stream<cuq> a(cxe $$0) {
         return $$0.a().stream();
      }

      public cxe a(cxe $$0, Stream<cuq> $$1) {
         return cxe.a($$1.toList());
      }
   };
   Map<kl<?>, eqg<?>> d = Stream.of(a, b, c).collect(Collectors.toMap(eqg::a, $$0 -> (eqg<?>)$$0));
   Codec<eqg<?>> e = lp.as.q().comapFlatMap($$0 -> {
      eqg<?> $$1 = d.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No items in component");
   }, eqg::a);
}
