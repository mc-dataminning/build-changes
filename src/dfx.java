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

public class dfx {
   private static final Logger c = LogUtils.getLogger();
   public static final dfx a = new dfx(jt.a(), List.of());
   public static final MapCodec<dfx> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               edd.c.promotePartial(ad.a("Carver: ", c::error)).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               ekv.d.promotePartial(ad.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dfx::new)
   );
   private final jt<edd<?>> d;
   private final List<jt<ekv>> e;
   private final Supplier<List<edr<?, ?>>> f;
   private final Supplier<Set<ekv>> g;

   dfx(jt<edd<?>> $$0, List<jt<ekv>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> $$1.stream().flatMap(jt::a).map(jp::a).flatMap(ekv::a).filter($$0xx -> $$0xx.b() == eef.g).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> $$1.stream().flatMap(jt::a).map(jp::a).collect(Collectors.toSet()));
   }

   public Iterable<jp<edd<?>>> a() {
      return this.d;
   }

   public List<edr<?, ?>> b() {
      return this.f.get();
   }

   public List<jt<ekv>> c() {
      return this.e;
   }

   public boolean a(ekv $$0) {
      return this.g.get().contains($$0);
   }

   public static class a extends dfx.b {
      private final jq<ekv> a;
      private final jq<edd<?>> b;

      public a(jq<ekv> $$0, jq<edd<?>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public dfx.a a(eav.a $$0, alg<ekv> $$1) {
         this.a($$0.ordinal(), this.a.b($$1));
         return this;
      }

      public dfx.a a(alg<edd<?>> $$0) {
         this.a(this.b.b($$0));
         return this;
      }
   }

   public static class b {
      private final List<jp<edd<?>>> a = new ArrayList<>();
      private final List<List<jp<ekv>>> b = new ArrayList<>();

      public dfx.b a(eav.a $$0, jp<ekv> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public dfx.b a(int $$0, jp<ekv> $$1) {
         this.a($$0);
         this.b.get($$0).add($$1);
         return this;
      }

      public dfx.b a(jp<edd<?>> $$0) {
         this.a.add($$0);
         return this;
      }

      private void a(int $$0) {
         while (this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }
      }

      public dfx a() {
         return new dfx(jt.a(this.a), this.b.stream().map(jt::a).collect(ImmutableList.toImmutableList()));
      }
   }
}
