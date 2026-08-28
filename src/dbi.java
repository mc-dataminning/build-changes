import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record dbi(int c) {
   public static final Codec<dbi> a = RecordCodecBuilder.create($$0 -> $$0.group(aym.l.fieldOf("value").forGetter(dbi::a)).apply($$0, dbi::new));
   public static final zb<ByteBuf, dbi> b = zb.a(yz.g, dbi::a, dbi::new);

   public dbi(int c) {
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
