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

public class dbx {
   private static final Logger c = LogUtils.getLogger();
   public static final dbx a = new dbx(ImmutableMap.of(), ImmutableList.of());
   public static final MapCodec<dbx> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.simpleMap(dwp.a.c, dyw.c.promotePartial(ac.a("Carver: ", c::error)), ayx.a(dwp.a.values())).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               egn.d.promotePartial(ac.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dbx::new)
   );
   private final Map<dwp.a, jb<dyw<?>>> d;
   private final List<jb<egn>> e;
   private final Supplier<List<dzk<?, ?>>> f;
   private final Supplier<Set<egn>> g;

   dbx(Map<dwp.a, jb<dyw<?>>> $$0, List<jb<egn>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(jb::a).map(ix::a).flatMap(egn::a).filter($$0xx -> $$0xx.b() == dzx.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(jb::a).map(ix::a).collect(Collectors.toSet()));
   }

   public Iterable<ix<dyw<?>>> a(dwp.a $$0) {
      return Objects.requireNonNullElseGet(this.d.get($$0), List::of);
   }

   public List<dzk<?, ?>> a() {
      return this.f.get();
   }

   public List<jb<egn>> b() {
      return this.e;
   }

   public boolean a(egn $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends dbx.b {
      private final iy<egn> a;
      private final iy<dyw<?>> b;

      public a(iy<egn> $$0, iy<dyw<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public dbx.a a(dwp.b $$0, akl<egn> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public dbx.a a(dwp.a $$0, akl<dyw<?>> $$1) {
         this.a($$0, this.b.b($$1));
         return this;
      }
   }

   public static class b {
      private final Map<dwp.a, List<ix<dyw<?>>>> a = Maps.newLinkedHashMap();
      private final List<List<ix<egn>>> b = Lists.newArrayList();

      public dbx.b a(dwp.b $$0, ix<egn> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public dbx.b a(int $$0, ix<egn> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public dbx.b a(dwp.a $$0, ix<dyw<?>> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public dbx a() {
         return new dbx(
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> jb.a((List)$$0.getValue()))),
            this.b.stream().map(jb::a).collect(ImmutableList.toImmutableList())
         );
      }
   }
}
