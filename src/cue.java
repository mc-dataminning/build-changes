import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record cue(int d) {
   public static final Codec<cue> a = Codec.INT.xmap(cue::new, cue::a);
   public static final ye<ByteBuf, cue> b = yc.e.a(cue::new, cue::a);
   public static final cue c = new cue(4603950);

   public int a() {
      return this.d;
   }
}
