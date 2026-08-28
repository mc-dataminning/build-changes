import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record ddx(int c) {
   public static final Codec<ddx> a = RecordCodecBuilder.create($$0 -> $$0.group(azn.m.fieldOf("value").forGetter(ddx::a)).apply($$0, ddx::new));
   public static final zt<ByteBuf, ddx> b = zt.a(zr.h, ddx::a, ddx::new);

   public ddx(int c) {
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
