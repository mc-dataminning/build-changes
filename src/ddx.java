import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class ddx {
   public static final ddx a = new ddx(ImmutableMultimap.of(), Map.of());
   private final Multimap<dea<?>, ddu<?>> b;
   private final Map<alf<ddp<?>>, ddu<?>> c;

   private ddx(Multimap<dea<?>, ddu<?>> $$0, Map<alf<ddp<?>>, ddu<?>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static ddx a(Iterable<ddu<?>> $$0) {
      Builder<dea<?>, ddu<?>> $$1 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<alf<ddp<?>>, ddu<?>> $$2 = ImmutableMap.builder();

      for (ddu<?> $$3 : $$0) {
         $$1.put($$3.b().b(), $$3);
         $$2.put($$3.a(), $$3);
      }

      return new ddx($$1.build(), $$2.build());
   }

   public <I extends ddv, T extends ddp<I>> Collection<ddu<T>> a(dea<T> $$0) {
      return this.b.get($$0);
   }

   public Collection<ddu<?>> a() {
      return this.c.values();
   }

   @Nullable
   public ddu<?> a(alf<ddp<?>> $$0) {
      return this.c.get($$0);
   }

   public <I extends ddv, T extends ddp<I>> Stream<ddu<T>> a(dea<T> $$0, I $$1, div $$2) {
      return $$1.b() ? Stream.empty() : this.a($$0).stream().filter($$2x -> $$2x.b().a($$1, $$2));
   }
}
