import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dcg {
   public static final dcg a = new dcg(ImmutableMultimap.of(), Map.of());
   private final Multimap<dcj<?>, dcd<?>> b;
   private final Map<aly<dbz<?>>, dcd<?>> c;

   private dcg(Multimap<dcj<?>, dcd<?>> $$0, Map<aly<dbz<?>>, dcd<?>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static dcg a(Iterable<dcd<?>> $$0) {
      Builder<dcj<?>, dcd<?>> $$1 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<aly<dbz<?>>, dcd<?>> $$2 = ImmutableMap.builder();

      for (dcd<?> $$3 : $$0) {
         $$1.put($$3.b().b(), $$3);
         $$2.put($$3.a(), $$3);
      }

      return new dcg($$1.build(), $$2.build());
   }

   public <I extends dce, T extends dbz<I>> Collection<dcd<T>> a(dcj<T> $$0) {
      return this.b.get($$0);
   }

   public Collection<dcd<?>> a() {
      return this.c.values();
   }

   @Nullable
   public dcd<?> a(aly<dbz<?>> $$0) {
      return this.c.get($$0);
   }

   public <I extends dce, T extends dbz<I>> Stream<dcd<T>> a(dcj<T> $$0, I $$1, dha $$2) {
      return $$1.b() ? Stream.empty() : this.a($$0).stream().filter($$2x -> $$2x.b().a($$1, $$2));
   }
}
