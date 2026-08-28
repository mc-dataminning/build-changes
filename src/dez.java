import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dez {
   public static final dez a = new dez(ImmutableMultimap.of(), Map.of());
   private final Multimap<dfc<?>, dew<?>> b;
   private final Map<alj<der<?>>, dew<?>> c;

   private dez(Multimap<dfc<?>, dew<?>> $$0, Map<alj<der<?>>, dew<?>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static dez a(Iterable<dew<?>> $$0) {
      Builder<dfc<?>, dew<?>> $$1 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<alj<der<?>>, dew<?>> $$2 = ImmutableMap.builder();

      for (dew<?> $$3 : $$0) {
         $$1.put($$3.b().b(), $$3);
         $$2.put($$3.a(), $$3);
      }

      return new dez($$1.build(), $$2.build());
   }

   public <I extends dex, T extends der<I>> Collection<dew<T>> a(dfc<T> $$0) {
      return this.b.get($$0);
   }

   public Collection<dew<?>> a() {
      return this.c.values();
   }

   @Nullable
   public dew<?> a(alj<der<?>> $$0) {
      return this.c.get($$0);
   }

   public <I extends dex, T extends der<I>> Stream<dew<T>> a(dfc<T> $$0, I $$1, djz $$2) {
      return $$1.b() ? Stream.empty() : this.a($$0).stream().filter($$2x -> $$2x.b().a($$1, $$2));
   }
}
