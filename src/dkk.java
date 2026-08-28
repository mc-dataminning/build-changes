import com.mojang.serialization.MapCodec;

public class dkk extends diq {
   public static final MapCodec<dkk> a = b(dkk::new);
   private static final xj b = xj.c("container.crafting");

   @Override
   public MapCodec<? extends dkk> a() {
      return a;
   }

   protected dkk(dvu.d $$0) {
      super($$0);
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awx.an);
      }

      return bsk.a;
   }

   @Override
   protected bsm b(dvv $$0, dfm $$1, jh $$2) {
      return new bss(($$2x, $$3, $$4) -> new css($$2x, $$3, csm.a($$1, $$2)), b);
   }
}
