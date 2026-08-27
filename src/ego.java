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

public class ego {
   private static final Codec<ego> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(atq.a(ekk.a, "min").forGetter($$0x -> Optional.ofNullable($$0x.c)), atq.a(ekk.a, "max").forGetter($$0x -> Optional.ofNullable($$0x.d)))
            .apply($$0, ego::new)
   );
   public static final Codec<ego> a = Codec.either(Codec.INT, b).xmap($$0 -> (ego)$$0.map(ego::a, Function.identity()), $$0 -> {
      OptionalInt $$1 = $$0.b();
      return $$1.isPresent() ? Either.left($$1.getAsInt()) : Either.right($$0);
   });
   @Nullable
   private final ekj c;
   @Nullable
   private final ekj d;
   private final ego.b e;
   private final ego.a f;

   public Set<eix<?>> a() {
      Builder<eix<?>> $$0 = ImmutableSet.builder();
      if (this.c != null) {
         $$0.addAll(this.c.a());
      }

      if (this.d != null) {
         $$0.addAll(this.d.a());
      }

      return $$0.build();
   }

   private ego(Optional<ekj> $$0, Optional<ekj> $$1) {
      this($$0.orElse(null), $$1.orElse(null));
   }

   private ego(@Nullable ekj $$0, @Nullable ekj $$1) {
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
         this.e = ($$2, $$3) -> aui.a($$3, $$0.a($$2), $$1.a($$2));
         this.f = ($$2, $$3) -> $$3 >= $$0.a($$2) && $$3 <= $$1.a($$2);
      }
   }

   public static ego a(int $$0) {
      ekh $$1 = ekh.a((float)$$0);
      return new ego(Optional.of($$1), Optional.of($$1));
   }

   public static ego a(int $$0, int $$1) {
      return new ego(Optional.of(ekh.a((float)$$0)), Optional.of(ekh.a((float)$$1)));
   }

   public static ego b(int $$0) {
      return new ego(Optional.of(ekh.a((float)$$0)), Optional.empty());
   }

   public static ego c(int $$0) {
      return new ego(Optional.empty(), Optional.of(ekh.a((float)$$0)));
   }

   public int a(egp $$0, int $$1) {
      return this.e.apply($$0, $$1);
   }

   public boolean b(egp $$0, int $$1) {
      return this.f.test($$0, $$1);
   }

   private OptionalInt b() {
      return Objects.equals(this.c, this.d) && this.c instanceof ekh $$0 && Math.floor((double)$$0.c()) == (double)$$0.c()
         ? OptionalInt.of((int)$$0.c())
         : OptionalInt.empty();
   }

   @FunctionalInterface
   interface a {
      boolean test(egp var1, int var2);
   }

   @FunctionalInterface
   interface b {
      int apply(egp var1, int var2);
   }
}
