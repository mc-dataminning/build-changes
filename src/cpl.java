import javax.annotation.Nullable;

public class cpl extends cog {
   public cpl(bxc<? extends cpl> $$0, djx $$1) {
      super($$0, $$1);
   }

   public static boolean a(bxc<cpl> $$0, dko $$1, bxb $$2, iv $$3, azx $$4) {
      iv $$5 = $$3;

      do {
         $$5 = $$5.d();
      } while ($$1.a_($$5).a(dne.rx));

      return b($$0, $$1, $$2, $$3, $$4) && (bxb.a($$2) || $$1.h($$5.e()));
   }

   @Override
   protected awo u() {
      return awp.Aq;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.As;
   }

   @Override
   protected awo l_() {
      return awp.Ar;
   }

   @Override
   awo m() {
      return awp.At;
   }

   @Override
   protected csf a(czy $$0, float $$1, @Nullable czy $$2) {
      csf $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof csi) {
         ((csi)$$3).a(new bvx(bvz.b, 600));
      }

      return $$3;
   }
}
