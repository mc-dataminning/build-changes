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

public class cte {
   private static final Logger c = LogUtils.getLogger();
   public static final cte a = new cte(ImmutableMap.of(), ImmutableList.of());
   public static final MapCodec<cte> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.simpleMap(dms.a.c, doz.c.promotePartial(ac.a("Carver: ", c::error)), auk.a(dms.a.values())).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               dwq.d.promotePartial(ac.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, cte::new)
   );
   private final Map<dms.a, ik<doz<?>>> d;
   private final List<ik<dwq>> e;
   private final Supplier<List<dpn<?, ?>>> f;
   private final Supplier<Set<dwq>> g;

   cte(Map<dms.a, ik<doz<?>>> $$0, List<ik<dwq>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(ik::a).map(ig::a).flatMap(dwq::a).filter($$0xx -> $$0xx.b() == dqa.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(ik::a).map(ig::a).collect(Collectors.toSet()));
   }

   public Iterable<ig<doz<?>>> a(dms.a $$0) {
      return Objects.requireNonNullElseGet(this.d.get($$0), List::of);
   }

   public List<dpn<?, ?>> a() {
      return this.f.get();
   }

   public List<ik<dwq>> b() {
      return this.e;
   }

   public boolean a(dwq $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends cte.b {
      private final ih<dwq> a;
      private final ih<doz<?>> b;

      public a(ih<dwq> $$0, ih<doz<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public cte.a a(dms.b $$0, agl<dwq> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public cte.a a(dms.a $$0, agl<doz<?>> $$1) {
         this.a($$0, this.b.b($$1));
         return this;
      }
   }

   public static class b {
      private final Map<dms.a, List<ig<doz<?>>>> a = Maps.newLinkedHashMap();
      private final List<List<ig<dwq>>> b = Lists.newArrayList();

      public cte.b a(dms.b $$0, ig<dwq> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public cte.b a(int $$0, ig<dwq> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public cte.b a(dms.a $$0, ig<doz<?>> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public cte a() {
         return new cte(
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ik.a((List)$$0.getValue()))),
            this.b.stream().map(ik::a).collect(ImmutableList.toImmutableList())
         );
      }
   }
}
