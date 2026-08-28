import javax.annotation.Nullable;

public class cmd extends ckz {
   public cmd(bul<? extends cmd> $$0, dfb $$1) {
      super($$0, $$1);
   }

   public static boolean a(bul<cmd> $$0, dfr $$1, buk $$2, jh $$3, azs $$4) {
      jh $$5 = $$3;

      do {
         $$5 = $$5.d();
      } while ($$1.a_($$5).a(dig.qP));

      return b($$0, $$1, $$2, $$3, $$4) && (buk.a($$2) || $$1.h($$5.e()));
   }

   @Override
   protected awk w() {
      return awl.zq;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.zs;
   }

   @Override
   protected awk o_() {
      return awl.zr;
   }

   @Override
   awk t() {
      return awl.zt;
   }

   @Override
   protected cou a(cwb $$0, float $$1, @Nullable cwb $$2) {
      cou $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cow) {
         ((cow)$$3).a(new btj(btl.b, 600));
      }

      return $$3;
   }
}
