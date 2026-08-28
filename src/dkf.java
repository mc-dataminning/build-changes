import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkf extends djl {
   public static final MapCodec<dkf> a = b(dkf::new);
   private static final wp b = wp.c("container.cartography_table");

   @Override
   public MapCodec<dkf> a() {
      return a;
   }

   protected dkf(dwv.d $$0) {
      super($$0);
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awk.aw);
      }

      return bsj.a;
   }

   @Nullable
   @Override
   protected bsl b(dww $$0, dgh $$1, ji $$2) {
      return new bsr(($$2x, $$3, $$4) -> new csj($$2x, $$3, cso.a($$1, $$2)), b);
   }
}
