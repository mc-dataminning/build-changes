import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cxa(int d) {
   public static final cxa a = new cxa(0);
   public static final Codec<cxa> b = Codec.INT.xmap(cxa::new, cxa::a);
   public static final zj<ByteBuf, cxa> c = zh.g.a(cxa::new, cxa::a);

   public int a() {
      return this.d;
   }
}
