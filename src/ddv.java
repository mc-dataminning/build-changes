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

public class ddv {
   private static final Logger c = LogUtils.getLogger();
   public static final ddv a = new ddv(ImmutableMap.of(), ImmutableList.of());
   public static final MapCodec<ddv> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.simpleMap(dyr.a.c, eaz.c.promotePartial(ad.a("Carver: ", c::error)), azj.a(dyr.a.values())).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               eiq.d.promotePartial(ad.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ddv::new)
   );
   private final Map<dyr.a, jq<eaz<?>>> d;
   private final List<jq<eiq>> e;
   private final Supplier<List<ebn<?, ?>>> f;
   private final Supplier<Set<eiq>> g;

   ddv(Map<dyr.a, jq<eaz<?>>> $$0, List<jq<eiq>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(jq::a).map(jm::a).flatMap(eiq::a).filter($$0xx -> $$0xx.b() == eca.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(jq::a).map(jm::a).collect(Collectors.toSet()));
   }

   public Iterable<jm<eaz<?>>> a(dyr.a $$0) {
      return Objects.requireNonNullElseGet(this.d.get($$0), List::of);
   }

   public List<ebn<?, ?>> a() {
      return this.f.get();
   }

   public List<jq<eiq>> b() {
      return this.e;
   }

   public boolean a(eiq $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends ddv.b {
      private final jn<eiq> a;
      private final jn<eaz<?>> b;

      public a(jn<eiq> $$0, jn<eaz<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public ddv.a a(dyr.b $$0, akp<eiq> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public ddv.a a(dyr.a $$0, akp<eaz<?>> $$1) {
         this.a($$0, this.b.b($$1));
         return this;
      }
   }

   public static class b {
      private final Map<dyr.a, List<jm<eaz<?>>>> a = Maps.newLinkedHashMap();
      private final List<List<jm<eiq>>> b = Lists.newArrayList();

      public ddv.b a(dyr.b $$0, jm<eiq> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public ddv.b a(int $$0, jm<eiq> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public ddv.b a(dyr.a $$0, jm<eaz<?>> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public ddv a() {
         return new ddv(
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> jq.a((List)$$0.getValue()))),
            this.b.stream().map(jq::a).collect(ImmutableList.toImmutableList())
         );
      }
   }
}
