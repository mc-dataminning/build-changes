import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record dgj(int c) {
   public static final Codec<dgj> a = RecordCodecBuilder.create($$0 -> $$0.group(ayw.m.fieldOf("value").forGetter(dgj::a)).apply($$0, dgj::new));
   public static final yy<ByteBuf, dgj> b = yy.a(yw.h, dgj::a, dgj::new);

   public dgj(int c) {
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
