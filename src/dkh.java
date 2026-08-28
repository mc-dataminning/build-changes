import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkh extends djn {
   public static final MapCodec<dkh> a = b(dkh::new);
   private static final wp b = wp.c("container.cartography_table");

   @Override
   public MapCodec<dkh> a() {
      return a;
   }

   protected dkh(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awk.aw);
      }

      return bsl.a;
   }

   @Nullable
   @Override
   protected bsn b(dwy $$0, dgj $$1, ji $$2) {
      return new bst(($$2x, $$3, $$4) -> new csl($$2x, $$3, csq.a($$1, $$2)), b);
   }
}
