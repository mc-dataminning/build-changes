import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record dgv(int c) {
   public static final Codec<dgv> a = RecordCodecBuilder.create($$0 -> $$0.group(azg.m.fieldOf("value").forGetter(dgv::a)).apply($$0, dgv::new));
   public static final ze<ByteBuf, dgv> b = ze.a(zc.h, dgv::a, dgv::new);

   public dgv(int c) {
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
