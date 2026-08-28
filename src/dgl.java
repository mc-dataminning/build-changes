import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record dgl(int c) {
   public static final Codec<dgl> a = RecordCodecBuilder.create($$0 -> $$0.group(ayy.m.fieldOf("value").forGetter(dgl::a)).apply($$0, dgl::new));
   public static final za<ByteBuf, dgl> b = za.a(yy.h, dgl::a, dgl::new);

   public dgl(int c) {
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
