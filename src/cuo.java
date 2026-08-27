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

public class cuo {
   private static final Logger c = LogUtils.getLogger();
   public static final cuo a = new cuo(ImmutableMap.of(), ImmutableList.of());
   public static final MapCodec<cuo> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.simpleMap(dol.a.c, dqs.c.promotePartial(ac.a("Carver: ", c::error)), avj.a(dol.a.values())).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               dyj.d.promotePartial(ac.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, cuo::new)
   );
   private final Map<dol.a, il<dqs<?>>> d;
   private final List<il<dyj>> e;
   private final Supplier<List<drg<?, ?>>> f;
   private final Supplier<Set<dyj>> g;

   cuo(Map<dol.a, il<dqs<?>>> $$0, List<il<dyj>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(il::a).map(ih::a).flatMap(dyj::a).filter($$0xx -> $$0xx.b() == drt.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(il::a).map(ih::a).collect(Collectors.toSet()));
   }

   public Iterable<ih<dqs<?>>> a(dol.a $$0) {
      return Objects.requireNonNullElseGet(this.d.get($$0), List::of);
   }

   public List<drg<?, ?>> a() {
      return this.f.get();
   }

   public List<il<dyj>> b() {
      return this.e;
   }

   public boolean a(dyj $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends cuo.b {
      private final ii<dyj> a;
      private final ii<dqs<?>> b;

      public a(ii<dyj> $$0, ii<dqs<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public cuo.a a(dol.b $$0, ahf<dyj> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public cuo.a a(dol.a $$0, ahf<dqs<?>> $$1) {
         this.a($$0, this.b.b($$1));
         return this;
      }
   }

   public static class b {
      private final Map<dol.a, List<ih<dqs<?>>>> a = Maps.newLinkedHashMap();
      private final List<List<ih<dyj>>> b = Lists.newArrayList();

      public cuo.b a(dol.b $$0, ih<dyj> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public cuo.b a(int $$0, ih<dyj> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public cuo.b a(dol.a $$0, ih<dqs<?>> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public cuo a() {
         return new cuo(
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> il.a((List)$$0.getValue()))),
            this.b.stream().map(il::a).collect(ImmutableList.toImmutableList())
         );
      }
   }
}
