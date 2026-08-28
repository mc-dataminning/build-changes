import com.mojang.serialization.MapCodec;

public class djy extends die {
   public static final MapCodec<djy> a = b(djy::new);
   private static final xi b = xi.c("container.crafting");

   @Override
   public MapCodec<? extends djy> a() {
      return a;
   }

   protected djy(dvi.d $$0) {
      super($$0);
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awv.an);
      }

      return bsd.a;
   }

   @Override
   protected bsf b(dvj $$0, dfb $$1, jh $$2) {
      return new bsl(($$2x, $$3, $$4) -> new csh($$2x, $$3, csb.a($$1, $$2)), b);
   }
}
