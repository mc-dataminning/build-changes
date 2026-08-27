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

public class cnl {
   private static final Logger c = LogUtils.getLogger();
   public static final cnl a = new cnl(ImmutableMap.of(), ImmutableList.of());
   public static final MapCodec<cnl> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.simpleMap(dhg.a.c, djn.c.promotePartial(ac.a("Carver: ", c::error)), apr.a(dhg.a.values())).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               dre.d.promotePartial(ac.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, cnl::new)
   );
   private final Map<dhg.a, hi<djn<?>>> d;
   private final List<hi<dre>> e;
   private final Supplier<List<dkb<?, ?>>> f;
   private final Supplier<Set<dre>> g;

   cnl(Map<dhg.a, hi<djn<?>>> $$0, List<hi<dre>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(hi::a).map(he::a).flatMap(dre::a).filter($$0xx -> $$0xx.b() == dko.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(hi::a).map(he::a).collect(Collectors.toSet()));
   }

   public Iterable<he<djn<?>>> a(dhg.a $$0) {
      return Objects.requireNonNullElseGet(this.d.get($$0), List::of);
   }

   public List<dkb<?, ?>> a() {
      return this.f.get();
   }

   public List<hi<dre>> b() {
      return this.e;
   }

   public boolean a(dre $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends cnl.b {
      private final hf<dre> a;
      private final hf<djn<?>> b;

      public a(hf<dre> $$0, hf<djn<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public cnl.a a(dhg.b $$0, acp<dre> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public cnl.a a(dhg.a $$0, acp<djn<?>> $$1) {
         this.a($$0, this.b.b($$1));
         return this;
      }
   }

   public static class b {
      private final Map<dhg.a, List<he<djn<?>>>> a = Maps.newLinkedHashMap();
      private final List<List<he<dre>>> b = Lists.newArrayList();

      public cnl.b a(dhg.b $$0, he<dre> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public cnl.b a(int $$0, he<dre> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public cnl.b a(dhg.a $$0, he<djn<?>> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public cnl a() {
         return new cnl(
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> hi.a((List)$$0.getValue()))),
            this.b.stream().map(hi::a).collect(ImmutableList.toImmutableList())
         );
      }
   }
}
