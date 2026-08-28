import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record dcy(int c) {
   public static final Codec<dcy> a = RecordCodecBuilder.create($$0 -> $$0.group(ayi.m.fieldOf("value").forGetter(dcy::a)).apply($$0, dcy::new));
   public static final yn<ByteBuf, dcy> b = yn.a(yl.h, dcy::a, dcy::new);

   public dcy(int c) {
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
