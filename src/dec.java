import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dec {
   public static final dec a = new dec(ImmutableMultimap.of(), Map.of());
   private final Multimap<def<?>, ddz<?>> b;
   private final Map<alf<ddu<?>>, ddz<?>> c;

   private dec(Multimap<def<?>, ddz<?>> $$0, Map<alf<ddu<?>>, ddz<?>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static dec a(Iterable<ddz<?>> $$0) {
      Builder<def<?>, ddz<?>> $$1 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<alf<ddu<?>>, ddz<?>> $$2 = ImmutableMap.builder();

      for (ddz<?> $$3 : $$0) {
         $$1.put($$3.b().b(), $$3);
         $$2.put($$3.a(), $$3);
      }

      return new dec($$1.build(), $$2.build());
   }

   public <I extends dea, T extends ddu<I>> Collection<ddz<T>> a(def<T> $$0) {
      return this.b.get($$0);
   }

   public Collection<ddz<?>> a() {
      return this.c.values();
   }

   @Nullable
   public ddz<?> a(alf<ddu<?>> $$0) {
      return this.c.get($$0);
   }

   public <I extends dea, T extends ddu<I>> Stream<ddz<T>> a(def<T> $$0, I $$1, dja $$2) {
      return $$1.b() ? Stream.empty() : this.a($$0).stream().filter($$2x -> $$2x.b().a($$1, $$2));
   }
}
