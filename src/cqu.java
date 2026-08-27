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

public class cqu {
   private static final Logger c = LogUtils.getLogger();
   public static final cqu a = new cqu(ImmutableMap.of(), ImmutableList.of());
   public static final MapCodec<cqu> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.simpleMap(dko.a.c, dmv.c.promotePartial(ac.a("Carver: ", c::error)), asp.a(dko.a.values())).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               dum.d.promotePartial(ac.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, cqu::new)
   );
   private final Map<dko.a, hk<dmv<?>>> d;
   private final List<hk<dum>> e;
   private final Supplier<List<dnj<?, ?>>> f;
   private final Supplier<Set<dum>> g;

   cqu(Map<dko.a, hk<dmv<?>>> $$0, List<hk<dum>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(hk::a).map(hg::a).flatMap(dum::a).filter($$0xx -> $$0xx.b() == dnw.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(hk::a).map(hg::a).collect(Collectors.toSet()));
   }

   public Iterable<hg<dmv<?>>> a(dko.a $$0) {
      return Objects.requireNonNullElseGet(this.d.get($$0), List::of);
   }

   public List<dnj<?, ?>> a() {
      return this.f.get();
   }

   public List<hk<dum>> b() {
      return this.e;
   }

   public boolean a(dum $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends cqu.b {
      private final hh<dum> a;
      private final hh<dmv<?>> b;

      public a(hh<dum> $$0, hh<dmv<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public cqu.a a(dko.b $$0, aew<dum> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public cqu.a a(dko.a $$0, aew<dmv<?>> $$1) {
         this.a($$0, this.b.b($$1));
         return this;
      }
   }

   public static class b {
      private final Map<dko.a, List<hg<dmv<?>>>> a = Maps.newLinkedHashMap();
      private final List<List<hg<dum>>> b = Lists.newArrayList();

      public cqu.b a(dko.b $$0, hg<dum> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public cqu.b a(int $$0, hg<dum> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public cqu.b a(dko.a $$0, hg<dmv<?>> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public cqu a() {
         return new cqu(
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> hk.a((List)$$0.getValue()))),
            this.b.stream().map(hk::a).collect(ImmutableList.toImmutableList())
         );
      }
   }
}
