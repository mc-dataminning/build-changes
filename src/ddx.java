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

public class ddx {
   private static final Logger c = LogUtils.getLogger();
   public static final ddx a = new ddx(ImmutableMap.of(), ImmutableList.of());
   public static final MapCodec<ddx> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.simpleMap(dyu.a.c, ebc.c.promotePartial(ad.a("Carver: ", c::error)), azk.a(dyu.a.values())).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               eit.d.promotePartial(ad.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ddx::new)
   );
   private final Map<dyu.a, jq<ebc<?>>> d;
   private final List<jq<eit>> e;
   private final Supplier<List<ebq<?, ?>>> f;
   private final Supplier<Set<eit>> g;

   ddx(Map<dyu.a, jq<ebc<?>>> $$0, List<jq<eit>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(jq::a).map(jm::a).flatMap(eit::a).filter($$0xx -> $$0xx.b() == ecd.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(jq::a).map(jm::a).collect(Collectors.toSet()));
   }

   public Iterable<jm<ebc<?>>> a(dyu.a $$0) {
      return Objects.requireNonNullElseGet(this.d.get($$0), List::of);
   }

   public List<ebq<?, ?>> a() {
      return this.f.get();
   }

   public List<jq<eit>> b() {
      return this.e;
   }

   public boolean a(eit $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends ddx.b {
      private final jn<eit> a;
      private final jn<ebc<?>> b;

      public a(jn<eit> $$0, jn<ebc<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public ddx.a a(dyu.b $$0, akq<eit> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public ddx.a a(dyu.a $$0, akq<ebc<?>> $$1) {
         this.a($$0, this.b.b($$1));
         return this;
      }
   }

   public static class b {
      private final Map<dyu.a, List<jm<ebc<?>>>> a = Maps.newLinkedHashMap();
      private final List<List<jm<eit>>> b = Lists.newArrayList();

      public ddx.b a(dyu.b $$0, jm<eit> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public ddx.b a(int $$0, jm<eit> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public ddx.b a(dyu.a $$0, jm<ebc<?>> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public ddx a() {
         return new ddx(
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> jq.a((List)$$0.getValue()))),
            this.b.stream().map(jq::a).collect(ImmutableList.toImmutableList())
         );
      }
   }
}
