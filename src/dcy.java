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

public class dcy {
   private static final Logger c = LogUtils.getLogger();
   public static final dcy a = new dcy(ImmutableMap.of(), ImmutableList.of());
   public static final MapCodec<dcy> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.simpleMap(dxq.a.c, dzx.c.promotePartial(ac.a("Carver: ", c::error)), azu.a(dxq.a.values())).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               eho.d.promotePartial(ac.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dcy::new)
   );
   private final Map<dxq.a, jm<dzx<?>>> d;
   private final List<jm<eho>> e;
   private final Supplier<List<eal<?, ?>>> f;
   private final Supplier<Set<eho>> g;

   dcy(Map<dxq.a, jm<dzx<?>>> $$0, List<jm<eho>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(jm::a).map(ji::a).flatMap(eho::a).filter($$0xx -> $$0xx.b() == eay.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(jm::a).map(ji::a).collect(Collectors.toSet()));
   }

   public Iterable<ji<dzx<?>>> a(dxq.a $$0) {
      return Objects.requireNonNullElseGet(this.d.get($$0), List::of);
   }

   public List<eal<?, ?>> a() {
      return this.f.get();
   }

   public List<jm<eho>> b() {
      return this.e;
   }

   public boolean a(eho $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends dcy.b {
      private final jj<eho> a;
      private final jj<dzx<?>> b;

      public a(jj<eho> $$0, jj<dzx<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public dcy.a a(dxq.b $$0, ale<eho> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public dcy.a a(dxq.a $$0, ale<dzx<?>> $$1) {
         this.a($$0, this.b.b($$1));
         return this;
      }
   }

   public static class b {
      private final Map<dxq.a, List<ji<dzx<?>>>> a = Maps.newLinkedHashMap();
      private final List<List<ji<eho>>> b = Lists.newArrayList();

      public dcy.b a(dxq.b $$0, ji<eho> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public dcy.b a(int $$0, ji<eho> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public dcy.b a(dxq.a $$0, ji<dzx<?>> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public dcy a() {
         return new dcy(
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> jm.a((List)$$0.getValue()))),
            this.b.stream().map(jm::a).collect(ImmutableList.toImmutableList())
         );
      }
   }
}
