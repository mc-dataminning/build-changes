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

public class dke {
   private static final Logger c = LogUtils.getLogger();
   public static final dke a = new dke(ji.a(), List.of());
   public static final MapCodec<dke> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               eik.c.promotePartial(af.a("Carver: ", c::error)).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               eqf.d.promotePartial(af.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dke::new)
   );
   private final ji<eik<?>> d;
   private final List<ji<eqf>> e;
   private final Supplier<List<eiy<?, ?>>> f;
   private final Supplier<Set<eqf>> g;

   dke(ji<eik<?>> $$0, List<ji<eqf>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(ji::a).map(je::a).flatMap(eqf::a).filter($$0xx -> $$0xx.b() == ejm.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(ji::a).map(je::a).collect(Collectors.toSet()));
   }

   public Iterable<je<eik<?>>> a() {
      return this.d;
   }

   public List<eiy<?, ?>> b() {
      return this.f.get();
   }

   public List<ji<eqf>> c() {
      return this.e;
   }

   public boolean a(eqf $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends dke.b {
      private final jf<eqf> a;
      private final jf<eik<?>> b;

      public a(jf<eqf> $$0, jf<eik<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public dke.a a(egc.a $$0, alf<eqf> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public dke.a a(alf<eik<?>> $$0) {
         this.a(this.b.b($$0));
         return this;
      }
   }

   public static class b {
      private final List<je<eik<?>>> a = new ArrayList<>();
      private final List<List<je<eqf>>> b = new ArrayList<>();

      public dke.b a(egc.a $$0, je<eqf> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public dke.b a(int $$0, je<eqf> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public dke.b a(je<eik<?>> $$0) {
         this.a.add($$0);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public dke a() {
         return new dke(ji.a(this.a), this.b.stream().map(ji::a).collect(ImmutableList.toImmutableList()));
      }
   }
}
