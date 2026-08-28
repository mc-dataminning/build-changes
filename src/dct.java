import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dct {
   public static final dct a = new dct(ImmutableMultimap.of(), Map.of());
   private final Multimap<dcw<?>, dcq<?>> b;
   private final Map<alc<dcl<?>>, dcq<?>> c;

   private dct(Multimap<dcw<?>, dcq<?>> $$0, Map<alc<dcl<?>>, dcq<?>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static dct a(Iterable<dcq<?>> $$0) {
      Builder<dcw<?>, dcq<?>> $$1 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<alc<dcl<?>>, dcq<?>> $$2 = ImmutableMap.builder();

      for (dcq<?> $$3 : $$0) {
         $$1.put($$3.b().b(), $$3);
         $$2.put($$3.a(), $$3);
      }

      return new dct($$1.build(), $$2.build());
   }

   public <I extends dcr, T extends dcl<I>> Collection<dcq<T>> a(dcw<T> $$0) {
      return this.b.get($$0);
   }

   public Collection<dcq<?>> a() {
      return this.c.values();
   }

   @Nullable
   public dcq<?> a(alc<dcl<?>> $$0) {
      return this.c.get($$0);
   }

   public <I extends dcr, T extends dcl<I>> Stream<dcq<T>> a(dcw<T> $$0, I $$1, dhp $$2) {
      return $$1.b() ? Stream.empty() : this.a($$0).stream().filter($$2x -> $$2x.b().a($$1, $$2));
   }
}
