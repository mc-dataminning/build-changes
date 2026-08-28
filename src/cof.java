import javax.annotation.Nullable;

public class cof extends cnb {
   public cof(bwj<? extends cof> $$0, dip $$1) {
      super($$0, $$1);
   }

   public static boolean a(bwj<cof> $$0, djg $$1, bwi $$2, iu $$3, azt $$4) {
      iu $$5 = $$3;

      do {
         $$5 = $$5.d();
      } while ($$1.a_($$5).a(dlw.rt));

      return b($$0, $$1, $$2, $$3, $$4) && (bwi.a($$2) || $$1.h($$5.e()));
   }

   @Override
   protected awk u() {
      return awl.Ak;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.Am;
   }

   @Override
   protected awk l_() {
      return awl.Al;
   }

   @Override
   awk m() {
      return awl.An;
   }

   @Override
   protected cqz a(cys $$0, float $$1, @Nullable cys $$2) {
      cqz $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof crc) {
         ((crc)$$3).a(new bve(bvg.b, 600));
      }

      return $$3;
   }
}
