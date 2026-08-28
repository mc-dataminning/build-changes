import com.mojang.serialization.MapCodec;

public class dpk extends djy {
   public static final MapCodec<dpk> b = b(dpk::new);
   private static final xi c = xi.c("container.upgrade");

   @Override
   public MapCodec<dpk> a() {
      return b;
   }

   protected dpk(dvi.d $$0) {
      super($$0);
   }

   @Override
   protected bsf b(dvj $$0, dfb $$1, jh $$2) {
      return new bsl(($$2x, $$3, $$4) -> new cto($$2x, $$3, csb.a($$1, $$2)), c);
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awv.aF);
      }

      return bsd.a;
   }
}
