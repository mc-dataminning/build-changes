import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum cvw implements ayq {
   a("building", 0),
   b("redstone", 1),
   c("equipment", 2),
   d("misc", 3);

   public static final Codec<cvw> e = ayq.a(cvw::values);
   public static final IntFunction<cvw> f = awn.a(cvw::a, values(), awn.a.a);
   public static final yq<ByteBuf, cvw> g = yo.a(f, cvw::a);
   private final String h;
   private final int i;

   private cvw(String $$0, int $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   private int a() {
      return this.i;
   }
}
