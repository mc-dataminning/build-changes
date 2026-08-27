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

public class cwn {
   private static final Logger c = LogUtils.getLogger();
   public static final cwn a = new cwn(ImmutableMap.of(), ImmutableList.of());
   public static final MapCodec<cwn> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.simpleMap(dqk.a.c, dsr.c.promotePartial(ac.a("Carver: ", c::error)), axc.a(dqk.a.values())).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               eai.d.promotePartial(ac.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, cwn::new)
   );
   private final Map<dqk.a, in<dsr<?>>> d;
   private final List<in<eai>> e;
   private final Supplier<List<dtf<?, ?>>> f;
   private final Supplier<Set<eai>> g;

   cwn(Map<dqk.a, in<dsr<?>>> $$0, List<in<eai>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(in::a).map(ij::a).flatMap(eai::a).filter($$0xx -> $$0xx.b() == dts.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(in::a).map(ij::a).collect(Collectors.toSet()));
   }

   public Iterable<ij<dsr<?>>> a(dqk.a $$0) {
      return Objects.requireNonNullElseGet(this.d.get($$0), List::of);
   }

   public List<dtf<?, ?>> a() {
      return this.f.get();
   }

   public List<in<eai>> b() {
      return this.e;
   }

   public boolean a(eai $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends cwn.b {
      private final ik<eai> a;
      private final ik<dsr<?>> b;

      public a(ik<eai> $$0, ik<dsr<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public cwn.a a(dqk.b $$0, aix<eai> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public cwn.a a(dqk.a $$0, aix<dsr<?>> $$1) {
         this.a($$0, this.b.b($$1));
         return this;
      }
   }

   public static class b {
      private final Map<dqk.a, List<ij<dsr<?>>>> a = Maps.newLinkedHashMap();
      private final List<List<ij<eai>>> b = Lists.newArrayList();

      public cwn.b a(dqk.b $$0, ij<eai> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public cwn.b a(int $$0, ij<eai> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public cwn.b a(dqk.a $$0, ij<dsr<?>> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public cwn a() {
         return new cwn(
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> in.a((List)$$0.getValue()))),
            this.b.stream().map(in::a).collect(ImmutableList.toImmutableList())
         );
      }
   }
}
