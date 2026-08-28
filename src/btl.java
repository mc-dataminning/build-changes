import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;
import org.slf4j.Logger;

public record btl<T>(T a, int b) {
   private static final Logger c = LogUtils.getLogger();

   public btl(T a, int b) {
      if (b < 0) {
         throw (IllegalArgumentException)ag.b(new IllegalArgumentException("Weight should be >= 0"));
      } else {
         if (b == 0 && ac.aV) {
            c.warn("Found 0 weight, make sure this is intentional!");
         }

         this.a = a;
         this.b = b;
      }
   }

   public static <E> Codec<btl<E>> a(Codec<E> $$0) {
      return a($$0.fieldOf("data"));
   }

   public static <E> Codec<btl<E>> a(MapCodec<E> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group($$0.forGetter(btl::a), azg.l.fieldOf("weight").forGetter(btl::b)).apply($$1, btl::new));
   }

   public <U> btl<U> a(Function<T, U> $$0) {
      return new btl<>($$0.apply(this.a()), this.b);
   }
}
