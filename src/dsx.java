import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dsx extends dww {
   public static final MapCodec<dsx> b = b(dsx::new);
   private static final Map<jc, fgm> e = fgj.c(dne.b(10.0, 8.0, 8.0, 16.0));

   @Override
   public MapCodec<dsx> a() {
      return b;
   }

   public dsx(ebf.d $$0) {
      super(duq.b.h, $$0);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return e.get($$0.c(d));
   }
}
