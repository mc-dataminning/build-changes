import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record ddo(int c) {
   public static final Codec<ddo> a = RecordCodecBuilder.create($$0 -> $$0.group(azd.m.fieldOf("value").forGetter(ddo::a)).apply($$0, ddo::new));
   public static final zi<ByteBuf, ddo> b = zi.a(zg.h, ddo::a, ddo::new);

   public ddo(int c) {
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
