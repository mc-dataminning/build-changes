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

public class csr {
   private static final Logger c = LogUtils.getLogger();
   public static final csr a = new csr(ImmutableMap.of(), ImmutableList.of());
   public static final MapCodec<csr> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.simpleMap(dmb.a.c, doi.c.promotePartial(ac.a("Carver: ", c::error)), aub.a(dmb.a.values())).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               dvz.d.promotePartial(ac.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, csr::new)
   );
   private final Map<dmb.a, ig<doi<?>>> d;
   private final List<ig<dvz>> e;
   private final Supplier<List<dow<?, ?>>> f;
   private final Supplier<Set<dvz>> g;

   csr(Map<dmb.a, ig<doi<?>>> $$0, List<ig<dvz>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(ig::a).map(ib::a).flatMap(dvz::a).filter($$0xx -> $$0xx.b() == dpj.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(ig::a).map(ib::a).collect(Collectors.toSet()));
   }

   public Iterable<ib<doi<?>>> a(dmb.a $$0) {
      return Objects.requireNonNullElseGet(this.d.get($$0), List::of);
   }

   public List<dow<?, ?>> a() {
      return this.f.get();
   }

   public List<ig<dvz>> b() {
      return this.e;
   }

   public boolean a(dvz $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends csr.b {
      private final ic<dvz> a;
      private final ic<doi<?>> b;

      public a(ic<dvz> $$0, ic<doi<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public csr.a a(dmb.b $$0, agf<dvz> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public csr.a a(dmb.a $$0, agf<doi<?>> $$1) {
         this.a($$0, this.b.b($$1));
         return this;
      }
   }

   public static class b {
      private final Map<dmb.a, List<ib<doi<?>>>> a = Maps.newLinkedHashMap();
      private final List<List<ib<dvz>>> b = Lists.newArrayList();

      public csr.b a(dmb.b $$0, ib<dvz> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public csr.b a(int $$0, ib<dvz> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public csr.b a(dmb.a $$0, ib<doi<?>> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public csr a() {
         return new csr(
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ig.a((List)$$0.getValue()))),
            this.b.stream().map(ig::a).collect(ImmutableList.toImmutableList())
         );
      }
   }
}
