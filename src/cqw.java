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

public class cqw {
   private static final Logger c = LogUtils.getLogger();
   public static final cqw a = new cqw(ImmutableMap.of(), ImmutableList.of());
   public static final MapCodec<cqw> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.simpleMap(dkq.a.c, dmx.c.promotePartial(ac.a("Carver: ", c::error)), asr.a(dkq.a.values())).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               duo.d.promotePartial(ac.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, cqw::new)
   );
   private final Map<dkq.a, hk<dmx<?>>> d;
   private final List<hk<duo>> e;
   private final Supplier<List<dnl<?, ?>>> f;
   private final Supplier<Set<duo>> g;

   cqw(Map<dkq.a, hk<dmx<?>>> $$0, List<hk<duo>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(hk::a).map(hg::a).flatMap(duo::a).filter($$0xx -> $$0xx.b() == dny.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(hk::a).map(hg::a).collect(Collectors.toSet()));
   }

   public Iterable<hg<dmx<?>>> a(dkq.a $$0) {
      return Objects.requireNonNullElseGet(this.d.get($$0), List::of);
   }

   public List<dnl<?, ?>> a() {
      return this.f.get();
   }

   public List<hk<duo>> b() {
      return this.e;
   }

   public boolean a(duo $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends cqw.b {
      private final hh<duo> a;
      private final hh<dmx<?>> b;

      public a(hh<duo> $$0, hh<dmx<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public cqw.a a(dkq.b $$0, aex<duo> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public cqw.a a(dkq.a $$0, aex<dmx<?>> $$1) {
         this.a($$0, this.b.b($$1));
         return this;
      }
   }

   public static class b {
      private final Map<dkq.a, List<hg<dmx<?>>>> a = Maps.newLinkedHashMap();
      private final List<List<hg<duo>>> b = Lists.newArrayList();

      public cqw.b a(dkq.b $$0, hg<duo> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public cqw.b a(int $$0, hg<duo> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public cqw.b a(dkq.a $$0, hg<dmx<?>> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public cqw a() {
         return new cqw(
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> hk.a((List)$$0.getValue()))),
            this.b.stream().map(hk::a).collect(ImmutableList.toImmutableList())
         );
      }
   }
}
