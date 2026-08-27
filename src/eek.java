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

public class eek {
   private static final Codec<eek> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(asq.a(eig.a, "min").forGetter($$0x -> Optional.ofNullable($$0x.c)), asq.a(eig.a, "max").forGetter($$0x -> Optional.ofNullable($$0x.d)))
            .apply($$0, eek::new)
   );
   public static final Codec<eek> a = Codec.either(Codec.INT, b).xmap($$0 -> (eek)$$0.map(eek::a, Function.identity()), $$0 -> {
      OptionalInt $$1 = $$0.b();
      return $$1.isPresent() ? Either.left($$1.getAsInt()) : Either.right($$0);
   });
   @Nullable
   private final eif c;
   @Nullable
   private final eif d;
   private final eek.b e;
   private final eek.a f;

   public Set<egt<?>> a() {
      Builder<egt<?>> $$0 = ImmutableSet.builder();
      if (this.c != null) {
         $$0.addAll(this.c.a());
      }

      if (this.d != null) {
         $$0.addAll(this.d.a());
      }

      return $$0.build();
   }

   private eek(Optional<eif> $$0, Optional<eif> $$1) {
      this($$0.orElse(null), $$1.orElse(null));
   }

   private eek(@Nullable eif $$0, @Nullable eif $$1) {
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
         this.e = ($$2, $$3) -> ati.a($$3, $$0.a($$2), $$1.a($$2));
         this.f = ($$2, $$3) -> $$3 >= $$0.a($$2) && $$3 <= $$1.a($$2);
      }
   }

   public static eek a(int $$0) {
      eid $$1 = eid.a((float)$$0);
      return new eek(Optional.of($$1), Optional.of($$1));
   }

   public static eek a(int $$0, int $$1) {
      return new eek(Optional.of(eid.a((float)$$0)), Optional.of(eid.a((float)$$1)));
   }

   public static eek b(int $$0) {
      return new eek(Optional.of(eid.a((float)$$0)), Optional.empty());
   }

   public static eek c(int $$0) {
      return new eek(Optional.empty(), Optional.of(eid.a((float)$$0)));
   }

   public int a(eel $$0, int $$1) {
      return this.e.apply($$0, $$1);
   }

   public boolean b(eel $$0, int $$1) {
      return this.f.test($$0, $$1);
   }

   private OptionalInt b() {
      return Objects.equals(this.c, this.d) && this.c instanceof eid $$0 && Math.floor((double)$$0.c()) == (double)$$0.c()
         ? OptionalInt.of((int)$$0.c())
         : OptionalInt.empty();
   }

   @FunctionalInterface
   interface a {
      boolean test(eel var1, int var2);
   }

   @FunctionalInterface
   interface b {
      int apply(eel var1, int var2);
   }
}
