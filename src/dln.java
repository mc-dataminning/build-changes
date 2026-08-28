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

public class dln {
   private static final Logger c = LogUtils.getLogger();
   public static final dln a = new dln(jk.a(), List.of());
   public static final MapCodec<dln> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ejt.c.promotePartial(ag.a("Carver: ", c::error)).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               err.d.promotePartial(ag.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dln::new)
   );
   private final jk<ejt<?>> d;
   private final List<jk<err>> e;
   private final Supplier<List<ekh<?, ?>>> f;
   private final Supplier<Set<err>> g;

   dln(jk<ejt<?>> $$0, List<jk<err>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(jk::a).map(jg::a).flatMap(err::a).filter($$0xx -> $$0xx.b() == ekw.h).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(jk::a).map(jg::a).collect(Collectors.toSet()));
   }

   public Iterable<jg<ejt<?>>> a() {
      return this.d;
   }

   public List<ekh<?, ?>> b() {
      return this.f.get();
   }

   public List<jk<err>> c() {
      return this.e;
   }

   public boolean a(err $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends dln.b {
      private final jh<err> a;
      private final jh<ejt<?>> b;

      public a(jh<err> $$0, jh<ejt<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public dln.a a(ehl.a $$0, alq<err> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public dln.a a(alq<ejt<?>> $$0) {
         this.a(this.b.b($$0));
         return this;
      }
   }

   public static class b {
      private final List<jg<ejt<?>>> a = new ArrayList<>();
      private final List<List<jg<err>>> b = new ArrayList<>();

      public dln.b a(ehl.a $$0, jg<err> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public dln.b a(int $$0, jg<err> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public dln.b a(jg<ejt<?>> $$0) {
         this.a.add($$0);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public dln a() {
         return new dln(jk.a(this.a), this.b.stream().map(jk::a).collect(ImmutableList.toImmutableList()));
      }
   }
}
