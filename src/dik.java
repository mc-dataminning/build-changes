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

public class dik {
   private static final Logger c = LogUtils.getLogger();
   public static final dik a = new dik(ju.a(), List.of());
   public static final MapCodec<dik> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               eft.c.promotePartial(ae.a("Carver: ", c::error)).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               enn.d.promotePartial(ae.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dik::new)
   );
   private final ju<eft<?>> d;
   private final List<ju<enn>> e;
   private final Supplier<List<egh<?, ?>>> f;
   private final Supplier<Set<enn>> g;

   dik(ju<eft<?>> $$0, List<ju<enn>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(ju::a).map(jq::a).flatMap(enn::a).filter($$0xx -> $$0xx.b() == egv.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(ju::a).map(jq::a).collect(Collectors.toSet()));
   }

   public Iterable<jq<eft<?>>> a() {
      return this.d;
   }

   public List<egh<?, ?>> b() {
      return this.f.get();
   }

   public List<ju<enn>> c() {
      return this.e;
   }

   public boolean a(enn $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends dik.b {
      private final jr<enn> a;
      private final jr<eft<?>> b;

      public a(jr<enn> $$0, jr<eft<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public dik.a a(edl.a $$0, aly<enn> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public dik.a a(aly<eft<?>> $$0) {
         this.a(this.b.b($$0));
         return this;
      }
   }

   public static class b {
      private final List<jq<eft<?>>> a = new ArrayList<>();
      private final List<List<jq<enn>>> b = new ArrayList<>();

      public dik.b a(edl.a $$0, jq<enn> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public dik.b a(int $$0, jq<enn> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public dik.b a(jq<eft<?>> $$0) {
         this.a.add($$0);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public dik a() {
         return new dik(ju.a(this.a), this.b.stream().map(ju::a).collect(ImmutableList.toImmutableList()));
      }
   }
}
