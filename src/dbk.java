import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dbk {
   public static final dbk a = new dbk(ImmutableMultimap.of(), Map.of());
   private final Multimap<dbn<?>, dbh<?>> b;
   private final Map<akt<dbc<?>>, dbh<?>> c;

   private dbk(Multimap<dbn<?>, dbh<?>> $$0, Map<akt<dbc<?>>, dbh<?>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static dbk a(Iterable<dbh<?>> $$0) {
      Builder<dbn<?>, dbh<?>> $$1 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<akt<dbc<?>>, dbh<?>> $$2 = ImmutableMap.builder();

      for (dbh<?> $$3 : $$0) {
         $$1.put($$3.b().b(), $$3);
         $$2.put($$3.a(), $$3);
      }

      return new dbk($$1.build(), $$2.build());
   }

   public <I extends dbi, T extends dbc<I>> Collection<dbh<T>> a(dbn<T> $$0) {
      return this.b.get($$0);
   }

   public Collection<dbh<?>> a() {
      return this.c.values();
   }

   @Nullable
   public dbh<?> a(akt<dbc<?>> $$0) {
      return this.c.get($$0);
   }

   public <I extends dbi, T extends dbc<I>> Stream<dbh<T>> a(dbn<T> $$0, I $$1, dgg $$2) {
      return $$1.b() ? Stream.empty() : this.a($$0).stream().filter($$2x -> $$2x.b().a($$1, $$2));
   }
}
