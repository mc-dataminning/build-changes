import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dsv extends dwu {
   public static final MapCodec<dsv> b = b(dsv::new);
   private static final Map<jb, fgk> e = fgh.c(dnc.b(10.0, 8.0, 8.0, 16.0));

   @Override
   public MapCodec<dsv> a() {
      return b;
   }

   public dsv(ebd.d $$0) {
      super(duo.b.h, $$0);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return e.get($$0.c(d));
   }
}
