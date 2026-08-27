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

public class cty {
   private static final Logger c = LogUtils.getLogger();
   public static final cty a = new cty(ImmutableMap.of(), ImmutableList.of());
   public static final MapCodec<cty> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.simpleMap(dnu.a.c, dqb.c.promotePartial(ac.a("Carver: ", c::error)), aut.a(dnu.a.values())).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               dxs.d.promotePartial(ac.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, cty::new)
   );
   private final Map<dnu.a, ij<dqb<?>>> d;
   private final List<ij<dxs>> e;
   private final Supplier<List<dqp<?, ?>>> f;
   private final Supplier<Set<dxs>> g;

   cty(Map<dnu.a, ij<dqb<?>>> $$0, List<ij<dxs>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(ij::a).map(ie::a).flatMap(dxs::a).filter($$0xx -> $$0xx.b() == drc.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(ij::a).map(ie::a).collect(Collectors.toSet()));
   }

   public Iterable<ie<dqb<?>>> a(dnu.a $$0) {
      return Objects.requireNonNullElseGet(this.d.get($$0), List::of);
   }

   public List<dqp<?, ?>> a() {
      return this.f.get();
   }

   public List<ij<dxs>> b() {
      return this.e;
   }

   public boolean a(dxs $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends cty.b {
      private final ig<dxs> a;
      private final ig<dqb<?>> b;

      public a(ig<dxs> $$0, ig<dqb<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public cty.a a(dnu.b $$0, ags<dxs> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public cty.a a(dnu.a $$0, ags<dqb<?>> $$1) {
         this.a($$0, this.b.b($$1));
         return this;
      }
   }

   public static class b {
      private final Map<dnu.a, List<ie<dqb<?>>>> a = Maps.newLinkedHashMap();
      private final List<List<ie<dxs>>> b = Lists.newArrayList();

      public cty.b a(dnu.b $$0, ie<dxs> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public cty.b a(int $$0, ie<dxs> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public cty.b a(dnu.a $$0, ie<dqb<?>> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public cty a() {
         return new cty(
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ij.a((List)$$0.getValue()))),
            this.b.stream().map(ij::a).collect(ImmutableList.toImmutableList())
         );
      }
   }
}
