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

public class cqk {
   private static final Logger c = LogUtils.getLogger();
   public static final cqk a = new cqk(ImmutableMap.of(), ImmutableList.of());
   public static final MapCodec<cqk> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.simpleMap(dke.a.c, dml.c.promotePartial(ac.a("Carver: ", c::error)), ash.a(dke.a.values())).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               duc.d.promotePartial(ac.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, cqk::new)
   );
   private final Map<dke.a, hi<dml<?>>> d;
   private final List<hi<duc>> e;
   private final Supplier<List<dmz<?, ?>>> f;
   private final Supplier<Set<duc>> g;

   cqk(Map<dke.a, hi<dml<?>>> $$0, List<hi<duc>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(hi::a).map(he::a).flatMap(duc::a).filter($$0xx -> $$0xx.b() == dnm.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(hi::a).map(he::a).collect(Collectors.toSet()));
   }

   public Iterable<he<dml<?>>> a(dke.a $$0) {
      return Objects.requireNonNullElseGet(this.d.get($$0), List::of);
   }

   public List<dmz<?, ?>> a() {
      return this.f.get();
   }

   public List<hi<duc>> b() {
      return this.e;
   }

   public boolean a(duc $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends cqk.b {
      private final hf<duc> a;
      private final hf<dml<?>> b;

      public a(hf<duc> $$0, hf<dml<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public cqk.a a(dke.b $$0, aeq<duc> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public cqk.a a(dke.a $$0, aeq<dml<?>> $$1) {
         this.a($$0, this.b.b($$1));
         return this;
      }
   }

   public static class b {
      private final Map<dke.a, List<he<dml<?>>>> a = Maps.newLinkedHashMap();
      private final List<List<he<duc>>> b = Lists.newArrayList();

      public cqk.b a(dke.b $$0, he<duc> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public cqk.b a(int $$0, he<duc> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public cqk.b a(dke.a $$0, he<dml<?>> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public cqk a() {
         return new cqk(
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> hi.a((List)$$0.getValue()))),
            this.b.stream().map(hi::a).collect(ImmutableList.toImmutableList())
         );
      }
   }
}
