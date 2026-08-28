import javax.annotation.Nullable;

public class col extends cnh {
   public col(bwm<? extends col> $$0, div $$1) {
      super($$0, $$1);
   }

   public static boolean a(bwm<col> $$0, djm $$1, bwl $$2, iu $$3, azv $$4) {
      iu $$5 = $$3;

      do {
         $$5 = $$5.d();
      } while ($$1.a_($$5).a(dmc.ru));

      return b($$0, $$1, $$2, $$3, $$4) && (bwl.a($$2) || $$1.h($$5.e()));
   }

   @Override
   protected awm u() {
      return awn.An;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.Ap;
   }

   @Override
   protected awm l_() {
      return awn.Ao;
   }

   @Override
   awm m() {
      return awn.Aq;
   }

   @Override
   protected crf a(cyy $$0, float $$1, @Nullable cyy $$2) {
      crf $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cri) {
         ((cri)$$3).a(new bvh(bvj.b, 600));
      }

      return $$3;
   }
}
