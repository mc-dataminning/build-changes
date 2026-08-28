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

public class ewh {
   private static final Codec<ewh> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               fao.a.optionalFieldOf("min").forGetter($$0x -> Optional.ofNullable($$0x.c)),
               fao.a.optionalFieldOf("max").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, ewh::new)
   );
   public static final Codec<ewh> a = Codec.either(Codec.INT, b).xmap($$0 -> (ewh)$$0.map(ewh::a, Function.identity()), $$0 -> {
      OptionalInt $$1 = $$0.b();
      return $$1.isPresent() ? Either.left($$1.getAsInt()) : Either.right($$0);
   });
   @Nullable
   private final fan c;
   @Nullable
   private final fan d;
   private final ewh.b e;
   private final ewh.a f;

   public Set<bbd<?>> a() {
      Builder<bbd<?>> $$0 = ImmutableSet.builder();
      if (this.c != null) {
         $$0.addAll(this.c.a());
      }

      if (this.d != null) {
         $$0.addAll(this.d.a());
      }

      return $$0.build();
   }

   private ewh(Optional<fan> $$0, Optional<fan> $$1) {
      this($$0.orElse(null), $$1.orElse(null));
   }

   private ewh(@Nullable fan $$0, @Nullable fan $$1) {
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
         this.e = ($$2, $$3) -> azu.a($$3, $$0.a($$2), $$1.a($$2));
         this.f = ($$2, $$3) -> $$3 >= $$0.a($$2) && $$3 <= $$1.a($$2);
      }
   }

   public static ewh a(int $$0) {
      fak $$1 = fak.a((float)$$0);
      return new ewh(Optional.of($$1), Optional.of($$1));
   }

   public static ewh a(int $$0, int $$1) {
      return new ewh(Optional.of(fak.a((float)$$0)), Optional.of(fak.a((float)$$1)));
   }

   public static ewh b(int $$0) {
      return new ewh(Optional.of(fak.a((float)$$0)), Optional.empty());
   }

   public static ewh c(int $$0) {
      return new ewh(Optional.empty(), Optional.of(fak.a((float)$$0)));
   }

   public int a(ewi $$0, int $$1) {
      return this.e.apply($$0, $$1);
   }

   public boolean b(ewi $$0, int $$1) {
      return this.f.test($$0, $$1);
   }

   private OptionalInt b() {
      return Objects.equals(this.c, this.d) && this.c instanceof fak $$0 && Math.floor((double)$$0.c()) == (double)$$0.c()
         ? OptionalInt.of((int)$$0.c())
         : OptionalInt.empty();
   }

   @FunctionalInterface
   interface a {
      boolean test(ewi var1, int var2);
   }

   @FunctionalInterface
   interface b {
      int apply(ewi var1, int var2);
   }
}
