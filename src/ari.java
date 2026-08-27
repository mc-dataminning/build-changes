import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;

public record ari<T extends Comparable<T>>(T b, T c) {
   public static final Codec<ari<Integer>> a = a(Codec.INT);

   public ari(T b, T c) {
      if (b.compareTo(c) > 0) {
         throw new IllegalArgumentException("min_inclusive must be less than or equal to max_inclusive");
      } else {
         this.b = b;
         this.c = c;
      }
   }

   public ari(T $$0) {
      this($$0, $$0);
   }

   public static <T extends Comparable<T>> Codec<ari<T>> a(Codec<T> $$0) {
      return aqy.a($$0, "min_inclusive", "max_inclusive", ari::a, ari::a, ari::b);
   }

   public static <T extends Comparable<T>> Codec<ari<T>> a(Codec<T> $$0, T $$1, T $$2) {
      return aqy.a(
         a($$0),
         (Function<ari<T>, DataResult<ari<T>>>)($$2x -> {
            if ($$2x.a().compareTo($$1) < 0) {
               return DataResult.error(() -> "Range limit too low, expected at least " + $$1 + " [" + $$2x.a() + "-" + $$2x.b() + "]");
            } else {
               return $$2x.b().compareTo($$2) > 0
                  ? DataResult.error(() -> "Range limit too high, expected at most " + $$2 + " [" + $$2x.a() + "-" + $$2x.b() + "]")
                  : DataResult.success($$2x);
            }
         })
      );
   }

   public static <T extends Comparable<T>> DataResult<ari<T>> a(T $$0, T $$1) {
      return $$0.compareTo($$1) <= 0
         ? DataResult.success(new ari($$0, $$1))
         : DataResult.error(() -> "min_inclusive must be less than or equal to max_inclusive");
   }

   public boolean a(T $$0) {
      return $$0.compareTo(this.b) >= 0 && $$0.compareTo(this.c) <= 0;
   }

   public boolean a(ari<T> $$0) {
      return $$0.a().compareTo(this.b) >= 0 && $$0.c.compareTo(this.c) <= 0;
   }

   @Override
   public String toString() {
      return "[" + this.b + ", " + this.c + "]";
   }

   public T a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
