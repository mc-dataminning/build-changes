import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record bsn<T>(T a, int b) {
   private static final Logger c = LogUtils.getLogger();

   public bsn(T a, int b) {
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

   public static <E> Codec<bsn<E>> a(Codec<E> $$0) {
      return a($$0.fieldOf("data"));
   }

   public static <E> Codec<bsn<E>> a(MapCodec<E> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group($$0.forGetter(bsn::a), ayu.l.fieldOf("weight").forGetter(bsn::b)).apply($$1, bsn::new));
   }
}
