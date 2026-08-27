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

public class ecf {
   private static final Codec<ecf> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(aqy.a(egb.a, "min").forGetter($$0x -> Optional.ofNullable($$0x.c)), aqy.a(egb.a, "max").forGetter($$0x -> Optional.ofNullable($$0x.d)))
            .apply($$0, ecf::new)
   );
   public static final Codec<ecf> a = Codec.either(Codec.INT, b).xmap($$0 -> (ecf)$$0.map(ecf::a, Function.identity()), $$0 -> {
      OptionalInt $$1 = $$0.b();
      return $$1.isPresent() ? Either.left($$1.getAsInt()) : Either.right($$0);
   });
   @Nullable
   private final ega c;
   @Nullable
   private final ega d;
   private final ecf.b e;
   private final ecf.a f;

   public Set<eeo<?>> a() {
      Builder<eeo<?>> $$0 = ImmutableSet.builder();
      if (this.c != null) {
         $$0.addAll(this.c.a());
      }

      if (this.d != null) {
         $$0.addAll(this.d.a());
      }

      return $$0.build();
   }

   private ecf(Optional<ega> $$0, Optional<ega> $$1) {
      this($$0.orElse(null), $$1.orElse(null));
   }

   private ecf(@Nullable ega $$0, @Nullable ega $$1) {
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
         this.e = ($$2, $$3) -> arp.a($$3, $$0.a($$2), $$1.a($$2));
         this.f = ($$2, $$3) -> $$3 >= $$0.a($$2) && $$3 <= $$1.a($$2);
      }
   }

   public static ecf a(int $$0) {
      efy $$1 = efy.a((float)$$0);
      return new ecf(Optional.of($$1), Optional.of($$1));
   }

   public static ecf a(int $$0, int $$1) {
      return new ecf(Optional.of(efy.a((float)$$0)), Optional.of(efy.a((float)$$1)));
   }

   public static ecf b(int $$0) {
      return new ecf(Optional.of(efy.a((float)$$0)), Optional.empty());
   }

   public static ecf c(int $$0) {
      return new ecf(Optional.empty(), Optional.of(efy.a((float)$$0)));
   }

   public int a(ecg $$0, int $$1) {
      return this.e.apply($$0, $$1);
   }

   public boolean b(ecg $$0, int $$1) {
      return this.f.test($$0, $$1);
   }

   private OptionalInt b() {
      return Objects.equals(this.c, this.d) && this.c instanceof efy $$0 && Math.floor((double)$$0.c()) == (double)$$0.c()
         ? OptionalInt.of((int)$$0.c())
         : OptionalInt.empty();
   }

   @FunctionalInterface
   interface a {
      boolean test(ecg var1, int var2);
   }

   @FunctionalInterface
   interface b {
      int apply(ecg var1, int var2);
   }
}
