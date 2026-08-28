import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class daf implements Predicate<cvx> {
   public static final zf<ws, daf> a = zd.c(ly.K).a(daf::new, $$0 -> $$0.e);
   public static final zf<ws, Optional<daf>> b = zd.c(ly.K)
      .a($$0 -> $$0.b() == 0 ? Optional.empty() : Optional.of(new daf((jt<cvt>)$$0)), $$0 -> $$0.<jt.a<cvt>>map($$0x -> $$0x.e).orElse(jt.a()));
   public static final Codec<jt<cvt>> c = alb.a(ly.K, cvx.a, false);
   public static final Codec<daf> d = ays.b(c).xmap(daf::new, $$0 -> $$0.e);
   private final jt<cvt> e;
   @Nullable
   private List<jp<cvt>> f;

   private daf(jt<cvt> $$0) {
      $$0.d().ifRight($$0x -> {
         if ($$0x.isEmpty()) {
            throw new UnsupportedOperationException("Ingredients can't be empty");
         } else if ($$0x.contains(cwb.a.f())) {
            throw new UnsupportedOperationException("Ingredient can't contain air");
         }
      });
      this.e = $$0;
   }

   public static boolean a(Optional<daf> $$0, cvx $$1) {
      return $$0.<Boolean>map($$1x -> $$1x.a($$1)).orElseGet($$1::f);
   }

   public List<jp<cvt>> a() {
      if (this.f == null) {
         this.f = ImmutableList.copyOf(this.e);
      }

      return this.f;
   }

   public boolean a(cvx $$0) {
      List<jp<cvt>> $$1 = this.a();

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         if ($$0.a($$1.get($$2))) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof daf $$1 ? Objects.equals(this.e, $$1.e) : false;
   }

   public static daf a(deu $$0) {
      return new daf(jt.a($$0.j().f()));
   }

   public static daf a(deu... $$0) {
      return a(Arrays.stream($$0));
   }

   public static daf a(Stream<? extends deu> $$0) {
      return new daf(jt.a($$0.map($$0x -> $$0x.j().f()).toList()));
   }

   public static daf a(jt<cvt> $$0) {
      return new daf($$0);
   }
}
