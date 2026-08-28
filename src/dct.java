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

public class dct {
   private static final Logger c = LogUtils.getLogger();
   public static final dct a = new dct(ImmutableMap.of(), ImmutableList.of());
   public static final MapCodec<dct> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.simpleMap(dxl.a.c, dzs.c.promotePartial(ac.a("Carver: ", c::error)), azp.a(dxl.a.values())).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               ehj.d.promotePartial(ac.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dct::new)
   );
   private final Map<dxl.a, jm<dzs<?>>> d;
   private final List<jm<ehj>> e;
   private final Supplier<List<eag<?, ?>>> f;
   private final Supplier<Set<ehj>> g;

   dct(Map<dxl.a, jm<dzs<?>>> $$0, List<jm<ehj>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(jm::a).map(ji::a).flatMap(ehj::a).filter($$0xx -> $$0xx.b() == eat.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(jm::a).map(ji::a).collect(Collectors.toSet()));
   }

   public Iterable<ji<dzs<?>>> a(dxl.a $$0) {
      return Objects.requireNonNullElseGet(this.d.get($$0), List::of);
   }

   public List<eag<?, ?>> a() {
      return this.f.get();
   }

   public List<jm<ehj>> b() {
      return this.e;
   }

   public boolean a(ehj $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends dct.b {
      private final jj<ehj> a;
      private final jj<dzs<?>> b;

      public a(jj<ehj> $$0, jj<dzs<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public dct.a a(dxl.b $$0, ala<ehj> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public dct.a a(dxl.a $$0, ala<dzs<?>> $$1) {
         this.a($$0, this.b.b($$1));
         return this;
      }
   }

   public static class b {
      private final Map<dxl.a, List<ji<dzs<?>>>> a = Maps.newLinkedHashMap();
      private final List<List<ji<ehj>>> b = Lists.newArrayList();

      public dct.b a(dxl.b $$0, ji<ehj> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public dct.b a(int $$0, ji<ehj> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public dct.b a(dxl.a $$0, ji<dzs<?>> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public dct a() {
         return new dct(
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> jm.a((List)$$0.getValue()))),
            this.b.stream().map(jm::a).collect(ImmutableList.toImmutableList())
         );
      }
   }
}
