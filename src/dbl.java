import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dbl {
   public static final dbl a = new dbl(ImmutableMultimap.of(), Map.of());
   private final Multimap<dbo<?>, dbi<?>> b;
   private final Map<aku<dbd<?>>, dbi<?>> c;

   private dbl(Multimap<dbo<?>, dbi<?>> $$0, Map<aku<dbd<?>>, dbi<?>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static dbl a(Iterable<dbi<?>> $$0) {
      Builder<dbo<?>, dbi<?>> $$1 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<aku<dbd<?>>, dbi<?>> $$2 = ImmutableMap.builder();

      for (dbi<?> $$3 : $$0) {
         $$1.put($$3.b().b(), $$3);
         $$2.put($$3.a(), $$3);
      }

      return new dbl($$1.build(), $$2.build());
   }

   public <I extends dbj, T extends dbd<I>> Collection<dbi<T>> a(dbo<T> $$0) {
      return this.b.get($$0);
   }

   public Collection<dbi<?>> a() {
      return this.c.values();
   }

   @Nullable
   public dbi<?> a(aku<dbd<?>> $$0) {
      return this.c.get($$0);
   }

   public <I extends dbj, T extends dbd<I>> Stream<dbi<T>> a(dbo<T> $$0, I $$1, dgh $$2) {
      return $$1.b() ? Stream.empty() : this.a($$0).stream().filter($$2x -> $$2x.b().a($$1, $$2));
   }
}
