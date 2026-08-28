import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dem {
   public static final dem a = new dem(ImmutableMultimap.of(), Map.of());
   private final Multimap<dep<?>, dej<?>> b;
   private final Map<alf<dee<?>>, dej<?>> c;

   private dem(Multimap<dep<?>, dej<?>> $$0, Map<alf<dee<?>>, dej<?>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static dem a(Iterable<dej<?>> $$0) {
      Builder<dep<?>, dej<?>> $$1 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<alf<dee<?>>, dej<?>> $$2 = ImmutableMap.builder();

      for (dej<?> $$3 : $$0) {
         $$1.put($$3.b().b(), $$3);
         $$2.put($$3.a(), $$3);
      }

      return new dem($$1.build(), $$2.build());
   }

   public <I extends dek, T extends dee<I>> Collection<dej<T>> a(dep<T> $$0) {
      return this.b.get($$0);
   }

   public Collection<dej<?>> a() {
      return this.c.values();
   }

   @Nullable
   public dej<?> a(alf<dee<?>> $$0) {
      return this.c.get($$0);
   }

   public <I extends dek, T extends dee<I>> Stream<dej<T>> a(dep<T> $$0, I $$1, djm $$2) {
      return $$1.b() ? Stream.empty() : this.a($$0).stream().filter($$2x -> $$2x.b().a($$1, $$2));
   }
}
