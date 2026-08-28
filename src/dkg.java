import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkg extends djm {
   public static final MapCodec<dkg> a = b(dkg::new);
   private static final wo b = wo.c("container.cartography_table");

   @Override
   public MapCodec<dkg> a() {
      return a;
   }

   protected dkg(dww.d $$0) {
      super($$0);
   }

   @Override
   protected bsj a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awk.aw);
      }

      return bsj.a;
   }

   @Nullable
   @Override
   protected bsl b(dwx $$0, dgi $$1, ji $$2) {
      return new bsr(($$2x, $$3, $$4) -> new csk($$2x, $$3, csp.a($$1, $$2)), b);
   }
}
