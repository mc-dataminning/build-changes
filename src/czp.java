import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class czp implements Predicate<cvl> {
   public static final zb<wo, czp> a = yz.c(lv.K).a(czp::new, $$0 -> $$0.e);
   public static final zb<wo, Optional<czp>> b = yz.c(lv.K)
      .a($$0 -> $$0.b() == 0 ? Optional.empty() : Optional.of(new czp((jr<cvg>)$$0)), $$0 -> $$0.<jr.a<cvg>>map($$0x -> $$0x.e).orElse(jr.a()));
   public static final Codec<jr<cvg>> c = akv.a(lv.K, cvl.a, false);
   public static final Codec<czp> d = ayl.b(c).xmap(czp::new, $$0 -> $$0.e);
   private final jr<cvg> e;
   @Nullable
   private List<jn<cvg>> f;

   private czp(jr<cvg> $$0) {
      $$0.d().ifRight($$0x -> {
         if ($$0x.isEmpty()) {
            throw new UnsupportedOperationException("Ingredients can't be empty");
         } else if ($$0x.contains(cvo.a.o())) {
            throw new UnsupportedOperationException("Ingredient can't contain air");
         }
      });
      this.e = $$0;
   }

   public static boolean a(Optional<czp> $$0, cvl $$1) {
      return $$0.<Boolean>map($$1x -> $$1x.a($$1)).orElseGet($$1::f);
   }

   public List<jn<cvg>> a() {
      if (this.f == null) {
         this.f = ImmutableList.copyOf(this.e);
      }

      return this.f;
   }

   public boolean a(cvl $$0) {
      List<jn<cvg>> $$1 = this.a();

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         if ($$0.a($$1.get($$2))) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof czp $$1 ? Objects.equals(this.e, $$1.e) : false;
   }

   public static czp a(ddr $$0) {
      return new czp(jr.a($$0.r().o()));
   }

   public static czp a(ddr... $$0) {
      return a(Arrays.stream($$0));
   }

   public static czp a(Stream<? extends ddr> $$0) {
      return new czp(jr.a($$0.map($$0x -> $$0x.r().o()).toList()));
   }

   public static czp a(jr<cvg> $$0) {
      return new czp($$0);
   }
}
