import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;
import org.slf4j.Logger;

public record bta<T>(T a, int b) {
   private static final Logger c = LogUtils.getLogger();

   public bta(T a, int b) {
      if (b < 0) {
         throw (IllegalArgumentException)ag.b(new IllegalArgumentException("Weight should be >= 0"));
      } else {
         if (b == 0 && ac.aU) {
            c.warn("Found 0 weight, make sure this is intentional!");
         }

         this.a = a;
         this.b = b;
      }
   }

   public static <E> Codec<bta<E>> a(Codec<E> $$0) {
      return a($$0.fieldOf("data"));
   }

   public static <E> Codec<bta<E>> a(MapCodec<E> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group($$0.forGetter(bta::a), ayw.l.fieldOf("weight").forGetter(bta::b)).apply($$1, bta::new));
   }

   public <U> bta<U> a(Function<T, U> $$0) {
      return new bta<>($$0.apply(this.a()), this.b);
   }
}
