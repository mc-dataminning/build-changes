import com.mojang.serialization.MapCodec;

public class dqv extends dle {
   public static final MapCodec<dqv> b = b(dqv::new);
   private static final wo c = wo.c("container.upgrade");

   @Override
   public MapCodec<dqv> a() {
      return b;
   }

   protected dqv(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected bsk b(dwv $$0, dgg $$1, ji $$2) {
      return new bsq(($$2x, $$3, $$4) -> new cua($$2x, $$3, csn.a($$1, $$2)), c);
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awj.aF);
      }

      return bsi.a;
   }
}
