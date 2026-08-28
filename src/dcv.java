import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record dcv(int c) {
   public static final Codec<dcv> a = RecordCodecBuilder.create($$0 -> $$0.group(ayh.m.fieldOf("value").forGetter(dcv::a)).apply($$0, dcv::new));
   public static final ym<ByteBuf, dcv> b = ym.a(yk.h, dcv::a, dcv::new);

   public dcv(int c) {
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
