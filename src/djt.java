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

public class djt {
   private static final Logger c = LogUtils.getLogger();
   public static final djt a = new djt(ji.a(), List.of());
   public static final MapCodec<djt> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ehr.c.promotePartial(af.a("Carver: ", c::error)).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               epm.d.promotePartial(af.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, djt::new)
   );
   private final ji<ehr<?>> d;
   private final List<ji<epm>> e;
   private final Supplier<List<eif<?, ?>>> f;
   private final Supplier<Set<epm>> g;

   djt(ji<ehr<?>> $$0, List<ji<epm>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(ji::a).map(je::a).flatMap(epm::a).filter($$0xx -> $$0xx.b() == eit.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(ji::a).map(je::a).collect(Collectors.toSet()));
   }

   public Iterable<je<ehr<?>>> a() {
      return this.d;
   }

   public List<eif<?, ?>> b() {
      return this.f.get();
   }

   public List<ji<epm>> c() {
      return this.e;
   }

   public boolean a(epm $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends djt.b {
      private final jf<epm> a;
      private final jf<ehr<?>> b;

      public a(jf<epm> $$0, jf<ehr<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public djt.a a(efj.a $$0, ald<epm> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public djt.a a(ald<ehr<?>> $$0) {
         this.a(this.b.b($$0));
         return this;
      }
   }

   public static class b {
      private final List<je<ehr<?>>> a = new ArrayList<>();
      private final List<List<je<epm>>> b = new ArrayList<>();

      public djt.b a(efj.a $$0, je<epm> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public djt.b a(int $$0, je<epm> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public djt.b a(je<ehr<?>> $$0) {
         this.a.add($$0);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public djt a() {
         return new djt(ji.a(this.a), this.b.stream().map(ji::a).collect(ImmutableList.toImmutableList()));
      }
   }
}
