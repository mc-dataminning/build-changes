import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dsf extends dwe {
   public static final MapCodec<dsf> b = b(dsf::new);
   private static final Map<jb, ffr> e = ffo.c(dmm.b(10.0, 8.0, 8.0, 16.0));

   @Override
   public MapCodec<dsf> a() {
      return b;
   }

   public dsf(ean.d $$0) {
      super(dty.b.h, $$0);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return e.get($$0.c(d));
   }
}
