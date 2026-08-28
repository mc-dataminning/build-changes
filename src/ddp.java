import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record ddp(int c) {
   public static final Codec<ddp> a = RecordCodecBuilder.create($$0 -> $$0.group(azn.m.fieldOf("value").forGetter(ddp::a)).apply($$0, ddp::new));
   public static final zt<ByteBuf, ddp> b = zt.a(zr.h, ddp::a, ddp::new);

   public ddp(int c) {
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
