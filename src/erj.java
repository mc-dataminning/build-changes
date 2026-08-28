import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface erj {
   eri<cxm> a = new eri<cxm>() {
      @Override
      public kp<cxm> a() {
         return kq.ab;
      }

      public Stream<cuo> a(cxm $$0) {
         return $$0.b();
      }

      public cxm c() {
         return cxm.a;
      }

      public cxm a(cxm $$0, Stream<cuo> $$1) {
         return cxm.a($$1.toList());
      }
   };
   eri<cxd> b = new eri<cxd>() {
      @Override
      public kp<cxd> a() {
         return kq.F;
      }

      public cxd c() {
         return cxd.a;
      }

      public Stream<cuo> a(cxd $$0) {
         return $$0.a();
      }

      public cxd a(cxd $$0, Stream<cuo> $$1) {
         cxd.a $$2 = new cxd.a($$0).a();
         $$1.forEach($$2::a);
         return $$2.d();
      }
   };
   eri<cxe> c = new eri<cxe>() {
      @Override
      public kp<cxe> a() {
         return kq.E;
      }

      public cxe c() {
         return cxe.a;
      }

      public Stream<cuo> a(cxe $$0) {
         return $$0.a().stream();
      }

      public cxe a(cxe $$0, Stream<cuo> $$1) {
         return cxe.a($$1.toList());
      }
   };
   Map<kp<?>, eri<?>> d = Stream.of(a, b, c).collect(Collectors.toMap(eri::a, $$0 -> (eri<?>)$$0));
   Codec<eri<?>> e = lt.aq.r().comapFlatMap($$0 -> {
      eri<?> $$1 = d.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No items in component");
   }, eri::a);
}
