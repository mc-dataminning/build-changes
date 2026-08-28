import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record dar(int d) {
   public static final Codec<dar> a = Codec.INT.xmap(dar::new, dar::a);
   public static final yt<ByteBuf, dar> b = yr.g.a(dar::new, dar::a);
   public static final dar c = new dar(4603950);

   public int a() {
      return this.d;
   }
}
