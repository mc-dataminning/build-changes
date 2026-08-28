import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record dbl(int c) {
   public static final Codec<dbl> a = RecordCodecBuilder.create($$0 -> $$0.group(ayo.l.fieldOf("value").forGetter(dbl::a)).apply($$0, dbl::new));
   public static final zc<ByteBuf, dbl> b = zc.a(za.h, dbl::a, dbl::new);

   public dbl(int c) {
      if (c <= 0) {
         throw new IllegalArgumentException("Enchantment value must be positive, but was " + c);
      } else {
         this.c = c;
      }
   }

   public int a() {
      return this.c;
   }
}
