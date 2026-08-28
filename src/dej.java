import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dej {
   public static final dej a = new dej(ImmutableMultimap.of(), Map.of());
   private final Multimap<dem<?>, deg<?>> b;
   private final Map<alf<deb<?>>, deg<?>> c;

   private dej(Multimap<dem<?>, deg<?>> $$0, Map<alf<deb<?>>, deg<?>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static dej a(Iterable<deg<?>> $$0) {
      Builder<dem<?>, deg<?>> $$1 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<alf<deb<?>>, deg<?>> $$2 = ImmutableMap.builder();

      for (deg<?> $$3 : $$0) {
         $$1.put($$3.b().b(), $$3);
         $$2.put($$3.a(), $$3);
      }

      return new dej($$1.build(), $$2.build());
   }

   public <I extends deh, T extends deb<I>> Collection<deg<T>> a(dem<T> $$0) {
      return this.b.get($$0);
   }

   public Collection<deg<?>> a() {
      return this.c.values();
   }

   @Nullable
   public deg<?> a(alf<deb<?>> $$0) {
      return this.c.get($$0);
   }

   public <I extends deh, T extends deb<I>> Stream<deg<T>> a(dem<T> $$0, I $$1, djh $$2) {
      return $$1.b() ? Stream.empty() : this.a($$0).stream().filter($$2x -> $$2x.b().a($$1, $$2));
   }
}
