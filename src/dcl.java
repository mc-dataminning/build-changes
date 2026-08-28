import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dcl {
   public static final dcl a = new dcl(ImmutableMultimap.of(), Map.of());
   private final Multimap<dco<?>, dci<?>> b;
   private final Map<aly<dcd<?>>, dci<?>> c;

   private dcl(Multimap<dco<?>, dci<?>> $$0, Map<aly<dcd<?>>, dci<?>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static dcl a(Iterable<dci<?>> $$0) {
      Builder<dco<?>, dci<?>> $$1 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<aly<dcd<?>>, dci<?>> $$2 = ImmutableMap.builder();

      for (dci<?> $$3 : $$0) {
         $$1.put($$3.b().b(), $$3);
         $$2.put($$3.a(), $$3);
      }

      return new dcl($$1.build(), $$2.build());
   }

   public <I extends dcj, T extends dcd<I>> Collection<dci<T>> a(dco<T> $$0) {
      return this.b.get($$0);
   }

   public Collection<dci<?>> a() {
      return this.c.values();
   }

   @Nullable
   public dci<?> a(aly<dcd<?>> $$0) {
      return this.c.get($$0);
   }

   public <I extends dcj, T extends dcd<I>> Stream<dci<T>> a(dco<T> $$0, I $$1, dhh $$2) {
      return $$1.b() ? Stream.empty() : this.a($$0).stream().filter($$2x -> $$2x.b().a($$1, $$2));
   }
}
