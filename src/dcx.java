import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record dcx(int c) {
   public static final Codec<dcx> a = RecordCodecBuilder.create($$0 -> $$0.group(ayi.m.fieldOf("value").forGetter(dcx::a)).apply($$0, dcx::new));
   public static final yn<ByteBuf, dcx> b = yn.a(yl.h, dcx::a, dcx::new);

   public dcx(int c) {
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
