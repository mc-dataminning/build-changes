import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record dau(int c) {
   public static final Codec<dau> a = RecordCodecBuilder.create($$0 -> $$0.group(ayl.l.fieldOf("value").forGetter(dau::a)).apply($$0, dau::new));
   public static final zb<ByteBuf, dau> b = zb.a(yz.g, dau::a, dau::new);

   public dau(int c) {
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
