import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record dcw(int c) {
   public static final Codec<dcw> a = RecordCodecBuilder.create($$0 -> $$0.group(ayi.m.fieldOf("value").forGetter(dcw::a)).apply($$0, dcw::new));
   public static final yn<ByteBuf, dcw> b = yn.a(yl.h, dcw::a, dcw::new);

   public dcw(int c) {
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
