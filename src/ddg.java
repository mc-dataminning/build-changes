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

public class ddg {
   private static final Logger c = LogUtils.getLogger();
   public static final ddg a = new ddg(ImmutableMap.of(), ImmutableList.of());
   public static final MapCodec<ddg> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.simpleMap(dyb.a.c, eaj.c.promotePartial(ac.a("Carver: ", c::error)), azc.a(dyb.a.values())).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               eia.d.promotePartial(ac.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ddg::new)
   );
   private final Map<dyb.a, jn<eaj<?>>> d;
   private final List<jn<eia>> e;
   private final Supplier<List<eax<?, ?>>> f;
   private final Supplier<Set<eia>> g;

   ddg(Map<dyb.a, jn<eaj<?>>> $$0, List<jn<eia>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(jn::a).map(jj::a).flatMap(eia::a).filter($$0xx -> $$0xx.b() == ebk.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(jn::a).map(jj::a).collect(Collectors.toSet()));
   }

   public Iterable<jj<eaj<?>>> a(dyb.a $$0) {
      return Objects.requireNonNullElseGet(this.d.get($$0), List::of);
   }

   public List<eax<?, ?>> a() {
      return this.f.get();
   }

   public List<jn<eia>> b() {
      return this.e;
   }

   public boolean a(eia $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends ddg.b {
      private final jk<eia> a;
      private final jk<eaj<?>> b;

      public a(jk<eia> $$0, jk<eaj<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public ddg.a a(dyb.b $$0, akj<eia> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public ddg.a a(dyb.a $$0, akj<eaj<?>> $$1) {
         this.a($$0, this.b.b($$1));
         return this;
      }
   }

   public static class b {
      private final Map<dyb.a, List<jj<eaj<?>>>> a = Maps.newLinkedHashMap();
      private final List<List<jj<eia>>> b = Lists.newArrayList();

      public ddg.b a(dyb.b $$0, jj<eia> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public ddg.b a(int $$0, jj<eia> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public ddg.b a(dyb.a $$0, jj<eaj<?>> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public ddg a() {
         return new ddg(
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> jn.a((List)$$0.getValue()))),
            this.b.stream().map(jn::a).collect(ImmutableList.toImmutableList())
         );
      }
   }
}
