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

public class dcx {
   private static final Logger c = LogUtils.getLogger();
   public static final dcx a = new dcx(ImmutableMap.of(), ImmutableList.of());
   public static final MapCodec<dcx> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.simpleMap(dxp.a.c, dzw.c.promotePartial(ac.a("Carver: ", c::error)), azt.a(dxp.a.values())).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               ehn.d.promotePartial(ac.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dcx::new)
   );
   private final Map<dxp.a, jm<dzw<?>>> d;
   private final List<jm<ehn>> e;
   private final Supplier<List<eak<?, ?>>> f;
   private final Supplier<Set<ehn>> g;

   dcx(Map<dxp.a, jm<dzw<?>>> $$0, List<jm<ehn>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(jm::a).map(ji::a).flatMap(ehn::a).filter($$0xx -> $$0xx.b() == eax.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(jm::a).map(ji::a).collect(Collectors.toSet()));
   }

   public Iterable<ji<dzw<?>>> a(dxp.a $$0) {
      return Objects.requireNonNullElseGet(this.d.get($$0), List::of);
   }

   public List<eak<?, ?>> a() {
      return this.f.get();
   }

   public List<jm<ehn>> b() {
      return this.e;
   }

   public boolean a(ehn $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends dcx.b {
      private final jj<ehn> a;
      private final jj<dzw<?>> b;

      public a(jj<ehn> $$0, jj<dzw<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public dcx.a a(dxp.b $$0, ald<ehn> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public dcx.a a(dxp.a $$0, ald<dzw<?>> $$1) {
         this.a($$0, this.b.b($$1));
         return this;
      }
   }

   public static class b {
      private final Map<dxp.a, List<ji<dzw<?>>>> a = Maps.newLinkedHashMap();
      private final List<List<ji<ehn>>> b = Lists.newArrayList();

      public dcx.b a(dxp.b $$0, ji<ehn> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public dcx.b a(int $$0, ji<ehn> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public dcx.b a(dxp.a $$0, ji<dzw<?>> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public dcx a() {
         return new dcx(
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> jm.a((List)$$0.getValue()))),
            this.b.stream().map(jm::a).collect(ImmutableList.toImmutableList())
         );
      }
   }
}
