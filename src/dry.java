import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dry extends dvx {
   public static final MapCodec<dry> b = b(dry::new);
   private static final Map<ja, ffk> e = ffh.c(dmf.b(10.0, 8.0, 8.0, 16.0));

   @Override
   public MapCodec<dry> a() {
      return b;
   }

   public dry(eag.d $$0) {
      super(dtr.b.h, $$0);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return e.get($$0.c(d));
   }
}
