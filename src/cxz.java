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

public class cxz {
   private static final Logger c = LogUtils.getLogger();
   public static final cxz a = new cxz(ImmutableMap.of(), ImmutableList.of());
   public static final MapCodec<cxz> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.simpleMap(dsi.a.c, dup.c.promotePartial(ac.a("Carver: ", c::error)), axq.a(dsi.a.values())).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               ecg.d.promotePartial(ac.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, cxz::new)
   );
   private final Map<dsi.a, ip<dup<?>>> d;
   private final List<ip<ecg>> e;
   private final Supplier<List<dvd<?, ?>>> f;
   private final Supplier<Set<ecg>> g;

   cxz(Map<dsi.a, ip<dup<?>>> $$0, List<ip<ecg>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(ip::a).map(il::a).flatMap(ecg::a).filter($$0xx -> $$0xx.b() == dvq.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(ip::a).map(il::a).collect(Collectors.toSet()));
   }

   public Iterable<il<dup<?>>> a(dsi.a $$0) {
      return Objects.requireNonNullElseGet(this.d.get($$0), List::of);
   }

   public List<dvd<?, ?>> a() {
      return this.f.get();
   }

   public List<ip<ecg>> b() {
      return this.e;
   }

   public boolean a(ecg $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends cxz.b {
      private final im<ecg> a;
      private final im<dup<?>> b;

      public a(im<ecg> $$0, im<dup<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public cxz.a a(dsi.b $$0, ajg<ecg> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public cxz.a a(dsi.a $$0, ajg<dup<?>> $$1) {
         this.a($$0, this.b.b($$1));
         return this;
      }
   }

   public static class b {
      private final Map<dsi.a, List<il<dup<?>>>> a = Maps.newLinkedHashMap();
      private final List<List<il<ecg>>> b = Lists.newArrayList();

      public cxz.b a(dsi.b $$0, il<ecg> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public cxz.b a(int $$0, il<ecg> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public cxz.b a(dsi.a $$0, il<dup<?>> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public cxz a() {
         return new cxz(
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ip.a((List)$$0.getValue()))),
            this.b.stream().map(ip::a).collect(ImmutableList.toImmutableList())
         );
      }
   }
}
