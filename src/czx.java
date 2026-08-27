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

public class czx {
   private static final Logger c = LogUtils.getLogger();
   public static final czx a = new czx(ImmutableMap.of(), ImmutableList.of());
   public static final MapCodec<czx> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.simpleMap(dun.a.c, dwu.c.promotePartial(ac.a("Carver: ", c::error)), aye.a(dun.a.values())).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               eel.d.promotePartial(ac.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, czx::new)
   );
   private final Map<dun.a, ip<dwu<?>>> d;
   private final List<ip<eel>> e;
   private final Supplier<List<dxi<?, ?>>> f;
   private final Supplier<Set<eel>> g;

   czx(Map<dun.a, ip<dwu<?>>> $$0, List<ip<eel>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(ip::a).map(il::a).flatMap(eel::a).filter($$0xx -> $$0xx.b() == dxv.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(ip::a).map(il::a).collect(Collectors.toSet()));
   }

   public Iterable<il<dwu<?>>> a(dun.a $$0) {
      return Objects.requireNonNullElseGet(this.d.get($$0), List::of);
   }

   public List<dxi<?, ?>> a() {
      return this.f.get();
   }

   public List<ip<eel>> b() {
      return this.e;
   }

   public boolean a(eel $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends czx.b {
      private final im<eel> a;
      private final im<dwu<?>> b;

      public a(im<eel> $$0, im<dwu<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public czx.a a(dun.b $$0, ajs<eel> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public czx.a a(dun.a $$0, ajs<dwu<?>> $$1) {
         this.a($$0, this.b.b($$1));
         return this;
      }
   }

   public static class b {
      private final Map<dun.a, List<il<dwu<?>>>> a = Maps.newLinkedHashMap();
      private final List<List<il<eel>>> b = Lists.newArrayList();

      public czx.b a(dun.b $$0, il<eel> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public czx.b a(int $$0, il<eel> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public czx.b a(dun.a $$0, il<dwu<?>> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public czx a() {
         return new czx(
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ip.a((List)$$0.getValue()))),
            this.b.stream().map(ip::a).collect(ImmutableList.toImmutableList())
         );
      }
   }
}
