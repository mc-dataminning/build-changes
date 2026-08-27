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

public class cqp {
   private static final Logger c = LogUtils.getLogger();
   public static final cqp a = new cqp(ImmutableMap.of(), ImmutableList.of());
   public static final MapCodec<cqp> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.simpleMap(dkj.a.c, dmq.c.promotePartial(ac.a("Carver: ", c::error)), ask.a(dkj.a.values())).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               duh.d.promotePartial(ac.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, cqp::new)
   );
   private final Map<dkj.a, hk<dmq<?>>> d;
   private final List<hk<duh>> e;
   private final Supplier<List<dne<?, ?>>> f;
   private final Supplier<Set<duh>> g;

   cqp(Map<dkj.a, hk<dmq<?>>> $$0, List<hk<duh>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(hk::a).map(hg::a).flatMap(duh::a).filter($$0xx -> $$0xx.b() == dnr.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(hk::a).map(hg::a).collect(Collectors.toSet()));
   }

   public Iterable<hg<dmq<?>>> a(dkj.a $$0) {
      return Objects.requireNonNullElseGet(this.d.get($$0), List::of);
   }

   public List<dne<?, ?>> a() {
      return this.f.get();
   }

   public List<hk<duh>> b() {
      return this.e;
   }

   public boolean a(duh $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends cqp.b {
      private final hh<duh> a;
      private final hh<dmq<?>> b;

      public a(hh<duh> $$0, hh<dmq<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public cqp.a a(dkj.b $$0, aet<duh> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public cqp.a a(dkj.a $$0, aet<dmq<?>> $$1) {
         this.a($$0, this.b.b($$1));
         return this;
      }
   }

   public static class b {
      private final Map<dkj.a, List<hg<dmq<?>>>> a = Maps.newLinkedHashMap();
      private final List<List<hg<duh>>> b = Lists.newArrayList();

      public cqp.b a(dkj.b $$0, hg<duh> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public cqp.b a(int $$0, hg<duh> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public cqp.b a(dkj.a $$0, hg<dmq<?>> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public cqp a() {
         return new cqp(
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> hk.a((List)$$0.getValue()))),
            this.b.stream().map(hk::a).collect(ImmutableList.toImmutableList())
         );
      }
   }
}
