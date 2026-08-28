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

public class dil {
   private static final Logger c = LogUtils.getLogger();
   public static final dil a = new dil(ju.a(), List.of());
   public static final MapCodec<dil> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               efu.c.promotePartial(ae.a("Carver: ", c::error)).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               eno.d.promotePartial(ae.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dil::new)
   );
   private final ju<efu<?>> d;
   private final List<ju<eno>> e;
   private final Supplier<List<egi<?, ?>>> f;
   private final Supplier<Set<eno>> g;

   dil(ju<efu<?>> $$0, List<ju<eno>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(ju::a).map(jq::a).flatMap(eno::a).filter($$0xx -> $$0xx.b() == egw.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(ju::a).map(jq::a).collect(Collectors.toSet()));
   }

   public Iterable<jq<efu<?>>> a() {
      return this.d;
   }

   public List<egi<?, ?>> b() {
      return this.f.get();
   }

   public List<ju<eno>> c() {
      return this.e;
   }

   public boolean a(eno $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends dil.b {
      private final jr<eno> a;
      private final jr<efu<?>> b;

      public a(jr<eno> $$0, jr<efu<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public dil.a a(edm.a $$0, aly<eno> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public dil.a a(aly<efu<?>> $$0) {
         this.a(this.b.b($$0));
         return this;
      }
   }

   public static class b {
      private final List<jq<efu<?>>> a = new ArrayList<>();
      private final List<List<jq<eno>>> b = new ArrayList<>();

      public dil.b a(edm.a $$0, jq<eno> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public dil.b a(int $$0, jq<eno> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public dil.b a(jq<efu<?>> $$0) {
         this.a.add($$0);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public dil a() {
         return new dil(ju.a(this.a), this.b.stream().map(ju::a).collect(ImmutableList.toImmutableList()));
      }
   }
}
