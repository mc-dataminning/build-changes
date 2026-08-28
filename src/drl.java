import com.mojang.serialization.MapCodec;
import java.util.Map;

public class drl extends dvf {
   public static final MapCodec<drl> b = b(drl::new);
   private static final Map<ja, feq> e = fen.c(dlu.b(10.0, 8.0, 8.0, 16.0));

   @Override
   public MapCodec<drl> a() {
      return b;
   }

   public drl(dzn.d $$0) {
      super(dtc.b.h, $$0);
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return e.get($$0.c(d));
   }
}
