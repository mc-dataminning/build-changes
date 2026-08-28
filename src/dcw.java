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

public class dcw {
   private static final Logger c = LogUtils.getLogger();
   public static final dcw a = new dcw(ImmutableMap.of(), ImmutableList.of());
   public static final MapCodec<dcw> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.simpleMap(dxo.a.c, dzv.c.promotePartial(ac.a("Carver: ", c::error)), azs.a(dxo.a.values())).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               ehm.d.promotePartial(ac.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dcw::new)
   );
   private final Map<dxo.a, jm<dzv<?>>> d;
   private final List<jm<ehm>> e;
   private final Supplier<List<eaj<?, ?>>> f;
   private final Supplier<Set<ehm>> g;

   dcw(Map<dxo.a, jm<dzv<?>>> $$0, List<jm<ehm>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(jm::a).map(ji::a).flatMap(ehm::a).filter($$0xx -> $$0xx.b() == eaw.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(jm::a).map(ji::a).collect(Collectors.toSet()));
   }

   public Iterable<ji<dzv<?>>> a(dxo.a $$0) {
      return Objects.requireNonNullElseGet(this.d.get($$0), List::of);
   }

   public List<eaj<?, ?>> a() {
      return this.f.get();
   }

   public List<jm<ehm>> b() {
      return this.e;
   }

   public boolean a(ehm $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends dcw.b {
      private final jj<ehm> a;
      private final jj<dzv<?>> b;

      public a(jj<ehm> $$0, jj<dzv<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public dcw.a a(dxo.b $$0, ald<ehm> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public dcw.a a(dxo.a $$0, ald<dzv<?>> $$1) {
         this.a($$0, this.b.b($$1));
         return this;
      }
   }

   public static class b {
      private final Map<dxo.a, List<ji<dzv<?>>>> a = Maps.newLinkedHashMap();
      private final List<List<ji<ehm>>> b = Lists.newArrayList();

      public dcw.b a(dxo.b $$0, ji<ehm> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public dcw.b a(int $$0, ji<ehm> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public dcw.b a(dxo.a $$0, ji<dzv<?>> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public dcw a() {
         return new dcw(
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> jm.a((List)$$0.getValue()))),
            this.b.stream().map(jm::a).collect(ImmutableList.toImmutableList())
         );
      }
   }
}
