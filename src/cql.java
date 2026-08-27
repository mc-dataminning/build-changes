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

public class cql {
   private static final Logger c = LogUtils.getLogger();
   public static final cql a = new cql(ImmutableMap.of(), ImmutableList.of());
   public static final MapCodec<cql> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.simpleMap(dkf.a.c, dmm.c.promotePartial(ac.a("Carver: ", c::error)), ash.a(dkf.a.values())).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               dud.d.promotePartial(ac.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, cql::new)
   );
   private final Map<dkf.a, hi<dmm<?>>> d;
   private final List<hi<dud>> e;
   private final Supplier<List<dna<?, ?>>> f;
   private final Supplier<Set<dud>> g;

   cql(Map<dkf.a, hi<dmm<?>>> $$0, List<hi<dud>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(hi::a).map(he::a).flatMap(dud::a).filter($$0xx -> $$0xx.b() == dnn.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(hi::a).map(he::a).collect(Collectors.toSet()));
   }

   public Iterable<he<dmm<?>>> a(dkf.a $$0) {
      return Objects.requireNonNullElseGet(this.d.get($$0), List::of);
   }

   public List<dna<?, ?>> a() {
      return this.f.get();
   }

   public List<hi<dud>> b() {
      return this.e;
   }

   public boolean a(dud $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends cql.b {
      private final hf<dud> a;
      private final hf<dmm<?>> b;

      public a(hf<dud> $$0, hf<dmm<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public cql.a a(dkf.b $$0, aeq<dud> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public cql.a a(dkf.a $$0, aeq<dmm<?>> $$1) {
         this.a($$0, this.b.b($$1));
         return this;
      }
   }

   public static class b {
      private final Map<dkf.a, List<he<dmm<?>>>> a = Maps.newLinkedHashMap();
      private final List<List<he<dud>>> b = Lists.newArrayList();

      public cql.b a(dkf.b $$0, he<dud> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public cql.b a(int $$0, he<dud> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public cql.b a(dkf.a $$0, he<dmm<?>> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public cql a() {
         return new cql(
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> hi.a((List)$$0.getValue()))),
            this.b.stream().map(hi::a).collect(ImmutableList.toImmutableList())
         );
      }
   }
}
