import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.Function;
import javax.annotation.Nullable;

public class ekt {
   private static final Codec<ekt> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(awe.a(eop.a, "min").forGetter($$0x -> Optional.ofNullable($$0x.c)), awe.a(eop.a, "max").forGetter($$0x -> Optional.ofNullable($$0x.d)))
            .apply($$0, ekt::new)
   );
   public static final Codec<ekt> a = Codec.either(Codec.INT, b).xmap($$0 -> (ekt)$$0.map(ekt::a, Function.identity()), $$0 -> {
      OptionalInt $$1 = $$0.b();
      return $$1.isPresent() ? Either.left($$1.getAsInt()) : Either.right($$0);
   });
   @Nullable
   private final eoo c;
   @Nullable
   private final eoo d;
   private final ekt.b e;
   private final ekt.a f;

   public Set<enc<?>> a() {
      Builder<enc<?>> $$0 = ImmutableSet.builder();
      if (this.c != null) {
         $$0.addAll(this.c.a());
      }

      if (this.d != null) {
         $$0.addAll(this.d.a());
      }

      return $$0.build();
   }

   private ekt(Optional<eoo> $$0, Optional<eoo> $$1) {
      this($$0.orElse(null), $$1.orElse(null));
   }

   private ekt(@Nullable eoo $$0, @Nullable eoo $$1) {
      this.c = $$0;
      this.d = $$1;
      if ($$0 == null) {
         if ($$1 == null) {
            this.e = ($$0x, $$1x) -> $$1x;
            this.f = ($$0x, $$1x) -> true;
         } else {
            this.e = ($$1x, $$2) -> Math.min($$1.a($$1x), $$2);
            this.f = ($$1x, $$2) -> $$2 <= $$1.a($$1x);
         }
      } else if ($$1 == null) {
         this.e = ($$1x, $$2) -> Math.max($$0.a($$1x), $$2);
         this.f = ($$1x, $$2) -> $$2 >= $$0.a($$1x);
      } else {
         this.e = ($$2, $$3) -> aww.a($$3, $$0.a($$2), $$1.a($$2));
         this.f = ($$2, $$3) -> $$3 >= $$0.a($$2) && $$3 <= $$1.a($$2);
      }
   }

   public static ekt a(int $$0) {
      eom $$1 = eom.a((float)$$0);
      return new ekt(Optional.of($$1), Optional.of($$1));
   }

   public static ekt a(int $$0, int $$1) {
      return new ekt(Optional.of(eom.a((float)$$0)), Optional.of(eom.a((float)$$1)));
   }

   public static ekt b(int $$0) {
      return new ekt(Optional.of(eom.a((float)$$0)), Optional.empty());
   }

   public static ekt c(int $$0) {
      return new ekt(Optional.empty(), Optional.of(eom.a((float)$$0)));
   }

   public int a(eku $$0, int $$1) {
      return this.e.apply($$0, $$1);
   }

   public boolean b(eku $$0, int $$1) {
      return this.f.test($$0, $$1);
   }

   private OptionalInt b() {
      return Objects.equals(this.c, this.d) && this.c instanceof eom $$0 && Math.floor((double)$$0.c()) == (double)$$0.c()
         ? OptionalInt.of((int)$$0.c())
         : OptionalInt.empty();
   }

   @FunctionalInterface
   interface a {
      boolean test(eku var1, int var2);
   }

   @FunctionalInterface
   interface b {
      int apply(eku var1, int var2);
   }
}
