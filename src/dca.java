import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class dca implements Predicate<cxp> {
   public static final zt<xg, dca> a = zr.c(mb.K).a(dca::new, $$0 -> $$0.e);
   public static final zt<xg, Optional<dca>> b = zr.c(mb.K)
      .a($$0 -> $$0.b() == 0 ? Optional.empty() : Optional.of(new dca((ju<cxl>)$$0)), $$0 -> $$0.<ju.a<cxl>>map($$0x -> $$0x.e).orElse(ju.a()));
   public static final Codec<ju<cxl>> c = alt.a(mb.K, cxl.e, false);
   public static final Codec<dca> d = azn.b(c).xmap(dca::new, $$0 -> $$0.e);
   private final ju<cxl> e;
   @Nullable
   private List<jq<cxl>> f;

   private dca(ju<cxl> $$0) {
      $$0.d().ifRight($$0x -> {
         if ($$0x.isEmpty()) {
            throw new UnsupportedOperationException("Ingredients can't be empty");
         } else if ($$0x.contains(cxt.a.f())) {
            throw new UnsupportedOperationException("Ingredient can't contain air");
         }
      });
      this.e = $$0;
   }

   public static boolean a(Optional<dca> $$0, cxp $$1) {
      return $$0.<Boolean>map($$1x -> $$1x.a($$1)).orElseGet($$1::f);
   }

   public List<jq<cxl>> a() {
      if (this.f == null) {
         this.f = ImmutableList.copyOf(this.e);
      }

      return this.f;
   }

   public boolean a(cxp $$0) {
      List<jq<cxl>> $$1 = this.a();

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         if ($$0.a($$1.get($$2))) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof dca $$1 ? Objects.equals(this.e, $$1.e) : false;
   }

   public static dca a(dhh $$0) {
      return new dca(ju.a($$0.j().f()));
   }

   public static dca a(dhh... $$0) {
      return a(Arrays.stream($$0));
   }

   public static dca a(Stream<? extends dhh> $$0) {
      return new dca(ju.a($$0.map($$0x -> $$0x.j().f()).toList()));
   }

   public static dca a(ju<cxl> $$0) {
      return new dca($$0);
   }

   public ddp b() {
      return (ddp)this.e.d().map(ddp.h::new, $$0 -> new ddp.b($$0.stream().map(dca::a).toList()));
   }

   public static ddp a(Optional<dca> $$0) {
      return $$0.<ddp>map(dca::b).orElse(ddp.c.c);
   }

   private static ddp a(jq<cxl> $$0) {
      ddp $$1 = new ddp.d($$0);
      cxp $$2 = $$0.a().k();
      if (!$$2.f()) {
         ddp $$3 = new ddp.f($$2);
         return new ddp.j($$1, $$3);
      } else {
         return $$1;
      }
   }
}
