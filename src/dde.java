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

public class dde {
   private static final Logger c = LogUtils.getLogger();
   public static final dde a = new dde(ImmutableMap.of(), ImmutableList.of());
   public static final MapCodec<dde> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.simpleMap(dxv.a.c, ead.c.promotePartial(ac.a("Carver: ", c::error)), ayz.a(dxv.a.values())).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               ehu.d.promotePartial(ac.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dde::new)
   );
   private final Map<dxv.a, jn<ead<?>>> d;
   private final List<jn<ehu>> e;
   private final Supplier<List<ear<?, ?>>> f;
   private final Supplier<Set<ehu>> g;

   dde(Map<dxv.a, jn<ead<?>>> $$0, List<jn<ehu>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(jn::a).map(jj::a).flatMap(ehu::a).filter($$0xx -> $$0xx.b() == ebe.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(jn::a).map(jj::a).collect(Collectors.toSet()));
   }

   public Iterable<jj<ead<?>>> a(dxv.a $$0) {
      return Objects.requireNonNullElseGet(this.d.get($$0), List::of);
   }

   public List<ear<?, ?>> a() {
      return this.f.get();
   }

   public List<jn<ehu>> b() {
      return this.e;
   }

   public boolean a(ehu $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends dde.b {
      private final jk<ehu> a;
      private final jk<ead<?>> b;

      public a(jk<ehu> $$0, jk<ead<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public dde.a a(dxv.b $$0, akj<ehu> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public dde.a a(dxv.a $$0, akj<ead<?>> $$1) {
         this.a($$0, this.b.b($$1));
         return this;
      }
   }

   public static class b {
      private final Map<dxv.a, List<jj<ead<?>>>> a = Maps.newLinkedHashMap();
      private final List<List<jj<ehu>>> b = Lists.newArrayList();

      public dde.b a(dxv.b $$0, jj<ehu> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public dde.b a(int $$0, jj<ehu> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public dde.b a(dxv.a $$0, jj<ead<?>> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public dde a() {
         return new dde(
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> jn.a((List)$$0.getValue()))),
            this.b.stream().map(jn::a).collect(ImmutableList.toImmutableList())
         );
      }
   }
}
