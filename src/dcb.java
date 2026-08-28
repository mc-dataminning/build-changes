import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record dcb(int c) {
   public static final Codec<dcb> a = RecordCodecBuilder.create($$0 -> $$0.group(ayv.m.fieldOf("value").forGetter(dcb::a)).apply($$0, dcb::new));
   public static final zh<ByteBuf, dcb> b = zh.a(zf.h, dcb::a, dcb::new);

   public dcb(int c) {
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
