import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dke extends djk {
   public static final MapCodec<dke> a = b(dke::new);
   private static final wo b = wo.c("container.cartography_table");

   @Override
   public MapCodec<dke> a() {
      return a;
   }

   protected dke(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awj.aw);
      }

      return bsi.a;
   }

   @Nullable
   @Override
   protected bsk b(dwv $$0, dgg $$1, ji $$2) {
      return new bsq(($$2x, $$3, $$4) -> new csi($$2x, $$3, csn.a($$1, $$2)), b);
   }
}
