import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class dal implements Predicate<cwb> {
   public static final zg<wt, dal> a = ze.c(lz.K).a(dal::new, $$0 -> $$0.e);
   public static final zg<wt, Optional<dal>> b = ze.c(lz.K)
      .a($$0 -> $$0.b() == 0 ? Optional.empty() : Optional.of(new dal((ju<cvx>)$$0)), $$0 -> $$0.<ju.a<cvx>>map($$0x -> $$0x.e).orElse(ju.a()));
   public static final Codec<ju<cvx>> c = alc.a(lz.K, cwb.a, false);
   public static final Codec<dal> d = ayt.b(c).xmap(dal::new, $$0 -> $$0.e);
   private final ju<cvx> e;
   @Nullable
   private List<jq<cvx>> f;

   private dal(ju<cvx> $$0) {
      $$0.d().ifRight($$0x -> {
         if ($$0x.isEmpty()) {
            throw new UnsupportedOperationException("Ingredients can't be empty");
         } else if ($$0x.contains(cwf.a.f())) {
            throw new UnsupportedOperationException("Ingredient can't contain air");
         }
      });
      this.e = $$0;
   }

   public static boolean a(Optional<dal> $$0, cwb $$1) {
      return $$0.<Boolean>map($$1x -> $$1x.a($$1)).orElseGet($$1::f);
   }

   public List<jq<cvx>> a() {
      if (this.f == null) {
         this.f = ImmutableList.copyOf(this.e);
      }

      return this.f;
   }

   public boolean a(cwb $$0) {
      List<jq<cvx>> $$1 = this.a();

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         if ($$0.a($$1.get($$2))) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof dal $$1 ? Objects.equals(this.e, $$1.e) : false;
   }

   public static dal a(dfa $$0) {
      return new dal(ju.a($$0.j().f()));
   }

   public static dal a(dfa... $$0) {
      return a(Arrays.stream($$0));
   }

   public static dal a(Stream<? extends dfa> $$0) {
      return new dal(ju.a($$0.map($$0x -> $$0x.j().f()).toList()));
   }

   public static dal a(ju<cvx> $$0) {
      return new dal($$0);
   }
}
