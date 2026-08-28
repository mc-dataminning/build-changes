import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class dag implements Predicate<cvs> {
   public static final zc<wp, dag> a = za.c(lw.K).a(dag::new, $$0 -> $$0.e);
   public static final zc<wp, Optional<dag>> b = za.c(lw.K)
      .a($$0 -> $$0.b() == 0 ? Optional.empty() : Optional.of(new dag((js<cvn>)$$0)), $$0 -> $$0.<js.a<cvn>>map($$0x -> $$0x.e).orElse(js.a()));
   public static final Codec<js<cvn>> c = aky.a(lw.K, cvs.a, false);
   public static final Codec<dag> d = ayo.b(c).xmap(dag::new, $$0 -> $$0.e);
   private final js<cvn> e;
   @Nullable
   private List<jo<cvn>> f;

   private dag(js<cvn> $$0) {
      $$0.d().ifRight($$0x -> {
         if ($$0x.isEmpty()) {
            throw new UnsupportedOperationException("Ingredients can't be empty");
         } else if ($$0x.contains(cvw.a.n())) {
            throw new UnsupportedOperationException("Ingredient can't contain air");
         }
      });
      this.e = $$0;
   }

   public static boolean a(Optional<dag> $$0, cvs $$1) {
      return $$0.<Boolean>map($$1x -> $$1x.a($$1)).orElseGet($$1::f);
   }

   public List<jo<cvn>> a() {
      if (this.f == null) {
         this.f = ImmutableList.copyOf(this.e);
      }

      return this.f;
   }

   public boolean a(cvs $$0) {
      List<jo<cvn>> $$1 = this.a();

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         if ($$0.a($$1.get($$2))) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof dag $$1 ? Objects.equals(this.e, $$1.e) : false;
   }

   public static dag a(dei $$0) {
      return new dag(js.a($$0.q().n()));
   }

   public static dag a(dei... $$0) {
      return a(Arrays.stream($$0));
   }

   public static dag a(Stream<? extends dei> $$0) {
      return new dag(js.a($$0.map($$0x -> $$0x.q().n()).toList()));
   }

   public static dag a(js<cvn> $$0) {
      return new dag($$0);
   }
}
