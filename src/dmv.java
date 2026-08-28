import com.mojang.serialization.MapCodec;

public class dmv extends dlz {
   public static final MapCodec<dmv> a = b(dmv::new);
   private static final xi b = xi.c("container.loom");

   @Override
   public MapCodec<dmv> a() {
      return a;
   }

   protected dmv(dvi.d $$0) {
      super($$0);
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awv.ax);
      }

      return bsd.a;
   }

   @Override
   protected bsf b(dvj $$0, dfb $$1, jh $$2) {
      return new bsl(($$2x, $$3, $$4) -> new csv($$2x, $$3, csb.a($$1, $$2)), b);
   }

   @Override
   public dvj a(czs $$0) {
      return this.m().b(aF, $$0.g().g());
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(aF);
   }
}
