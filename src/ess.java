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

public class ess {
   private static final Codec<ess> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               exb.a.optionalFieldOf("min").forGetter($$0x -> Optional.ofNullable($$0x.c)),
               exb.a.optionalFieldOf("max").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, ess::new)
   );
   public static final Codec<ess> a = Codec.either(Codec.INT, b).xmap($$0 -> (ess)$$0.map(ess::a, Function.identity()), $$0 -> {
      OptionalInt $$1 = $$0.b();
      return $$1.isPresent() ? Either.left($$1.getAsInt()) : Either.right($$0);
   });
   @Nullable
   private final exa c;
   @Nullable
   private final exa d;
   private final ess.b e;
   private final ess.a f;

   public Set<evm<?>> a() {
      Builder<evm<?>> $$0 = ImmutableSet.builder();
      if (this.c != null) {
         $$0.addAll(this.c.a());
      }

      if (this.d != null) {
         $$0.addAll(this.d.a());
      }

      return $$0.build();
   }

   private ess(Optional<exa> $$0, Optional<exa> $$1) {
      this($$0.orElse(null), $$1.orElse(null));
   }

   private ess(@Nullable exa $$0, @Nullable exa $$1) {
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
         this.e = ($$2, $$3) -> azc.a($$3, $$0.a($$2), $$1.a($$2));
         this.f = ($$2, $$3) -> $$3 >= $$0.a($$2) && $$3 <= $$1.a($$2);
      }
   }

   public static ess a(int $$0) {
      ewx $$1 = ewx.a((float)$$0);
      return new ess(Optional.of($$1), Optional.of($$1));
   }

   public static ess a(int $$0, int $$1) {
      return new ess(Optional.of(ewx.a((float)$$0)), Optional.of(ewx.a((float)$$1)));
   }

   public static ess b(int $$0) {
      return new ess(Optional.of(ewx.a((float)$$0)), Optional.empty());
   }

   public static ess c(int $$0) {
      return new ess(Optional.empty(), Optional.of(ewx.a((float)$$0)));
   }

   public int a(est $$0, int $$1) {
      return this.e.apply($$0, $$1);
   }

   public boolean b(est $$0, int $$1) {
      return this.f.test($$0, $$1);
   }

   private OptionalInt b() {
      return Objects.equals(this.c, this.d) && this.c instanceof ewx $$0 && Math.floor((double)$$0.c()) == (double)$$0.c()
         ? OptionalInt.of((int)$$0.c())
         : OptionalInt.empty();
   }

   @FunctionalInterface
   interface a {
      boolean test(est var1, int var2);
   }

   @FunctionalInterface
   interface b {
      int apply(est var1, int var2);
   }
}
