import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record def(int c) {
   public static final Codec<def> a = RecordCodecBuilder.create($$0 -> $$0.group(ays.m.fieldOf("value").forGetter(def::a)).apply($$0, def::new));
   public static final yt<ByteBuf, def> b = yt.a(yr.h, def::a, def::new);

   public def(int c) {
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
