import io.netty.buffer.ByteBuf;
import java.util.HashMap;
import java.util.Map;

public record aaa(Map<String, String> b) implements zs<zy> {
   private static final int c = 128;
   private static final int d = 4096;
   private static final int e = 32;
   private static final zj<ByteBuf, Map<String, String>> f = zh.a(HashMap::new, zh.b(128), zh.b(4096), 32);
   public static final zj<ByteBuf, aaa> a = zj.a(f, aaa::b, aaa::new);

   @Override
   public zu<aaa> a() {
      return aak.b;
   }

   public void a(zy $$0) {
      $$0.a(this);
   }
}
