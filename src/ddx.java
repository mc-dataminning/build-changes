import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public final class ddx implements cro.a<jf<czg>>, Predicate<czk> {
   public static final yw<wj, ddx> a = yu.c(mh.K).a(ddx::new, $$0 -> $$0.e);
   public static final yw<wj, Optional<ddx>> b = yu.c(mh.K)
      .a($$0 -> $$0.b() == 0 ? Optional.empty() : Optional.of(new ddx((jj<czg>)$$0)), $$0 -> $$0.<jj.a<czg>>map($$0x -> $$0x.e).orElse(jj.a()));
   public static final Codec<jj<czg>> c = ala.a(mh.K, czg.e, false);
   public static final Codec<ddx> d = ayu.c(c).xmap(ddx::new, $$0 -> $$0.e);
   private final jj<czg> e;

   private ddx(jj<czg> $$0) {
      $$0.d().ifRight($$0x -> {
         if ($$0x.isEmpty()) {
            throw new UnsupportedOperationException("Ingredients can't be empty");
         } else if ($$0x.contains(czo.a.e())) {
            throw new UnsupportedOperationException("Ingredient can't contain air");
         }
      });
      this.e = $$0;
   }

   public static boolean a(Optional<ddx> $$0, czk $$1) {
      return $$0.<Boolean>map($$1x -> $$1x.a($$1)).orElseGet($$1::f);
   }

   @Deprecated
   public Stream<jf<czg>> a() {
      return this.e.a();
   }

   public boolean b() {
      return this.e.b() == 0;
   }

   public boolean a(czk $$0) {
      return $$0.a(this.e);
   }

   public boolean a(jf<czg> $$0) {
      return this.e.a($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof ddx $$1 ? Objects.equals(this.e, $$1.e) : false;
   }

   public static ddx a(djg $$0) {
      return new ddx(jj.a($$0.h().e()));
   }

   public static ddx a(djg... $$0) {
      return a(Arrays.stream($$0));
   }

   public static ddx a(Stream<? extends djg> $$0) {
      return new ddx(jj.a($$0.map($$0x -> $$0x.h().e()).toList()));
   }

   public static ddx a(jj<czg> $$0) {
      return new ddx($$0);
   }

   public dfn c() {
      return (dfn)this.e.d().map(dfn.h::new, $$0 -> new dfn.b($$0.stream().map(ddx::b).toList()));
   }

   public static dfn a(Optional<ddx> $$0) {
      return $$0.<dfn>map(ddx::c).orElse(dfn.c.c);
   }

   private static dfn b(jf<czg> $$0) {
      dfn $$1 = new dfn.d($$0);
      czk $$2 = $$0.a().i();
      if (!$$2.f()) {
         dfn $$3 = new dfn.f($$2);
         return new dfn.j($$1, $$3);
      } else {
         return $$1;
      }
   }
}
