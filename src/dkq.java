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

public class dkq {
   private static final Logger c = LogUtils.getLogger();
   public static final dkq a = new dkq(jj.a(), List.of());
   public static final MapCodec<dkq> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               eiw.c.promotePartial(ag.a("Carver: ", c::error)).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               eqr.d.promotePartial(ag.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dkq::new)
   );
   private final jj<eiw<?>> d;
   private final List<jj<eqr>> e;
   private final Supplier<List<ejk<?, ?>>> f;
   private final Supplier<Set<eqr>> g;

   dkq(jj<eiw<?>> $$0, List<jj<eqr>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(jj::a).map(jf::a).flatMap(eqr::a).filter($$0xx -> $$0xx.b() == ejy.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(jj::a).map(jf::a).collect(Collectors.toSet()));
   }

   public Iterable<jf<eiw<?>>> a() {
      return this.d;
   }

   public List<ejk<?, ?>> b() {
      return this.f.get();
   }

   public List<jj<eqr>> c() {
      return this.e;
   }

   public boolean a(eqr $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends dkq.b {
      private final jg<eqr> a;
      private final jg<eiw<?>> b;

      public a(jg<eqr> $$0, jg<eiw<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public dkq.a a(ego.a $$0, alf<eqr> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public dkq.a a(alf<eiw<?>> $$0) {
         this.a(this.b.b($$0));
         return this;
      }
   }

   public static class b {
      private final List<jf<eiw<?>>> a = new ArrayList<>();
      private final List<List<jf<eqr>>> b = new ArrayList<>();

      public dkq.b a(ego.a $$0, jf<eqr> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public dkq.b a(int $$0, jf<eqr> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public dkq.b a(jf<eiw<?>> $$0) {
         this.a.add($$0);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public dkq a() {
         return new dkq(jj.a(this.a), this.b.stream().map(jj::a).collect(ImmutableList.toImmutableList()));
      }
   }
}
