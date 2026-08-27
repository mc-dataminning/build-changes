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

public class dda {
   private static final Logger c = LogUtils.getLogger();
   public static final dda a = new dda(ImmutableMap.of(), ImmutableList.of());
   public static final MapCodec<dda> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.simpleMap(dyq.a.c, eax.c.promotePartial(ad.a("Carver: ", c::error)), azg.a(dyq.a.values())).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               eix.d.promotePartial(ad.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dda::new)
   );
   private final Map<dyq.a, je<eax<?>>> d;
   private final List<je<eix>> e;
   private final Supplier<List<ebm<?, ?>>> f;
   private final Supplier<Set<eix>> g;

   dda(Map<dyq.a, je<eax<?>>> $$0, List<je<eix>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(je::a).map(ja::a).flatMap(eix::a).filter($$0xx -> $$0xx.b() == eca.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(je::a).map(ja::a).collect(Collectors.toSet()));
   }

   public Iterable<ja<eax<?>>> a(dyq.a $$0) {
      return Objects.requireNonNullElseGet(this.d.get($$0), List::of);
   }

   public List<ebm<?, ?>> a() {
      return this.f.get();
   }

   public List<je<eix>> b() {
      return this.e;
   }

   public boolean a(eix $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends dda.b {
      private final jb<eix> a;
      private final jb<eax<?>> b;

      public a(jb<eix> $$0, jb<eax<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public dda.a a(dyq.b $$0, aks<eix> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public dda.a a(dyq.a $$0, aks<eax<?>> $$1) {
         this.a($$0, this.b.b($$1));
         return this;
      }
   }

   public static class b {
      private final Map<dyq.a, List<ja<eax<?>>>> a = Maps.newLinkedHashMap();
      private final List<List<ja<eix>>> b = Lists.newArrayList();

      public dda.b a(dyq.b $$0, ja<eix> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public dda.b a(int $$0, ja<eix> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public dda.b a(dyq.a $$0, ja<eax<?>> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public dda a() {
         return new dda(
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> je.a((List)$$0.getValue()))),
            this.b.stream().map(je::a).collect(ImmutableList.toImmutableList())
         );
      }
   }
}
