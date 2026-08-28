import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record dfy(int c) {
   public static final Codec<dfy> a = RecordCodecBuilder.create($$0 -> $$0.group(ayu.m.fieldOf("value").forGetter(dfy::a)).apply($$0, dfy::new));
   public static final yw<ByteBuf, dfy> b = yw.a(yu.h, dfy::a, dfy::new);

   public dfy(int c) {
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
