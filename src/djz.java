import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class djz {
   private static final Logger c = LogUtils.getLogger();
   public static final djz a = new djz(ji.a(), List.of());
   public static final MapCodec<djz> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               eic.c.promotePartial(af.a("Carver: ", c::error)).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               epx.d.promotePartial(af.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, djz::new)
   );
   private final ji<eic<?>> d;
   private final List<ji<epx>> e;
   private final Supplier<List<eiq<?, ?>>> f;
   private final Supplier<Set<epx>> g;

   djz(ji<eic<?>> $$0, List<ji<epx>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(ji::a).map(je::a).flatMap(epx::a).filter($$0xx -> $$0xx.b() == eje.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(ji::a).map(je::a).collect(Collectors.toSet()));
   }

   public Iterable<je<eic<?>>> a() {
      return this.d;
   }

   public List<eiq<?, ?>> b() {
      return this.f.get();
   }

   public List<ji<epx>> c() {
      return this.e;
   }

   public boolean a(epx $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends djz.b {
      private final jf<epx> a;
      private final jf<eic<?>> b;

      public a(jf<epx> $$0, jf<eic<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public djz.a a(efu.a $$0, alf<epx> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public djz.a a(alf<eic<?>> $$0) {
         this.a(this.b.b($$0));
         return this;
      }
   }

   public static class b {
      private final List<je<eic<?>>> a = new ArrayList<>();
      private final List<List<je<epx>>> b = new ArrayList<>();

      public djz.b a(efu.a $$0, je<epx> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public djz.b a(int $$0, je<epx> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public djz.b a(je<eic<?>> $$0) {
         this.a.add($$0);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public djz a() {
         return new djz(ji.a(this.a), this.b.stream().map(ji::a).collect(ImmutableList.toImmutableList()));
      }
   }
}
