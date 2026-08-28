import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record dfd(int c) {
   public static final Codec<dfd> a = RecordCodecBuilder.create($$0 -> $$0.group(ays.m.fieldOf("value").forGetter(dfd::a)).apply($$0, dfd::new));
   public static final yu<ByteBuf, dfd> b = yu.a(ys.h, dfd::a, dfd::new);

   public dfd(int c) {
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
