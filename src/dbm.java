import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dbm {
   public static final dbm a = new dbm(ImmutableMultimap.of(), Map.of());
   private final Multimap<dbp<?>, dbj<?>> b;
   private final Map<aku<dbe<?>>, dbj<?>> c;

   private dbm(Multimap<dbp<?>, dbj<?>> $$0, Map<aku<dbe<?>>, dbj<?>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static dbm a(Iterable<dbj<?>> $$0) {
      Builder<dbp<?>, dbj<?>> $$1 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<aku<dbe<?>>, dbj<?>> $$2 = ImmutableMap.builder();

      for (dbj<?> $$3 : $$0) {
         $$1.put($$3.b().b(), $$3);
         $$2.put($$3.a(), $$3);
      }

      return new dbm($$1.build(), $$2.build());
   }

   public <I extends dbk, T extends dbe<I>> Collection<dbj<T>> a(dbp<T> $$0) {
      return this.b.get($$0);
   }

   public Collection<dbj<?>> a() {
      return this.c.values();
   }

   @Nullable
   public dbj<?> a(aku<dbe<?>> $$0) {
      return this.c.get($$0);
   }

   public <I extends dbk, T extends dbe<I>> Stream<dbj<T>> a(dbp<T> $$0, I $$1, dgi $$2) {
      return $$1.b() ? Stream.empty() : this.a($$0).stream().filter($$2x -> $$2x.b().a($$1, $$2));
   }
}
