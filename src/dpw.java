import com.mojang.serialization.MapCodec;

public class dpw extends dkk {
   public static final MapCodec<dpw> b = b(dpw::new);
   private static final xj c = xj.c("container.upgrade");

   @Override
   public MapCodec<dpw> a() {
      return b;
   }

   protected dpw(dvu.d $$0) {
      super($$0);
   }

   @Override
   protected bsm b(dvv $$0, dfm $$1, jh $$2) {
      return new bss(($$2x, $$3, $$4) -> new ctz($$2x, $$3, csm.a($$1, $$2)), c);
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awx.aF);
      }

      return bsk.a;
   }
}
