import com.mojang.serialization.MapCodec;
import java.util.Map;

public class drs extends dvp {
   public static final MapCodec<drs> b = b(drs::new);
   private static final Map<ja, ffc> e = fez.c(dma.b(10.0, 8.0, 8.0, 16.0));

   @Override
   public MapCodec<drs> a() {
      return b;
   }

   public drs(dzy.d $$0) {
      super(dtk.b.h, $$0);
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return e.get($$0.c(d));
   }
}
