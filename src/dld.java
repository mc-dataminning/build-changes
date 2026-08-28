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

public class dld {
   private static final Logger c = LogUtils.getLogger();
   public static final dld a = new dld(jk.a(), List.of());
   public static final MapCodec<dld> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ejj.c.promotePartial(ag.a("Carver: ", c::error)).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               erh.d.promotePartial(ag.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dld::new)
   );
   private final jk<ejj<?>> d;
   private final List<jk<erh>> e;
   private final Supplier<List<ejx<?, ?>>> f;
   private final Supplier<Set<erh>> g;

   dld(jk<ejj<?>> $$0, List<jk<erh>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(jk::a).map(jg::a).flatMap(erh::a).filter($$0xx -> $$0xx.b() == ekm.h).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(jk::a).map(jg::a).collect(Collectors.toSet()));
   }

   public Iterable<jg<ejj<?>>> a() {
      return this.d;
   }

   public List<ejx<?, ?>> b() {
      return this.f.get();
   }

   public List<jk<erh>> c() {
      return this.e;
   }

   public boolean a(erh $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends dld.b {
      private final jh<erh> a;
      private final jh<ejj<?>> b;

      public a(jh<erh> $$0, jh<ejj<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public dld.a a(ehb.a $$0, alj<erh> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public dld.a a(alj<ejj<?>> $$0) {
         this.a(this.b.b($$0));
         return this;
      }
   }

   public static class b {
      private final List<jg<ejj<?>>> a = new ArrayList<>();
      private final List<List<jg<erh>>> b = new ArrayList<>();

      public dld.b a(ehb.a $$0, jg<erh> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public dld.b a(int $$0, jg<erh> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public dld.b a(jg<ejj<?>> $$0) {
         this.a.add($$0);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public dld a() {
         return new dld(jk.a(this.a), this.b.stream().map(jk::a).collect(ImmutableList.toImmutableList()));
      }
   }
}
