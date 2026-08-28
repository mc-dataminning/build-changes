import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dbn {
   public static final dbn a = new dbn(ImmutableMultimap.of(), Map.of());
   private final Multimap<dbq<?>, dbk<?>> b;
   private final Map<aku<dbf<?>>, dbk<?>> c;

   private dbn(Multimap<dbq<?>, dbk<?>> $$0, Map<aku<dbf<?>>, dbk<?>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static dbn a(Iterable<dbk<?>> $$0) {
      Builder<dbq<?>, dbk<?>> $$1 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<aku<dbf<?>>, dbk<?>> $$2 = ImmutableMap.builder();

      for (dbk<?> $$3 : $$0) {
         $$1.put($$3.b().b(), $$3);
         $$2.put($$3.a(), $$3);
      }

      return new dbn($$1.build(), $$2.build());
   }

   public <I extends dbl, T extends dbf<I>> Collection<dbk<T>> a(dbq<T> $$0) {
      return this.b.get($$0);
   }

   public Collection<dbk<?>> a() {
      return this.c.values();
   }

   @Nullable
   public dbk<?> a(aku<dbf<?>> $$0) {
      return this.c.get($$0);
   }

   public <I extends dbl, T extends dbf<I>> Stream<dbk<T>> a(dbq<T> $$0, I $$1, dgj $$2) {
      return $$1.b() ? Stream.empty() : this.a($$0).stream().filter($$2x -> $$2x.b().a($$1, $$2));
   }
}
