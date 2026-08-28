import io.netty.buffer.ByteBuf;
import java.util.HashMap;
import java.util.Map;

public record aak(Map<String, String> b) implements aac<aai> {
   private static final int c = 128;
   private static final int d = 4096;
   private static final int e = 32;
   private static final zt<ByteBuf, Map<String, String>> f = zr.a(HashMap::new, zr.b(128), zr.b(4096), 32);
   public static final zt<ByteBuf, aak> a = zt.a(f, aak::b, aak::new);

   @Override
   public aae<aak> a() {
      return aau.b;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }
}
