import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class dda {
   private static final Logger c = LogUtils.getLogger();
   public static final dda a = new dda(ImmutableMap.of(), ImmutableList.of());
   public static final MapCodec<dda> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.simpleMap(dxs.a.c, dzz.c.promotePartial(ac.a("Carver: ", c::error)), azu.a(dxs.a.values())).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               ehq.d.promotePartial(ac.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dda::new)
   );
   private final Map<dxs.a, jm<dzz<?>>> d;
   private final List<jm<ehq>> e;
   private final Supplier<List<ean<?, ?>>> f;
   private final Supplier<Set<ehq>> g;

   dda(Map<dxs.a, jm<dzz<?>>> $$0, List<jm<ehq>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(jm::a).map(ji::a).flatMap(ehq::a).filter($$0xx -> $$0xx.b() == eba.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(jm::a).map(ji::a).collect(Collectors.toSet()));
   }

   public Iterable<ji<dzz<?>>> a(dxs.a $$0) {
      return Objects.requireNonNullElseGet(this.d.get($$0), List::of);
   }

   public List<ean<?, ?>> a() {
      return this.f.get();
   }

   public List<jm<ehq>> b() {
      return this.e;
   }

   public boolean a(ehq $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends dda.b {
      private final jj<ehq> a;
      private final jj<dzz<?>> b;

      public a(jj<ehq> $$0, jj<dzz<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public dda.a a(dxs.b $$0, ale<ehq> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public dda.a a(dxs.a $$0, ale<dzz<?>> $$1) {
         this.a($$0, this.b.b($$1));
         return this;
      }
   }

   public static class b {
      private final Map<dxs.a, List<ji<dzz<?>>>> a = Maps.newLinkedHashMap();
      private final List<List<ji<ehq>>> b = Lists.newArrayList();

      public dda.b a(dxs.b $$0, ji<ehq> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public dda.b a(int $$0, ji<ehq> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public dda.b a(dxs.a $$0, ji<dzz<?>> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public dda a() {
         return new dda(
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> jm.a((List)$$0.getValue()))),
            this.b.stream().map(jm::a).collect(ImmutableList.toImmutableList())
         );
      }
   }
}
