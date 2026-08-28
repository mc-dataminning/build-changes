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

public class ddh {
   private static final Logger c = LogUtils.getLogger();
   public static final ddh a = new ddh(ImmutableMap.of(), ImmutableList.of());
   public static final MapCodec<ddh> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.simpleMap(dyc.a.c, eak.c.promotePartial(ac.a("Carver: ", c::error)), azc.a(dyc.a.values())).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               eib.d.promotePartial(ac.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ddh::new)
   );
   private final Map<dyc.a, jn<eak<?>>> d;
   private final List<jn<eib>> e;
   private final Supplier<List<eay<?, ?>>> f;
   private final Supplier<Set<eib>> g;

   ddh(Map<dyc.a, jn<eak<?>>> $$0, List<jn<eib>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(jn::a).map(jj::a).flatMap(eib::a).filter($$0xx -> $$0xx.b() == ebl.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(jn::a).map(jj::a).collect(Collectors.toSet()));
   }

   public Iterable<jj<eak<?>>> a(dyc.a $$0) {
      return Objects.requireNonNullElseGet(this.d.get($$0), List::of);
   }

   public List<eay<?, ?>> a() {
      return this.f.get();
   }

   public List<jn<eib>> b() {
      return this.e;
   }

   public boolean a(eib $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends ddh.b {
      private final jk<eib> a;
      private final jk<eak<?>> b;

      public a(jk<eib> $$0, jk<eak<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public ddh.a a(dyc.b $$0, akj<eib> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public ddh.a a(dyc.a $$0, akj<eak<?>> $$1) {
         this.a($$0, this.b.b($$1));
         return this;
      }
   }

   public static class b {
      private final Map<dyc.a, List<jj<eak<?>>>> a = Maps.newLinkedHashMap();
      private final List<List<jj<eib>>> b = Lists.newArrayList();

      public ddh.b a(dyc.b $$0, jj<eib> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public ddh.b a(int $$0, jj<eib> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public ddh.b a(dyc.a $$0, jj<eak<?>> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public ddh a() {
         return new ddh(
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> jn.a((List)$$0.getValue()))),
            this.b.stream().map(jn::a).collect(ImmutableList.toImmutableList())
         );
      }
   }
}
