import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dcd {
   public static final dcd a = new dcd(ImmutableMultimap.of(), Map.of());
   private final Multimap<dcg<?>, dca<?>> b;
   private final Map<alo<dbv<?>>, dca<?>> c;

   private dcd(Multimap<dcg<?>, dca<?>> $$0, Map<alo<dbv<?>>, dca<?>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static dcd a(Iterable<dca<?>> $$0) {
      Builder<dcg<?>, dca<?>> $$1 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<alo<dbv<?>>, dca<?>> $$2 = ImmutableMap.builder();

      for (dca<?> $$3 : $$0) {
         $$1.put($$3.b().b(), $$3);
         $$2.put($$3.a(), $$3);
      }

      return new dcd($$1.build(), $$2.build());
   }

   public <I extends dcb, T extends dbv<I>> Collection<dca<T>> a(dcg<T> $$0) {
      return this.b.get($$0);
   }

   public Collection<dca<?>> a() {
      return this.c.values();
   }

   @Nullable
   public dca<?> a(alo<dbv<?>> $$0) {
      return this.c.get($$0);
   }

   public <I extends dcb, T extends dbv<I>> Stream<dca<T>> a(dcg<T> $$0, I $$1, dgz $$2) {
      return $$1.b() ? Stream.empty() : this.a($$0).stream().filter($$2x -> $$2x.b().a($$1, $$2));
   }
}
