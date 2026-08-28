import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record esl(int c) {
   public static final Codec<esl> a = Codec.INT.xmap(esl::new, esl::b);
   public static final zc<ByteBuf, esl> b = za.h.a(esl::new, esl::b);

   public String a() {
      return "map_" + this.c;
   }

   public int b() {
      return this.c;
   }
}
