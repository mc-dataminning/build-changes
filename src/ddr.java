import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class ddr {
   public static final ddr a = new ddr(ImmutableMultimap.of(), Map.of());
   private final Multimap<ddu<?>, ddo<?>> b;
   private final Map<ald<ddj<?>>, ddo<?>> c;

   private ddr(Multimap<ddu<?>, ddo<?>> $$0, Map<ald<ddj<?>>, ddo<?>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static ddr a(Iterable<ddo<?>> $$0) {
      Builder<ddu<?>, ddo<?>> $$1 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<ald<ddj<?>>, ddo<?>> $$2 = ImmutableMap.builder();

      for (ddo<?> $$3 : $$0) {
         $$1.put($$3.b().b(), $$3);
         $$2.put($$3.a(), $$3);
      }

      return new ddr($$1.build(), $$2.build());
   }

   public <I extends ddp, T extends ddj<I>> Collection<ddo<T>> a(ddu<T> $$0) {
      return this.b.get($$0);
   }

   public Collection<ddo<?>> a() {
      return this.c.values();
   }

   @Nullable
   public ddo<?> a(ald<ddj<?>> $$0) {
      return this.c.get($$0);
   }

   public <I extends ddp, T extends ddj<I>> Stream<ddo<T>> a(ddu<T> $$0, I $$1, dip $$2) {
      return $$1.b() ? Stream.empty() : this.a($$0).stream().filter($$2x -> $$2x.b().a($$1, $$2));
   }
}
