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

public class dkl {
   private static final Logger c = LogUtils.getLogger();
   public static final dkl a = new dkl(jj.a(), List.of());
   public static final MapCodec<dkl> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               eir.c.promotePartial(ag.a("Carver: ", c::error)).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               eqm.d.promotePartial(ag.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dkl::new)
   );
   private final jj<eir<?>> d;
   private final List<jj<eqm>> e;
   private final Supplier<List<ejf<?, ?>>> f;
   private final Supplier<Set<eqm>> g;

   dkl(jj<eir<?>> $$0, List<jj<eqm>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(jj::a).map(jf::a).flatMap(eqm::a).filter($$0xx -> $$0xx.b() == ejt.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(jj::a).map(jf::a).collect(Collectors.toSet()));
   }

   public Iterable<jf<eir<?>>> a() {
      return this.d;
   }

   public List<ejf<?, ?>> b() {
      return this.f.get();
   }

   public List<jj<eqm>> c() {
      return this.e;
   }

   public boolean a(eqm $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends dkl.b {
      private final jg<eqm> a;
      private final jg<eir<?>> b;

      public a(jg<eqm> $$0, jg<eir<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public dkl.a a(egj.a $$0, alf<eqm> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public dkl.a a(alf<eir<?>> $$0) {
         this.a(this.b.b($$0));
         return this;
      }
   }

   public static class b {
      private final List<jf<eir<?>>> a = new ArrayList<>();
      private final List<List<jf<eqm>>> b = new ArrayList<>();

      public dkl.b a(egj.a $$0, jf<eqm> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public dkl.b a(int $$0, jf<eqm> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public dkl.b a(jf<eir<?>> $$0) {
         this.a.add($$0);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public dkl a() {
         return new dkl(jj.a(this.a), this.b.stream().map(jj::a).collect(ImmutableList.toImmutableList()));
      }
   }
}
