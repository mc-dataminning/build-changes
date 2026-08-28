import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dcm {
   public static final dcm a = new dcm(ImmutableMultimap.of(), Map.of());
   private final Multimap<dcp<?>, dcj<?>> b;
   private final Map<aly<dce<?>>, dcj<?>> c;

   private dcm(Multimap<dcp<?>, dcj<?>> $$0, Map<aly<dce<?>>, dcj<?>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static dcm a(Iterable<dcj<?>> $$0) {
      Builder<dcp<?>, dcj<?>> $$1 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<aly<dce<?>>, dcj<?>> $$2 = ImmutableMap.builder();

      for (dcj<?> $$3 : $$0) {
         $$1.put($$3.b().b(), $$3);
         $$2.put($$3.a(), $$3);
      }

      return new dcm($$1.build(), $$2.build());
   }

   public <I extends dck, T extends dce<I>> Collection<dcj<T>> a(dcp<T> $$0) {
      return this.b.get($$0);
   }

   public Collection<dcj<?>> a() {
      return this.c.values();
   }

   @Nullable
   public dcj<?> a(aly<dce<?>> $$0) {
      return this.c.get($$0);
   }

   public <I extends dck, T extends dce<I>> Stream<dcj<T>> a(dcp<T> $$0, I $$1, dhi $$2) {
      return $$1.b() ? Stream.empty() : this.a($$0).stream().filter($$2x -> $$2x.b().a($$1, $$2));
   }
}
