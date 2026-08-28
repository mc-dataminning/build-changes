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

public class eqn {
   private static final Codec<eqn> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               euw.a.optionalFieldOf("min").forGetter($$0x -> Optional.ofNullable($$0x.c)),
               euw.a.optionalFieldOf("max").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, eqn::new)
   );
   public static final Codec<eqn> a = Codec.either(Codec.INT, b).xmap($$0 -> (eqn)$$0.map(eqn::a, Function.identity()), $$0 -> {
      OptionalInt $$1 = $$0.b();
      return $$1.isPresent() ? Either.left($$1.getAsInt()) : Either.right($$0);
   });
   @Nullable
   private final euv c;
   @Nullable
   private final euv d;
   private final eqn.b e;
   private final eqn.a f;

   public Set<eth<?>> a() {
      Builder<eth<?>> $$0 = ImmutableSet.builder();
      if (this.c != null) {
         $$0.addAll(this.c.a());
      }

      if (this.d != null) {
         $$0.addAll(this.d.a());
      }

      return $$0.build();
   }

   private eqn(Optional<euv> $$0, Optional<euv> $$1) {
      this($$0.orElse(null), $$1.orElse(null));
   }

   private eqn(@Nullable euv $$0, @Nullable euv $$1) {
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
         this.e = ($$2, $$3) -> aye.a($$3, $$0.a($$2), $$1.a($$2));
         this.f = ($$2, $$3) -> $$3 >= $$0.a($$2) && $$3 <= $$1.a($$2);
      }
   }

   public static eqn a(int $$0) {
      eus $$1 = eus.a((float)$$0);
      return new eqn(Optional.of($$1), Optional.of($$1));
   }

   public static eqn a(int $$0, int $$1) {
      return new eqn(Optional.of(eus.a((float)$$0)), Optional.of(eus.a((float)$$1)));
   }

   public static eqn b(int $$0) {
      return new eqn(Optional.of(eus.a((float)$$0)), Optional.empty());
   }

   public static eqn c(int $$0) {
      return new eqn(Optional.empty(), Optional.of(eus.a((float)$$0)));
   }

   public int a(eqo $$0, int $$1) {
      return this.e.apply($$0, $$1);
   }

   public boolean b(eqo $$0, int $$1) {
      return this.f.test($$0, $$1);
   }

   private OptionalInt b() {
      return Objects.equals(this.c, this.d) && this.c instanceof eus $$0 && Math.floor((double)$$0.c()) == (double)$$0.c()
         ? OptionalInt.of((int)$$0.c())
         : OptionalInt.empty();
   }

   @FunctionalInterface
   interface a {
      boolean test(eqo var1, int var2);
   }

   @FunctionalInterface
   interface b {
      int apply(eqo var1, int var2);
   }
}
