import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record czl(int d) {
   public static final Codec<czl> a = Codec.INT.xmap(czl::new, czl::a);
   public static final yn<ByteBuf, czl> b = yl.g.a(czl::new, czl::a);
   public static final czl c = new czl(4603950);

   public int a() {
      return this.d;
   }
}
