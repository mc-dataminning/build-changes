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

public class fag {
   private static final Codec<fag> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               fen.a.optionalFieldOf("min").forGetter($$0x -> Optional.ofNullable($$0x.c)),
               fen.a.optionalFieldOf("max").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, fag::new)
   );
   public static final Codec<fag> a = Codec.either(Codec.INT, b).xmap($$0 -> (fag)$$0.map(fag::a, Function.identity()), $$0 -> {
      OptionalInt $$1 = $$0.b();
      return $$1.isPresent() ? Either.left($$1.getAsInt()) : Either.right($$0);
   });
   @Nullable
   private final fem c;
   @Nullable
   private final fem d;
   private final fag.b e;
   private final fag.a f;

   public Set<baz<?>> a() {
      Builder<baz<?>> $$0 = ImmutableSet.builder();
      if (this.c != null) {
         $$0.addAll(this.c.a());
      }

      if (this.d != null) {
         $$0.addAll(this.d.a());
      }

      return $$0.build();
   }

   private fag(Optional<fem> $$0, Optional<fem> $$1) {
      this($$0.orElse(null), $$1.orElse(null));
   }

   private fag(@Nullable fem $$0, @Nullable fem $$1) {
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
         this.e = ($$2, $$3) -> azo.a($$3, $$0.a($$2), $$1.a($$2));
         this.f = ($$2, $$3) -> $$3 >= $$0.a($$2) && $$3 <= $$1.a($$2);
      }
   }

   public static fag a(int $$0) {
      fej $$1 = fej.a((float)$$0);
      return new fag(Optional.of($$1), Optional.of($$1));
   }

   public static fag a(int $$0, int $$1) {
      return new fag(Optional.of(fej.a((float)$$0)), Optional.of(fej.a((float)$$1)));
   }

   public static fag b(int $$0) {
      return new fag(Optional.of(fej.a((float)$$0)), Optional.empty());
   }

   public static fag c(int $$0) {
      return new fag(Optional.empty(), Optional.of(fej.a((float)$$0)));
   }

   public int a(fah $$0, int $$1) {
      return this.e.apply($$0, $$1);
   }

   public boolean b(fah $$0, int $$1) {
      return this.f.test($$0, $$1);
   }

   private OptionalInt b() {
      return Objects.equals(this.c, this.d) && this.c instanceof fej $$0 && Math.floor((double)$$0.c()) == (double)$$0.c()
         ? OptionalInt.of((int)$$0.c())
         : OptionalInt.empty();
   }

   @FunctionalInterface
   interface a {
      boolean test(fah var1, int var2);
   }

   @FunctionalInterface
   interface b {
      int apply(fah var1, int var2);
   }
}
