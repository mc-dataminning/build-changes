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

public class fai {
   private static final Codec<fai> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               fep.a.optionalFieldOf("min").forGetter($$0x -> Optional.ofNullable($$0x.c)),
               fep.a.optionalFieldOf("max").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, fai::new)
   );
   public static final Codec<fai> a = Codec.either(Codec.INT, b).xmap($$0 -> (fai)$$0.map(fai::a, Function.identity()), $$0 -> {
      OptionalInt $$1 = $$0.b();
      return $$1.isPresent() ? Either.left($$1.getAsInt()) : Either.right($$0);
   });
   @Nullable
   private final feo c;
   @Nullable
   private final feo d;
   private final fai.b e;
   private final fai.a f;

   public Set<bbb<?>> a() {
      Builder<bbb<?>> $$0 = ImmutableSet.builder();
      if (this.c != null) {
         $$0.addAll(this.c.a());
      }

      if (this.d != null) {
         $$0.addAll(this.d.a());
      }

      return $$0.build();
   }

   private fai(Optional<feo> $$0, Optional<feo> $$1) {
      this($$0.orElse(null), $$1.orElse(null));
   }

   private fai(@Nullable feo $$0, @Nullable feo $$1) {
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
         this.e = ($$2, $$3) -> azq.a($$3, $$0.a($$2), $$1.a($$2));
         this.f = ($$2, $$3) -> $$3 >= $$0.a($$2) && $$3 <= $$1.a($$2);
      }
   }

   public static fai a(int $$0) {
      fel $$1 = fel.a((float)$$0);
      return new fai(Optional.of($$1), Optional.of($$1));
   }

   public static fai a(int $$0, int $$1) {
      return new fai(Optional.of(fel.a((float)$$0)), Optional.of(fel.a((float)$$1)));
   }

   public static fai b(int $$0) {
      return new fai(Optional.of(fel.a((float)$$0)), Optional.empty());
   }

   public static fai c(int $$0) {
      return new fai(Optional.empty(), Optional.of(fel.a((float)$$0)));
   }

   public int a(faj $$0, int $$1) {
      return this.e.apply($$0, $$1);
   }

   public boolean b(faj $$0, int $$1) {
      return this.f.test($$0, $$1);
   }

   private OptionalInt b() {
      return Objects.equals(this.c, this.d) && this.c instanceof fel $$0 && Math.floor((double)$$0.c()) == (double)$$0.c()
         ? OptionalInt.of((int)$$0.c())
         : OptionalInt.empty();
   }

   @FunctionalInterface
   interface a {
      boolean test(faj var1, int var2);
   }

   @FunctionalInterface
   interface b {
      int apply(faj var1, int var2);
   }
}
