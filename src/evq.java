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

public class evq {
   private static final Codec<evq> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ezx.a.optionalFieldOf("min").forGetter($$0x -> Optional.ofNullable($$0x.c)),
               ezx.a.optionalFieldOf("max").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, evq::new)
   );
   public static final Codec<evq> a = Codec.either(Codec.INT, b).xmap($$0 -> (evq)$$0.map(evq::a, Function.identity()), $$0 -> {
      OptionalInt $$1 = $$0.b();
      return $$1.isPresent() ? Either.left($$1.getAsInt()) : Either.right($$0);
   });
   @Nullable
   private final ezw c;
   @Nullable
   private final ezw d;
   private final evq.b e;
   private final evq.a f;

   public Set<bai<?>> a() {
      Builder<bai<?>> $$0 = ImmutableSet.builder();
      if (this.c != null) {
         $$0.addAll(this.c.a());
      }

      if (this.d != null) {
         $$0.addAll(this.d.a());
      }

      return $$0.build();
   }

   private evq(Optional<ezw> $$0, Optional<ezw> $$1) {
      this($$0.orElse(null), $$1.orElse(null));
   }

   private evq(@Nullable ezw $$0, @Nullable ezw $$1) {
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
         this.e = ($$2, $$3) -> ayz.a($$3, $$0.a($$2), $$1.a($$2));
         this.f = ($$2, $$3) -> $$3 >= $$0.a($$2) && $$3 <= $$1.a($$2);
      }
   }

   public static evq a(int $$0) {
      ezt $$1 = ezt.a((float)$$0);
      return new evq(Optional.of($$1), Optional.of($$1));
   }

   public static evq a(int $$0, int $$1) {
      return new evq(Optional.of(ezt.a((float)$$0)), Optional.of(ezt.a((float)$$1)));
   }

   public static evq b(int $$0) {
      return new evq(Optional.of(ezt.a((float)$$0)), Optional.empty());
   }

   public static evq c(int $$0) {
      return new evq(Optional.empty(), Optional.of(ezt.a((float)$$0)));
   }

   public int a(evr $$0, int $$1) {
      return this.e.apply($$0, $$1);
   }

   public boolean b(evr $$0, int $$1) {
      return this.f.test($$0, $$1);
   }

   private OptionalInt b() {
      return Objects.equals(this.c, this.d) && this.c instanceof ezt $$0 && Math.floor((double)$$0.c()) == (double)$$0.c()
         ? OptionalInt.of((int)$$0.c())
         : OptionalInt.empty();
   }

   @FunctionalInterface
   interface a {
      boolean test(evr var1, int var2);
   }

   @FunctionalInterface
   interface b {
      int apply(evr var1, int var2);
   }
}
