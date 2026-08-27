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

public class dbz {
   private static final Logger c = LogUtils.getLogger();
   public static final dbz a = new dbz(ImmutableMap.of(), ImmutableList.of());
   public static final MapCodec<dbz> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.simpleMap(dwr.a.c, dyy.c.promotePartial(ac.a("Carver: ", c::error)), ayz.a(dwr.a.values())).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               egp.d.promotePartial(ac.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dbz::new)
   );
   private final Map<dwr.a, jb<dyy<?>>> d;
   private final List<jb<egp>> e;
   private final Supplier<List<dzm<?, ?>>> f;
   private final Supplier<Set<egp>> g;

   dbz(Map<dwr.a, jb<dyy<?>>> $$0, List<jb<egp>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(jb::a).map(ix::a).flatMap(egp::a).filter($$0xx -> $$0xx.b() == dzz.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(jb::a).map(ix::a).collect(Collectors.toSet()));
   }

   public Iterable<ix<dyy<?>>> a(dwr.a $$0) {
      return Objects.requireNonNullElseGet(this.d.get($$0), List::of);
   }

   public List<dzm<?, ?>> a() {
      return this.f.get();
   }

   public List<jb<egp>> b() {
      return this.e;
   }

   public boolean a(egp $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends dbz.b {
      private final iy<egp> a;
      private final iy<dyy<?>> b;

      public a(iy<egp> $$0, iy<dyy<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public dbz.a a(dwr.b $$0, akm<egp> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public dbz.a a(dwr.a $$0, akm<dyy<?>> $$1) {
         this.a($$0, this.b.b($$1));
         return this;
      }
   }

   public static class b {
      private final Map<dwr.a, List<ix<dyy<?>>>> a = Maps.newLinkedHashMap();
      private final List<List<ix<egp>>> b = Lists.newArrayList();

      public dbz.b a(dwr.b $$0, ix<egp> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public dbz.b a(int $$0, ix<egp> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public dbz.b a(dwr.a $$0, ix<dyy<?>> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public dbz a() {
         return new dbz(
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> jb.a((List)$$0.getValue()))),
            this.b.stream().map(jb::a).collect(ImmutableList.toImmutableList())
         );
      }
   }
}
