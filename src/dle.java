import com.mojang.serialization.MapCodec;

public class dle extends djk {
   public static final MapCodec<dle> a = b(dle::new);
   private static final wo b = wo.c("container.crafting");

   @Override
   public MapCodec<? extends dle> a() {
      return a;
   }

   protected dle(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awj.an);
      }

      return bsi.a;
   }

   @Override
   protected bsk b(dwv $$0, dgg $$1, ji $$2) {
      return new bsq(($$2x, $$3, $$4) -> new cst($$2x, $$3, csn.a($$1, $$2)), b);
   }
}
