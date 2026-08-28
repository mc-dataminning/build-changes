import javax.annotation.Nullable;

public class cmk extends clg {
   public cmk(bus<? extends cmk> $$0, dfm $$1) {
      super($$0, $$1);
   }

   public static boolean a(bus<cmk> $$0, dgd $$1, bur $$2, jh $$3, azu $$4) {
      jh $$5 = $$3;

      do {
         $$5 = $$5.d();
      } while ($$1.a_($$5).a(dis.qP));

      return b($$0, $$1, $$2, $$3, $$4) && (bur.a($$2) || $$1.h($$5.e()));
   }

   @Override
   protected awm t() {
      return awn.zq;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.zs;
   }

   @Override
   protected awm n_() {
      return awn.zr;
   }

   @Override
   awm q() {
      return awn.zt;
   }

   @Override
   protected cpb a(cwm $$0, float $$1, @Nullable cwm $$2) {
      cpb $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cpd) {
         ((cpd)$$3).a(new btq(bts.b, 600));
      }

      return $$3;
   }
}
