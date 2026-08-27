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

public class cui {
   private static final Logger c = LogUtils.getLogger();
   public static final cui a = new cui(ImmutableMap.of(), ImmutableList.of());
   public static final MapCodec<cui> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.simpleMap(dof.a.c, dqm.c.promotePartial(ac.a("Carver: ", c::error)), ave.a(dof.a.values())).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               dyd.d.promotePartial(ac.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, cui::new)
   );
   private final Map<dof.a, il<dqm<?>>> d;
   private final List<il<dyd>> e;
   private final Supplier<List<dra<?, ?>>> f;
   private final Supplier<Set<dyd>> g;

   cui(Map<dof.a, il<dqm<?>>> $$0, List<il<dyd>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(il::a).map(ih::a).flatMap(dyd::a).filter($$0xx -> $$0xx.b() == drn.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(il::a).map(ih::a).collect(Collectors.toSet()));
   }

   public Iterable<ih<dqm<?>>> a(dof.a $$0) {
      return Objects.requireNonNullElseGet(this.d.get($$0), List::of);
   }

   public List<dra<?, ?>> a() {
      return this.f.get();
   }

   public List<il<dyd>> b() {
      return this.e;
   }

   public boolean a(dyd $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends cui.b {
      private final ii<dyd> a;
      private final ii<dqm<?>> b;

      public a(ii<dyd> $$0, ii<dqm<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public cui.a a(dof.b $$0, ahc<dyd> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public cui.a a(dof.a $$0, ahc<dqm<?>> $$1) {
         this.a($$0, this.b.b($$1));
         return this;
      }
   }

   public static class b {
      private final Map<dof.a, List<ih<dqm<?>>>> a = Maps.newLinkedHashMap();
      private final List<List<ih<dyd>>> b = Lists.newArrayList();

      public cui.b a(dof.b $$0, ih<dyd> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public cui.b a(int $$0, ih<dyd> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public cui.b a(dof.a $$0, ih<dqm<?>> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public cui a() {
         return new cui(
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> il.a((List)$$0.getValue()))),
            this.b.stream().map(il::a).collect(ImmutableList.toImmutableList())
         );
      }
   }
}
