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

public class dau {
   private static final Logger c = LogUtils.getLogger();
   public static final dau a = new dau(ImmutableMap.of(), ImmutableList.of());
   public static final MapCodec<dau> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.simpleMap(dvm.a.c, dxt.c.promotePartial(ac.a("Carver: ", c::error)), ayq.a(dvm.a.values())).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               efk.d.promotePartial(ac.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dau::new)
   );
   private final Map<dvm.a, iz<dxt<?>>> d;
   private final List<iz<efk>> e;
   private final Supplier<List<dyh<?, ?>>> f;
   private final Supplier<Set<efk>> g;

   dau(Map<dvm.a, iz<dxt<?>>> $$0, List<iz<efk>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(iz::a).map(iv::a).flatMap(efk::a).filter($$0xx -> $$0xx.b() == dyu.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(iz::a).map(iv::a).collect(Collectors.toSet()));
   }

   public Iterable<iv<dxt<?>>> a(dvm.a $$0) {
      return Objects.requireNonNullElseGet(this.d.get($$0), List::of);
   }

   public List<dyh<?, ?>> a() {
      return this.f.get();
   }

   public List<iz<efk>> b() {
      return this.e;
   }

   public boolean a(efk $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends dau.b {
      private final iw<efk> a;
      private final iw<dxt<?>> b;

      public a(iw<efk> $$0, iw<dxt<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public dau.a a(dvm.b $$0, ake<efk> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public dau.a a(dvm.a $$0, ake<dxt<?>> $$1) {
         this.a($$0, this.b.b($$1));
         return this;
      }
   }

   public static class b {
      private final Map<dvm.a, List<iv<dxt<?>>>> a = Maps.newLinkedHashMap();
      private final List<List<iv<efk>>> b = Lists.newArrayList();

      public dau.b a(dvm.b $$0, iv<efk> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public dau.b a(int $$0, iv<efk> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public dau.b a(dvm.a $$0, iv<dxt<?>> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public dau a() {
         return new dau(
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> iz.a((List)$$0.getValue()))),
            this.b.stream().map(iz::a).collect(ImmutableList.toImmutableList())
         );
      }
   }
}
