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

public class egd {
   private static final Codec<egd> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(atg.a(ejz.a, "min").forGetter($$0x -> Optional.ofNullable($$0x.c)), atg.a(ejz.a, "max").forGetter($$0x -> Optional.ofNullable($$0x.d)))
            .apply($$0, egd::new)
   );
   public static final Codec<egd> a = Codec.either(Codec.INT, b).xmap($$0 -> (egd)$$0.map(egd::a, Function.identity()), $$0 -> {
      OptionalInt $$1 = $$0.b();
      return $$1.isPresent() ? Either.left($$1.getAsInt()) : Either.right($$0);
   });
   @Nullable
   private final ejy c;
   @Nullable
   private final ejy d;
   private final egd.b e;
   private final egd.a f;

   public Set<eim<?>> a() {
      Builder<eim<?>> $$0 = ImmutableSet.builder();
      if (this.c != null) {
         $$0.addAll(this.c.a());
      }

      if (this.d != null) {
         $$0.addAll(this.d.a());
      }

      return $$0.build();
   }

   private egd(Optional<ejy> $$0, Optional<ejy> $$1) {
      this($$0.orElse(null), $$1.orElse(null));
   }

   private egd(@Nullable ejy $$0, @Nullable ejy $$1) {
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
         this.e = ($$2, $$3) -> aty.a($$3, $$0.a($$2), $$1.a($$2));
         this.f = ($$2, $$3) -> $$3 >= $$0.a($$2) && $$3 <= $$1.a($$2);
      }
   }

   public static egd a(int $$0) {
      ejw $$1 = ejw.a((float)$$0);
      return new egd(Optional.of($$1), Optional.of($$1));
   }

   public static egd a(int $$0, int $$1) {
      return new egd(Optional.of(ejw.a((float)$$0)), Optional.of(ejw.a((float)$$1)));
   }

   public static egd b(int $$0) {
      return new egd(Optional.of(ejw.a((float)$$0)), Optional.empty());
   }

   public static egd c(int $$0) {
      return new egd(Optional.empty(), Optional.of(ejw.a((float)$$0)));
   }

   public int a(ege $$0, int $$1) {
      return this.e.apply($$0, $$1);
   }

   public boolean b(ege $$0, int $$1) {
      return this.f.test($$0, $$1);
   }

   private OptionalInt b() {
      return Objects.equals(this.c, this.d) && this.c instanceof ejw $$0 && Math.floor((double)$$0.c()) == (double)$$0.c()
         ? OptionalInt.of((int)$$0.c())
         : OptionalInt.empty();
   }

   @FunctionalInterface
   interface a {
      boolean test(ege var1, int var2);
   }

   @FunctionalInterface
   interface b {
      int apply(ege var1, int var2);
   }
}
