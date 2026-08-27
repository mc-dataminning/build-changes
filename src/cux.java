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

public class cux {
   private static final Logger c = LogUtils.getLogger();
   public static final cux a = new cux(ImmutableMap.of(), ImmutableList.of());
   public static final MapCodec<cux> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.simpleMap(dou.a.c, drb.c.promotePartial(ac.a("Carver: ", c::error)), avl.a(dou.a.values())).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               dys.d.promotePartial(ac.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, cux::new)
   );
   private final Map<dou.a, il<drb<?>>> d;
   private final List<il<dys>> e;
   private final Supplier<List<drp<?, ?>>> f;
   private final Supplier<Set<dys>> g;

   cux(Map<dou.a, il<drb<?>>> $$0, List<il<dys>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(il::a).map(ih::a).flatMap(dys::a).filter($$0xx -> $$0xx.b() == dsc.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(il::a).map(ih::a).collect(Collectors.toSet()));
   }

   public Iterable<ih<drb<?>>> a(dou.a $$0) {
      return Objects.requireNonNullElseGet(this.d.get($$0), List::of);
   }

   public List<drp<?, ?>> a() {
      return this.f.get();
   }

   public List<il<dys>> b() {
      return this.e;
   }

   public boolean a(dys $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends cux.b {
      private final ii<dys> a;
      private final ii<drb<?>> b;

      public a(ii<dys> $$0, ii<drb<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public cux.a a(dou.b $$0, ahg<dys> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public cux.a a(dou.a $$0, ahg<drb<?>> $$1) {
         this.a($$0, this.b.b($$1));
         return this;
      }
   }

   public static class b {
      private final Map<dou.a, List<ih<drb<?>>>> a = Maps.newLinkedHashMap();
      private final List<List<ih<dys>>> b = Lists.newArrayList();

      public cux.b a(dou.b $$0, ih<dys> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public cux.b a(int $$0, ih<dys> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public cux.b a(dou.a $$0, ih<drb<?>> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public cux a() {
         return new cux(
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> il.a((List)$$0.getValue()))),
            this.b.stream().map(il::a).collect(ImmutableList.toImmutableList())
         );
      }
   }
}
