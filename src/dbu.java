import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record dbu(int c) {
   public static final Codec<dbu> a = RecordCodecBuilder.create($$0 -> $$0.group(ayw.m.fieldOf("value").forGetter(dbu::a)).apply($$0, dbu::new));
   public static final zj<ByteBuf, dbu> b = zj.a(zh.h, dbu::a, dbu::new);

   public dbu(int c) {
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
