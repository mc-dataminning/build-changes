import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface eul {
   euk<cze> a = new euk<cze>() {
      @Override
      public kt<cze> a() {
         return ku.al;
      }

      public Stream<cwm> a(cze $$0) {
         return $$0.b();
      }

      public cze c() {
         return cze.a;
      }

      public cze a(cze $$0, Stream<cwm> $$1) {
         return cze.a($$1.toList());
      }
   };
   euk<cyq> b = new euk<cyq>() {
      @Override
      public kt<cyq> a() {
         return ku.P;
      }

      public cyq c() {
         return cyq.a;
      }

      public Stream<cwm> a(cyq $$0) {
         return $$0.b();
      }

      public cyq a(cyq $$0, Stream<cwm> $$1) {
         cyq.a $$2 = new cyq.a($$0).a();
         $$1.forEach($$2::a);
         return $$2.d();
      }
   };
   euk<cyr> c = new euk<cyr>() {
      @Override
      public kt<cyr> a() {
         return ku.O;
      }

      public cyr c() {
         return cyr.a;
      }

      public Stream<cwm> a(cyr $$0) {
         return $$0.a().stream();
      }

      public cyr a(cyr $$0, Stream<cwm> $$1) {
         return cyr.a($$1.toList());
      }
   };
   Map<kt<?>, euk<?>> d = Stream.of(a, b, c).collect(Collectors.toMap(euk::a, $$0 -> (euk<?>)$$0));
   Codec<euk<?>> e = lz.ao.q().comapFlatMap($$0 -> {
      euk<?> $$1 = d.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No items in component");
   }, euk::a);
}
