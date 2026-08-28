import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record ddw(int c) {
   public static final Codec<ddw> a = RecordCodecBuilder.create($$0 -> $$0.group(azn.m.fieldOf("value").forGetter(ddw::a)).apply($$0, ddw::new));
   public static final zt<ByteBuf, ddw> b = zt.a(zr.h, ddw::a, ddw::new);

   public ddw(int c) {
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
