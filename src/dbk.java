import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record dbk(int c) {
   public static final Codec<dbk> a = RecordCodecBuilder.create($$0 -> $$0.group(ays.m.fieldOf("value").forGetter(dbk::a)).apply($$0, dbk::new));
   public static final zf<ByteBuf, dbk> b = zf.a(zd.h, dbk::a, dbk::new);

   public dbk(int c) {
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
