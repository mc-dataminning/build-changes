import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dfj {
   public static final dfj a = new dfj(ImmutableMultimap.of(), Map.of());
   private final Multimap<dfm<?>, dfg<?>> b;
   private final Map<alq<dfb<?>>, dfg<?>> c;

   private dfj(Multimap<dfm<?>, dfg<?>> $$0, Map<alq<dfb<?>>, dfg<?>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static dfj a(Iterable<dfg<?>> $$0) {
      Builder<dfm<?>, dfg<?>> $$1 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<alq<dfb<?>>, dfg<?>> $$2 = ImmutableMap.builder();

      for (dfg<?> $$3 : $$0) {
         $$1.put($$3.b().b(), $$3);
         $$2.put($$3.a(), $$3);
      }

      return new dfj($$1.build(), $$2.build());
   }

   public <I extends dfh, T extends dfb<I>> Collection<dfg<T>> a(dfm<T> $$0) {
      return this.b.get($$0);
   }

   public Collection<dfg<?>> a() {
      return this.c.values();
   }

   @Nullable
   public dfg<?> a(alq<dfb<?>> $$0) {
      return this.c.get($$0);
   }

   public <I extends dfh, T extends dfb<I>> Stream<dfg<T>> a(dfm<T> $$0, I $$1, dkj $$2) {
      return $$1.b() ? Stream.empty() : this.a($$0).stream().filter($$2x -> $$2x.b().a($$1, $$2));
   }
}
