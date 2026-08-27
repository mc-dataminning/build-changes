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

public class cqj {
   private static final Logger c = LogUtils.getLogger();
   public static final cqj a = new cqj(ImmutableMap.of(), ImmutableList.of());
   public static final MapCodec<cqj> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.simpleMap(dkd.a.c, dmk.c.promotePartial(ac.a("Carver: ", c::error)), asf.a(dkd.a.values())).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               dub.d.promotePartial(ac.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, cqj::new)
   );
   private final Map<dkd.a, hj<dmk<?>>> d;
   private final List<hj<dub>> e;
   private final Supplier<List<dmy<?, ?>>> f;
   private final Supplier<Set<dub>> g;

   cqj(Map<dkd.a, hj<dmk<?>>> $$0, List<hj<dub>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(hj::a).map(hf::a).flatMap(dub::a).filter($$0xx -> $$0xx.b() == dnl.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(hj::a).map(hf::a).collect(Collectors.toSet()));
   }

   public Iterable<hf<dmk<?>>> a(dkd.a $$0) {
      return Objects.requireNonNullElseGet(this.d.get($$0), List::of);
   }

   public List<dmy<?, ?>> a() {
      return this.f.get();
   }

   public List<hj<dub>> b() {
      return this.e;
   }

   public boolean a(dub $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends cqj.b {
      private final hg<dub> a;
      private final hg<dmk<?>> b;

      public a(hg<dub> $$0, hg<dmk<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public cqj.a a(dkd.b $$0, aeo<dub> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public cqj.a a(dkd.a $$0, aeo<dmk<?>> $$1) {
         this.a($$0, this.b.b($$1));
         return this;
      }
   }

   public static class b {
      private final Map<dkd.a, List<hf<dmk<?>>>> a = Maps.newLinkedHashMap();
      private final List<List<hf<dub>>> b = Lists.newArrayList();

      public cqj.b a(dkd.b $$0, hf<dub> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public cqj.b a(int $$0, hf<dub> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public cqj.b a(dkd.a $$0, hf<dmk<?>> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public cqj a() {
         return new cqj(
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> hj.a((List)$$0.getValue()))),
            this.b.stream().map(hj::a).collect(ImmutableList.toImmutableList())
         );
      }
   }
}
