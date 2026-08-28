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

public class eqc {
   private static final Codec<eqc> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               euj.a.optionalFieldOf("min").forGetter($$0x -> Optional.ofNullable($$0x.c)),
               euj.a.optionalFieldOf("max").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, eqc::new)
   );
   public static final Codec<eqc> a = Codec.either(Codec.INT, b).xmap($$0 -> (eqc)$$0.map(eqc::a, Function.identity()), $$0 -> {
      OptionalInt $$1 = $$0.b();
      return $$1.isPresent() ? Either.left($$1.getAsInt()) : Either.right($$0);
   });
   @Nullable
   private final eui c;
   @Nullable
   private final eui d;
   private final eqc.b e;
   private final eqc.a f;

   public Set<esw<?>> a() {
      Builder<esw<?>> $$0 = ImmutableSet.builder();
      if (this.c != null) {
         $$0.addAll(this.c.a());
      }

      if (this.d != null) {
         $$0.addAll(this.d.a());
      }

      return $$0.build();
   }

   private eqc(Optional<eui> $$0, Optional<eui> $$1) {
      this($$0.orElse(null), $$1.orElse(null));
   }

   private eqc(@Nullable eui $$0, @Nullable eui $$1) {
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
         this.e = ($$2, $$3) -> ayu.a($$3, $$0.a($$2), $$1.a($$2));
         this.f = ($$2, $$3) -> $$3 >= $$0.a($$2) && $$3 <= $$1.a($$2);
      }
   }

   public static eqc a(int $$0) {
      eug $$1 = eug.a((float)$$0);
      return new eqc(Optional.of($$1), Optional.of($$1));
   }

   public static eqc a(int $$0, int $$1) {
      return new eqc(Optional.of(eug.a((float)$$0)), Optional.of(eug.a((float)$$1)));
   }

   public static eqc b(int $$0) {
      return new eqc(Optional.of(eug.a((float)$$0)), Optional.empty());
   }

   public static eqc c(int $$0) {
      return new eqc(Optional.empty(), Optional.of(eug.a((float)$$0)));
   }

   public int a(eqd $$0, int $$1) {
      return this.e.apply($$0, $$1);
   }

   public boolean b(eqd $$0, int $$1) {
      return this.f.test($$0, $$1);
   }

   private OptionalInt b() {
      return Objects.equals(this.c, this.d) && this.c instanceof eug $$0 && Math.floor((double)$$0.c()) == (double)$$0.c()
         ? OptionalInt.of((int)$$0.c())
         : OptionalInt.empty();
   }

   @FunctionalInterface
   interface a {
      boolean test(eqd var1, int var2);
   }

   @FunctionalInterface
   interface b {
      int apply(eqd var1, int var2);
   }
}
