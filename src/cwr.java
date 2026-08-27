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

public class cwr {
   private static final Logger c = LogUtils.getLogger();
   public static final cwr a = new cwr(ImmutableMap.of(), ImmutableList.of());
   public static final MapCodec<cwr> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.simpleMap(dqr.a.c, dsy.c.promotePartial(ac.a("Carver: ", c::error)), axc.a(dqr.a.values())).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               eap.d.promotePartial(ac.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, cwr::new)
   );
   private final Map<dqr.a, in<dsy<?>>> d;
   private final List<in<eap>> e;
   private final Supplier<List<dtm<?, ?>>> f;
   private final Supplier<Set<eap>> g;

   cwr(Map<dqr.a, in<dsy<?>>> $$0, List<in<eap>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(in::a).map(ij::a).flatMap(eap::a).filter($$0xx -> $$0xx.b() == dtz.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(in::a).map(ij::a).collect(Collectors.toSet()));
   }

   public Iterable<ij<dsy<?>>> a(dqr.a $$0) {
      return Objects.requireNonNullElseGet(this.d.get($$0), List::of);
   }

   public List<dtm<?, ?>> a() {
      return this.f.get();
   }

   public List<in<eap>> b() {
      return this.e;
   }

   public boolean a(eap $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends cwr.b {
      private final ik<eap> a;
      private final ik<dsy<?>> b;

      public a(ik<eap> $$0, ik<dsy<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public cwr.a a(dqr.b $$0, aix<eap> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public cwr.a a(dqr.a $$0, aix<dsy<?>> $$1) {
         this.a($$0, this.b.b($$1));
         return this;
      }
   }

   public static class b {
      private final Map<dqr.a, List<ij<dsy<?>>>> a = Maps.newLinkedHashMap();
      private final List<List<ij<eap>>> b = Lists.newArrayList();

      public cwr.b a(dqr.b $$0, ij<eap> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public cwr.b a(int $$0, ij<eap> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public cwr.b a(dqr.a $$0, ij<dsy<?>> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public cwr a() {
         return new cwr(
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> in.a((List)$$0.getValue()))),
            this.b.stream().map(in::a).collect(ImmutableList.toImmutableList())
         );
      }
   }
}
