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

public class dag {
   private static final Logger c = LogUtils.getLogger();
   public static final dag a = new dag(ImmutableMap.of(), ImmutableList.of());
   public static final MapCodec<dag> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.simpleMap(duw.a.c, dxd.c.promotePartial(ac.a("Carver: ", c::error)), ayg.a(duw.a.values())).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               eeu.d.promotePartial(ac.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dag::new)
   );
   private final Map<duw.a, ir<dxd<?>>> d;
   private final List<ir<eeu>> e;
   private final Supplier<List<dxr<?, ?>>> f;
   private final Supplier<Set<eeu>> g;

   dag(Map<duw.a, ir<dxd<?>>> $$0, List<ir<eeu>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(ir::a).map(in::a).flatMap(eeu::a).filter($$0xx -> $$0xx.b() == dye.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(ir::a).map(in::a).collect(Collectors.toSet()));
   }

   public Iterable<in<dxd<?>>> a(duw.a $$0) {
      return Objects.requireNonNullElseGet(this.d.get($$0), List::of);
   }

   public List<dxr<?, ?>> a() {
      return this.f.get();
   }

   public List<ir<eeu>> b() {
      return this.e;
   }

   public boolean a(eeu $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends dag.b {
      private final io<eeu> a;
      private final io<dxd<?>> b;

      public a(io<eeu> $$0, io<dxd<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public dag.a a(duw.b $$0, aju<eeu> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public dag.a a(duw.a $$0, aju<dxd<?>> $$1) {
         this.a($$0, this.b.b($$1));
         return this;
      }
   }

   public static class b {
      private final Map<duw.a, List<in<dxd<?>>>> a = Maps.newLinkedHashMap();
      private final List<List<in<eeu>>> b = Lists.newArrayList();

      public dag.b a(duw.b $$0, in<eeu> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public dag.b a(int $$0, in<eeu> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public dag.b a(duw.a $$0, in<dxd<?>> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public dag a() {
         return new dag(
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ir.a((List)$$0.getValue()))),
            this.b.stream().map(ir::a).collect(ImmutableList.toImmutableList())
         );
      }
   }
}
