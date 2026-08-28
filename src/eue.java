import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface eue {
   eud<cyx> a = new eud<cyx>() {
      @Override
      public kt<cyx> a() {
         return ku.al;
      }

      public Stream<cwf> a(cyx $$0) {
         return $$0.b();
      }

      public cyx c() {
         return cyx.a;
      }

      public cyx a(cyx $$0, Stream<cwf> $$1) {
         return cyx.a($$1.toList());
      }
   };
   eud<cyj> b = new eud<cyj>() {
      @Override
      public kt<cyj> a() {
         return ku.P;
      }

      public cyj c() {
         return cyj.a;
      }

      public Stream<cwf> a(cyj $$0) {
         return $$0.b();
      }

      public cyj a(cyj $$0, Stream<cwf> $$1) {
         cyj.a $$2 = new cyj.a($$0).a();
         $$1.forEach($$2::a);
         return $$2.d();
      }
   };
   eud<cyk> c = new eud<cyk>() {
      @Override
      public kt<cyk> a() {
         return ku.O;
      }

      public cyk c() {
         return cyk.a;
      }

      public Stream<cwf> a(cyk $$0) {
         return $$0.a().stream();
      }

      public cyk a(cyk $$0, Stream<cwf> $$1) {
         return cyk.a($$1.toList());
      }
   };
   Map<kt<?>, eud<?>> d = Stream.of(a, b, c).collect(Collectors.toMap(eud::a, $$0 -> (eud<?>)$$0));
   Codec<eud<?>> e = lz.ao.q().comapFlatMap($$0 -> {
      eud<?> $$1 = d.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No items in component");
   }, eud::a);
}
