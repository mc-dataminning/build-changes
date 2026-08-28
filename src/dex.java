import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dex {
   public static final dex a = new dex(ImmutableMultimap.of(), Map.of());
   private final Multimap<dfa<?>, deu<?>> b;
   private final Map<alh<dep<?>>, deu<?>> c;

   private dex(Multimap<dfa<?>, deu<?>> $$0, Map<alh<dep<?>>, deu<?>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static dex a(Iterable<deu<?>> $$0) {
      Builder<dfa<?>, deu<?>> $$1 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<alh<dep<?>>, deu<?>> $$2 = ImmutableMap.builder();

      for (deu<?> $$3 : $$0) {
         $$1.put($$3.b().b(), $$3);
         $$2.put($$3.a(), $$3);
      }

      return new dex($$1.build(), $$2.build());
   }

   public <I extends dev, T extends dep<I>> Collection<deu<T>> a(dfa<T> $$0) {
      return this.b.get($$0);
   }

   public Collection<deu<?>> a() {
      return this.c.values();
   }

   @Nullable
   public deu<?> a(alh<dep<?>> $$0) {
      return this.c.get($$0);
   }

   public <I extends dev, T extends dep<I>> Stream<deu<T>> a(dfa<T> $$0, I $$1, djx $$2) {
      return $$1.b() ? Stream.empty() : this.a($$0).stream().filter($$2x -> $$2x.b().a($$1, $$2));
   }
}
