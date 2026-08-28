import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record dfo(int c) {
   public static final Codec<dfo> a = RecordCodecBuilder.create($$0 -> $$0.group(ayu.m.fieldOf("value").forGetter(dfo::a)).apply($$0, dfo::new));
   public static final yw<ByteBuf, dfo> b = yw.a(yu.h, dfo::a, dfo::new);

   public dfo(int c) {
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
