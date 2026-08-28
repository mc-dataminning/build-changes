import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dsk extends dwj {
   public static final MapCodec<dsk> b = b(dsk::new);
   private static final Map<jb, ffw> e = fft.c(dmr.b(10.0, 8.0, 8.0, 16.0));

   @Override
   public MapCodec<dsk> a() {
      return b;
   }

   public dsk(eas.d $$0) {
      super(dud.b.h, $$0);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return e.get($$0.c(d));
   }
}
