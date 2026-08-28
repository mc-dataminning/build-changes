import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class daw implements Predicate<cwm> {
   public static final zh<wu, daw> a = zf.c(ma.K).a(daw::new, $$0 -> $$0.e);
   public static final zh<wu, Optional<daw>> b = zf.c(ma.K)
      .a($$0 -> $$0.b() == 0 ? Optional.empty() : Optional.of(new daw((ju<cwi>)$$0)), $$0 -> $$0.<ju.a<cwi>>map($$0x -> $$0x.e).orElse(ju.a()));
   public static final Codec<ju<cwi>> c = ald.a(ma.K, cwm.a, false);
   public static final Codec<daw> d = ayv.b(c).xmap(daw::new, $$0 -> $$0.e);
   private final ju<cwi> e;
   @Nullable
   private List<jq<cwi>> f;

   private daw(ju<cwi> $$0) {
      $$0.d().ifRight($$0x -> {
         if ($$0x.isEmpty()) {
            throw new UnsupportedOperationException("Ingredients can't be empty");
         } else if ($$0x.contains(cwq.a.f())) {
            throw new UnsupportedOperationException("Ingredient can't contain air");
         }
      });
      this.e = $$0;
   }

   public static boolean a(Optional<daw> $$0, cwm $$1) {
      return $$0.<Boolean>map($$1x -> $$1x.a($$1)).orElseGet($$1::f);
   }

   public List<jq<cwi>> a() {
      if (this.f == null) {
         this.f = ImmutableList.copyOf(this.e);
      }

      return this.f;
   }

   public boolean a(cwm $$0) {
      List<jq<cwi>> $$1 = this.a();

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         if ($$0.a($$1.get($$2))) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof daw $$1 ? Objects.equals(this.e, $$1.e) : false;
   }

   public static daw a(dfl $$0) {
      return new daw(ju.a($$0.j().f()));
   }

   public static daw a(dfl... $$0) {
      return a(Arrays.stream($$0));
   }

   public static daw a(Stream<? extends dfl> $$0) {
      return new daw(ju.a($$0.map($$0x -> $$0x.j().f()).toList()));
   }

   public static daw a(ju<cwi> $$0) {
      return new daw($$0);
   }
}
