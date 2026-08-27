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

public class edh {
   private static final Codec<edh> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(asg.a(ehd.a, "min").forGetter($$0x -> Optional.ofNullable($$0x.c)), asg.a(ehd.a, "max").forGetter($$0x -> Optional.ofNullable($$0x.d)))
            .apply($$0, edh::new)
   );
   public static final Codec<edh> a = Codec.either(Codec.INT, b).xmap($$0 -> (edh)$$0.map(edh::a, Function.identity()), $$0 -> {
      OptionalInt $$1 = $$0.b();
      return $$1.isPresent() ? Either.left($$1.getAsInt()) : Either.right($$0);
   });
   @Nullable
   private final ehc c;
   @Nullable
   private final ehc d;
   private final edh.b e;
   private final edh.a f;

   public Set<efq<?>> a() {
      Builder<efq<?>> $$0 = ImmutableSet.builder();
      if (this.c != null) {
         $$0.addAll(this.c.a());
      }

      if (this.d != null) {
         $$0.addAll(this.d.a());
      }

      return $$0.build();
   }

   private edh(Optional<ehc> $$0, Optional<ehc> $$1) {
      this($$0.orElse(null), $$1.orElse(null));
   }

   private edh(@Nullable ehc $$0, @Nullable ehc $$1) {
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
         this.e = ($$2, $$3) -> asy.a($$3, $$0.a($$2), $$1.a($$2));
         this.f = ($$2, $$3) -> $$3 >= $$0.a($$2) && $$3 <= $$1.a($$2);
      }
   }

   public static edh a(int $$0) {
      eha $$1 = eha.a((float)$$0);
      return new edh(Optional.of($$1), Optional.of($$1));
   }

   public static edh a(int $$0, int $$1) {
      return new edh(Optional.of(eha.a((float)$$0)), Optional.of(eha.a((float)$$1)));
   }

   public static edh b(int $$0) {
      return new edh(Optional.of(eha.a((float)$$0)), Optional.empty());
   }

   public static edh c(int $$0) {
      return new edh(Optional.empty(), Optional.of(eha.a((float)$$0)));
   }

   public int a(edi $$0, int $$1) {
      return this.e.apply($$0, $$1);
   }

   public boolean b(edi $$0, int $$1) {
      return this.f.test($$0, $$1);
   }

   private OptionalInt b() {
      return Objects.equals(this.c, this.d) && this.c instanceof eha $$0 && Math.floor((double)$$0.c()) == (double)$$0.c()
         ? OptionalInt.of((int)$$0.c())
         : OptionalInt.empty();
   }

   @FunctionalInterface
   interface a {
      boolean test(edi var1, int var2);
   }

   @FunctionalInterface
   interface b {
      int apply(edi var1, int var2);
   }
}
