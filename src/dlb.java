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

public class dlb {
   private static final Logger c = LogUtils.getLogger();
   public static final dlb a = new dlb(jj.a(), List.of());
   public static final MapCodec<dlb> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ejh.c.promotePartial(ag.a("Carver: ", c::error)).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               erf.d.promotePartial(ag.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dlb::new)
   );
   private final jj<ejh<?>> d;
   private final List<jj<erf>> e;
   private final Supplier<List<ejv<?, ?>>> f;
   private final Supplier<Set<erf>> g;

   dlb(jj<ejh<?>> $$0, List<jj<erf>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(jj::a).map(jf::a).flatMap(erf::a).filter($$0xx -> $$0xx.b() == ekk.h).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(jj::a).map(jf::a).collect(Collectors.toSet()));
   }

   public Iterable<jf<ejh<?>>> a() {
      return this.d;
   }

   public List<ejv<?, ?>> b() {
      return this.f.get();
   }

   public List<jj<erf>> c() {
      return this.e;
   }

   public boolean a(erf $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends dlb.b {
      private final jg<erf> a;
      private final jg<ejh<?>> b;

      public a(jg<erf> $$0, jg<ejh<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public dlb.a a(egz.a $$0, alh<erf> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public dlb.a a(alh<ejh<?>> $$0) {
         this.a(this.b.b($$0));
         return this;
      }
   }

   public static class b {
      private final List<jf<ejh<?>>> a = new ArrayList<>();
      private final List<List<jf<erf>>> b = new ArrayList<>();

      public dlb.b a(egz.a $$0, jf<erf> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public dlb.b a(int $$0, jf<erf> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public dlb.b a(jf<ejh<?>> $$0) {
         this.a.add($$0);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public dlb a() {
         return new dlb(jj.a(this.a), this.b.stream().map(jj::a).collect(ImmutableList.toImmutableList()));
      }
   }
}
