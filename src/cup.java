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

public class cup {
   private static final Logger c = LogUtils.getLogger();
   public static final cup a = new cup(ImmutableMap.of(), ImmutableList.of());
   public static final MapCodec<cup> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.simpleMap(dom.a.c, dqt.c.promotePartial(ac.a("Carver: ", c::error)), avk.a(dom.a.values())).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               dyk.d.promotePartial(ac.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, cup::new)
   );
   private final Map<dom.a, il<dqt<?>>> d;
   private final List<il<dyk>> e;
   private final Supplier<List<drh<?, ?>>> f;
   private final Supplier<Set<dyk>> g;

   cup(Map<dom.a, il<dqt<?>>> $$0, List<il<dyk>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(il::a).map(ih::a).flatMap(dyk::a).filter($$0xx -> $$0xx.b() == dru.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(il::a).map(ih::a).collect(Collectors.toSet()));
   }

   public Iterable<ih<dqt<?>>> a(dom.a $$0) {
      return Objects.requireNonNullElseGet(this.d.get($$0), List::of);
   }

   public List<drh<?, ?>> a() {
      return this.f.get();
   }

   public List<il<dyk>> b() {
      return this.e;
   }

   public boolean a(dyk $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends cup.b {
      private final ii<dyk> a;
      private final ii<dqt<?>> b;

      public a(ii<dyk> $$0, ii<dqt<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public cup.a a(dom.b $$0, ahf<dyk> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public cup.a a(dom.a $$0, ahf<dqt<?>> $$1) {
         this.a($$0, this.b.b($$1));
         return this;
      }
   }

   public static class b {
      private final Map<dom.a, List<ih<dqt<?>>>> a = Maps.newLinkedHashMap();
      private final List<List<ih<dyk>>> b = Lists.newArrayList();

      public cup.b a(dom.b $$0, ih<dyk> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public cup.b a(int $$0, ih<dyk> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public cup.b a(dom.a $$0, ih<dqt<?>> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public cup a() {
         return new cup(
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> il.a((List)$$0.getValue()))),
            this.b.stream().map(il::a).collect(ImmutableList.toImmutableList())
         );
      }
   }
}
