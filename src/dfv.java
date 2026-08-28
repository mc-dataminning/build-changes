import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record dfv(int c) {
   public static final Codec<dfv> a = RecordCodecBuilder.create($$0 -> $$0.group(ayu.m.fieldOf("value").forGetter(dfv::a)).apply($$0, dfv::new));
   public static final yw<ByteBuf, dfv> b = yw.a(yu.h, dfv::a, dfv::new);

   public dfv(int c) {
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
