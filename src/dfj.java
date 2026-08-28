import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record dfj(int c) {
   public static final Codec<dfj> a = RecordCodecBuilder.create($$0 -> $$0.group(ayu.m.fieldOf("value").forGetter(dfj::a)).apply($$0, dfj::new));
   public static final yw<ByteBuf, dfj> b = yw.a(yu.h, dfj::a, dfj::new);

   public dfj(int c) {
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
