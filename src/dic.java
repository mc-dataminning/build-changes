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

public class dic {
   private static final Logger c = LogUtils.getLogger();
   public static final dic a = new dic(ju.a(), List.of());
   public static final MapCodec<dic> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               efn.c.promotePartial(ae.a("Carver: ", c::error)).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               enh.d.promotePartial(ae.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dic::new)
   );
   private final ju<efn<?>> d;
   private final List<ju<enh>> e;
   private final Supplier<List<egb<?, ?>>> f;
   private final Supplier<Set<enh>> g;

   dic(ju<efn<?>> $$0, List<ju<enh>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(ju::a).map(jq::a).flatMap(enh::a).filter($$0xx -> $$0xx.b() == egp.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(ju::a).map(jq::a).collect(Collectors.toSet()));
   }

   public Iterable<jq<efn<?>>> a() {
      return this.d;
   }

   public List<egb<?, ?>> b() {
      return this.f.get();
   }

   public List<ju<enh>> c() {
      return this.e;
   }

   public boolean a(enh $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends dic.b {
      private final jr<enh> a;
      private final jr<efn<?>> b;

      public a(jr<enh> $$0, jr<efn<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public dic.a a(edf.a $$0, alo<enh> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public dic.a a(alo<efn<?>> $$0) {
         this.a(this.b.b($$0));
         return this;
      }
   }

   public static class b {
      private final List<jq<efn<?>>> a = new ArrayList<>();
      private final List<List<jq<enh>>> b = new ArrayList<>();

      public dic.b a(edf.a $$0, jq<enh> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public dic.b a(int $$0, jq<enh> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public dic.b a(jq<efn<?>> $$0) {
         this.a.add($$0);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public dic a() {
         return new dic(ju.a(this.a), this.b.stream().map(ju::a).collect(ImmutableList.toImmutableList()));
      }
   }
}
