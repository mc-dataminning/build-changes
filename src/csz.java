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

public class csz {
   private static final Logger c = LogUtils.getLogger();
   public static final csz a = new csz(ImmutableMap.of(), ImmutableList.of());
   public static final MapCodec<csz> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.simpleMap(dmn.a.c, dou.c.promotePartial(ac.a("Carver: ", c::error)), aug.a(dmn.a.values())).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               dwl.d.promotePartial(ac.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, csz::new)
   );
   private final Map<dmn.a, ig<dou<?>>> d;
   private final List<ig<dwl>> e;
   private final Supplier<List<dpi<?, ?>>> f;
   private final Supplier<Set<dwl>> g;

   csz(Map<dmn.a, ig<dou<?>>> $$0, List<ig<dwl>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(ig::a).map(ib::a).flatMap(dwl::a).filter($$0xx -> $$0xx.b() == dpv.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(ig::a).map(ib::a).collect(Collectors.toSet()));
   }

   public Iterable<ib<dou<?>>> a(dmn.a $$0) {
      return Objects.requireNonNullElseGet(this.d.get($$0), List::of);
   }

   public List<dpi<?, ?>> a() {
      return this.f.get();
   }

   public List<ig<dwl>> b() {
      return this.e;
   }

   public boolean a(dwl $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends csz.b {
      private final ic<dwl> a;
      private final ic<dou<?>> b;

      public a(ic<dwl> $$0, ic<dou<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public csz.a a(dmn.b $$0, agh<dwl> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public csz.a a(dmn.a $$0, agh<dou<?>> $$1) {
         this.a($$0, this.b.b($$1));
         return this;
      }
   }

   public static class b {
      private final Map<dmn.a, List<ib<dou<?>>>> a = Maps.newLinkedHashMap();
      private final List<List<ib<dwl>>> b = Lists.newArrayList();

      public csz.b a(dmn.b $$0, ib<dwl> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public csz.b a(int $$0, ib<dwl> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public csz.b a(dmn.a $$0, ib<dou<?>> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public csz a() {
         return new csz(
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ig.a((List)$$0.getValue()))),
            this.b.stream().map(ig::a).collect(ImmutableList.toImmutableList())
         );
      }
   }
}
