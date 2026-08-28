import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record dbq(int c) {
   public static final Codec<dbq> a = RecordCodecBuilder.create($$0 -> $$0.group(ayt.m.fieldOf("value").forGetter(dbq::a)).apply($$0, dbq::new));
   public static final zg<ByteBuf, dbq> b = zg.a(ze.h, dbq::a, dbq::new);

   public dbq(int c) {
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
