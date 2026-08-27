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

public class cry {
   private static final Logger c = LogUtils.getLogger();
   public static final cry a = new cry(ImmutableMap.of(), ImmutableList.of());
   public static final MapCodec<cry> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.simpleMap(dlg.a.c, dnn.c.promotePartial(ac.a("Carver: ", c::error)), atr.a(dlg.a.values())).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               dve.d.promotePartial(ac.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, cry::new)
   );
   private final Map<dlg.a, ig<dnn<?>>> d;
   private final List<ig<dve>> e;
   private final Supplier<List<dob<?, ?>>> f;
   private final Supplier<Set<dve>> g;

   cry(Map<dlg.a, ig<dnn<?>>> $$0, List<ig<dve>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(ig::a).map(ib::a).flatMap(dve::a).filter($$0xx -> $$0xx.b() == doo.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(ig::a).map(ib::a).collect(Collectors.toSet()));
   }

   public Iterable<ib<dnn<?>>> a(dlg.a $$0) {
      return Objects.requireNonNullElseGet(this.d.get($$0), List::of);
   }

   public List<dob<?, ?>> a() {
      return this.f.get();
   }

   public List<ig<dve>> b() {
      return this.e;
   }

   public boolean a(dve $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends cry.b {
      private final ic<dve> a;
      private final ic<dnn<?>> b;

      public a(ic<dve> $$0, ic<dnn<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public cry.a a(dlg.b $$0, afv<dve> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public cry.a a(dlg.a $$0, afv<dnn<?>> $$1) {
         this.a($$0, this.b.b($$1));
         return this;
      }
   }

   public static class b {
      private final Map<dlg.a, List<ib<dnn<?>>>> a = Maps.newLinkedHashMap();
      private final List<List<ib<dve>>> b = Lists.newArrayList();

      public cry.b a(dlg.b $$0, ib<dve> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public cry.b a(int $$0, ib<dve> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public cry.b a(dlg.a $$0, ib<dnn<?>> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public cry a() {
         return new cry(
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ig.a((List)$$0.getValue()))),
            this.b.stream().map(ig::a).collect(ImmutableList.toImmutableList())
         );
      }
   }
}
