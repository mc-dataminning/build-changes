import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record bri<T>(T a, int b) {
   private static final Logger c = LogUtils.getLogger();

   public bri(T a, int b) {
      if (b < 0) {
         throw (IllegalArgumentException)af.b(new IllegalArgumentException("Weight should be >= 0"));
      } else {
         if (b == 0 && ab.aU) {
            c.warn("Found 0 weight, make sure this is intentional!");
         }

         this.a = a;
         this.b = b;
      }
   }

   public static <E> Codec<bri<E>> a(Codec<E> $$0) {
      return a($$0.fieldOf("data"));
   }

   public static <E> Codec<bri<E>> a(MapCodec<E> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group($$0.forGetter(bri::a), ayi.l.fieldOf("weight").forGetter(bri::b)).apply($$1, bri::new));
   }
}
