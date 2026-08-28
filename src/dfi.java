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

public class dfi {
   private static final Logger c = LogUtils.getLogger();
   public static final dfi a = new dfi(jr.a(), List.of());
   public static final MapCodec<dfi> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               eco.c.promotePartial(ad.a("Carver: ", c::error)).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               ekg.d.promotePartial(ad.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dfi::new)
   );
   private final jr<eco<?>> d;
   private final List<jr<ekg>> e;
   private final Supplier<List<edc<?, ?>>> f;
   private final Supplier<Set<ekg>> g;

   dfi(jr<eco<?>> $$0, List<jr<ekg>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(jr::a).map(jn::a).flatMap(ekg::a).filter($$0xx -> $$0xx.b() == edq.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(jr::a).map(jn::a).collect(Collectors.toSet()));
   }

   public Iterable<jn<eco<?>>> a() {
      return this.d;
   }

   public List<edc<?, ?>> b() {
      return this.f.get();
   }

   public List<jr<ekg>> c() {
      return this.e;
   }

   public boolean a(ekg $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends dfi.b {
      private final jo<ekg> a;
      private final jo<eco<?>> b;

      public a(jo<ekg> $$0, jo<eco<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public dfi.a a(eag.a $$0, alb<ekg> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public dfi.a a(alb<eco<?>> $$0) {
         this.a(this.b.b($$0));
         return this;
      }
   }

   public static class b {
      private final List<jn<eco<?>>> a = new ArrayList<>();
      private final List<List<jn<ekg>>> b = new ArrayList<>();

      public dfi.b a(eag.a $$0, jn<ekg> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public dfi.b a(int $$0, jn<ekg> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public dfi.b a(jn<eco<?>> $$0) {
         this.a.add($$0);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public dfi a() {
         return new dfi(jr.a(this.a), this.b.stream().map(jr::a).collect(ImmutableList.toImmutableList()));
      }
   }
}
