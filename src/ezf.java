import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface ezf {
   eze<dbv> a = new eze<dbv>() {
      @Override
      public ki<dbv> a() {
         return kj.ap;
      }

      public Stream<czd> a(dbv $$0) {
         return $$0.b();
      }

      public dbv c() {
         return dbv.a;
      }

      public dbv a(dbv $$0, Stream<czd> $$1) {
         return dbv.a($$1.toList());
      }
   };
   eze<dbg> b = new eze<dbg>() {
      @Override
      public ki<dbg> a() {
         return kj.Q;
      }

      public dbg c() {
         return dbg.a;
      }

      public Stream<czd> a(dbg $$0) {
         return $$0.b();
      }

      public dbg a(dbg $$0, Stream<czd> $$1) {
         dbg.a $$2 = new dbg.a($$0).a();
         $$1.forEach($$2::a);
         return $$2.d();
      }
   };
   eze<dbh> c = new eze<dbh>() {
      @Override
      public ki<dbh> a() {
         return kj.P;
      }

      public dbh c() {
         return dbh.a;
      }

      public Stream<czd> a(dbh $$0) {
         return $$0.a().stream();
      }

      public dbh a(dbh $$0, Stream<czd> $$1) {
         return dbh.a($$1.toList());
      }
   };
   Map<ki<?>, eze<?>> d = Stream.of(a, b, c).collect(Collectors.toMap(eze::a, $$0 -> (eze<?>)$$0));
   Codec<eze<?>> e = mf.am.q().comapFlatMap($$0 -> {
      eze<?> $$1 = d.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No items in component");
   }, eze::a);
}
